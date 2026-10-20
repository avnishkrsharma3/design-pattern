package CreationalPattern.FactoryMethodPattern.Product;

/**
 * <b>Concrete Product</b> for the Chicago style clam pizza.
 * Created by {@code ChicagoPizzaStore#createPizza(PizzaType)}.
 * <p>
 * Chicago style pizzas are cut into squares instead of slices, so the shared
 * {@code cut()} step is overridden here.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public class ChicagoStyleClamPizza extends AbstractPizza {

    public ChicagoStyleClamPizza() {
        super("Chicago Style Clam Pizza");
    }

    @Override
    public void cut() {
        logger.log("cut " + getName() + " into square slices");
    }
}
