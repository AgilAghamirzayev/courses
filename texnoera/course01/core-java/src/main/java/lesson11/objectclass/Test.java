package lesson11.objectclass;

public class Test {
  public static void main(String[] args) {

    Person p1 = new Person("Ali", 11);
    Person p5 = p1;
    Person p2 = new Person("Ali", 11);
    Person p3 = new Person("Zeynab", 10);
    Animal animal = new Animal();

    System.out.println("p1 hashcode: " + p1.hashCode());
    System.out.println("p2 hashcode: " + p2.hashCode());
    System.out.println("p3 hashcode: " + p3.hashCode());



    System.out.println(p1 == p1);
    System.out.println(p5 == p1);
    System.out.println(p1 == p2);
    System.out.println(p1 == p3);
    System.out.println(p1.equals(p1));
    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));
    System.out.println(p1.equals(animal));
  }
}
