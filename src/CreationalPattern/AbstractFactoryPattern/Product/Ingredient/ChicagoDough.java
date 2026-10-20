package CreationalPattern.AbstractFactoryPattern.Product.Ingredient;

import CreationalPattern.SingletonPattern.DoubleCheckedSyncLogger;
/**
 * @author Avnish
 * @date 20-10-2026
 */
public class ChicagoDough implements Dough {

    private final DoubleCheckedSyncLogger logger = DoubleCheckedSyncLogger.getInstance();
    @Override
    public void prepareDough(){
        logger.log("preparing Chicago style dough");
    }
}
