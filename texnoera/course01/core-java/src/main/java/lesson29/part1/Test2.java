package lesson29.part1;

import java.util.Optional;

public class Test2 {


  public static void main(String[] args) {
    Person ali = new Person("Ali", 11);
    Person vali = new Person();

    System.out.println(getPersonName(ali));
    System.out.println(getPersonName(vali));
  }


  public static String getPersonName(Person person) {
    Optional<Person> person1 = Optional.of(person);
    Optional<Object> empty = Optional.empty();

    if (empty.isPresent()) {
      System.out.println("Test");
    }

    if (person1.isPresent()) {
      Person person2 = person1.get();
      return person2.getName();
    }

    return "";
  }


}
