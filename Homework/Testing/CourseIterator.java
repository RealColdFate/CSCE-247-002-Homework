import java.util.Iterator;

public class CourseIterator implements Iterator {

    private Assignment[] assignements;

    private int position;

    public CourseIterator(Assignment[] assignments) {
        position = 0;
        this.assignements = assignments;
    }

    public boolean hasNext() {
        return !(assignements.length == position);
    }

    public Assignment next() {
        position++;
        return assignements[position];
    }


}