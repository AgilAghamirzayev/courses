package lesson10.polymorphism2;

public class Main4 {
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

    if (animal instanceof Cat) {
      Cat cat = (Cat) animal;
      cat.run();
    }

    if (animal instanceof Dog) {
      Dog dog = (Dog) animal;
      dog.bark();
    }

    if (animal instanceof Fish) {
      Fish fish = (Fish) animal;
      fish.swim();
    }

  }

}
