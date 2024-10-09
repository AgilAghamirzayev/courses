package lesson02.arrays;

import java.util.Arrays;

public class ArraysV7 {

  public static void main(String[] args) {

    int[][] nums = new int[4][3];

    nums[0][0] = 1;
    nums[1][2] = 9;
    nums[3][2] = 8;


    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }

  }



}
