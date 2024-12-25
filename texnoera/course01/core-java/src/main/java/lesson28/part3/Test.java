package lesson28.part3;

import java.util.ArrayList;
import java.util.List;

public class Test {
  private static final List<Integer> numbers = new ArrayList<>();


  public static void main(String[] args) throws InterruptedException {
    Runnable runnable1 = () -> {
      for (int i = 0; i < 10000; i++) {
        numbers.add(i);
        try {
          Thread.sleep(50);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    };

    Runnable runnable2 = () -> {
      for (int i = 0; i < 10000; i++) {
        System.out.println(numbers.get(i));
        try {
          Thread.sleep(50);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    };

    Thread thread1 = new Thread(runnable1);
    Thread thread2 = new Thread(runnable2);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();
  }
}
