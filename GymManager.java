package com.gla;

import java.sql.*;

public class GymManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO members VALUES(?,?,?,?)");
        ps.setInt(1, 1);
        ps.setString(2, "Ankit");
        ps.setString(3, "Premium");
        ps.setInt(4, 6);
        ps.executeUpdate();

        // READ Premium members
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM members WHERE type='Premium'");

        while(rs.next()) {
            System.out.println(rs.getString("name"));
        }

        // UPDATE extend months
        PreparedStatement ps2 = con.prepareStatement(
                "UPDATE members SET months = months + ? WHERE id=?");
        ps2.setInt(1, 3);
        ps2.setInt(2, 1);
        ps2.executeUpdate();

        // DELETE
        PreparedStatement ps3 = con.prepareStatement(
                "DELETE FROM members WHERE id=?");
        ps3.setInt(1, 1);
        ps3.executeUpdate();

        con.close();
    }
}
