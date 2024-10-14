package lesson04;

import java.util.Scanner;

public class Challenge1 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();

    char charLetter = s.charAt(0);

    int charToIntLetter = (int) charLetter;

    int nextInt = charToIntLetter + 1;
    int previousInt = charToIntLetter - 1;

    char nextChar = (char) nextInt;
    char previousChar = (char) previousInt;

    System.out.println("Next character: " + nextChar);
    System.out.println("Previous character: " + previousChar);

  }

}
