package lesson14.inclass.abstraction.abstarct.classes;

public class Cat extends Animal {

  public Cat(String name, int age) {
    super(name, age);
  }

  @Override
  public void makeSound() {
    System.out.println(name + " Cat making sound");
  }

  @Override
  public void eat() {
    System.out.println(name + " Cat eating");
  }

  @Override
  public void sleep() {
    System.out.println(name + " Cat sleeping");
  }

}
