package lesson10.polymorphism;

public class Cylinder extends Circle {

  private double height;

  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
  }

  public double volume() {
    return super.area() * height;
  }

  @Override
  public double perimeter() {
    return 2 * (super.perimeter() + height);
  }

  @Override
  public double area() {
    return 2 * PI * Math.pow(getRadius(), 2) + 2 * PI * getRadius() * height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if (height < 0) {
      throw new IllegalArgumentException("Height cannot be negative");
    }
    this.height = height;
  }

  @Override
  public String toString() {
    return String.format("Cylinder(radius:%.2f, height:%.2f, perimeter:%.2f, area:%.2f, volume:%.2f)",
        super.getRadius(), height, perimeter(), area(), volume());
  }
}
