package com.gla;

import java.sql.*;

public class BankAccountManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT (Create account)
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO accounts VALUES(?,?,?)");
        ps.setInt(1, 101);
        ps.setString(2, "Aman");
        ps.setDouble(3, 15000);
        ps.executeUpdate();

        // READ balance > 10000
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM accounts WHERE balance > 10000");
        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getDouble(3));
        }

        // UPDATE Deposit (+5000)
        PreparedStatement ps2 = con.prepareStatement(
                "UPDATE accounts SET balance = balance + ? WHERE accNo=?");
        ps2.setDouble(1, 5000);
        ps2.setInt(2, 101);
        ps2.executeUpdate();

        // DELETE account
        PreparedStatement ps3 = con.prepareStatement(
                "DELETE FROM accounts WHERE accNo=?");
        ps3.setInt(1, 101);
        ps3.executeUpdate();

        con.close();
    }
}
