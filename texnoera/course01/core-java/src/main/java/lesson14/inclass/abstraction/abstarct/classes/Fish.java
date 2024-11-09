package lesson14.inclass.abstraction.abstarct.classes;

public class Fish extends Animal {
  public Fish(String name, int age) {
    super(name, age);
  }

  @Override
  public void makeSound() {
    System.out.println("Fish make sound");
  }

  @Override
  public void eat() {
    System.out.println("Fish eat");
  }

  @Override
  public void sleep() {
    System.out.println("Fish sleep");
  }
}
