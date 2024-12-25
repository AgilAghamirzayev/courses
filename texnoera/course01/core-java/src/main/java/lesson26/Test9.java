package lesson26;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test9 {
  public static void main(String[] args) {
    List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    Stream<Integer> stream = nums.stream();
    Set<Integer> n = stream
        .filter(i -> i % 2 == 0)
        .collect(Collectors.toSet());

  }
}
