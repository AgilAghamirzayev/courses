package lesson12.demo.service;

import lesson12.demo.entity.TaskEntity;
import lesson12.demo.repository.TaskRepository;

public class TaskService {

  public void createTask(TaskEntity task) {
    task.setId(task.getId() + 1);
    TaskRepository.TASKS[task.getId()] = task;
  }

  public void deleteTask(int id) {
    System.out.println("Updating task...");
  }

  public void competeTask(boolean isCompleted) {
    System.out.println("Deleting task...");
  }

}
