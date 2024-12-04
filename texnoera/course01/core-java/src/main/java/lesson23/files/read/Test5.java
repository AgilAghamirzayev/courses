package lesson23.files.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test5 {
  public static void main(String[] args) {

    ArrayList<String> todo = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader("todo.txt"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        todo.add(line);
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    }

    System.out.println(todo);
  }
}
