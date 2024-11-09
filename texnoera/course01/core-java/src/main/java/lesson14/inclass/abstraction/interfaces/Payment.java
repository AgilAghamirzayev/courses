package lesson14.inclass.abstraction.interfaces;

public interface Payment {

  String TEST = "test";
  void pay(double amount);

  default void test() {
    System.out.println("Payment interface test");
  }

}
