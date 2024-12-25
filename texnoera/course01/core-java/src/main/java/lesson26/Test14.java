package lesson26;

import java.util.ArrayList;
import java.util.List;

public class Test14 {
  public static void main(String[] args) {
    List<List<String>> groups = List.of(
        List.of("a", "b", "c"),
        List.of("d", "e", "f"),
        List.of("g", "h", "i")
    );

    List<String> list = groups.stream()
        .flatMap(a -> a.stream())
        .toList();

    list.forEach(System.out::println);

  }
}
