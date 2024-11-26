package lesson17.part4;

import java.util.Arrays;

public class Test2 {

  public static void main(String[] args) {
    Integer[] i = new Integer[] {1, 2, 3};
    Double[] d = new Double[] {1.2, 2.5, 3.2};
    String[] s = new String[] {"bir", "iki", "uc"};

    print(i);
    print(d);
    print(s);
    System.out.println(getFirstElement(s));
  }

  public static <E> void print(E[] e) {
    System.out.println(Arrays.toString(e));
  }

  public static <E>  E getFirstElement(E[] e) {
    return e[0];
  }
}
