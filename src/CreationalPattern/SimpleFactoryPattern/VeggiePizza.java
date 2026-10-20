package CreationalPattern.SimpleFactoryPattern;

import CreationalPattern.SingletonPattern.DoubleCheckedSyncLogger;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class VeggiePizza implements Pizza {
    DoubleCheckedSyncLogger logger = DoubleCheckedSyncLogger.getInstance();
    @Override
    public void prepare() {
        logger.log("Preparing VeggiePizza");
    }

    @Override
    public void bake() {
        logger.log("Baking VeggiePizza");
    }

    @Override
    public void cut() {
        logger.log("Cutting VeggiePizza");
    }

    @Override
    public void box() {
        logger.log("Boxing VeggiePizza");
    }
}
