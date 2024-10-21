package lesson07.part4;

public class CreditCard {
  public String number;
  public int balance;
  public Customer owner;

  public CreditCard(String number, int balance) {
    this.number = number;
    this.balance = balance;
  }

  public CreditCard(String number, int balance, Customer owner) {
    this(number, balance);
    this.owner = owner;
    owner.setCustomer(this);
  }

  public void setOwner(Customer owner) {
    this.owner = owner;
  }

}
