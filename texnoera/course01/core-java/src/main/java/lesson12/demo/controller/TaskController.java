package lesson12.demo.controller;

import java.util.Scanner;
import lesson12.demo.entity.TaskEntity;
import lesson12.demo.service.TaskService;

public class TaskController {

  private final Scanner scanner = new Scanner(System.in);
  private final TaskService taskService = new TaskService();

  public void createTask() {
    System.out.print("Task name: ");
    String name = scanner.next();
    System.out.println("Task description: ");
    String description = scanner.next();

    TaskEntity task = new TaskEntity(name, description);
    taskService.createTask(task);
  }

  public void deleteTask() {
    System.out.println("Updating task...");
  }

  public void competeTask() {
    System.out.println("Deleting task...");
  }
}
