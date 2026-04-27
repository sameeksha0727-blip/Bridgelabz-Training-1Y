import java.sql.*;
import java.util.Scanner;

public class StudentService {

    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        try (Connection con = DBConnection.getConnection()) {

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Course: ");
            String course = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO students VALUES (?, ?, ?)"
            );

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, course);

            ps.executeUpdate();
            System.out.println("Student Added");

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void requestBook() {
        try (Connection con = DBConnection.getConnection()) {

            System.out.print("Student ID: ");
            int sid = sc.nextInt();

            System.out.print("Book ID: ");
            int bid = sc.nextInt();

            System.out.print("Type (ISSUE/RETURN): ");
            String type = sc.next();

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO requests (book_id, student_id, type, status) VALUES (?, ?, ?, 'PENDING')"
            );

            ps.setInt(1, bid);
            ps.setInt(2, sid);
            ps.setString(3, type);

            ps.executeUpdate();
            System.out.println("Request Sent");

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
