package lesson23.files.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test9 {

  public static void main(String[] args) {
    String fileName = "todo.txt";
    Scanner scanner = new Scanner(System.in);

    try (FileWriter fr = new FileWriter(fileName, true);
         BufferedWriter writer = new BufferedWriter(fr, 1024)) {
      for (int i = 0; i < 3; i++) {
        System.out.print("ADD TO DO: ");
        String sb = String.format("%s. %s \n", i + 1, scanner.nextLine());
        writer.write(sb);
      }
    } catch (IOException e) {
      System.out.println("Error writing to file: " + fileName);
    }

  }

}
