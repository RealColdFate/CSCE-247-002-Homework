public class Assignment {
    private String title;

    private String descritpion;

    private String topic;

    private int points;

    public Assignment(String title, String description, String topic, int points) {
        this.descritpion = description;
        this.title = title;
        this.topic = topic;
        this.points = points;

    }

    public String toString() {
        return title + ": " + descritpion + ", covers: " + topic;
    }

}