package com.gla;

import java.sql.*;

public class VehicleServiceManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT vehicle
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO vehicles VALUES(?,?,?)");
        ps.setString(1, "UP15AB1234");
        ps.setString(2, "Rohit");
        ps.setString(3, "Pending");
        ps.executeUpdate();

        // READ pending vehicles
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM vehicles WHERE status='Pending'");
        while(rs.next()) {
            System.out.println(rs.getString(2));
        }

        // UPDATE status
        PreparedStatement ps2 = con.prepareStatement(
                "UPDATE vehicles SET status='Completed' WHERE regNo=?");
        ps2.setString(1, "UP15AB1234");
        ps2.executeUpdate();

        // DELETE vehicle
        PreparedStatement ps3 = con.prepareStatement(
                "DELETE FROM vehicles WHERE regNo=?");
        ps3.setString(1, "UP15AB1234");
        ps3.executeUpdate();

        con.close();
    }
}
