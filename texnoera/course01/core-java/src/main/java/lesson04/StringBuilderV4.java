package lesson04;

public class StringBuilderV4 {
  public static void main(String[] args) {
    StringBuilder test = new StringBuilder();

    for (int i = 0; i < 10; i++) {
      test.append(" ").append(i).append("  ");
    }

    test.reverse();
    test.insert(5, "aa");

    System.out.println(test);
  }
}
