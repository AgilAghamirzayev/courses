package lesson02;

import java.util.Scanner;

public class Method04 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");

    int number1 = scanner.nextInt();

    System.out.println("Enter second number: ");

    int number2 = scanner.nextInt();

    int sum = number1 + number2;

    System.out.println(sum);

  }

  private int sum(int a, int b) {
    return a + b;
  }

  private void print(int result) {
    System.out.println("Result: " + result);
  }



}
