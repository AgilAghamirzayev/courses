package lesson07.solutions;

import java.util.Arrays;

public class MyStack {

  public static final int MAX_STACK_SIZE = 10;
  private final String[] array = new String[MAX_STACK_SIZE];
  private int pointer = 0;

  public void push(String newElement) {
    if (pointer == MAX_STACK_SIZE) {
      throw new RuntimeException("Cannot push, stack is full");
    }
    array[pointer++] = newElement;
  }

  public String pop() {
    if (pointer == 0) {
      throw new RuntimeException("Cannot pop, stack is empty");
    }
    String lastElement = array[--pointer];
    array[pointer] = null;
    return lastElement;
  }

  public void clear() {
//    Arrays.fill(array, null);
    Arrays.fill(array, 0, pointer, null);
    pointer = 0;
  }

  public boolean isEmpty() {
    return pointer == 0;
  }

  public boolean isFull() {
    return pointer == MAX_STACK_SIZE;
  }

  public int size() {
    return pointer;
  }

  public int getCapacity() {
    return MAX_STACK_SIZE;
  }

  public void showElements() {
    System.out.print("[ ");
    for (int i = 0; i < pointer; i++) {
      System.out.print(array[i]);
      if (i < pointer - 1) {
        System.out.print(", ");
      }
    }
    System.out.println(" ]");
  }

  public String showElementsAsString() {
    StringBuilder sb = new StringBuilder("[ ");
    for (int i = 0; i < pointer; i++) {
      sb.append(array[i]);
      if (i < pointer - 1) {
        sb.append(", ");
      }
    }
    sb.append(" ]");
    return sb.toString();
  }

}