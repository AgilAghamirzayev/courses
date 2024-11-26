package lesson17.part6;

public class C extends B {
  private final String c;

  public C(String c) {
    super("b");
    this.c = c;
  }

  @Override
  public String toString() {
    return "C{" +
        "c='" + c + '\'' +
        '}';
  }
}
