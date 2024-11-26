package lesson16.exceptions.part3;

public class Test1 {

  public static void main(String[] args) {
    try {
      test1();
    }catch (Exception e) {
      System.out.println("Exception");
    }

  }

  public static void test1() throws RuntimeException, Exception {
   if (true) {
     throw new Exception();
   } else {
     throw new RuntimeException();
   }
  }

  public static void test2() throws Exception {
    System.out.println("test");
  }
}
