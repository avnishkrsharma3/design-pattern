package CreationalPattern.SimpleFactoryPattern;

import CreationalPattern.SingletonPattern.DoubleCheckedSyncLogger;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class CheesePizza implements Pizza {
    DoubleCheckedSyncLogger logger = DoubleCheckedSyncLogger.getInstance();
    @Override
    public void prepare() {
        logger.log("prepare cheesePizza");
    }

    @Override
    public void bake() {
        logger.log("bake cheesePizza");
    }

    @Override
    public void cut() {
        logger.log("cut cheesePizza");
    }

    @Override
    public void box() {
        logger.log("box cheesePizza");
    }
}
