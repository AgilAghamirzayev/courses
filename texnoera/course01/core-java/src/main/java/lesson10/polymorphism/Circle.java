package lesson10.polymorphism;

public class Circle {

  protected final static double PI = 3;

  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double perimeter() {
    return 2 * PI * radius;
  }

  public double area() {
    return PI * Math.pow(radius, 2);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    if (radius < 0) {
      throw new IllegalArgumentException("Radius cannot be negative");
    }
    this.radius = radius;
  }

  @Override
  public String toString() {
    return String.format("Circle(radius=%.2f, perimeter=%.2f area=%.2f)",
        radius, perimeter(), area());
  }

}
