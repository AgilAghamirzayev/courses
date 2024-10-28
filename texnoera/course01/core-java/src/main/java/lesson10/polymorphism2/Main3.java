package lesson10.polymorphism2;

public class Main3 {
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
    Dog dog = (Dog) animal;
    dog.bark();

  }

}
