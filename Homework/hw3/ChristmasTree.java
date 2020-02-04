// Andrew Merrill
// abstract class defining a tree
public abstract class ChristmasTree {
    // breif discription of the type of tree used in toString()
    protected String description;

    // returns trees discripiton
    public String toString() {
        return description;
    }

    // returns the cost of the tree
    public abstract double getCost();

}