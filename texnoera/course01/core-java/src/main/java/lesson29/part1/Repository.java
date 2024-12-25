package lesson29.part1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

public class Repository {


  public List<Person> people = List.of(
      new Person("John", 11),
      new Person("Tom", 22)
  );

  public Optional<Person> getPersonByNameOpt(String name) {

    LocalDateTime now = LocalDateTime.now();
    System.out.println(ZoneId.of("America/Los_Angeles"));

    return people.stream()
        .filter(p -> p.getName().equals(name))
        .findAny();
  }

  public Person getPersonByName(String name) {
    // database operations
    return new Person("Ali", 11);
  }

}
