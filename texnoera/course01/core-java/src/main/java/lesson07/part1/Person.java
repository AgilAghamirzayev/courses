package lesson07.part1;

public class Person {
  public String fin;
  public String firstName;
  public String lastName;
  public Car car;

  public String info() {
    String carInfo = (car != null)
        ? car.info()
        : "No car assigned";

    return String.format(
        "Name: %s %s, FIN: %s, Car: %s",
        firstName, lastName, fin, carInfo
    );
  }

}
