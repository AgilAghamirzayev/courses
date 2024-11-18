package lesson16.exceptions.part1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example6 {

  public static void main(String[] args) {
    // try-cache with resources
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int number = scanner.nextInt();
      System.out.println(number);
    } catch (InputMismatchException expected) {
      expected.printStackTrace();
      System.out.println("Invalid input. Please enter a number.");
    }

  }

}
