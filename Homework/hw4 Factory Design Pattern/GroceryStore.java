/**
 * A GroceryStore Object
 * <p>
 * A class to represent the grocery store where cereals are sold
 *
 * @author Andrew Merrill
 * @version son 1.0.0 February 10, 2020
 */
public class GroceryStore {
    /**
     * @param type The type of cereal to be constructed
     * @return the instance of the cereal that has been instatiated
     * creates a cereal instance form a given string cereal type
     */
    public Cereal orderCereal(String type) {
        if (type.equalsIgnoreCase("Lucky Charms")) {
            return new LuckyCharms();
        }
        else if (type.equalsIgnoreCase("Frosted flakes")) {
            return new FrostedFlakes();
        }
        else if (type.equalsIgnoreCase("Fruit Loops")) {
            return new FruitLoops();
        }
        return null;
    }

    /**
     * @param type The type of cereal to be constructed
     * @return the instance of the cereal that has been instatiated
     * creates a ceral instance form a given string cereal type
     */
    private Cereal createCeral(String type) {
        if (type.equalsIgnoreCase("Lucky Charms")) {
            return new LuckyCharms();
        }
        else if (type.equalsIgnoreCase("Frosted flakes")) {
            return new FrostedFlakes();
        }
        else if (type.equalsIgnoreCase("FruitLoops")) {
            return new FruitLoops();
        }
        return null;
    }
}