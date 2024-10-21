package lesson07.part4;

public class BankTestV1 {
  public static void main(String[] args) {
    Customer ali = new Customer(111, "Ali");
    CreditCard creditCard = new CreditCard("121", 1000);

    ali.setCustomer(creditCard);
    creditCard.setOwner(ali);

  }
}
