package lesson27.part3;

public class Main {
  public static void main(String[] args) {
    Test9 test = new Test9();
    Thread thread1 = new Thread(test);
    Thread thread2 = new Thread(test);
    Thread thread3 = new Thread(test);

    thread1.start();
    thread2.start();
    thread3.start();
  }
}
