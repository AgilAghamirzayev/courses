package lesson16.exceptions.part1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example5 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Enter a number: ");
      int number = scanner.nextInt();
      System.out.println(number);
    } catch (InputMismatchException expected) {
      expected.printStackTrace();
      System.out.println("Invalid input. Please enter a number.");
    } finally {
      System.out.println("Finally");
      scanner.close();
    }

  }

}
