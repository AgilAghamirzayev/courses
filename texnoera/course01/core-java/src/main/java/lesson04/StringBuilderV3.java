package lesson04;

public class StringBuilderV3 {
  public static void main(String[] args) {
    StringBuilder test = new StringBuilder();

    for (int i = 0; i < 10; i++) {
      test.append(" ").append(i).append("  ");
    }

    System.out.println(test);
  }
}
