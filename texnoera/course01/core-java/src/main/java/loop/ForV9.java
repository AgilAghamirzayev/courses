package loop;

public class ForV9 {

  public static void main(String[] args) {


    for (int first = 1; first <= 10; first++) {

      if (first == 5) {
        continue;
      }

      System.out.println(first);

      if (first == 7) {
        break;
      }
    }

  }

}
