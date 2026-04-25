package com.gla;

import java.sql.*;

public class EnrollmentManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO enrollments VALUES(?,?,?)");
        ps.setInt(1, 1);
        ps.setString(2, "Ravi");
        ps.setString(3, "Java");
        ps.executeUpdate();

        // READ by course
        PreparedStatement ps2 = con.prepareStatement(
                "SELECT * FROM enrollments WHERE course=?");
        ps2.setString(1, "Java");
        ResultSet rs = ps2.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getString("student"));
        }

        // UPDATE course
        PreparedStatement ps3 = con.prepareStatement(
                "UPDATE enrollments SET course=? WHERE id=?");
        ps3.setString(1, "Python");
        ps3.setInt(2, 1);
        ps3.executeUpdate();

        // DELETE
        PreparedStatement ps4 = con.prepareStatement(
                "DELETE FROM enrollments WHERE id=?");
        ps4.setInt(1, 1);
        ps4.executeUpdate();

        con.close();
    }
}
