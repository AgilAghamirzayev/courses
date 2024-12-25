package lesson27.part1;

// Single-threaded example
public class SingleThreadExample {
    public static void main(String[] args) {
        System.out.println("Task 1 is starting...");
        for (int i = 0; i < 5; i++) {
            System.out.println("Task 1 - Step " + i);
        }

        System.out.println("Task 2 is starting...");
        for (int i = 0; i < 5; i++) {
            System.out.println("Task 2 - Step " + i);
        }
    }
}