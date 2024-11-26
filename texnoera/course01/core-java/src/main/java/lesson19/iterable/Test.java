package lesson19.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Fail fast and fail safe difference

public class Test {

  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 5, 2, 67, 7));

    System.out.println(nums);

    int j = 0;
    while (nums.size() > 0) {
      nums.remove(0);
      nums.removeFirst();
      nums.removeLast();
      nums.remove(nums.size()-1);
      j++;
    }

    System.out.println(nums);



    Iterator<Integer> iterator = nums.iterator();

    while (iterator.hasNext()) {
      Integer next = iterator.next();
      System.out.println(next);
    }


  }

}
