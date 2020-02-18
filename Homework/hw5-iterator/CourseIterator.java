import java.util.Iterator;

/**
 * A class CourseIterator to make a course's assignments iterable
 *
 * @author Anderw Merrill
 * @version 1.0.0 February 18, 2020
 */
public class CourseIterator implements Iterator {
    /**
     * Array of assignments
     */
    private Assignment[] assignments;
    /**
     * current position of the iterator
     */
    private int position;

    /**
     * Default constructor for CourseIterator
     * @param assignments an array of Assignments for the course
     */
    public CourseIterator(Assignment[] assignments) {
        position = 0;
        this.assignments = assignments;
    }

    /**
     * Returns true if there is a next element and false if there isn't
     * @return returns if there is a next element
     */
    public boolean hasNext() {
        return (assignments[position] != null);
    }

    /**
     * Returns the next element in the array and adds one to position
     * @return Next elements in assignments
     */
    public Assignment next() {
        Assignment next = assignments[position];
        position++;
        return next;
    }


}