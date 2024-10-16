package lesson05;

public class TestBos1 {

  public static void main(String[] args) {
    Box box1 = new Box();
    box1.height = 2;
    box1.width = 3;
    box1.depth = 4;

    System.out.println("Volume box1: " + box1.volume());

    Box box2 = new Box();
    box2.height = 5;
    box2.width = 6;
    box2.depth = 7;

    System.out.println("Volume box2: " + box2.volume());
  }


}

