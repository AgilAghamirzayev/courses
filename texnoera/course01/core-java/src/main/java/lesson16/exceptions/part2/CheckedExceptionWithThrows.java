package lesson16.exceptions.part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionWithThrows {
  public static void main(String[] args) {

    try {
      readFile("test.txt");
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("An error occurred: " + e.getMessage());
    }

  }

  public static void readFile(String fileName) throws IOException {
    FileReader fileReader = new FileReader(fileName);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    System.out.println(bufferedReader.readLine());
    bufferedReader.close();
  }
}