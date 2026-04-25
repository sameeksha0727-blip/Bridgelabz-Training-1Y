package com.gla;

import java.sql.*;

public class SalesManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO sales VALUES(?,?,?,?)");
        ps.setInt(1, 1);
        ps.setString(2, "Java Book");
        ps.setInt(3, 2);
        ps.setDouble(4, 500);
        ps.executeUpdate();

        // READ quantity > 1
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM sales WHERE quantity > 1");

        while(rs.next()) {
            System.out.println(rs.getString("bookName"));
        }

        // UPDATE quantity
        PreparedStatement ps2 = con.prepareStatement(
                "UPDATE sales SET quantity=? WHERE id=?");
        ps2.setInt(1, 5);
        ps2.setInt(2, 1);
        ps2.executeUpdate();

        // DELETE
        PreparedStatement ps3 = con.prepareStatement(
                "DELETE FROM sales WHERE id=?");
        ps3.setInt(1, 1);
        ps3.executeUpdate();

        con.close();
    }
}
