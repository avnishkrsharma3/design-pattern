package CreationalPattern.FactoryMethodPattern.Product;

/**
 * The <b>Product</b> of the Factory Method pattern.
 * <p>
 * The client only ever talks to this interface, never to a concrete pizza.
 * The concrete classes are produced by the factory method declared in
 * {@code PizzaStore} and are therefore invisible to the client.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public interface Pizza {

    /**
     * @return the human readable name of this pizza.
     */
    String getName();

    public void prepare();

    public void bake();

    public void cut();

    public void box();

}
