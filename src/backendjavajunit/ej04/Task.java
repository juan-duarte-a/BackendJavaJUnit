package backendjavajunit.ej04;

public class Task {
    
    private static long idCount = 1001;
    private final long id;
    private String name;
    private String description;

    public Task(String name, String description) {
        this.id = idCount++;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return id + ". " + name + ". " + description;
    }
    
}
