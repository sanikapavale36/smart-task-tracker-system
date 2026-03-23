public class Task {
    private int id;
    private String title;
    private String status;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = "Pending";
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void markCompleted() {
        this.status = "Completed";
    }

    @Override
    public String toString() {
        return id + ". " + title + " [" + status + "]";
    }
}
