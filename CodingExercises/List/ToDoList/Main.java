package CodingExercises.List.ToDoList;

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        ToDo toDo = new ToDo();
        Scanner sc = new Scanner(System.in);

        while (true) { // Loop to keep prompting the user
            displayMenu();
            System.out.print("Choose an option: ");
            String choice = sc.nextLine().trim().toUpperCase(); // Trim whitespace for cleaner input

            switch (choice) {
                case "A": {
                    System.out.print("Enter task to add: ");
                    String task = sc.nextLine();
                    toDo.addTask(task);
                    System.out.println("Task added: " + task);
                    break;
                }
                case "D": {
                    System.out.print("Enter task to delete: ");
                    String task = sc.nextLine();
                    toDo.deleteTask(task);
                    System.out.println("Task deleted: " + task);
                    break;
                }
                case "C": {
                    System.out.print("Enter task to move: ");
                    String task = sc.nextLine();
                    System.out.print("Enter new position: ");
                    int position = sc.nextInt();
                    sc.nextLine(); // Clear the newline character
                    toDo.changeTaskPosition(task, position);
                    System.out.println("Task moved: " + task + " to position " + position);
                    break;
                }
                case "E": {
                    System.out.print("Enter task to edit: ");
                    String oldTask = sc.nextLine();
                    System.out.print("Enter new task description: ");
                    String newTask = sc.nextLine();
                    toDo.editTask(oldTask, newTask);
                    System.out.println("Task edited: " + oldTask + " -> " + newTask);
                    break;
                }
                case "R": {
                    System.out.print("Enter task to reverse: ");
                    String task = sc.nextLine();
                    toDo.reverseTask(task);
                    System.out.println("Task reversed: " + task);
                    break;
                }
                case "DT": {
                    System.out.print("Enter task to delete: ");
                    String task = sc.nextLine();
                    toDo.deleteTask(task);
                    System.out.println("Task deleted: " + task);
                    break;
                }
                case "Q": { // Add an exit option
                    System.out.println("Exiting program. Goodbye!");
                    sc.close(); // Close the scanner
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    public static void displayMenu() {
        System.out.println(
            """
            Your options are:
            - A: to Add a task
            - D: to Delete a task
            - C: to Change the position of a task
            - E: to Edit a task
            - R: to Reverse the task
            - DT: to Delete a task
            - Q: to Quit
            """
        );
    }
}
