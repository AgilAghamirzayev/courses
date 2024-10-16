package lesson05;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Person ali = new Person();
    ali.name = "Ali";
    ali.age = 37;
    ali.gender = "Male";

    System.out.println(ali);

    System.out.println(ali.name);
    System.out.println(ali.age);
    System.out.println(ali.gender);

    ali.age = -11;
    System.out.println(ali.age);
  }

}

