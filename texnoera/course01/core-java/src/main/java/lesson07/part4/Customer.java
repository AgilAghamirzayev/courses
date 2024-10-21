package lesson07.part4;

public class Customer {
  public int id;
  public String name;
  public CreditCard creditCards;

  public Customer(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void setCustomer(CreditCard creditCard) {
    this.creditCards = creditCard;
  }

}
