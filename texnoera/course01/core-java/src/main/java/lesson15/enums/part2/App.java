package lesson15.enums.part2;

import static lesson15.enums.part2.Status.COMPLETED;
import static lesson15.enums.part2.Status.DO;
import static lesson15.enums.part2.Status.IN_PROGRESS;

public class App {
  public static void main(String[] args) {
    Task task1 = new Task("Java", DO);
    Task task2 = new Task("Kotlin", COMPLETED);
    Task task3 = new Task("Go", IN_PROGRESS);

    printTaskStatus(task1, task2, task3);
  }

  public static void printTaskStatus(Task... tasks) {
    for (Task task : tasks) {
      switch (task.getStatus()) {
        case DO -> System.out.println("Task is in progress");
        case COMPLETED -> System.out.println("Task is completed");
        case IN_PROGRESS -> System.out.println("Task in progress complete");
        default -> System.out.println("Task not in progress");
      }
    }
  }
}
