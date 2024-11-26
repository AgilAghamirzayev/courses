package lesson19.sorting.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test5 {
  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Vali", "A", 55));
    persons.add(new Person("Aysu", "C", 42));
    persons.add(new Person("Aysu", "C", 40));
    persons.add(new Person("Aysu", "B", 12));
    persons.add(new Person("Aysu", "D", 72));
    persons.add(new Person("Aydan", "D", 72));
    persons.add(new Person("Asu", "D", 72));
    persons.add(new Person("Aysun", "D", 72));
    persons.add(new Person("Lale", "F", 23));

    System.out.println("Before sorting: ");
    persons.forEach(System.out::println);

    Collections.sort(persons,
        Comparator.comparing(Person::getName)
            .thenComparing(Person::getLastName)
            .thenComparing(Person::getAge)
    );


    System.out.println("After sorting: ");
    persons.forEach(System.out::println);

  }
}
