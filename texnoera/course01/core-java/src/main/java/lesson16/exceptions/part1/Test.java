package lesson16.exceptions.part1;

import java.io.Closeable;
import java.util.Objects;

public class Test implements Closeable {

  public void setAge(Integer age) {
    if (Objects.isNull(age)) {
      throw new NullPointerException("Age cannot be null");
    }

    System.out.println("Age set to " + age);
  }

  @Override
  public void close() {
    System.out.println("Test close");
  }

}
