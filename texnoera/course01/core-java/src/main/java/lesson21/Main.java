package lesson21;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = "";
    int count = 0;
    System.out.println("String daxil edin ");
    String soz = scanner.nextLine();

    for (int i = 0; i < soz.length(); i++) {
      boolean c = false;
      if (i == 0) {
        s += soz.charAt(i);
      } else {
        for (int j = 0; j < s.length(); j++) {

          if (soz.charAt(i) == s.charAt(j)) {
            c = true;
            break;

          } else {
            c = false;
          }
        }
        if (!c) {
          s += soz.charAt(i);
        } else {
          continue;
        }
      }

    }

    for (int i = 0; i < s.length(); i++) {
      count = 0;
      for (int j = 0; j < soz.length(); j++) {
        if (s.charAt(i) == soz.charAt(j)) {
          count++;
        } else {
          continue;
        }
      }
      System.out.println(s.toLowerCase().charAt(i) + " -> " + count);
    }
  }
}
