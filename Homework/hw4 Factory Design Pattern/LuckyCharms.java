/**
 * A LuckyCharms Object
 * <p>
 * A class to represent the Lucky Charms cereal inherits from cereal
 *
 * @author Andrew Merrill
 * @version 1.0.0 February 10, 2020
 */
public class LuckyCharms extends Cereal {
    /**
     * Default LuckyCharms constructor.
     */
    LuckyCharms() {
        name = "Lucky Charms";
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
                "    - Create marshmellow shapes\n" +
                "\n" +
                "    - Mix circles and marshmellows");
    }

}