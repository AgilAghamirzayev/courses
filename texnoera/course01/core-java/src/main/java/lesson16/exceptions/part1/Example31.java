package lesson16.exceptions.part1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example31 {

  public static void main(String[] args) {
    inputNumber();
  }

  private static void inputNumber()  {

    while (true) {
      try {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(number);
        scanner.close();
        break;
      } catch (InputMismatchException runtimeException) {
        runtimeException.printStackTrace();
        System.out.println("Please enter a number !!!");
      }
    }
  }


}
