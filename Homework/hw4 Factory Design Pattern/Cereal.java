/**
 * A Cereal Object
 * <p>
 * An abstract class to represent all types of cereal
 *
 * @author Andrew Merrill
 * @version 1.0.0 February 10, 2020
 */

public abstract class Cereal {

    protected String name;
    protected double price;

    /**
     * Prints the preparation for the cereal box
     */
    public void prepare() {
        System.out.println("Preparing the " + name);
    }

    /**
     * Prints the boxing text for the cereal box
     */
    public void boxCereal() {
        System.out.println("Putting fun pictures of " + name + "  on a box");
        System.out.println("Pouring the " + name + " into the box");
    }

    /**
     * Prints the pricing text for the cereal box
     */
    public void priceCereal() {
        System.out.println("Putting price tags of $" + price + " on the " + name + " box");
    }


}