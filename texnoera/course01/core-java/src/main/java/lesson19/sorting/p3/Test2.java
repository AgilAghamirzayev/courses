package lesson19.sorting.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Vali", "V", 55));
    persons.add(new Person("Aysu", "A", 42));
    persons.add(new Person("Aysu", "D", 12));
    persons.add(new Person("Aysu", "H", 72));
    persons.add(new Person("Lale", "F", 23));

    System.out.println("Before sorting: ");
    persons.forEach(System.out::println);

    Collections.sort(persons, Comparator.comparing(( p) -> p.getName()));

    System.out.println("After sorting: ");
    persons.forEach(System.out::println);



  }
}
