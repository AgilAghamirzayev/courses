package lesson02.arrays;

public class ArraysV2 {

  public static void main(String[] args) {

    int[] nums = new int[10];
    nums[0] = 1;
    nums[1] = 2;
    nums[9] = 3;

    print(nums);
  }


  public static void print(int[] nums) {
    System.out.print("[ ");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + ", ");
    }
    System.out.print(" ]");
  }



}
