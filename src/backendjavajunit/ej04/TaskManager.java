package backendjavajunit.ej04;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    
    private final List<Task> tasks;
    
    public TaskManager() {
        tasks = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.listTaks();
    }
    
    public void listTaks() {
        if (tasks.isEmpty())
            System.out.println("There are no tasks.");
        else
            tasks.forEach(System.out::println);
    }
    
    public List<Task> getTasks() {
        return tasks;
    }
    
    public void addTask(long id, String name, String description) {
        tasks.add(new Task(id, name, description));
    }
    
    public boolean removeTask(long id) {
        return tasks.removeIf(t -> t.getId() == id);
    }
    
}
