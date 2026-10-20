package CreationalPattern.AbstractFactoryPattern.Product.Ingredient;
import CreationalPattern.SingletonPattern.*;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class NYSauce implements Sauce {
    private final DoubleCheckedSyncLogger logger = DoubleCheckedSyncLogger.getInstance();
    @Override
    public void prepareSauce() {
        logger.log("preparing NY style Sauce");
    }
}
