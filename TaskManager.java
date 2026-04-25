package com.gla;

import java.sql.*;

public class TaskManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        // INSERT
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO tasks VALUES(?,?,?)");
        ps.setInt(1, 1);
        ps.setString(2, "Complete JDBC Assignment");
        ps.setString(3, "Pending");
        ps.executeUpdate();

        // READ Pending tasks
        ResultSet rs = con.createStatement().executeQuery(
                "SELECT * FROM tasks WHERE status='Pending'");

        while(rs.next()) {
            System.out.println(rs.getString("title"));
        }

        // UPDATE Completed
        PreparedStatement ps2 = con.prepareStatement(
                "UPDATE tasks SET status='Completed' WHERE id=?");
        ps2.setInt(1, 1);
        ps2.executeUpdate();

        // DELETE Completed tasks
        con.createStatement().executeUpdate(
                "DELETE FROM tasks WHERE status='Completed'");

        con.close();
    }
}
