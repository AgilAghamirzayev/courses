package lesson16.exceptions.part1;

public class Example1 {

  public static void main(String[] args) {
    int i = 0;
    int j = 5;
    tp:
    for (; ; ) {
      i++;
      for (; ; ) {
        if (i > --j) {
          break tp;
        }
      }
    }

    System.out.println("i =" + i + ", j=" + j);

  }
}
