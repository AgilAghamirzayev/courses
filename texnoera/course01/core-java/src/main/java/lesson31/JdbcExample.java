package lesson31;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

public class JdbcExample {
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String username = "postgres";
    String password = "postgres";


    try (Connection conn = DriverManager.getConnection(url, username, password)) {
      Class.forName("org.postgresql.Driver");

      // Read
      Statement selectStmt = conn.createStatement();
      ResultSet rs = selectStmt.executeQuery("SELECT * FROM student");
      while (rs.next()) {
        System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " " + rs.getString("surname"));
      }

      // Insert a student record
      PreparedStatement insertStmt = conn.prepareStatement(
          "INSERT INTO student (name, surname, age, course, mark, birth_place, created_at) VALUES (?, ?, ?, ?, ?, ?, ?)");
      insertStmt.setString(1, "John");
      insertStmt.setString(2, "Doe");
      insertStmt.setInt(3, 21);
      insertStmt.setString(4, "Computer Science");
      insertStmt.setBigDecimal(5, new BigDecimal("85.75"));
      insertStmt.setString(6, "New York");
      insertStmt.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
      insertStmt.executeUpdate();

      PreparedStatement selectByCourseStmt = conn.prepareStatement("SELECT * FROM student WHERE course = ?");
      selectByCourseStmt.setString(1, "Computer Science");
      ResultSet select = selectByCourseStmt.executeQuery();
      while (select.next()) {
        System.out.println(select.getString("name") + " is in " + select.getString("course"));
      }

      // Update Marks for a Specific Student:
      PreparedStatement updateStmt = conn.prepareStatement("UPDATE student SET mark = ? WHERE id = ?");
      updateStmt.setBigDecimal(1, new BigDecimal("90.50"));
      updateStmt.setInt(2, 1);
      int rowsUpdated = updateStmt.executeUpdate();
      System.out.println("Rows updated: " + rowsUpdated);

      // Update Course for All Students in a Specific Location:
      PreparedStatement updateCourseStmt = conn.prepareStatement("UPDATE student SET course = ? WHERE birth_place = ?");
      updateCourseStmt.setString(1, "Data Science");
      updateCourseStmt.setString(2, "New York");
      int rowsUpdated2 = updateCourseStmt.executeUpdate();
      System.out.println("Rows updated: " + rowsUpdated2);


      PreparedStatement deleteByAgeStmt = conn.prepareStatement("DELETE FROM student WHERE age < ?");
      deleteByAgeStmt.setInt(1, 18);
      int rowsDeleted = deleteByAgeStmt.executeUpdate();
      System.out.println("Rows deleted: " + rowsDeleted);


      // Transfer Marks Between Students:
      conn.setAutoCommit(false);
      try {
        // Reduce marks for Student A
        PreparedStatement reduceMarksStmt = conn.prepareStatement("UPDATE student SET mark = mark - ? WHERE id = ?");
        reduceMarksStmt.setBigDecimal(1, new BigDecimal("5.00"));
        reduceMarksStmt.setInt(2, 1);
        reduceMarksStmt.executeUpdate();

        // Increase marks for Student B
        PreparedStatement increaseMarksStmt = conn.prepareStatement("UPDATE student SET mark = mark + ? WHERE id = ?");
        increaseMarksStmt.setBigDecimal(1, new BigDecimal("5.00"));
        increaseMarksStmt.setInt(2, 2);
        increaseMarksStmt.executeUpdate();

        conn.commit();
        System.out.println("Transaction committed successfully.");
      } catch (SQLException e) {
        conn.rollback();
        e.printStackTrace();
        System.out.println("Transaction rolled back.");
      }


    } catch (ClassNotFoundException e) {
      System.err.println("PostgreSQL Driver not found. Add the driver to your classpath.");
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}