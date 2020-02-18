/**
 * A class to hold the data for a given course assignment
 *
 * @author Anderw Merrill
 * @version 1.0.0 February 18, 2020
 */
public class Assignment {
    /**
     * The title of the Assignment
     */
    private String title;
    /**
     * The description of the assignment
     */
    private String description;
    /**
     * The topic of the assignment
     */
    private String topic;
    /**
     * The points for the assigment
     */
    private int points;

    /**
     * Default constructor for Assignment
     * @param title The title of the Assignment
     * @param description The description of the assignment
     * @param topic The topic of the assignment
     * @param points The points for the assigment
     */
    public Assignment(String title, String description, String topic, int points) {
        this.description = description;
        this.title = title;
        this.topic = topic;
        this.points = points;

    }

    /**
     * returns a string for the assignment
     * @return A string of the title, description, and topic of hte assignment
     */
    public String toString() {
        return title + ": " + description + ", covers: " + topic;
    }

}