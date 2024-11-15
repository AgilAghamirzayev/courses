package lesson15.wrapper;

public class Test2 {
  public static void main(String[] args) {
    Integer num1 = 128;
    Integer num2 = 128;

    System.out.println(num1 == num2);
    System.out.println(num1.equals(num2));

    Integer n1 = 127;
    Integer n2 = 127;
    System.out.println(n1 == n2);
    System.out.println(n1.equals(n2));

    Integer n3 = Integer.valueOf(127);

  }
}
