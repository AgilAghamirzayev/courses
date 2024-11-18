package lesson16.immutable;

public final class Car {
  private final String make;

  public Car(String make) {
    this.make = make;
  }

  public String getMake() {
    return make;
  }

  @Override
  public String toString() {
    return "Car{" +
        "make='" + make + '\'' +
        '}';
  }
}
