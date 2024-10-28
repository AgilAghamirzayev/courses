package lesson10.polymorphism2;

public class Fish extends Animal{

  public Fish(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Fish");
  }

  public void swim() {
    System.out.println("Swimming...");
  }

}
