package lesson02.arrays;

import java.util.Arrays;

public class ArraysV4 {

  public static void main(String[] args) {

    int[]nums  = new int[10]; // [1,2,0,0,0,0,0,0,0,3]
    nums[0] = 1;
    nums[1] = 2;
    nums[9] = 3;

    System.out.println(nums[1]);

    nums[1] = 7;

    String string = Arrays.toString(nums);
    System.out.println(string);
  }

}
