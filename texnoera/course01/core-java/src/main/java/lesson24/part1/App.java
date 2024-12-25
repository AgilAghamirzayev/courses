package lesson24.part1;

public class App {
  public static void main(String[] args) {
    SCalculator s = new SCalculator();
    s.calculate(10,2);

    DCalculator d = new DCalculator();
    d.calculate(10,2);

    SumCalculator sum = new SumCalculator();
    sum.calculate(10,2);

    MultiplyCalculator mul = new MultiplyCalculator();
    mul.calculate(10,2);
  }
}
