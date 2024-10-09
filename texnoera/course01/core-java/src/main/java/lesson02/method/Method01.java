package lesson02.method;

import java.util.Scanner;

public class Method01 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");

    int number1 = scanner.nextInt();

    System.out.println("Enter second number: ");

    int number2 = scanner.nextInt();

    int sum = number1 + number2;

    System.out.println(sum);


  }

}
