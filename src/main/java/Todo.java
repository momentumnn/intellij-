public class Todo extends Task {
    boolean isDone;

    Todo(String description) {
        super(description);
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        this.isDone = done;
    }
}