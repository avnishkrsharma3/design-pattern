package CreationalPattern.FactoryMethodPattern.Store;

import CreationalPattern.FactoryMethodPattern.Product.ChicagoStyleCheesePizza;
import CreationalPattern.FactoryMethodPattern.Product.ChicagoStyleClamPizza;
import CreationalPattern.FactoryMethodPattern.Product.Pizza;
import CreationalPattern.FactoryMethodPattern.Product.PizzaType;

/**
 * <b>Concrete Creator</b> for the Chicago store.
 * <p>
 * Same request, different product: asking this store for a {@link PizzaType#CHEESE}
 * pizza yields a {@code ChicagoStyleCheesePizza}, while the NY store yields an
 * {@code NYStyleCheesePizza}. The client code is identical in both cases.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            case CLAM:
                return new ChicagoStyleClamPizza();
            default:
                throw new IllegalArgumentException(getStoreName() + " does not serve a " + type + " pizza");
        }
    }
}
