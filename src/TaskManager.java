import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();
    private int taskIdCounter = 1;

    public void addTask(String title) {
        Task task = new Task(taskIdCounter++, title);
        tasks.add(task);
        System.out.println("Task added!");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void completeTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markCompleted();
                System.out.println("Task marked as completed!");
                return;
            }
        }
        System.out.println("Task not found.");
    }
}
