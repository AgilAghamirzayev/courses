package lesson11.hidingandoverriding;

public class Test {
  public static void main(String[] args) {
    Child child = new Child();
    Parent child1 = child;
    child1.g();
    child1.gg();
    child.printInfo();
  }
}
