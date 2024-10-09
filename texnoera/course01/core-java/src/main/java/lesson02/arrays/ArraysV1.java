package lesson02.arrays;

public class ArraysV1 {

  public static void main(String[] args) {

    int[] nums = new int[10];
    boolean[] booleans = new boolean[10];

    print(nums);
    print(booleans);
  }

  public static void print(int[] nums) {
    System.out.print("[ ");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + ", ");
    }
    System.out.print(" ]");

  }

  public static void print(boolean[] nums) {
    System.out.print("[ ");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + ", ");
    }
    System.out.print(" ]");

  }


}
