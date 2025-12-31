import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    static ArrayList<Task> taskList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int taskIdCounter = 1;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. Create Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }

    // CREATE
    static void createTask() {
        System.out.print("Enter task title: ");
        String title = sc.nextLine();

        System.out.print("Enter task description: ");
        String description = sc.nextLine();

        Task newTask = new Task(taskIdCounter++, title, description);
        taskList.add(newTask);

        System.out.println("Task added successfully!");
    }

    // READ
    static void viewTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\nTask List:");
        for (Task task : taskList) {
            task.displayTask();
        }
    }

    // UPDATE
    static void updateTask() {
        System.out.print("Enter task ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Task task : taskList) {
            if (task.getId() == id) {
                System.out.print("Enter new title: ");
                task.setTitle(sc.nextLine());

                System.out.print("Enter new description: ");
                task.setDescription(sc.nextLine());

                System.out.println("Task updated successfully!");
                return;
            }
        }
        System.out.println("Task not found!");
    }

    // DELETE
    static void deleteTask() {
        System.out.print("Enter task ID to delete: ");
        int id = sc.nextInt();

        for (Task task : taskList) {
            if (task.getId() == id) {
                taskList.remove(task);
                System.out.println("Task deleted successfully!");
                return;
            }
        }
        System.out.println("Task not found!");
    }
}
