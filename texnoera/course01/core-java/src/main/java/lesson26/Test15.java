package lesson26;

import java.util.List;

public class Test15 {
  public static void main(String[] args) {
    var nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    int sum1 = nums.stream()
        .mapToInt(i -> i)
        .sum();

    Integer sum2 = nums.stream()
        .reduce(0, Integer::max);

    System.out.println(sum1);
    System.out.println(sum2);
  }
}
