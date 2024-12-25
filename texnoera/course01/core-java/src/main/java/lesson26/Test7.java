package lesson26;

import java.util.List;

public class Test7 {
  public static void main(String[] args) {
    List<Integer> nums = List.of(1, 2, 3);

    nums.stream()
        .filter(i -> {
          System.out.println(i);
          return i == 2;
        }).forEach(i -> System.out.println(i));

  }
}
