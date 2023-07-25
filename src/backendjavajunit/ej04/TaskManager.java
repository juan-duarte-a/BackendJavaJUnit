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
    
    public void addInitialTasks() {
        tasks.add(new Task("Study Java", "Don't be lazy and write some code. Reading is not enough."));
        tasks.add(new Task("Work out", "Spend one hour exercising and try not to complain while doing it."));
        tasks.add(new Task("Walk the dog", "Take Firulais to the park and do not forget to collect his 'things'."));
    }
    
    public boolean removeTask(long id) {
        return tasks.removeIf((t) -> t.getId() == id);
    }
    
}
