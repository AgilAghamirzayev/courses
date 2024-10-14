package lesson04;

public class StringBuilderV2 {
  public static void main(String[] args) {
    String test = "";

    for (int i = 0; i < 10; i++) {
      test = test + " " + i  + "  ";
    }

    System.out.println(test);

  }
}
