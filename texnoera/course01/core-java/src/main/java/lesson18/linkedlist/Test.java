package lesson18.linkedlist;

public class Test {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println("Linked List:");
    list.display();

    System.out.println("\nRemoving element 20:");
    list.remove(20);
    list.display();

    System.out.println("\nRemoving element 40:");
    list.remove(40);
    list.display();
  }
}
