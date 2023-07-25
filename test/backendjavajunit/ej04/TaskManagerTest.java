package backendjavajunit.ej04;

import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class TaskManagerTest {
    
    private TaskManager taskManager;
    private static List<Task> tasksList;
    
    @BeforeClass
    public static void setUpClass() {
        tasksList = new ArrayList<>();
        tasksList.add(new Task(1001, "Study Java", "Don't be lazy and write some code. Reading is not enough."));
        tasksList.add(new Task(1002, "Work out", "Spend one hour exercising and try not to complain while doing it."));
        tasksList.add(new Task(1003, "Walk the dog", "Take Firulais to the park and do not forget to collect his 'things'."));
    }
    
    @Before
    public void setUp() {
        taskManager = new TaskManager();
        taskManager.addTask(1001, "Study Java", "Don't be lazy and write some code. Reading is not enough.");
        taskManager.addTask(1002, "Work out", "Spend one hour exercising and try not to complain while doing it.");
        taskManager.addTask(1003, "Walk the dog", "Take Firulais to the park and do not forget to collect his 'things'.");
    }

    @Test
    public void addTask() {
        Task task = new Task(1004, "Go to sleep", "You need properly sleep time. No more videogames before bed time.");
        taskManager.addTask(1004, "Go to sleep", "You need properly sleep time. No more videogames before bed time.");
        
        assertEquals(taskManager.getTasks().get(3), task);
    }

    @Test
    public void testGetTasks() {
        assertEquals(tasksList, taskManager.getTasks());
    }
    
    @Test
    public void testRemoveTaskNonexistentTask() {
        taskManager.removeTask(2000);
        assertEquals(tasksList, taskManager.getTasks());
    }

    @Test
    public void testRemoveTaskExistentTask() {
        List<Task> tempTaskList = new ArrayList<>(tasksList);
        tempTaskList.remove(2);
        
        taskManager.removeTask(1003);
        assertEquals(tempTaskList, taskManager.getTasks());
    }
    
}
