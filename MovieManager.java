package com.gla;

import java.sql.*;

public class MovieManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT movies
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO movies VALUES(?,?,?)");

        ps.setInt(1, 1);
        ps.setString(2, "Avengers");
        ps.setInt(3, 50);
        ps.executeUpdate();

        // READ available seats
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM movies WHERE seats > 0");
        while(rs.next()) {
            System.out.println(rs.getString(2));
        }

        // UPDATE book ticket (-1 seat)
        PreparedStatement ps2 = con.prepareStatement(
                "UPDATE movies SET seats = seats - 1 WHERE id=?");
        ps2.setInt(1, 1);
        ps2.executeUpdate();

        // DELETE movie
        PreparedStatement ps3 = con.prepareStatement(
                "DELETE FROM movies WHERE id=?");
        ps3.setInt(1, 1);
        ps3.executeUpdate();

        con.close();
    }
}
