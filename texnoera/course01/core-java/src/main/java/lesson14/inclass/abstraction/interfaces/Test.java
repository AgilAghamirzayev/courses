package lesson14.inclass.abstraction.interfaces;

public class Test {
  public static void main(String[] args) {
    Payment payment = new CashPayment();
    Payment payment1 = new CardPayment();
    Payment virtualPayment = new VirtualPayment();

    payAmount(payment, 100);
    payAmount(payment1, 290);
    payAmount(virtualPayment, 2222);
  }

  public static void payAmount(Payment payment, double amount) {
    payment.pay(amount);
    payment.test();
  }


}
