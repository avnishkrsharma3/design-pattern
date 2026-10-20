package CreationalPattern.FactoryMethodPattern.Product;

/**
 * The kind of pizza a customer asks for.
 * <p>
 * Notice that this enum says <b>what</b> the customer wants and not <b>which concrete class</b> to build.
 * That decision belongs to the concrete store (see {@code NYPizzaStore} / {@code ChicagoPizzaStore}).
 * This is what keeps the client decoupled from the products.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public enum PizzaType {
    CHEESE,
    VEGGIE,
    CLAM
}
