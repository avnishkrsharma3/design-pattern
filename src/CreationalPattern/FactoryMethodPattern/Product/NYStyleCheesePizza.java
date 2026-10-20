package CreationalPattern.FactoryMethodPattern.Product;

/**
 * <b>Concrete Product</b> for the New York style cheese pizza.
 * Created by {@code NYPizzaStore#createPizza(PizzaType)}.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public class NYStyleCheesePizza extends AbstractPizza {

    public NYStyleCheesePizza() {
        super("NY Style Cheese Pizza");
    }
}
