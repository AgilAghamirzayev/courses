package lesson26;

import java.util.List;

public class Test3 {
  public static void main(String[] args) {

    List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    nums.stream()
        .filter(i -> i % 2 == 0)
        .map(i -> i * i)
        .forEach(System.out::println);

  }
}
