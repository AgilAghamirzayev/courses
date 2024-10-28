package lesson10.polymorphism2;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Cat");
  }

  public void run() {
    System.out.println("Cat running ");
  }
}
