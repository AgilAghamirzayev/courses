package lesson17.part4;

import java.util.List;

public class Test3 {

  public static void main(String[] args) {
    print(List.of(1,2,3,5));
    print(List.of("Test1", "Test2", "Test3"));
    print(List.of(1.2, 2.5, 3.2));
  }

  public static void print(List<?> list) {
    list.forEach(System.out::println);
  }
}
