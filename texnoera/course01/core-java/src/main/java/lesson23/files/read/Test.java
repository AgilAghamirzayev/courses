package lesson23.files.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
  public static void main(String[] args) {

    try (FileReader reader = new FileReader("todo.txt")) {

        System.out.print((char) reader.read());


    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    }

  }
}
