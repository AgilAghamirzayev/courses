package lesson14.inclass.abstraction.abstarct.classes;

public class Test {
  public static void main(String[] args) {
    Animal dog = new Dog("Reky", 2);
    Animal cat = new Cat("Mezi", 1);

    dog.makeSound();
    cat.makeSound();
    cat.sleep();
    cat.eat();

    cat.test();
    dog.test();
  }
}
