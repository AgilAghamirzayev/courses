package lesson28.part2;

import java.util.List;

public class Test1 {

  private long balance = 10000;

  public static void main(String[] args) throws InterruptedException {
    Test1 bankAccount = new Test1();

    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        bankAccount.withdraw(1);
      }
    });

    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 2000; i++) {
        bankAccount.withdraw(1);
      }
    });

    Thread thread3 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        bankAccount.deposit(1);
      }
    });


    // 900
    List<Thread> threads = List.of(thread1, thread2, thread3);

    threads.forEach(Thread::start);
    threads.forEach(thread -> {
      try {
        thread.join();
      } catch (InterruptedException e) {
        throw new RuntimeException("interrupted", e);
      }
    });

    System.out.println("Balance: " + bankAccount.getBalance());
  }

  private void deposit(long amount)  {
    balance += amount;
  }

  private void withdraw(long amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      System.out.println("Un sufficient balance");
    }
  }

  public long getBalance() {
    return balance;
  }

}
