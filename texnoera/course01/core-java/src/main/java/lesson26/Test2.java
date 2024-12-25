package lesson26;

import java.util.List;

public class Test2 {
  public static void main(String[] args) {

    var nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) % 2 == 0) {
        int pow =  nums.get(i) * nums.get(i);
        System.out.println(pow);
      }
    }


  }
}
