package lesson06;


public class TestBox3 {

  public static void main(String[] args) {
    Box box1 = new Box(2, 3, 4);
    System.out.println("Volume box1: " + box1.volume());

    Box box2 = new Box(5, 6, 7);
    System.out.println("Volume box2: " + box2.volume());

    Box box3 = new Box(2);
    System.out.println("Volume box3: " + box3.volume());

    Box box = new Box();
    System.out.println("Volume box: " + box.volume());
  }


}

