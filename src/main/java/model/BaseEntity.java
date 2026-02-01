package model;

public abstract class BaseEntity {
    private int id;
    private String name;

    public BaseEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    public void printSummary() {
        System.out.println("Entity: " + name + " (ID: " + id + ")");
    }

    public abstract void validate();
    public abstract void printInfo();
}
