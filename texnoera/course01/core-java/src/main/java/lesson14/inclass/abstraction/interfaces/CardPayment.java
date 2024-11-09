package lesson14.inclass.abstraction.interfaces;

public class CardPayment implements Payment, ReversPayment {

  @Override
  public void pay(double amount) {
    System.out.println("Card payment amount: " + amount);
  }

  @Override
  public void reversePayment(double amount) {
    System.out.println("Card reverse payment amount: " + amount);
  }
}
