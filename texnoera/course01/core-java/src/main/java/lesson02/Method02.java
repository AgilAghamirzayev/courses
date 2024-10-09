package lesson02;

import java.util.Scanner;

public class Method02 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");

    int number1 = scanner.nextInt();

    System.out.println("Enter second number: ");

    int number2 = scanner.nextInt();

    int sum = number1 + number2;

    System.out.println(sum);

  }

  private void sumAndPrint(int a, int b) {
    int sum = a + b;
    System.out.println(sum);
  }

}
