package lesson20.mapp;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
  public static void main(String[] args) {
    Map<String, Account> usernameAndAccount = new HashMap<>();

    Account account1 = new Account("1", "Ali", 1000.0);
    Account account2 = new Account("2", "Ahu", 1000.0);

    usernameAndAccount.put("ali76", account1);
    usernameAndAccount.put("ahu123", account2);

    System.out.println(usernameAndAccount);

    for (String username : usernameAndAccount.keySet()) {
      System.out.println(username);
    }

    for (Account account : usernameAndAccount.values()) {
      System.out.println(account);
    }

    System.out.println();
    System.out.println();
    System.out.println("username  -> " + "account");
    for (Map.Entry<String, Account> entry : usernameAndAccount.entrySet()) {
      String key = entry.getKey();
      Account value = entry.getValue();

      System.out.println(key + "    -> " + value);
    }

  }
}
