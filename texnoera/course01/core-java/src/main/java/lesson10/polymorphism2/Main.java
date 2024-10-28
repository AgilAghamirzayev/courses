package lesson10.polymorphism2;

import lesson09.diamond.A;

public class Main {
  public static void main(String[] args) {

    Dog dog = new Dog("Dog");
    Cat cat = new Cat("Cat");
    Fish fish = new Fish("Fish");

    Animal[] animals = {dog, cat, fish};

  }
}
