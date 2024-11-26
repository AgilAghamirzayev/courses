package lesson16.exceptions.part2;

import java.sql.*;

public class CheckedExceptionSQL {
    public static void main(String[] args) {
        try {
            connectToDatabase();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    public static void connectToDatabase() throws SQLException {
        throw new SQLException("Unable to connect to the database!");
    }
}