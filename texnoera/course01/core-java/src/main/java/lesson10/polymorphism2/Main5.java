package lesson10.polymorphism2;

public class Main5 {
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

    if (animal instanceof Cat cat) {
     cat.run();
    }

    if (animal instanceof Dog dog) {
      dog.bark();
    }

    if (animal instanceof Fish fish) {
      fish.swim();
    }

  }

}
