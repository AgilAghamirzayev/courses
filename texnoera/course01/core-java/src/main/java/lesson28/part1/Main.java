package lesson28.part1;

public class Main {
  public  static void main(String[] args) {
    Test2 test2 = new Test2();


    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        test2.increment();
      }
    });

    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 500; i++) {
        test2.increment();
      }
    });

    start(thread1, thread2);
    join(thread1, thread2);

    System.out.println(test2.getCount());

  }


  public static void start(Thread ... threads) {
    for (Thread thread : threads) {
      thread.start();
    }
  }

  public static void join(Thread ... threads) {
    for (Thread thread : threads) {
      try {
        thread.join();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

}
