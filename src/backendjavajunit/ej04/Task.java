package backendjavajunit.ej04;

import java.util.Objects;

public class Task {
    
    private final long id;
    private String name;
    private String description;

    public Task(long id, String name, String description) {
        this.id = id;
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
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Task))
            return false;
        
        return o.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.description);
        return hash;
    }
    
}
