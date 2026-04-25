package com.gla;

import java.sql.*;

public class PatientManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT patient
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO patients VALUES(?,?,?)");
        ps.setInt(1, 1);
        ps.setString(2, "Riya");
        ps.setString(3, "Fever");
        ps.executeUpdate();

        // READ patients with disease
        PreparedStatement ps2 = con.prepareStatement(
                "SELECT * FROM patients WHERE disease=?");
        ps2.setString(1, "Fever");
        ResultSet rs = ps2.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getString(2));
        }

        // UPDATE disease
        PreparedStatement ps3 = con.prepareStatement(
                "UPDATE patients SET disease=? WHERE id=?");
        ps3.setString(1, "Cold");
        ps3.setInt(2, 1);
        ps3.executeUpdate();

        // DELETE patient
        PreparedStatement ps4 = con.prepareStatement(
                "DELETE FROM patients WHERE id=?");
        ps4.setInt(1, 1);
        ps4.executeUpdate();

        con.close();
    }
}
