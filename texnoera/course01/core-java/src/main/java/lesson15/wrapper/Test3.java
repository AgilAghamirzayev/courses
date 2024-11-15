package lesson15.wrapper;

public class Test3 {



  public static void main(String[] args) {

    Long start = System.currentTimeMillis();

    Long a  = 0L;
    for (Integer i = 0; i < 1_000_000_000; i++) {
      a += i;
    }

    Long end = System.currentTimeMillis();

    System.out.println(end - start);
  }

}
