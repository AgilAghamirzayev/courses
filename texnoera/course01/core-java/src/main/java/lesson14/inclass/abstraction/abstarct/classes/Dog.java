package lesson14.inclass.abstraction.abstarct.classes;

import lesson14.inclass.abstraction.interfaces.Payment;

public class Dog extends Animal{
  public Dog(String name, int age) {
    super(name, age);
  }

  @Override
  public void makeSound() {
    System.out.println("Dog makeSound");
  }

  @Override
  public void eat() {
    System.out.println("Dog eat");
  }

  @Override
  public void sleep() {
    System.out.println("Dog sleep");
  }

}
