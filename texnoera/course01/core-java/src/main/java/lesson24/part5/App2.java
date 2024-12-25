package lesson24.part5;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class App2 {
  public static void main(String[] args) {
    Consumer<Double> s = a -> System.out.println(a);
    Supplier<Double> d = () -> Math.random() * 100;
    
    s.accept(d.get());
  }
}
