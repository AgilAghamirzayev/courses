package lesson09.inheritance02;

public class Singer extends Person {
  private String bandName;

  public void sing() {
    System.out.println("Singing...");
  }

  public void playGuitar() {
    System.out.println("Playing guitar...");
  }

}
