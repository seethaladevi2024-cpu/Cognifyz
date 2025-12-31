class Task {

    private int id;
    private String title;
    private String description;

    // Constructor
    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Display task details
    public void displayTask() {
        System.out.println("ID: " + id + 
                           ", Title: " + title + 
                           ", Description: " + description);
    }
}
