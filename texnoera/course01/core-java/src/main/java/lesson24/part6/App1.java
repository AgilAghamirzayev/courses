package lesson24.part6;

import java.util.List;

public class App1 {
  public static void main(String[] args) {
    List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    int sum = 0;

    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) % 2 == 0) {
        sum = sum + nums.get(i);
      }
    }

    System.out.println(sum);
  }
}
