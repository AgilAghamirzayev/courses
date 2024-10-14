package lesson04;

public class StringBuilderV1 {
  public static void main(String[] args) {
    String s = """
        SELECT * from Person where name = 'Ali'
        AND age > 30
        AND gender = 'Male'
        AND address LIKE '%Street%';
        """;

    String a = "SELECT * from Person where name = 'Ali'\n"
        + "AND age > 30\n"
        + "AND gender = 'Male'\n"
        + "AND address LIKE '%Street%';";

    System.out.println(s);
    StringBuilder sb = new StringBuilder();
    sb.append("SELECT * from Person where name = 'Ali'");
    sb.append("AND age > 30");
    sb.append("AND gender = 'Male'");
    sb.append("AND address LIKE '%Street%'");
    System.out.println(sb);

    String test = "";

    for (int i = 0; i < 10; i++) {
      test = test + " " + i  + "  ";
    }

    System.out.println(test);

  }
}
