package lesson27.part4;

public class SumThreadTest1 {

  public static void main(String[] args) throws InterruptedException {
    long rangeStart = 1;
    long rangeEnd = 1_000_000_000L;
    Sum thread1 = new Sum(rangeStart, rangeEnd / 2);
    Sum thread2 = new Sum((rangeEnd / 2) + 1, rangeEnd);

    long start = System.currentTimeMillis();

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    long end = System.currentTimeMillis();
    long totalSum = thread1.getResult() + thread2.getResult();

    System.out.println("Time: " + (end - start));

    System.out.println("Sum: " + totalSum);
  }
}