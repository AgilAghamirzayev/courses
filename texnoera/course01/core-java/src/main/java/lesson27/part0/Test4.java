package lesson27.part0;

public class Test4 {
  public static void main(String[] args) {
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread 1 is running");
      }
    });
    thread1.start();
    thread1.start();
  }

}
