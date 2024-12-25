package lesson24.part5;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import lesson101.lambda.part2.Function;

public class App4 {
  public static void main(String[] args) {
    Consumer<Double> s = a -> System.out.println(a);
    Supplier<Double> d = () -> Math.random() * 100;
    s.accept(d.get());

    Consumer<String> s1 = System.out::println;
    Function<Integer, String> f = word ->
        switch (word) {
          case 1 -> "one";
          case 2 -> "two";
          default -> "unknown";
        };

    s1.accept(f.apply(1));
    s1.accept(f.apply(2));
    s1.accept(f.apply(10));

    Predicate<Integer> isGreaterThan10 = number -> {
      if (number > 10) {
        return true;
      } else {
        return false;
      }
    } ;

    System.out.println(isGreaterThan10.test(5));
    System.out.println(isGreaterThan10.test(15));

  }
}

