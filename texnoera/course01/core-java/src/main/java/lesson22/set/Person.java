package lesson22.set;

public record Person(String name, Integer age)
    implements Comparable<Person> {


//  @Override
//  public int compare(Person o1, Person o2) {
//    return 0;
//  }

  @Override
  public int compareTo(Person person) {

    return this.age.compareTo(person.age());

  }
}
