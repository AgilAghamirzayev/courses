package lesson04;

public class StringBuilderV5 {
  public static void main(String[] args) {
    StringBuffer test = new StringBuffer();

    for (int i = 0; i < 10; i++) {
      test.append(" ").append(i).append("  ");
    }

    test.reverse();
    test.insert(5, "aa");

    System.out.println(test);
  }
}
