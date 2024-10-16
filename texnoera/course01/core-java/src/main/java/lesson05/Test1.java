package lesson05;

public class Test1 {

  public static void main(String[] args) {
    Person ali = new Person();
    ali.name = "Ali";
    ali.age = 37;
    ali.gender = "Male";

    ali.printDetails();
    ali.eatAndSleep();
    ali.work();
    ali.walk();

  }

}
