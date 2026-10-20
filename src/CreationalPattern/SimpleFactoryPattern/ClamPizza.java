package CreationalPattern.SimpleFactoryPattern;

import CreationalPattern.SingletonPattern.DoubleCheckedSyncLogger;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class ClamPizza implements Pizza {
    DoubleCheckedSyncLogger logger = DoubleCheckedSyncLogger.getInstance();
    @Override
    public void prepare() {
        logger.log("Preparing ClamPizza");
    }

    @Override
    public void bake() {
        logger.log("Baking ClamPizza");
    }

    @Override
    public void cut() {
        logger.log("Cutting ClamPizza");
    }

    @Override
    public void box() {
        logger.log("Boxing ClamPizza");
    }
}
