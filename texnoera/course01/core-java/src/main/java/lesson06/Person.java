package lesson06;

import java.util.Arrays;

public class Person {

  public final String test = "Test";

  public String name;
  public int age;
  public String gender;

  public void walk() {
    System.out.println("Walking...");
  }

  public void eatAndSleep() {
    eat("Pizza");
    sleep();
  }

  private void eat(String food) {
    System.out.println(name + " Eating " + food + "...");
  }

  private void sleep() {
    System.out.println("Sleeping...");
  }

  public void work() {
    System.out.println("Working...");
  }

  public void printFavoritesColors(String... colors) {
    System.out.println(Arrays.toString(colors));
  }

  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + gender);
  }

}
