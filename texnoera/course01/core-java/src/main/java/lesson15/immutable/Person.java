package lesson15.immutable;

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


}
