package lesson15.enums.part3;

import static lesson15.enums.part3.Planet.EARTH;

public class App {
  public static void main(String[] args) {
    double earthWeight = 70;
    double mass = earthWeight / EARTH.surfaceGravity();

    for (Planet p : Planet.values()) {
      System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
    }
  }
}
