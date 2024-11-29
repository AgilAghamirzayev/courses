package lesson20.mapp;

import java.util.HashMap;
import java.util.Map;

public class Test5 {

  public static void main(String[] args) {
    Map<Account, Integer> accountAndAmount = new HashMap<>();

    accountAndAmount.put(new Account("1", "Ali", 1000.0), 100);

    Integer amount = accountAndAmount.get(new Account("1", "Ali", 1000.0));

    System.out.println(amount);

  }


}
