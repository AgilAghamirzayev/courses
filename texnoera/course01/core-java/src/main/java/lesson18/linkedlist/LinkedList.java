package lesson18.linkedlist;

class LinkedList {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node head;

  public void add(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public void display() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }

  public void remove(int data) {
    if (head == null) {
      System.out.println("List is empty, nothing to remove.");
      return;
    }

    if (head.data == data) {
      head = head.next;
      return;
    }

    Node current = head;
    while (current.next != null && current.next.data != data) {
      current = current.next;
    }

    if (current.next == null) {
      System.out.println("Element " + data + " not found in the list.");
    } else {
      current.next = current.next.next;
    }
  }

}