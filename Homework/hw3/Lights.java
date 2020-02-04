// Andrew Merrill
// a decoration child of tree decorator to be added to a christmast tree
public class Lights extends TreeDecorator{
    private ChristmasTree tree;

    public Lights(ChristmasTree tree) {
        this.tree = tree;
    }

    public String toString() {
        return tree.toString() + " + strings of lights";
    }

    public double getCost() {
        return tree.getCost() + 2.0;
    }

}