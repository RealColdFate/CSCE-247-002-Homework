// Andrew Merrill
// a decoration child of tree decorator to be added to a christmast tree
public class Star extends TreeDecorator{
    private ChristmasTree tree;

    public Star(ChristmasTree tree) {
        this.tree = tree;
    }

    public String toString() {
        return tree.toString() + " + a star on top";
    }

    public double getCost() {
        return tree.getCost() + 6.0;
    }

}