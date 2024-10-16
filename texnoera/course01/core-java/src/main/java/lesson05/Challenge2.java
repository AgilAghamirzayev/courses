package lesson05;

import java.util.Scanner;

public class Challenge2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    String lowerCase = input.toLowerCase();

    int[] wordsCount = new int[26];

    for (int i = 0; i < lowerCase.length(); i++) {
      int c = lowerCase.charAt(i) - 'a';
      wordsCount[c]++;
    }

    for (int i = 0; i < 26; i++) {
      if (wordsCount[i] > 0) {
        System.out.println((char) ('a' + i) + ": " + wordsCount[i]);
      }
    }

  }

}
