package lesson09.modifiers.test2;

import lesson09.modifiers.test1.A;
import lesson09.modifiers.test1.B;

public class C {
  public static void main(String[] args) {
    B b = new B();
    A a = new A();
    BB bb = new BB();

    System.out.println(b.d);
    System.out.println(a.d);
    System.out.println(bb.d);
  }
}
