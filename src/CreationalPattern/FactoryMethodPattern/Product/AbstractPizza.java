package CreationalPattern.FactoryMethodPattern.Product;

import CreationalPattern.SingletonPattern.*;

/**
 * Convenience base class for every <b>Concrete Product</b>.
 * <p>
 * It implements the shared "make a pizza" steps once so that the concrete
 * classes stay focused on what makes them different (name + regional quirks).
 * <p>
 * A concrete product is free to override any of these steps, e.g. the Chicago
 * style pizzas {@code cut()} their pizza into squares instead of slices.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public abstract class AbstractPizza implements Pizza {

    protected final DoubleCheckedSyncLogger logger = DoubleCheckedSyncLogger.getInstance();

    private final String name;

    protected AbstractPizza(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void prepare() {
        logger.log("prepare " + name);
    }

    @Override
    public void bake() {
        logger.log("bake " + name);
    }

    @Override
    public void cut() {
        logger.log("cut " + name);
    }

    @Override
    public void box() {
        logger.log("box " + name);
    }

    @Override
    public String toString() {
        return name;
    }
}
