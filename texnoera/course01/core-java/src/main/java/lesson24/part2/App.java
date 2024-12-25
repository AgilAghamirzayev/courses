package lesson24.part2;

import lesson24.Calculator;

public class App {
  public static void main(String[] args) {

    Calculator sum = new Calculator() {
      @Override
      public void calculate(int a, int b) {
        System.out.printf("%d + %d = %d\n", a, b, a + b);
      }
    };

    System.out.println(sum.getClass().getName());
    sum.calculate(10, 2);


    Calculator d = new Calculator() {
      @Override
      public void calculate(int a, int b) {
        System.out.printf("%d / %d = %d\n", a, b, a / b);
      }
    };

    d.calculate(10, 2);
  }
}
