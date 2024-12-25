package lesson24.part3;

import java.util.Comparator;
import java.util.function.Consumer;
import lesson101.lambda.part2.Function;
import lesson101.lambda.part2.Predicate;
import lesson24.Calculator;

public class App2 {
  public static void main(String[] args) {

    Calculator sum = (a, b) -> System.out.printf("%d + %d = %d\n", a, b, a + b);
    Calculator divide = (a, b) -> System.out.printf("%d / %d = %d\n", a, b, a / b);
    Calculator multiply = (a, b) -> System.out.printf("%d * %d = %d\n", a, b, a * b);
    Calculator subtract = (a, b) -> System.out.printf("%d - %d = %d\n", a, b, a - b);

    sum.calculate(10, 2);
    divide.calculate(10, 2);
    multiply.calculate(10, 2);
    subtract.calculate(10, 2);

  }
}
