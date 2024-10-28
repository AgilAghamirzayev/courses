package lesson10.polymorphism;

public class Main2 {
  public static void main(String[] args) {
    // super-class -> sub-class
    Circle circle = new Cylinder(2, 3);
    double area = circle.area();
    double perimeter = circle.perimeter();
    System.out.println(area);
    System.out.println(perimeter);
    System.out.println(circle);


  }


  public static void test() {

  }

  public static void test(int a) {

  }

}
