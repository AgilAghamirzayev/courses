package lesson17.part2.p3;


public class Test {
  public static void main(String[] args) {
    Box box1 = new Box(1);
    Box box2 = new Box(1.1);

    Box box3 = new Box("Test");
    String value = (String) box3.getValue();
    String upperCase = value.toUpperCase();
    System.out.println(upperCase);

  }
}
