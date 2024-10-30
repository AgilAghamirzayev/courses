package lesson11.hidingandoverriding;

public class Child extends Parent {
  protected int i;  // Hiding i of parent
  protected byte b; // Hiding b of parent
  protected double d;

  // This is hiding of a method
  public static void g() {
    System.out.println("g() in Child");
  }

  @Override
  public void gg() {
    System.out.println("C -> CC");
  }

  public void printInfo() {
    System.out.println("i: " + i);
    System.out.println("super.i: " + super.i);
    System.out.println("b: " + b);
    System.out.println("super.b: " + super.b);
    System.out.println("d: " + d);
    g();
    super.g();

    Parent.g(); // the same as above

  }

}
