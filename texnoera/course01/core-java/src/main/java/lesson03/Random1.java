package lesson03;

import java.util.Random;

public class Random1 {

  public static void main(String[] args) {
    int random = (int) (Math.random() * 100) + 1;

    System.out.println(random);

    for (int i = 0; i < 100; i++) {
      Random random1 = new Random();
      int f = random1.nextInt(50, 100);
      System.out.println(f);
    }


  }

}
