package CreationalPattern.AbstractFactoryPattern.Product.Ingredient;
import CreationalPattern.SingletonPattern.*;
/**
 * @author Avnish
 * @date 20-10-2026
 */
public class NYDough implements Dough {
    private final DoubleCheckedSyncLogger logger = DoubleCheckedSyncLogger.getInstance();
    @Override
    public void prepareDough(){
        logger.log("preparing NY style dough");
    }
}
