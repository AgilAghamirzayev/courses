package lesson02.arrays;

import java.util.Arrays;

public class ArraysV3 {

  public static void main(String[] args) {

    int[]nums  = new int[10];
    nums[0] = 1;
    nums[1] = 2;
    nums[9] = 3;

    String string = Arrays.toString(nums);
    System.out.println(string);
  }

}
