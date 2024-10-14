package lesson04;

import java.util.Scanner;

public class Challenge5 {

  public static int camelcase(String s) {

    int wordCount = 1;

    for (int i = 0; i < s.length(); i++) {
      if ('A' <= s.charAt(i) && 'Z' >= s.charAt(i) ){
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
