package CreationalPattern.AbstractFactoryPattern.Product.Ingredient;

import CreationalPattern.SingletonPattern.DoubleCheckedSyncLogger;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class ChicagoSauce implements Sauce{

    private final DoubleCheckedSyncLogger logger = DoubleCheckedSyncLogger.getInstance();
    @Override
    public void prepareSauce() {
        logger.log("preparing Chicago style sauce");
    }

}
