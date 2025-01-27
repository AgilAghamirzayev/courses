package lesson20.mapp;

import java.util.Objects;

public class Account {
  private String id;
  private String name;
  private Double balance;

  public Account(String id, String name, Double balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(id, account.id) && Objects.equals(name, account.name) && Objects.equals(balance, account.balance);
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }

  @Override
  public String toString() {
    return String.format("[ %s, %s, %s ]", id, name, balance);
  }
}
