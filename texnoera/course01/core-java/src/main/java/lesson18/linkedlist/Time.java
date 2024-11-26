package lesson18.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Time {

  public static void main(String[] args) {

    O_N();
  }

  // O(n)
  private static void O_N() {
    List<Integer> l = new ArrayList<>();
    int N = l.size();
    for (int i = 0; i < N; i++) {
      System.out.println("----");
    }
  }

  // O(n^2)
  private static void O_N2() {
    List<Integer> l = new ArrayList<>();
    int N = l.size();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        System.out.println("----");
      }
    }
  }


}
