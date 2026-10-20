package CreationalPattern.FactoryMethodPattern.Product;

/**
 * <b>Concrete Product</b> for the Chicago style cheese pizza.
 * Created by {@code ChicagoPizzaStore#createPizza(PizzaType)}.
 * <p>
 * Chicago style pizzas are cut into squares instead of slices, so the shared
 * {@code cut()} step is overridden here.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public class ChicagoStyleCheesePizza extends AbstractPizza {

    public ChicagoStyleCheesePizza() {
        super("Chicago Style Cheese Pizza");
    }

    @Override
    public void cut() {
        logger.log("cut " + getName() + " into square slices");
    }
}
