package lesson09.modifiers.test1;

public class C {
  public static void main(String[] args) {
    B b = new B();
    A a = new A();

    System.out.println(b.b);
    System.out.println(b.c);
    System.out.println(b.d);

    System.out.println(a.b);
    System.out.println(a.c);
    System.out.println(a.d);
  }
}
