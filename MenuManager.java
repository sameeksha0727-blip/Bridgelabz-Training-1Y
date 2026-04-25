package com.gla;

import java.sql.*;

public class MenuManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO menu VALUES(?,?,?)");
        ps.setInt(1, 1);
        ps.setString(2, "Burger");
        ps.setDouble(3, 150);
        ps.executeUpdate();

        // READ price < 200
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM menu WHERE price < 200");

        while(rs.next()) {
            System.out.println(rs.getString("itemName"));
        }

        // UPDATE price
        PreparedStatement ps2 = con.prepareStatement(
                "UPDATE menu SET price=? WHERE id=?");
        ps2.setDouble(1, 180);
        ps2.setInt(2, 1);
        ps2.executeUpdate();

        // DELETE
        PreparedStatement ps3 = con.prepareStatement(
                "DELETE FROM menu WHERE id=?");
        ps3.setInt(1, 1);
        ps3.executeUpdate();

        con.close();
    }
}
