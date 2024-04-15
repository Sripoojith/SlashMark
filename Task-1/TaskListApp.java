import java.util.Scanner;
import java.util.ArrayList;

public class TaskListApp {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    addTask(tasks, scanner);
                    break;
                case 2:
                    removeTask(tasks, scanner);
                    break;
                case 3:
                    listTasks(tasks);
                    break;
                case 4:
                    System.out.println("Exiting Task List Application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    private static void displayMenu() {
        System.out.println("Task List Application");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. List Tasks");
        System.out.println("4. Quit");
        System.out.print("Select an option: ");
    }

    private static int getUserChoice(Scanner scanner) {
        return scanner.nextInt();
    }

    private static void addTask(ArrayList<String> tasks, Scanner scanner) {
        System.out.print("Enter task name: ");
        String name = scanner.next();
        tasks.add(name);
        System.out.println("Task added.");
    }

    private static void removeTask(ArrayList<String> tasks, Scanner scanner) {
        if (!tasks.isEmpty()) {

            listTasks(tasks);
            System.out.print("Enter the task number to remove: ");
            int taskNumber = scanner.nextInt();
            if (isValidTaskNumber(taskNumber, tasks.size())) {
                tasks.remove(taskNumber - 1);
                System.out.println("Task removed.");
            } else {
                System.out.println("Invalid task number.");
            }
        } else {
            System.out.println("No tasks to remove.");
        }
    }

    private static void listTasks(ArrayList<String> tasks) {
        if (!tasks.isEmpty()) {
            System.out.println("Task List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        } else {
            System.out.println("No tasks to list.");
        }
    }
    private static boolean isValidTaskNumber(int taskNumber, int size) {
        return taskNumber >= 1 && taskNumber <= size;
    }
}
