package lesson16.immutable;

public record Person2(String name,
                      Integer age) {

  public Person2(String name) {
    this(name, 11);
  }

}
