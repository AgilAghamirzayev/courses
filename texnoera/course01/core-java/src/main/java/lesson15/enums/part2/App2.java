package lesson15.enums.part2;

public class App2 {
  public static void main(String[] args) {
    Status[] values = Status.values();

    for (Status value : values) {
      System.out.println(value);
    }

    System.out.println(Status.valueOf("DO"));

  }
}
