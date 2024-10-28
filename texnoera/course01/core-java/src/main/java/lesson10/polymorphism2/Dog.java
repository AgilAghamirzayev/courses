package lesson10.polymorphism2;

public class Dog extends Animal{
  public Dog(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Dog");
  }

  public void bark() {
    System.out.println("Dog barking ");
  }

}
