package lesson05;

import java.util.Scanner;

public class Challenge1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    int[] wordsCount = new int[256];

    for (int i = 0; i < input.length(); i++) {
      wordsCount[input.charAt(i)]++;
    }

    char[] ch = new char[input.length()];

    for (int i = 0; i < input.length(); i++) {
      ch[i] = input.charAt(i);
      int charCount = 0;
      for (int j = 0; j <= i; j++) {
        if (ch[i] == input.charAt(j)) {
          charCount++;
        }
      }
      if (charCount == 1) {
        System.out.println("The occurrence of " + input.charAt(i) + " is: " + wordsCount[input.charAt(i)]);
      }
    }
  }

}
