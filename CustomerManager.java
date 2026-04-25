package com.gla;

import java.sql.*;

public class CustomerManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO customers VALUES(?,?,?)");
        ps.setInt(1, 1);
        ps.setString(2, "Rahul");
        ps.setString(3, "9876543210");
        ps.executeUpdate();

        // SEARCH LIKE
        PreparedStatement ps2 = con.prepareStatement(
                "SELECT * FROM customers WHERE name LIKE ?");
        ps2.setString(1, "Ra%");
        ResultSet rs = ps2.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getString(2));
        }

        // UPDATE
        PreparedStatement ps3 = con.prepareStatement(
                "UPDATE customers SET phone=? WHERE id=?");
        ps3.setString(1, "9999999999");
        ps3.setInt(2, 1);
        ps3.executeUpdate();

        // DELETE
        PreparedStatement ps4 = con.prepareStatement(
                "DELETE FROM customers WHERE id=?");
        ps4.setInt(1, 1);
        ps4.executeUpdate();

        con.close();
    }
}
