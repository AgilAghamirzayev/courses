package lesson3;

import java.util.Arrays;
import java.util.Random;

public class Challenge2 {

  public static void main(String[] args) {
    Random random = new Random();
    int[] array = new int[30];

    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(-100, 100);
    }

    System.out.println(-31%2);
    System.out.println("Original array: " + Arrays.toString(array));
    // odd, even
    int on = 0;
    int en = 0;
    int ep = 0;
    int op = 0;

    for (int i = 0; i < array.length; i++) {
      if        (array[i] < 0 && array[i] % 2 != 0) {
        on++;
      } else if (array[i] < 0 && array[i] % 2 == 0) {
        en++;
      } else if (array[i] > 0 && array[i] % 2 == 0) {
        ep++;
      } else if (array[i] > 0 && array[i] % 2 == 1) {
        op++;
      }
    }

    int[] ona = new int[on];
    int[] ena = new int[en];
    int[] epa = new int[ep];
    int[] opa = new int[op];


    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0 && array[i] % 2 != 0) {
        ona[--on] = array[i];
      } else if (array[i] < 0 && array[i] % 2 == 0) {
        ena[--en] = array[i];
      } else if (array[i] > 0 && array[i] % 2 == 0) {
        epa[--ep] = array[i];
      } else if (array[i] > 0 && array[i] % 2 == 1) {
        opa[--op] = array[i];
      }
    }

    print(ona);
    print(ena);
    print(epa);
    print(opa);


  }

  private static void print(int[] ona) {
    System.out.println(Arrays.toString(ona));
  }

}
