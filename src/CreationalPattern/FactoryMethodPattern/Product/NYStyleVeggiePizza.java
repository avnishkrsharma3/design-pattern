package CreationalPattern.FactoryMethodPattern.Product;

/**
 * <b>Concrete Product</b> for the New York style veggie pizza.
 * Created by {@code NYPizzaStore#createPizza(PizzaType)}.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public class NYStyleVeggiePizza extends AbstractPizza {

    public NYStyleVeggiePizza() {
        super("NY Style Veggie Pizza");
    }
}
