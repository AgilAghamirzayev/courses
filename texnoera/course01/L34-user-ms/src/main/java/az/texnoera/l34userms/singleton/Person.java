package az.texnoera.l34userms.singleton;

import java.util.Objects;

public class Person {

  private String name;
  private String lastName;
  private Integer age;

  public Person() {
  }

  public Person(String name, String lastName, Integer age) {
    this.name = name;
    this.age = age;
    this.lastName = lastName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(name, person.name) &&
        Objects.equals(lastName, person.lastName) &&
        Objects.equals(age, person.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastName, age);
  }
}
