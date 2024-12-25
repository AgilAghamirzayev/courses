package lesson27.part4;

public class Test1 {
  public static void main(String[] args) {
    long rangeStart = 1;
    long rangeEnd = 1_000_000_000L;
    long sum = 0;

    long start = System.currentTimeMillis();

    for (long i = rangeStart; i <= rangeEnd; i++) {
      sum += i;
    }

    long end = System.currentTimeMillis();

    System.out.println("Time: " + (end - start));

    System.out.println(sum);

  }
}
