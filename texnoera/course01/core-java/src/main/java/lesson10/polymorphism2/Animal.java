package lesson10.polymorphism2;

public class Animal {
  protected String name;

  public Animal(String name) {
    this.name = name;
  }


  public void makeSound() {
    System.out.println("The " + name + " makes a sound.");
  }

  public void sleep() {
    System.out.println("The " + name + " sleep");
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Animal{");
    sb.append("name='").append(name).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
