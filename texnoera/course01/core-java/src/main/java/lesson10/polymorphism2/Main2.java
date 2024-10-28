package lesson10.polymorphism2;

public class Main2 {
  public static void main(String[] args) {

    Dog dog = new Dog("Dog");
    Cat cat = new Cat("Cat");
    Fish fish = new Fish("Fish");

    printDog(dog);
    printCat(cat);
    printFish(fish);

  }

  public static void printDog(Dog dog) {
    System.out.println(dog);
  }

  public static void printCat(Cat cat) {
    System.out.println(cat);
  }

  public static void printFish(Fish fish) {
    System.out.println(fish);
  }

}
