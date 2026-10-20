package CreationalPattern.FactoryMethodPattern.Store;

import CreationalPattern.FactoryMethodPattern.Product.Pizza;
import CreationalPattern.FactoryMethodPattern.Product.PizzaType;
import CreationalPattern.SingletonPattern.*;

/**
 * <b>Creator</b> of the Factory Method pattern.
 * <p>
 * {@code PizzaStore} knows <i>how</i> to order and prepare a pizza, but it does
 * <b>not</b> know <i>which</i> concrete pizza it is dealing with. That knowledge
 * is pushed down into the concrete subclasses through the abstract factory
 * method {@link #createPizza(PizzaType)}.
 * <p>
 * <b>How the pattern works here:</b>
 * <ol>
 *     <li>{@code orderPizza(PizzaType)} is the <i>template method</i>. Its body is
 *         fixed: it asks the factory method for a product and then runs the
 *         common prepare / bake / cut / box steps.</li>
 *     <li>{@code createPizza(PizzaType)} is the <i>factory method</i>. It is
 *         declared {@code abstract} here and implemented by every concrete store,
 *         which is what allows a new store (and new products) to be added
 *         without touching this class or the client.</li>
 * </ol>
 * Because {@link #createPizza(PizzaType)} returns the {@link Pizza} interface,
 * the client never depends on any concrete product class.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public abstract class PizzaStore {

    protected final DoubleCheckedSyncLogger logger = DoubleCheckedSyncLogger.getInstance();

    /**
     * The <b>Factory Method</b>.
     * <p>
     * Each concrete store decides which {@link Pizza} implementation it produces
     * for a given request.
     *
     * @param type the pizza the customer asked for.
     * @return the concrete product created by this store.
     * @throws IllegalArgumentException if this store does not serve that type.
     */
    protected abstract Pizza createPizza(PizzaType type);

    /**
     * The <b>Template Method</b> that drives the factory method.
     * <p>
     * The steps below are identical for every store, so they live here. Only the
     * product differs, and that is supplied by {@link #createPizza(PizzaType)}.
     *
     * @param type the pizza the customer asked for.
     * @return the pizza that was ordered.
     */
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        logger.log(getStoreName() + " is ordering a " + type + " pizza");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * @return the name of this store, used only for the log output.
     */
    protected String getStoreName() {
        return getClass().getSimpleName();
    }
}
