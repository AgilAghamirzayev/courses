package lesson17.part6;

import java.util.ArrayList;
import java.util.List;

public class Test<T> {

  public static void main(String[] args) {
    List<B> listA = new ArrayList<>();
    listA.add(new B("a"));
    listA.add(new B("b"));
    listA.add(new B("c"));
    print1(listA);
    print2(listA);
  }

  public static void print1(List<? extends B> list) {
    B b = list.get(1);
//    list.add(new B("f"));
    System.out.println(b);
  }

  public static <T>void print2(List<? super B> list) {
//    B b = list.get(0);
    list.add(new C("a"));
    System.out.println(list);
  }

}
