package lesson12.demo.entity;

import java.util.Objects;

public class TaskEntity {
  private int id;
  private String name;
  private String description;
  private boolean completed = false;

  public TaskEntity() {
  }

  public TaskEntity(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskEntity taskEntity = (TaskEntity) o;
    return id == taskEntity.id && Objects.equals(name, taskEntity.name) && Objects.equals(description, taskEntity.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description);
  }
}
