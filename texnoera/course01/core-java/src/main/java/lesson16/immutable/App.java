package lesson16.immutable;

public class App {
  public static void main(String[] args) {
    Car bmw = new Car("BMW");
    Person person1 = new Person("John", 30, bmw);



    System.out.println("person1: " + person1);


    System.out.println("person1: " + person1);

  }
}
