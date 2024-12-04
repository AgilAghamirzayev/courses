package lesson23.files.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {
  public static void main(String[] args) {

    try (BufferedReader reader = new BufferedReader(new FileReader("todo.txt"))) {
      String line;
      while ((line = reader.readLine()) != null ) {
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    }

  }
}
