package lesson26;

import java.util.List;
import java.util.stream.Stream;

public class Test11 {
  public static void main(String[] args) {
    List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    Stream<Integer> stream = nums.stream();

    int sum = stream
        .mapToInt(i -> i)
        .sum();
    System.out.println(sum);


  }
}
