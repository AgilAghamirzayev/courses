package lesson14.inclass.abstraction.interfaces;

public class CashPayment implements Payment {
  @Override
  public void pay(double amount) {
    System.out.println("Cash payment amount: " + amount);
  }

}
