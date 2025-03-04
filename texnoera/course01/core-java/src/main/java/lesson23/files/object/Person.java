package lesson23.files.object;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private Integer id;
  private String name;

  public Person(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(id, person.id) && Objects.equals(name, person.name) ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return String.format("id: %s, name: %s", id, name);
  }
}
