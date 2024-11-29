package lesson20.mapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test4 {
  public static Map<Account, Integer> accountAndAmount = new HashMap<>();

  public static void main(String[] args) {

    Account account1 = new Account("1", "Ali", 1000.0);
    Account account2 = new Account("2", "Ahu", 1000.0);
    Account account3 = new Account("1", "Ali", 1000.0);

    accountAndAmount.put(account1, 100);
    accountAndAmount.put(account2, 200);
    accountAndAmount.put(account3, 100);


    accountAndAmount.forEach((k, v) ->
        System.out.println(k + " -> " + v));


  }


  public static Integer getAmount(Account account) {
    return accountAndAmount.get(account);
  }
}
