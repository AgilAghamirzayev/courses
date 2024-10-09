package lesson02.method;

import java.util.Scanner;

public class Method05 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");

    int a = scanner.nextInt();

    System.out.println("Enter second number: ");

    int b = scanner.nextInt();

    int result = sum(a, b);
    print(result);

  }

  private static int sum(int a, int b) {
    return a + b;
  }

  private static void print(int result) {
    System.out.println("Result: " + result);
  }



}
