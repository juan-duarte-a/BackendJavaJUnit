package backendjavajunit.ej04;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TaskManagerTest {
    
    private static TaskManager taskManager;
    
    @BeforeClass
    public static void setUpClass() {
        taskManager = new TaskManager();
    }

    @Test
    public void testListTaks() {
    }

    @Test
    public void testGetTasks() {
    }

    @Test
    public void testAddInitialTasks() {
    }

    @Test
    public void testRemoveTask() {
    }
    
}
