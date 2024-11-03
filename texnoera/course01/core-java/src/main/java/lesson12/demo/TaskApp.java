package lesson12.demo;

import java.util.Scanner;
import lesson12.demo.controller.TaskController;

public class TaskApp {
  public static void main(String[] args) {
    TaskController controller = new TaskController();
    Scanner scanner = new Scanner(System.in);
    System.out.println("1. Add task");
    System.out.println("2. Delete task");
    System.out.println("3. Compete task");
    int i = scanner.nextInt();

    switch (i) {
      case 1:
        controller.createTask();
        break;
      case 2:
        controller.deleteTask();
        break;
      case 3:
        controller.competeTask();
        break;
      default:
        System.out.println("Invalid option");
    }


  }
}
