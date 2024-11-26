package lesson17.part4;

import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    Integer[] i = new Integer[] {1, 2, 3};
    Double[] d = new Double[] {1.2, 2.5, 3.2};
    String[] s = new String[] {"bir", "iki", "uc"};

    printInteger(i);
    printDouble(d);
    printString(s);
  }

  private static void printString(String[] s) {
    System.out.println(Arrays.toString(s));
  }

  private static void printDouble(Double[] d) {
    System.out.println(Arrays.toString(d));

  }
  
  private static void printInteger(Integer[] i) {
    System.out.println(Arrays.toString(i));
  }

}
