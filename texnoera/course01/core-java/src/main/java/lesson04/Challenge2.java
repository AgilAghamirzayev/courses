package lesson04;

import java.util.Scanner;

public class Challenge2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();

    char charLetterP = s.charAt(0);
    char charLetterL = s.charAt(0);

    System.out.println("Next character: " + ++charLetterP);
    System.out.println("Previous character: " + --charLetterL);
  }

}
