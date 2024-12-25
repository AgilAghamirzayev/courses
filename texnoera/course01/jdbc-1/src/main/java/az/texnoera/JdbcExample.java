package az.texnoera;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String username = "postgres";
    String password = "postgres";

    try (Connection conn = DriverManager.getConnection(url, username, password)) {
      Class.forName("org.postgresql.Driver");

//    Read
//      List<Student> students = getStudentList(conn);
//      students.forEach(System.out::println);

//    Insert a student record
//      addStudent(conn, new Student(1, "Aysu", "Aliyeva", 22));

      List<Student> csStudents = getStudentsByCourse(conn, "Computer Science");
      System.out.println("Computer Science Students");
      csStudents.forEach(System.out::println);

      List<Student> bStudents = getStudentsByCourse(conn, "Biology");
      System.out.println("Biology Students");
      bStudents.forEach(System.out::println);

      List<Student> tStudents = getStudentsByCourse(conn, "Test");
      System.out.println("Test Students");
      tStudents.forEach(System.out::println);

//
//    Update Marks for a Specific Student:
//      PreparedStatement updateStmt = conn.prepareStatement("UPDATE student SET mark = ? WHERE id = ?");
//      updateStmt.setBigDecimal(1, new BigDecimal("90.50"));
//      updateStmt.setInt(2, 1);
//      int rowsUpdated = updateStmt.executeUpdate();
//      System.out.println("Rows updated: " + rowsUpdated);
//
//      // Update Course for All Students in a Specific Location:
//      PreparedStatement updateCourseStmt = conn.prepareStatement("UPDATE student SET course = ? WHERE birth_place = ?");
//      updateCourseStmt.setString(1, "Data Science");
//      updateCourseStmt.setString(2, "New York");
//      int rowsUpdated2 = updateCourseStmt.executeUpdate();
//      System.out.println("Rows updated: " + rowsUpdated2);
//
//
//      PreparedStatement deleteByAgeStmt = conn.prepareStatement("DELETE FROM student WHERE age < ?");
//      deleteByAgeStmt.setInt(1, 18);
//      int rowsDeleted = deleteByAgeStmt.executeUpdate();
//      System.out.println("Rows deleted: " + rowsDeleted);
//
//
//      // Transfer Marks Between Students:\
      Savepoint savepoint = null;
      conn.setAutoCommit(false);
      try {
        // Reduce marks for Student A
        PreparedStatement reduceMarksStmt = conn.prepareStatement("UPDATE student SET mark = mark - ? WHERE id = ?");
        reduceMarksStmt.setBigDecimal(1, new BigDecimal("5.00"));
        reduceMarksStmt.setInt(2, 1);
        reduceMarksStmt.executeUpdate();
        savepoint = conn.setSavepoint("");

//
//        // Increase marks for Student B
        PreparedStatement increaseMarksStmt = conn.prepareStatement("UPDATE student SET mark = mark + ? WHERE id = ?");
        increaseMarksStmt.setBigDecimal(1, new BigDecimal("5.00"));
        increaseMarksStmt.setInt(2, 2);
        increaseMarksStmt.executeUpdate();
//
        conn.commit();
        System.out.println("Transaction committed successfully.");
      } catch (SQLException e) {
        conn.rollback(savepoint);
        e.printStackTrace();
        System.out.println("Transaction rolled back.");
      }
//
    } catch (ClassNotFoundException e) {
      System.err.println("PostgreSQL Driver not found. Add the driver to your classpath. " + e.getMessage());
    } catch (SQLException e) {
      System.out.println("Something went wrong " + e.getMessage());
    }
  }

  private static List<Student> getStudentsByCourse(Connection conn, String course) {
    try {
      PreparedStatement selectByCourseStmt =
          conn.prepareStatement("SELECT * FROM student WHERE course = ?");
      selectByCourseStmt.setString(1,  course);
      ResultSet select = selectByCourseStmt.executeQuery();
      List<Student> students = new ArrayList<>();

      while (select.next()) {
        Student student = new Student(
            select.getInt("id"),
            select.getString("name"),
            select.getString("surname"),
            select.getInt("age")
        );
        students.add(student);
      }
      return students;
    } catch (SQLException e) {
      System.out.println("Something went wrong " + e.getMessage());
    }

    return List.of();
  }

  private static void addStudent(Connection conn, Student student) {
    try {
      PreparedStatement insertStmt = conn.prepareStatement("""
          INSERT INTO student (name, surname, age) VALUES (?, ?, ?)
          """);
      insertStmt.setString(1, student.name());
      insertStmt.setString(2, student.surname());
      insertStmt.setInt(3, student.age());
      insertStmt.executeUpdate();

    } catch (SQLException e) {
      System.out.println("Something went wrong " + e.getMessage());
    }
  }

  private static List<Student> getStudentList(Connection conn) {

    try {
      Statement selectStmt = conn.createStatement();
      ResultSet rs = selectStmt.executeQuery("SELECT * FROM student");

      List<Student> students = new ArrayList<>();

      while (rs.next()) {
        Student student = new Student(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getString("surname"),
            rs.getInt("age")
        );
        students.add(student);
      }
      return students;

    } catch (SQLException e) {
      System.out.println("Something went wrong " + e.getMessage());
    }

    return List.of();
  }
}