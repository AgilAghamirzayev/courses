package lesson23.files.write;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test7 {

  public static void main(String[] args) {
    String fileName = "todo.txt";
    Scanner scanner = new Scanner(System.in);

    try (FileWriter fileWriter = new FileWriter(fileName)) {
      for (int i = 0; i < 3; i++) {
        System.out.print("ADD TO DO: ");
        String sb = String.format("%s. %s \n", i + 1, scanner.nextLine());
        fileWriter.write(sb);
      }
    } catch (IOException e) {
      System.out.println("Error writing to file: " + fileName);
    }

  }

}
