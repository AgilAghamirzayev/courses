package lesson16.var;

import java.util.Map;
import lesson16.immutable.Person;
import lesson16.immutable.Person2;

public class Test {

  public static void main(String[] args) {
    //    var age = 11;
//    var name = "Ali";
//    var person = getPerson(name, age);
//
//
//    var test;
//    test = 11;
//    var test = null;

    Test classs = new Test();
    float a = 11;
    classs.test(a);
    classs.test(333.8f);
  }

  public void test(int a) {
    System.out.println("int " + a);
  }

  public void test(long a) {
    System.out.println("long " + a);
  }

  public void test(byte a) {
    System.out.println("byte " + a);
  }

  public void test(short a) {
    System.out.println("short " + a);
  }

  public void test(double a) {
    System.out.println("double " + a);
  }

  public void test(float a) {
    System.out.println("float " + a);
  }

  private static Person getPerson(String name, int age) {
    return new Person(name, age, null);
  }

}
