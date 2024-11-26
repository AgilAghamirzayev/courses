package lesson17.part6;

public class B extends A {
  private final String b;

  public B(String b) {
    super("a");
    this.b = b;
  }

  @Override
  public String toString() {
    return "B{" +
        "b='" + b + '\'' +
        '}';
  }
}
