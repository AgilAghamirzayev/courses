package lesson17.part2.p1;

public class Test {
  public static void main(String[] args) {
    Box<Integer> box1 = new Box<>(1);
    System.out.println(box1.getValue());

    Box<Double> box2 = new Box<>(1.1);
    System.out.println(box2.getValue());

    Box<String> box3 = new Box<>("Hello");
    String value = box3.getValue();
    String upperCase = value.toUpperCase();
    System.out.println(upperCase);
  }
}
