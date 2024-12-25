package lesson28.part2;

class BankAccount {
    private int balance = 1000;

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Un successfully");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final balance: " + account.getBalance());
    }
}