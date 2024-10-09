package lesson02;

import java.util.Scanner;

public class Method06 {

  public static void main(String[] args) {

    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number: ");

      int a = scanner.nextInt();

      System.out.print("Enter second number: ");

      int b = scanner.nextInt();

      double divide = divide(a, b);
      int multiply = multiply(a, b);
      print(divide);
      print(multiply);
      System.out.println();
    }


  }

  private static int subtract(int a, int b) {
    return a - b;
  }

  private static double divide(int a, int b) {
    if (b == 0) {
      System.err.println("Error: Division by zero is not allowed.");
    }
    return (double) a / (double) b;
  }

  private static int multiply(int a, int b) {
    return a * b;
  }

  private static int sum(int a, int b) {
    return a + b;
  }

  private static void print(int result) {
    System.out.println("Result: " + result);
  }

  private static void print(double result) {
    System.out.println("Result: " + result);
  }


}
