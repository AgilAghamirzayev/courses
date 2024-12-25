package lesson27.part1;

public class Task extends Thread {
    private String taskName;

    Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(taskName + " - Step " + i);
        }
    }
}