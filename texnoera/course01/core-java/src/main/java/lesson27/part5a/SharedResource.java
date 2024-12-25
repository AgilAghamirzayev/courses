package lesson27.part5a;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
  private Queue<Integer> queue = new LinkedList<>();
  private final int CAPACITY = 5;

  // Add item to the queue (Producer's task)
  public synchronized void produce(int item) throws InterruptedException {
    while (queue.size() == CAPACITY) {
      System.out.println("Queue is full, producer is waiting...");
      wait(); // Wait until space is available
    }
    queue.add(item);
    System.out.println("Produced: " + item);
    notify(); // Notify the consumer that an item is available
  }

  // Remove item from the queue (Consumer's task)
  public synchronized int consume() throws InterruptedException {
    while (queue.isEmpty()) {
      System.out.println("Queue is empty, consumer is waiting...");
      wait(); // Wait until an item is available
    }
    int item = queue.poll();
    System.out.println("Consumed: " + item);
    notify(); // Notify the producer that space is available
    return item;
  }
}