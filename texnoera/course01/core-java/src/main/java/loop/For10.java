package loop;

public class For10 {

  public static void main(String[] args) {


    FIRST:
    for (int first = 1; first <= 10; first++) {
      System.out.println("FIRST: " + first);
      SECOND:
      for (int i = 1; i <= 2; i++) {
        System.out.println("SECOND: " + i);
      }
      break FIRST;
//      System.out.println("FIRST: " + first);
    }

  }

}

/**
 *
 * FIRST 1
 * SECOND 1
 * SECOND 2
 *
 *
 */
