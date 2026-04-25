package com.gla;

import java.sql.*;

public class LibraryManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO books VALUES(?,?,?,?)");
        ps.setInt(1, 1);
        ps.setString(2, "Java Basics");
        ps.setString(3, "James Gosling");
        ps.setString(4, "Available");
        ps.executeUpdate();

        // SELECT available
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM books WHERE status='Available'");
        while(rs.next()) {
            System.out.println(rs.getString(2));
        }

        // UPDATE
        PreparedStatement ps2 = con.prepareStatement(
                "UPDATE books SET status='Issued' WHERE id=?");
        ps2.setInt(1, 1);
        ps2.executeUpdate();

        // DELETE
        PreparedStatement ps3 = con.prepareStatement(
                "DELETE FROM books WHERE id=?");
        ps3.setInt(1, 1);
        ps3.executeUpdate();

        con.close();
    }
}
