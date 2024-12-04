package lesson23.files.write;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test4 {

  public static void main(String[] args) {
    String fileName = "cities.txt";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the city name: ");
    String name = scanner.nextLine();

    try (FileWriter fileWriter = new FileWriter(fileName)) {
      fileWriter.write(name);
    } catch (IOException e) {
      System.out.println("Error writing to file: " + fileName);
    }

  }

}
