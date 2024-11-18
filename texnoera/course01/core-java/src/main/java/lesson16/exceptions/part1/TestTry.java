package lesson16.exceptions.part1;

public class TestTry {
  public static void main(String[] args) {
    try(Test test = new Test()) {
      test.setAge(null);
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Exception");
    }
  }
}
