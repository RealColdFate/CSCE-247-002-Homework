public class Course {
    private Assignment[] assignments;

    private int count;

    private String name;

    private String title;

    private static final int  MAX_ASSIGNMENTS = 5;
    private static final double TOTAL_PERCENT = 100;



    public Course(String title, String name) {
        count = 0;
        this.name = name;
        this.title = title;
        assignments = new Assignment[MAX_ASSIGNMENTS];
    }

    public void addAssignment(String title, String description, String topic, int points) {
        if (count == assignments.length - 1) {
            assignments = growArray(assignments);
            System.out.println("grow called");
        }
        assignments[count] = new Assignment(title, description, topic, points);
        count++;
    }

    /**
     * @return
     */
    public CourseIterator createIterator() {
        CourseIterator retIterator = new CourseIterator(assignments);
        return retIterator;
    }

    public double getAssignmentWeights() {
        return TOTAL_PERCENT / count;
    }

    public String toString() {
        return title + ": " + name;
    }

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