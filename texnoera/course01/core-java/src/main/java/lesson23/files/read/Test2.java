package lesson23.files.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
  public static void main(String[] args) {

    try (BufferedReader reader = new BufferedReader(new FileReader("todo.txt"))) {
      String s = reader.readLine();
      System.out.println(s);
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    }

  }
}
