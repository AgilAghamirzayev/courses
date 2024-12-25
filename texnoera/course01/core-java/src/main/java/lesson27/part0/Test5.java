package lesson27.part0;

public class Test5 {
  public static void main(String[] args) {
    Thread thread1 = new Thread(() -> System.out.println("Thread 1 is running"));
    Thread thread2 = new Thread(() -> System.out.println("Thread 2 is running"));
    Thread thread3 = new Thread(() -> System.out.println("Thread 3 is running"));

    thread1.start();
    thread2.start();
    thread3.start();

    System.out.println("Thread main is starting");
  }
}
