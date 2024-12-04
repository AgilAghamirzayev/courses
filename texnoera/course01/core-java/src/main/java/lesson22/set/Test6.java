package lesson22.set;

import java.util.Set;
import java.util.TreeSet;

public class Test6 {
  public static void main(String[] args) {
    Set<Person> people = new TreeSet<>();
    Person john = new Person("John", 9);
    Person bob = new Person("Bob", 11);

    Comparable<Person> john1 = (Comparable<Person>) john;

    int i = john1.compareTo(bob);
    System.out.println(i);
    String a = "";


    people.add(john);
    people.add(bob);
    people.add(new Person("Alice", 15));
    people.add(new Person("Bob", 12));
    people.add(new Person("Charlie", 15));

    people.forEach(System.out::println);
  }
}
