/**
 * A Course Object
 *
 * An object to hold all assignments given in a school course
 *
 * @author Anderw Merrill
 * @version 1.0.0 February 18, 2020
 */

public class Course {
    /**
     * The array of assignments
     */
    private Assignment[] assignments;

    /**
     * The count of assignments
     */
    private int count;

    /**
     * The name of the course
     */
    private String name;

    /**
     * The title of the course
     */
    private String title;

    private static final int  MAX_ASSIGNMENTS = 5;
    private static final double TOTAL_PERCENT = 100;


    /**
     * Default Course constructor
     *
     * @param title Title of the course
     * @param name  Name of the course
     */
    public Course(String title, String name) {
        count = 0;
        this.name = name;
        this.title = title;
        assignments = new Assignment[MAX_ASSIGNMENTS];
    }

    /**
     * Adds an assignment to the course array assignments
     * @param title The title of the assignment
     * @param description The description of the assigment
     * @param topic The topic of the assigment
     * @param points The points given on the assignment
     */
    public void addAssignment(String title, String description, String topic, int points) {
        if (count == assignments.length) {
            assignments = growArray(assignments);
            System.out.println("grow called");
        }
        count++;
        assignments[count - 1] = new Assignment(title, description, topic, points);
    }

    /**
     * Returns a new CourseIterator
     * @return CourseIterator to iterate through given assignments
     */
    public CourseIterator createIterator() {
        CourseIterator retIterator = new CourseIterator(assignments);
        return retIterator;
    }

    /**
     * Gives the weights of each assignment
     * @return The % weight of each assignment
     */
    public double getAssignmentWeights() {
        return TOTAL_PERCENT / count;
    }

    /**
     * Returns a string with the title and name of the course
     * @return String with the tile and name of the course
     */
    public String toString() {
        return title + ": " + name;
    }

    /**
     * Doubles the size of the given array and inserts the given array into the new array
     *
     * @param first Given array of assignments
     * @return an array of double the size of "first"
     */
    private Assignment[] growArray(Assignment[] first) {
        Assignment[] retArray = new Assignment[first.length * 2];
        for (int i = 0; i < first.length; ++i) {
            if (first[i] == null) {
                break;
            }
            retArray[i] = first[i];
        }
        return retArray;
    }




}