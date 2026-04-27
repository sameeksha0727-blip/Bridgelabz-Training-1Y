import java.sql.*;
import java.util.Scanner;

public class AdminService {

    Scanner sc = new Scanner(System.in);

    public boolean login() {
        try (Connection con = DBConnection.getConnection()) {

            System.out.print("Admin ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Password: ");
            String pass = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM admin WHERE admin_id=? AND password=?"
            );

            ps.setInt(1, id);
            ps.setString(2, pass);

            return ps.executeQuery().next();

        } catch (Exception e) {
            return false;
        }
    }

    public void approveRequest() {
        try (Connection con = DBConnection.getConnection()) {

            System.out.print("Request ID: ");
            int id = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM requests WHERE req_id=?"
            );
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int bookId = rs.getInt("book_id");
                String type = rs.getString("type");

                if (type.equalsIgnoreCase("ISSUE")) {
                    ResultSet stock = con.createStatement()
                            .executeQuery("SELECT stock FROM books WHERE id=" + bookId);

                    if (stock.next() && stock.getInt("stock") > 0) {
                        con.createStatement().executeUpdate(
                                "UPDATE books SET stock=stock-1 WHERE id=" + bookId);
                    } else {
                        System.out.println("Out of stock");
                        return;
                    }
                } else {
                    con.createStatement().executeUpdate(
                            "UPDATE books SET stock=stock+1 WHERE id=" + bookId);
                }

                con.createStatement().executeUpdate(
                        "UPDATE requests SET status='APPROVED' WHERE req_id=" + id);

                System.out.println("Approved");

            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
