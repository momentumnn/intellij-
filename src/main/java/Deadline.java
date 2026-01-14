public class Deadline extends Todo {
    String by;
    Deadline(String description, String by){
        super(description);
        this.by = by;
    }

    public String getBy(){
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }
}