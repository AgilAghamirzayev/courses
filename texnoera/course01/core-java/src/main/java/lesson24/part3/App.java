package lesson24.part3;

import lesson24.Calculator;

public class App {
  public static void main(String[] args) {

    Calculator sum = (int a, int b) -> System.out.printf("%d + %d = %d\n", a, b, a + b);
    Calculator divide = (int a, int b) -> System.out.printf("%d / %d = %d\n", a, b, a / b);
    Calculator multiply = (int a, int b) -> System.out.printf("%d * %d = %d\n", a, b, a * b);
    Calculator subtract = (int a, int b) -> System.out.printf("%d - %d = %d\n", a, b, a - b);

    sum.calculate(10,2);
    divide.calculate(10,2);
    multiply.calculate(10,2);
    subtract.calculate(10,2);

  }
}
