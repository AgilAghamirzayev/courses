package lesson03;

import java.util.Scanner;

public class TernaryOperator {

  public static void main(String[] args) {
    // compare ? true : false

    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();

    if (a == 10) {
      System.out.println("a is equal to 10");
    } else if (a == 20) {
      System.out.println("a is equal to 20");
    } else if (a == 30) {
      System.out.println("a is equal to 30");
    } else {
      System.out.println("a is not equal");
    }


//    String test = a == 10 ? test1() : test2();

    String test = a == 10 ? "a is equal to 10" :
        a == 20 ? "a is equal to 20" :
            a == 30 ? "a is equal to 30" : "a is not equal";

    System.out.println(test);
  }

}
