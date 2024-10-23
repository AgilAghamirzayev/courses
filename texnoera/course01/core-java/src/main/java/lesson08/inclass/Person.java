package lesson08.inclass;

public class Person {
  private String name;
  private int age;

  public void introduce() {
    System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
  }

  public void yasiDaxilEt(int age) {
    if (age < 0) {
      System.out.println("Invalid age");
      return;
    }

    this.age = age;
  }

  public void adiDaxilEt(String name) {
    if (name == null) {
      throw new RuntimeException("Null name: " + name);
    } else if (name.isBlank()) {
      throw new RuntimeException("Blank name: " + name);
    } else if (name.length() > 50) {
      throw new RuntimeException("Name is too long: " + name);
    } else if (!name.matches("[a-zA-Z]+")) {
      throw new RuntimeException("Invalid name format: " + name);
    }

    this.name = name.trim();
  }

  public int yasiGetir() {
    return age;
  }

  public String adiGetir() {
    return name;
  }

  private String test() {
    //...
    //...
    //...
    //...
    return "test();";
  }
}
