package lesson14.inclass.abstraction.abstarct.classes;

import lesson14.inclass.abstraction.interfaces.Payment;

public abstract class Animal {

  public String name;
  public int age;
  public final String NAME;

  public Animal(String name, int age) {
    NAME = "Animal";
    this.name = name;
    this.age = age;
  }

  public abstract void makeSound();

  public abstract void eat();

  public abstract void sleep();

  public void test() {
    System.out.println("Testing");
  }

}
