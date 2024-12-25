package lesson26;

import java.util.List;
import java.util.stream.Stream;

public class Test6 {
  public static void main(String[] args) {
    List<String> names = List.of("Alice", "Bob", "Tom", "Jerry", "like", "good");

    names.stream()
        .filter(name -> {
          System.out.println(name);
          String c = String.valueOf(name.charAt(0));
          return c.equals(c.toUpperCase());
        })
        .map(String::toUpperCase)
        .forEach(System.out::println);
  }
}
