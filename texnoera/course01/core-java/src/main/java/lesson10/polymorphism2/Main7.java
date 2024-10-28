package lesson10.polymorphism2;

import java.util.Arrays;

public class Main7 {
  public static void main(String[] args) {

    Dog dog = new Dog("Dog");
    Cat cat = new Cat("Cat");
    Fish fish = new Fish("Fish");

    printAnimal(dog, cat, fish);

  }

  public static void printAnimal(Animal... animals) {
    System.out.println(Arrays.toString(animals));

    for (Animal animal : animals) {
      switch (animal) {
        case Cat cat -> cat.run();
        case Dog dog -> dog.bark();
        case Fish fish -> fish.swim();
        default -> throw new IllegalStateException("Unexpected value: " + animal);
      }
    }

  }

}
