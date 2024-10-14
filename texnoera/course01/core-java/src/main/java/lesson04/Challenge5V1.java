package lesson04;

import java.util.Scanner;

public class Challenge5V1 {

  public static int camelcase(String s) {

    int wordCount = 1;

    for (char c : s.toCharArray()) {
      if ('A' <= c && 'Z' >= c) {
        wordCount++;
      }
    }

    return wordCount;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String word = scanner.nextLine();

    int camelCaseCount = camelcase(word);

    System.out.println("CamelCase count: " + camelCaseCount);
  }
}
