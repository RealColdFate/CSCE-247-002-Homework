/**
 * A FrostedFlakes Object
 * <p>
 * A class to represent the frosted flakes cereal inherits from cereal
 *
 * @author Andrew Merrill
 * @version 1.0.0 February 10, 2020
 */
public class FrostedFlakes extends Cereal {
    /**
     * Default Frosted Flakes constructor.
     */
    FrostedFlakes() {
        name = "Frosted Flakes";
        price = 2.99;
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
                "    - Shape into flakes\n" +
                "\n" +
                "    - Sprinkle with frosting");
    }

}