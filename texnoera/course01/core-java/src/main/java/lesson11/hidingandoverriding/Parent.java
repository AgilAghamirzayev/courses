package lesson11.hidingandoverriding;

public class Parent {
  protected int i;
  protected boolean b;

  public static void g() {
    System.out.println("g() in Parent");
  }

  public void gg() {
    System.out.println("P->CC");
  }


  protected void info() {
    System.out.println("i: " + i);
    System.out.println("b: " + b);
    g();
  }
}
