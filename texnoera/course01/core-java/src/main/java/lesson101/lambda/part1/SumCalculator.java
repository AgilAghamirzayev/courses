package lesson101.lambda.part1;

public class SumCalculator {

  public static void main(String[] args) {
    System.out.println(true && false);
    System.out.println(true || false);
    calculate((a, b) -> a + b, 1, 2);
    calculate((a, b) -> a - b, 1, 2);
    calculate((a, b) -> a * b, 1, 2);
    calculate((a, b) -> a / b, 1, 2);
  }

  public static void calculate(Calculator calculator, int a, int b) {
    System.out.println(calculator.calculate(a, b));
  }

}





