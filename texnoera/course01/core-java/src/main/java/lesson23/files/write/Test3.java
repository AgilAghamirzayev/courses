package lesson23.files.write;

import java.io.FileWriter;
import java.io.IOException;

public class Test3 {

  public static void main(String[] args) {
    String fileName = "cities.txt";
    String cities = "New York, London, Tokyo, Paris";

    try (FileWriter fileWriter = new FileWriter(fileName)) {
      fileWriter.write(cities);
    } catch (IOException e) {
      System.out.println("Error writing to file: " + fileName);
    }

  }

}
