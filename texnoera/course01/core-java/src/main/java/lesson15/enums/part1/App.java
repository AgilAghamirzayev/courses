package lesson15.enums.part1;

public class App {
  public static void main(String[] args) {
    Task task1 = new Task("Java", Status.do_);
    Task task2 = new Task("Kotlin", Status.done);
    Task task3 = new Task("Go", Status.inProgress);

    printTaskStatus(task1, task2, task3);
  }

  public static void printTaskStatus(Task... tasks) {
    for (Task task : tasks) {
      switch (task.getStatus()) {
        case Status.do_:
          System.out.println("Task is in progress");
          break;
        case Status.done:
          System.out.println("Task is completed");
          break;
        case Status.inProgress:
          System.out.println("Task in progress complete");
        default:
          System.out.println("Unknown status");
          break;
      }
    }
  }
}
