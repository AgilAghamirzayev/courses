package lesson16.immutable;

import java.util.Objects;

public final class Person {

  private final String name;
  private final Integer age;
  private final Car car;

  public Person(String name, Integer age, Car car) {
    this.name = name;
    this.age = age;
    this.car = car;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public Car getCar() {
    return car;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(car, person.car);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, car);
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", car=" + car +
        '}';
  }
}
