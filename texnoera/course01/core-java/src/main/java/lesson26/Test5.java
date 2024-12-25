package lesson26;

import java.util.Random;
import java.util.stream.Stream;

public class Test5 {
  public static void main(String[] args) {
    Stream.generate(new Random()::nextInt)
        .forEach(System.out::println);
  }
}
