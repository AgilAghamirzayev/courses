package lesson26;

import java.util.List;
import java.util.stream.Stream;

public class Test12 {
  public static void main(String[] args) {
    List<List<String>> groups = List.of(
        List.of("a", "b", "c"),
        List.of("d", "e", "f"),
        List.of("g", "h", "i")
    );

    groups.stream()
        .forEach( group -> group.stream()
            .forEach(System.out::println));



  }
}
