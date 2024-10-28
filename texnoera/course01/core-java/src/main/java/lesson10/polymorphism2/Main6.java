package lesson10.polymorphism2;

public class Main6 {
  public static void main(String[] args) {

    Dog dog = new Dog("Dog");
    Cat cat = new Cat("Cat");
    Fish fish = new Fish("Fish");

    printAnimal(dog);
    printAnimal(cat);
    printAnimal(fish);

  }

  public static void printAnimal(Animal animal) {
    System.out.println(animal);

    switch (animal) {
      case Cat cat -> cat.run();
      case Dog dog -> dog.bark();
      case Fish fish -> fish.swim();
      default -> throw new IllegalStateException("Unexpected value: " + animal);
    }

  }

}
