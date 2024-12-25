package lesson24.part6;

import java.util.List;
import java.util.function.Predicate;

public class App2 {
  public static void main(String[] args) {
    List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    Predicate<Integer> isEven = n -> n % 2 == 0;

    int sum = 0;

    for (int i = 0; i < nums.size(); i++) {
      if (isEven.test(nums.get(i))) {
        sum = sum + nums.get(i);
      }
    }

    System.out.println(sum);
  }
}
