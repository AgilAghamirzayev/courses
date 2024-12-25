package lesson27.part0;

public class Test1 {
  public static void main(String[] args) {
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);

    String name = Thread.currentThread().getName();
    System.out.println(name);
  }
}
