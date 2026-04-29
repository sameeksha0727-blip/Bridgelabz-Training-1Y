import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static final String URL = "jdbc:mysql://localhost:3306/route_tracker";
    static final String USER = "root";
    static final String PASS = "sam@#2707";

    public static Connection getConnection() {
        try {
            Connection con =
                    DriverManager.getConnection(URL, USER, PASS);
            System.out.println("JDBC Connected Successfully!");
            return con;
        } catch (Exception e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
            return null;
        }
    }
}

