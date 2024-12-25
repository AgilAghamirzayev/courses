package lesson20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

public class TodoApp {

  private static final String ACCOUNTS_FILE = "accounts.dat";
  private static final String TASKS_FILE = "tasks.dat";

  private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, String> accounts = new HashMap<>(); // Email -> Password
    private static final Map<String, List<Task>> tasks = new HashMap<>(); // Email -> Task List
    private static String loggedInUser = null;

    public static void main(String[] args) {
        loadAccounts();
        loadTasks();

        while (true) {
            System.out.println("\nWelcome to TODO App!");
            System.out.println("1. Create an Account");
            System.out.println("2. Login");
            System.out.println("3. Add TODO");
            System.out.println("4. View TODOs");
            System.out.println("5. Update Task Status");
            System.out.println("6. Delete Task");
            System.out.println("7. Logout");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> login();
                case 3 -> addTodo();
                case 4 -> viewTodos();
                case 5 -> updateTaskStatus();
                case 6 -> deleteTask();
                case 7 -> logout();
                case 8 -> {
                    saveAccounts();
                    saveTasks();
                    System.out.println("Thank you for using TODO App!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        if (!isValidEmail(email)) {
            System.out.println("Invalid email format. Please try again.");
            return;
        }

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if (!isValidPassword(password)) {
            System.out.println("Password must have at least 8 characters, including one uppercase, one number, and one special character.");
            return;
        }

        if (accounts.containsKey(email)) {
            System.out.println("Account already exists. Please login.");
            return;
        }

        accounts.put(email, password);
        tasks.put(email, new ArrayList<>());
        System.out.println("Account created successfully!");
    }

    private static void login() {
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (accounts.containsKey(email) && accounts.get(email).equals(password)) {
            loggedInUser = email;
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid email or password.");
        }
    }

    private static void addTodo() {
      if (!isLoggedIn()) {
        return;
      }

        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dueDateStr = scanner.nextLine();
        System.out.print("Enter priority (Low, Medium, High): ");
        String priority = scanner.nextLine();

        try {
            LocalDate dueDate = LocalDate.parse(dueDateStr);
            Task task = new Task(name, dueDate, priority);
            tasks.get(loggedInUser).add(task);
            System.out.println("Task added successfully!");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please try again.");
        }
    }

    private static void viewTodos() {
      if (!isLoggedIn()) {
        return;
      }

        List<Task> userTasks = tasks.get(loggedInUser);
        if (userTasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }

        System.out.println("Your TODOs:");
        for (Task task : userTasks) {
            System.out.println(task);
        }
    }

    private static void updateTaskStatus() {
      if (!isLoggedIn()) {
        return;
      }

        viewTodos();
        System.out.print("Enter task ID to update: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new status (Pending, In Progress, Completed): ");
        String status = scanner.nextLine();

        List<Task> userTasks = tasks.get(loggedInUser);
        if (taskId < 1 || taskId > userTasks.size()) {
            System.out.println("Invalid task ID.");
            return;
        }

        Task task = userTasks.get(taskId - 1);
        task.setStatus(status);
        System.out.println("Task status updated successfully!");
    }

    private static void deleteTask() {
      if (!isLoggedIn()) {
        return;
      }

        viewTodos();
        System.out.print("Enter task ID to delete: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<Task> userTasks = tasks.get(loggedInUser);
        if (taskId < 1 || taskId > userTasks.size()) {
            System.out.println("Invalid task ID.");
            return;
        }

        userTasks.remove(taskId - 1);
        System.out.println("Task deleted successfully!");
    }

    private static void logout() {
        if (isLoggedIn()) {
            loggedInUser = null;
            System.out.println("You have been logged out.");
        }
    }

    private static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    private static boolean isValidPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=*]).{8,}$");
    }

    private static boolean isLoggedIn() {
        if (loggedInUser == null) {
            System.out.println("You need to login first.");
            return false;
        }
        return true;
    }



  private static void loadAccounts() {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ACCOUNTS_FILE))) {
      Object loadedAccounts = ois.readObject();
      if (loadedAccounts instanceof Map) {
        accounts.putAll((Map<String, String>) loadedAccounts);
      }
      System.out.println("Accounts loaded successfully.");
    } catch (FileNotFoundException e) {
      System.out.println("No accounts file found. Starting with an empty list.");
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Failed to load accounts: " + e.getMessage());
    }
  }

  private static void saveAccounts() {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ACCOUNTS_FILE))) {
      oos.writeObject(accounts);
      System.out.println("Accounts saved successfully.");
    } catch (IOException e) {
      System.out.println("Failed to save accounts: " + e.getMessage());
    }
  }

  private static void loadTasks() {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(TASKS_FILE))) {
      Object loadedTasks = ois.readObject();
      if (loadedTasks instanceof Map) {
        tasks.putAll((Map<String, List<Task>>) loadedTasks);
      }
      System.out.println("Tasks loaded successfully.");
    } catch (FileNotFoundException e) {
      System.out.println("No tasks file found. Starting with an empty task list.");
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Failed to load tasks: " + e.getMessage());
    }
  }

  private static void saveTasks() {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(TASKS_FILE))) {
      oos.writeObject(tasks);
      System.out.println("Tasks saved successfully.");
    } catch (IOException e) {
      System.out.println("Failed to save tasks: " + e.getMessage());
    }
  }

}