// Andrew Merrill
// a decoration child of tree decorator to be added to a christmast tree
public class Tinsel extends TreeDecorator{
    private ChristmasTree tree;

    public Tinsel(ChristmasTree tree) {
        this.tree = tree;
    }

    public String toString() {
        return tree.toString() + " + tinsel all around";
    }

    public double getCost() {
        return tree.getCost() + 2.0;
    }

}