package lesson29.part1;

import java.util.Optional;

public class Test3 {


  public static void main(String[] args) {
    Repository repository = new Repository();

    Person tom = repository.getPersonByName("Tom");
    if (tom == null) {
      tom = new Person();
    }

    System.out.println(tom);

    Optional<Person> tom1 = repository.getPersonByNameOpt("Tom");
    tom1.ifPresent(z -> z.setAge(323));

    System.out.println(tom1.get());

    System.out.println();
  }

}
