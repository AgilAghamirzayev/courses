package lesson06.solutions;

import java.util.Scanner;

class MyStackNasir {
  Scanner scanner = new Scanner(System.in);
  final public int Max_size = 10;
  public int capacity = Max_size;
  public boolean empty;
  public boolean full;
  public int point = 0;
  String[] arr = new String[capacity];


  public void clear() {
    if (arr[0] != null) {

      for (int i = 0; i <= point; i++) {
        arr[point - 1] = null;
        point--;
      }
      System.out.println("Elementler silindi");
    } else {
      System.out.println("Arrayda element sayi 0-dir");
    }
  }

  public int size() {
    int count = 0;
    if (arr[0] != null) {
      for (int i = 0; i < point; i++) {
        count++;
      }
    }

    return count;
  }

  public String push(String element) {
    arr[point] = element;
    point++;
    return element;
  }

  public void showElements(String[] arr) {
    if (arr[0] == null) {
      System.out.println("Array bowdur");
    } else {
      for (int i = 0; i < point; i++) {
        System.out.print(arr[i] + " ");
      }
    }
  }

  public void pop() {
    if (arr[0] != null) {
      System.out.println();
      System.out.println(arr[point - 1] + " " + "elementi silindi");
      arr[point - 1] = null;
      point--;
    } else {
      System.out.println("Array bosdur");
    }
  }

  public void IsEmpty() {
    if (arr[0] != null) {
      empty = false;
      System.out.println(empty);
    } else {
      empty = true;
      System.out.println(empty);
    }
  }

  public void IsFull(MyStackNasir[] arr) {
    if (arr[0] == null) {
      full = false;
      System.out.println(full);
    } else {
      full = true;
      System.out.println(full);
    }
  }

  public void getCapacity() {
    System.out.println(Max_size);
  }
}