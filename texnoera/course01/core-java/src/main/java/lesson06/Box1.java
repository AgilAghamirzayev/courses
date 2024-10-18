package lesson06;

public class Box1 {

  public double height;
  public double width;
  public double depth;

  public Box1() {
    this(-1);
  }

  public Box1(double side) {
    this(side, side, side);
  }

  public Box1(double height, double width, double depth) {
    this.height = height;
    this.width = width;
    this.depth = depth;
  }

  public double volume() {
    return height * width * depth;
  }

}