package lesson27.part1;

public class MultiThreadExample {
    public static void main(String[] args) {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        Task task3 = new Task("Task 2");

        task1.start();
        task2.start();
    }
}