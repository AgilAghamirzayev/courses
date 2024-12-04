package lesson23.files.write;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test6 {

  public static void main(String[] args) {
    String fileName = "todo.txt";
    Scanner scanner = new Scanner(System.in);

    try (FileWriter fileWriter = new FileWriter(fileName)) {
      for (int i = 0; i < 3; i++) {
        System.out.print("ADD TO DO: ");
        String name = scanner.nextLine();
        fileWriter.write(i + 1 + ". ");
        fileWriter.write(name);
        fileWriter.write("\n");

      }
    } catch (IOException e) {
      System.out.println("Error writing to file: " + fileName);
    }


  }

}
