package lesson05;

public class TestBox {

  public static void main(String[] args) {
    Box box1 = new Box();
    box1.height = 2;
    box1.width = 3;
    box1.depth = 4;

    double volume1 = box1.height * box1.width * box1.depth;
    System.out.println("Volume box1: " + volume1);


    Box box2 = new Box();
    box2.height = 5;
    box2.width = 6;
    box2.depth = 7;

    double volume2 = box2.height * box2.width * box2.depth;
    System.out.println("Volume box2: " + volume2);



  }


}

