package lesson06.solutions;

public class Test {

  public static void main(String[] args) {

    MyStackNasir stack = new MyStackNasir();

    testResults(stack.empty == true);
    testResults(stack.full == false);

    stack.push("10");
    stack.push("15");
    stack.push("10");
    stack.push("11");
    stack.push("12");

    testResults(stack.size() == 5);

    stack.pop();
    stack.pop();

    testResults(stack.size() == 3);

    stack.push("111");
    stack.push("111");
    stack.push("111");
    stack.push("111");
    testResults(stack.size() == 7);

    stack.push("111");
    stack.push("111");
    stack.push("111");

    testResults(stack.full == true);
    testResults(stack.size() == 10);

    stack.clear();
    testResults(stack.empty);
    testResults(stack.size() == 0);
  }

  private static void testResults(Boolean caze) {
    System.out.println("Result: " + (caze ? "PASS" : "FAIL"));
  }

}
