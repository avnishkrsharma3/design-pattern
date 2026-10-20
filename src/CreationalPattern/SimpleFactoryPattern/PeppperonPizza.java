package CreationalPattern.SimpleFactoryPattern;

import CreationalPattern.SingletonPattern.DoubleCheckedSyncLogger;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class PeppperonPizza implements  Pizza{
    DoubleCheckedSyncLogger logger = DoubleCheckedSyncLogger.getInstance();
    @Override
    public void prepare() {
        logger.log("Preparing PeppperonPizza");
    }

    @Override
    public void bake() {
        logger.log("Baking PeppperonPizza");
    }

    @Override
    public void cut() {
        logger.log("Cutting PeppperonPizza");
    }

    @Override
    public void box() {
        logger.log("Boxing PeppperonPizza");
    }
}
