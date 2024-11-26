package lesson17.part3;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
  public static void main(String[] args) {
    List list = new ArrayList<>();
    Person ali = new Person("Ali", 11);
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    list.add("Date");
    list.add(1);
    list.add(ali);

    for (Object e : list) {
      System.out.println(e);
    }

  }
}
