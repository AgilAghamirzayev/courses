package lesson3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge1 {

  public static void main(String[] args) {
    Stream.generate(() -> (int)(Math.random() * 200 - 100))
        .limit(30)
        .collect(Collectors.groupingBy(n -> n < 0 ? n % 2 == 0 ? "NE" : "NO" : n % 2 == 0 ? "PE" : "PO"))
        .forEach((k, v) -> System.out.printf("%s %s \n", k, v));
  }

}
