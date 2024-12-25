package lesson27.part0;

public class Test6 {
  public static void main(String[] args) {
    Thread thread1 = new Thread(() -> System.out.println("Thread 1 is running"));
    thread1.run();

    Thread thread2 = new Thread(() -> System.out.println("Thread 2 is running"));
    thread2.run();

    System.out.println("Thread main is starting");
  }
}
