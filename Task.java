public class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public void complete() {
        completed = true;
    }

    public void display() {
        System.out.println(name + " - Completed: " + completed);
    }
}