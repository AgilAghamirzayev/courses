package lesson17.part5;

import java.util.List;

public class Test1 {

  public static void main(String[] args) {
    List<Integer> list1 = List.of(1,2,3,4);
    Integer test = test(list1);

    List<String> list2 = List.of("Apple", "Banana", "Cherry");
    String test1 = test(list2);

    List<Double> list3 = List.of(1.2, 2.5, 3.2);
    Double test2 = test(list3);

//    Object -> Double, String

    testO(1);
    testO(1.1);
    testO("S");

    testListO(list1);
  }

  public static void testListO(List<?> test) {
    System.out.println(test);
  }

  public static void testO(Object test) {
    System.out.println(test);
  }

  public static Object testa(List<Object> test) {
    System.out.println(test);
    return test.getFirst();
  }

  public static <T> T  test(List<T> test) {
    System.out.println(test);
    return test.getFirst();
  }

}
