package lesson17.part1;

public class Test {
  public static void main(String[] args) {
    IntegerBox integerBox = new IntegerBox(1);
    System.out.println(integerBox.getValue());

    DoubleBox doubleBox = new DoubleBox(1.1);
    System.out.println(doubleBox.getValue());
  }
}
