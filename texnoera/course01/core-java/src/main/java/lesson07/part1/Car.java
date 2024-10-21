package lesson07.part1;

public class Car {
  public String make;
  public String model;
  public String year;
  public int speed;
  public int distance;
  public Person owner;

  public String info() {
    String ownerInfo = (owner != null)
        ? owner.firstName + " " + owner.lastName
        : "No owner assigned";

    return String.format(
        "Make: %s, Model: %s, Year: %s, Speed: %d km/h, Distance: %d km, Owner: %s",
        make, model, year, speed, distance, ownerInfo
    );
  }

}
