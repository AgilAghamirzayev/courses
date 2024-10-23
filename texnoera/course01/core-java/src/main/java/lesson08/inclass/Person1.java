package lesson08.inclass;

public class Person1 {
  private String name;
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void introduce() {
    System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
  }

}
