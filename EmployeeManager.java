package com.gla;

import java.sql.*;

public class EmployeeManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT
        PreparedStatement ps1 = con.prepareStatement(
                "INSERT INTO employee VALUES(?,?,?)");
        ps1.setInt(1, 1);
        ps1.setString(2, "Amit");
        ps1.setDouble(3, 35000);
        ps1.executeUpdate();

        // SELECT salary > 30000
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM employee WHERE salary > 30000");
        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getDouble(3));
        }

        // UPDATE
        PreparedStatement ps2 = con.prepareStatement(
                "UPDATE employee SET salary = salary * 1.10 WHERE id=?");
        ps2.setInt(1, 1);
        ps2.executeUpdate();

        // DELETE
        con.createStatement().executeUpdate(
                "DELETE FROM employee WHERE salary < 15000");

        con.close();
    }
}
