package lesson07.solutions;

public class TestMyStack {

  public static void main(String[] args) {
    testPush();
    testPop();
    testIsEmpty();
    testIsFull();
    testSize();
    testClear();
    testShowElements();

    System.out.println("All tests passed!");
  }

  private static void testPush() {
    MyStack stack = new MyStack();

    stack.push("First");
    stack.push("Second");
    if (!stack.showElementsAsString().equals("[ First, Second ]")) {
      throw new AssertionError("Push test failed");
    }
    System.out.println("PASSED push(): push two elements");

    try {
      for (int i = 0; i < MyStack.MAX_STACK_SIZE - 2; i++) {
        stack.push("Element " + i);
      }
      stack.push("Overflow");
      throw new AssertionError("Push test failed: should have thrown exception when full");
    } catch (RuntimeException e) {
      if (!e.getMessage().equals("Cannot push, stack is full")) {
        throw new AssertionError("Push test failed: Incorrect exception message");
      }
      System.out.println("PASSED push(): when full");
    }

  }

  private static void testPop() {
    MyStack stack = new MyStack();
    stack.push("First");
    stack.push("Second");

    String poppedElement = stack.pop();
    if (!poppedElement.equals("Second")) {
      throw new AssertionError("Pop test failed: expected 'Second', got '" + poppedElement + "'");
    }
    System.out.println("PASSED pop: pop one element");

    stack.pop();
    if (!stack.isEmpty()) {
      throw new AssertionError("Pop test failed: Stack should be empty");
    }
    System.out.println("PASSED pop(): pop until empty");

    try {
      stack.pop();
      throw new AssertionError("Pop test failed: should have thrown exception when empty");
    } catch (RuntimeException e) {
      if (!e.getMessage().equals("Cannot pop, stack is empty")) {
        throw new AssertionError("Pop test failed: Incorrect exception message");
      }
      System.out.println("PASSED pop(): pop from empty stack");
    }

  }

  private static void testIsEmpty() {
    MyStack stack = new MyStack();
    if (!stack.isEmpty()) {
      throw new AssertionError("isEmpty test failed: Stack should be empty initially");
    }
    System.out.println("PASSED isEmpty(): is empty true");

    stack.push("First");
    if (stack.isEmpty()) {
      throw new AssertionError("isEmpty test failed: Stack should not be empty after push");
    }
    System.out.println("PASSED isEmpty(): is empty false");

    stack.pop();
    if (!stack.isEmpty()) {
      throw new AssertionError("isEmpty test failed: Stack should be empty after pop");
    }
    System.out.println("PASSED isEmpty(): is empty false after pop");
  }

  private static void testIsFull() {
    MyStack stack = new MyStack();

    if (stack.isFull()) {
      throw new AssertionError("isFull test failed: Stack should not be full initially");
    }
    System.out.println("PASSED ifFull(): isFull false");

    for (int i = 0; i < MyStack.MAX_STACK_SIZE; i++) {
      stack.push("Element " + i);
    }

    if (!stack.isFull()) {
      throw new AssertionError("isFull test failed: Stack should be full now");
    }
    System.out.println("PASSED isFull(): isFull true");
  }

  private static void testSize() {
    MyStack stack = new MyStack();

    if (stack.size() != 0) {
      throw new AssertionError("Size test failed: Expected size 0, got " + stack.size());
    }
    System.out.println("PASSED size(): size 0");

    stack.push("First");
    stack.push("Second");

    if (stack.size() != 2) {
      throw new AssertionError("Size test failed: Expected size 2, got " + stack.size());
    }
    System.out.println("PASSED size(): size 2");

    stack.pop();

    if (stack.size() != 1) {
      throw new AssertionError("Size test failed: Expected size 1, got " + stack.size());
    }
    System.out.println("PASSED size(): size 1 after pop");
  }

  private static void testClear() {
    MyStack stack = new MyStack();
    stack.push("First");
    stack.push("Second");

    stack.clear();

    if (stack.size() != 0) {
      throw new AssertionError("Clear test failed: Stack should be empty after clear");
    }
    System.out.println("PASSED size(): size 0 after clear");

    if (!stack.isEmpty()) {
      throw new AssertionError("Clear test failed: Stack should be empty after clear");
    }
    System.out.println("PASSED isEmpty(): is empty true after clear");

    if (!stack.showElementsAsString().equals("[  ]")) {
      throw new AssertionError("Clear test failed: Stack elements are not cleared properly");
    }
    System.out.println("PASSED clear()");
    System.out.println("PASSED showElements()");
  }

  private static void testShowElements() {
    MyStack stack = new MyStack();
    stack.push("First");
    stack.push("Second");

    if (!stack.showElementsAsString().equals("[ First, Second ]")) {
      throw new AssertionError("showElements test failed: Incorrect output for stack elements");
    }
    System.out.println("PASSED showElements(): after adding two stack elements");

    stack.clear();

    if (!stack.showElementsAsString().equals("[  ]")) {
      throw new AssertionError("showElements test failed: Incorrect output for empty stack");
    }
    System.out.println("PASSED showElements(): after clearing the stack");
  }
}