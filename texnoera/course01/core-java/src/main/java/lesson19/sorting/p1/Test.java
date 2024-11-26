package lesson19.sorting.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(List.of(4,5,3,2,1));
    System.out.println(numbers);

    Collections.sort(numbers);

    System.out.println(numbers);
  }
}
