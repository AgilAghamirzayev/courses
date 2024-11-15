package lesson15.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println(list.get(0));
    System.out.println(list.get(0));
    System.out.println(list.get(1));

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
