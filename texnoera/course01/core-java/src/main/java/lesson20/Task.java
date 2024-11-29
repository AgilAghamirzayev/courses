package lesson20;

import java.time.LocalDate;

public class Task {
    private static int idCounter = 1;
    private final int id;
    private final String name;
    private final LocalDate dueDate;
    private final String priority;
    private String status;

    public Task(String name, LocalDate dueDate, String priority) {
        this.id = idCounter++;
        this.name = name;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = "Pending";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Due Date: %s | Priority: %s | Status: %s", id, name, dueDate, priority, status);
    }
}