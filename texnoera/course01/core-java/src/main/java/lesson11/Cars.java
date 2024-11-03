package lesson11;

public class Cars {

  private static void drive() {
    System.out.println("fast");
  }

  static {
    System.out.println("faster");
  }

  {
    System.out.println("zoom");
  }

  public static void main(String[] args) {
    drive();
    drive();
  }
}