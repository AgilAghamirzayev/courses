package lesson23.files.write;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test5 {

  public static void main(String[] args) {
    String fileName = "cities.txt";
    Scanner scanner = new Scanner(System.in);

    try (FileWriter fileWriter = new FileWriter(fileName)) {
      for (int i = 0; i < 3; i++) {
        System.out.print("Enter the city name: ");
        String name = scanner.nextLine();
        fileWriter.write(name);
      }
    } catch (IOException e) {
      System.out.println("Error writing to file: " + fileName);
    }


  }

}
