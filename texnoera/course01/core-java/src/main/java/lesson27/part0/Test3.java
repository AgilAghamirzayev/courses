package lesson27.part0;

public class Test3 {
  public static void main(String[] args) {
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread 1");
      }
    });

    thread1.start();
  }
}
