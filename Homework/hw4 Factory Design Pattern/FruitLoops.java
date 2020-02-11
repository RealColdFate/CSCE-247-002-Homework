/**
 * A FruitLoops Object
 * <p>
 * A class to represent the Fruit Loops cereal inherits from cereal
 *
 * @author Andrew Merrill
 * @version 1.0.0 February 10, 2020
 */
public class FruitLoops extends Cereal {
    /**
     * Default FruitLoops constructor.
     */
    FruitLoops() {
        name = "Fruit Loops";
        price = 1.55;
        prepare();
        super.boxCereal();
        super.priceCereal();
    }

    /**
     * overides method prepare from superclass cereal and prints other text
     */
    public void prepare() {
        super.prepare();
        System.out.println("    - Gather the grain\n" +
                "\n" +
                "    - Shape into circles\n" +
                "\n" +
                "    - Randomly color circles\n" +
                "\n" +
                "    - Let circles dry");
    }

}