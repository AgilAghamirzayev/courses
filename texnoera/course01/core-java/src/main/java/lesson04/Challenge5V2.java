package lesson04;

import java.util.Scanner;

public class Challenge5V2 {

  public static int camelcase(String s) {

    return (int) (s.chars()
            .filter(Character::isUpperCase)
            .count() + 1);

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String word = scanner.nextLine();

    int camelCaseCount = camelcase(word);

    System.out.println("CamelCase count: " + camelCaseCount);
  }
}
