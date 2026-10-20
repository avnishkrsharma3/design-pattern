package CreationalPattern.FactoryMethodPattern.Store;

import CreationalPattern.FactoryMethodPattern.Product.NYStyleCheesePizza;
import CreationalPattern.FactoryMethodPattern.Product.NYStyleVeggiePizza;
import CreationalPattern.FactoryMethodPattern.Product.Pizza;
import CreationalPattern.FactoryMethodPattern.Product.PizzaType;

/**
 * <b>Concrete Creator</b> for the New York store.
 * <p>
 * This class only implements the factory method. The New York store has its own
 * menu, so a request that it cannot serve is rejected here instead of silently
 * producing a wrong product.
 * <p>
 * Adding a new NY product only requires changing this class - {@code PizzaStore}
 * and the client stay untouched.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new NYStyleCheesePizza();
            case VEGGIE:
                return new NYStyleVeggiePizza();
            default:
                throw new IllegalArgumentException(getStoreName() + " does not serve a " + type + " pizza");
        }
    }
}
