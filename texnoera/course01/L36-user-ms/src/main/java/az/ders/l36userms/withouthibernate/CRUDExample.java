package az.ders.l36userms.withouthibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDExample {
  
  // Set up the database connection
  private static final String DB_URL = "jdbc:mysql://localhost/mydatabase";
  private static final String DB_USER = "myuser";
  private static final String DB_PASSWORD = "mypassword";

  public static void main(String[] args) {
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
      // Create a new record
      String insertQuery = "INSERT INTO users (name, email) VALUES (?, ?)";
      PreparedStatement pstmt = conn.prepareStatement(insertQuery);
      pstmt.setString(1, "John Doe");
      pstmt.setString(2, "johndoe@example.com");
      int rowsAffected = pstmt.executeUpdate();
      System.out.println("Inserted " + rowsAffected + " rows.");

      // Retrieve a record
      String selectQuery = "SELECT * FROM users WHERE id = ?";
      pstmt = conn.prepareStatement(selectQuery);
      pstmt.setInt(1, 1);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String email = rs.getString("email");
        System.out.println(id + ": " + name + " (" + email + ")");
      }

      // Update a record
      String updateQuery = "UPDATE users SET email = ? WHERE id = ?";
      pstmt = conn.prepareStatement(updateQuery);
      pstmt.setString(1, "newemail@example.com");
      pstmt.setInt(2, 1);
      rowsAffected = pstmt.executeUpdate();
      System.out.println("Updated " + rowsAffected + " rows.");

      // Delete a record
      String deleteQuery = "DELETE FROM users WHERE id = ?";
      pstmt = conn.prepareStatement(deleteQuery);
      pstmt.setInt(1, 1);
      rowsAffected = pstmt.executeUpdate();
      System.out.println("Deleted " + rowsAffected + " rows.");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
