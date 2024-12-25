package lesson24.part1;

import lesson24.Calculator;

public class MultiplyCalculator implements Calculator {

  @Override
  public void calculate(int a, int b) {
    System.out.printf("%d * %d = %d\n", a, b, a * b);
  }

}
