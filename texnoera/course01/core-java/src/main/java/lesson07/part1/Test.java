package lesson07.part1;

public class Test {

  public static void main(String[] args) {
    Person ali = new Person();
    ali.fin = "4EFTH72";
    ali.firstName = "Ali";
    ali.lastName = "Aliyev";

    Person ayxan = new Person();
    ayxan.fin = "4EFTH72";
    ayxan.firstName = "Ali";
    ayxan.lastName = "Aliyev";


    Car porsche = new Car();
    porsche.make = "Porsche";
    porsche.model = "Cayenne Turbo";
    porsche.year = "2021";
    porsche.speed = 280;
    porsche.distance = 100000;

    ali.car = porsche;
    porsche.owner = ali;

    String model = ali.car.model;
    System.out.println(model);

//    System.out.println(porsche.info());
//    System.out.println(ali.info());
  }

}
