package lesson14.inclass.abstraction.interfaces;

public class VirtualPayment implements Payment {
  @Override
  public void pay(double amount) {
    System.out.println("VirtualPayment " + amount);
  }
}
