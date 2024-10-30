package lesson11.init;

public class Vehicle {
  static int vehicleCount;

  static {
    vehicleCount = 0;
    System.out.println("Vehicle class loaded. Static block executed.");
  }

  protected String brand = "Unknown Brand";

  {
    System.out.println("Vehicle instance initialization block executed.");
  }

  public Vehicle(String brand) {
    this.brand = brand;
    vehicleCount++;
    System.out.println("Vehicle constructor called for brand: " + this.brand);
  }

  public void start() {
    System.out.println(this.brand + " vehicle is starting.");
  }
}