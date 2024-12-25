package lesson26;

import java.util.ArrayList;
import java.util.List;

public class Test13 {
  public static void main(String[] args) {
    List<List<String>> groups = List.of(
        List.of("a", "b", "c"),
        List.of("d", "e", "f"),
        List.of("g", "h", "i")
    );

    List<String>  ng = new ArrayList<>();

    groups.stream()
        .forEach( group -> group.stream()
            .forEach( o -> ng.add(o)));

    ng.forEach( System.out::println);

  }
}
