package lesson11.init;

public class Car extends Vehicle {
  static int carCount;

  static {
    carCount = 0;
    System.out.println("Car class loaded. Static block executed.");
  }

  private int numberOfDoors = 4;

  {
    System.out.println("Car instance initialization block executed.");
  }

  public Car(String brand, int numberOfDoors) {
    super(brand);
    this.numberOfDoors = numberOfDoors;
    carCount++;
    System.out.println("Car constructor called for brand: " + this.brand + " with " + this.numberOfDoors + " doors.");
  }

  @Override
  public void start() {
    System.out.println(this.brand + " car is starting.");
  }

}