package lesson24.part6;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import lesson101.lambda.part2.Function;

public class App3 {
  public static void main(String[] args) {
    List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    Predicate<Integer> isEven = n -> n % 2 == 0;
    BinaryOperator<Integer> sum = Integer::sum;
    IntConsumer print = System.out::println;

    int result = 0;

    for (Integer num : nums) {
      if (isEven.test(num)) {
        result = sum.apply(result, num);
      }
    }

    print.accept(result);
  }
}
