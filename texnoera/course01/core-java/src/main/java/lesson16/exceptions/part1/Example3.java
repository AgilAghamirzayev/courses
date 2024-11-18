package lesson16.exceptions.part1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Enter a number: ");
      int number = scanner.nextInt();
      System.out.println(number);
      scanner.close();
    } catch (InputMismatchException expected) {
      System.out.println("Invalid input. Please enter a number.");
      scanner.close();
    }

  }

}
