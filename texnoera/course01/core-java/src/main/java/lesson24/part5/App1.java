package lesson24.part5;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class App1 {
  public static void main(String[] args) {
    Consumer<String> s = a -> System.out.println(a);
    Consumer<String> second = acceptedField -> System.out.println("Test");
//    s.accept("Hello world");
//    s.accept("Goodbye universe");
//    s.accept("Hello Earth");

    s.andThen(second)
        .andThen(s)
        .andThen(s)
        .accept("Hello World");

    Supplier<Double> d = () -> Math.random() * 100;
  }
}
