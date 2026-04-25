package com.gla;

import java.sql.*;

public class ProductManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO product VALUES(?,?,?)");

        ps.setInt(1, 101);
        ps.setString(2, "Pen");
        ps.setInt(3, 5);
        ps.executeUpdate();

        ps.setInt(1, 102);
        ps.setString(2, "Notebook");
        ps.setInt(3, 20);
        ps.executeUpdate();

        ps.setInt(1, 103);
        ps.setString(2, "Pencil");
        ps.setInt(3, 8);
        ps.executeUpdate();

        // SELECT low stock
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM product WHERE qty < 10");

        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getInt(3));
        }

        // UPDATE
        PreparedStatement ps2 = con.prepareStatement(
                "UPDATE product SET qty = qty + 10 WHERE pid=?");
        ps2.setInt(1, 101);
        ps2.executeUpdate();

        // DELETE
        PreparedStatement ps3 = con.prepareStatement(
                "DELETE FROM product WHERE pid=?");
        ps3.setInt(1, 103);
        ps3.executeUpdate();

        con.close();
    }
}
