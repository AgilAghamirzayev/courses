package lesson06;

public class Box {

  public double height;
  public double width;
  public double depth;

  public Box() {
    height = -1;
    width = -1;
    depth = -1;
  }

  public Box(double side) { // cube
    height = side;
    width = side;
    depth = side;
  }

  public Box(double h, double w, double d) {
    height = h;
    width = w;
    depth = d;
  }

  public double volume() {
    return height * width * depth;
  }

}