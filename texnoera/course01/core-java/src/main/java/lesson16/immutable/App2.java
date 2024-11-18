package lesson16.immutable;

public class App2 {
  public static void main(String[] args) {
    Person2 person1 = new Person2("Ayla", 11);
    Person2 person2 = new Person2("Ali", 12);
    Person2 person3 = new Person2("Ali", 12);

    System.out.println(person2);
    System.out.println(person2.hashCode());
    System.out.println(person3.hashCode());
    System.out.println(person2.equals(person3));

    System.out.println(person1.hashCode());
    System.out.println(person1.equals(person2));

    Integer age = person1.age();
    String name = person1.name();

    System.out.println(age);
    System.out.println(name);

  }
}
