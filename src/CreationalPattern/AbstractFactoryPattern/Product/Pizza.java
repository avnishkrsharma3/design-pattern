package CreationalPattern.AbstractFactoryPattern.Product;
import CreationalPattern.AbstractFactoryPattern.Factory.PizzaIngredientFactory;
import CreationalPattern.SingletonPattern.*;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public abstract class Pizza {
    private final DoubleCheckedSyncLogger logger = DoubleCheckedSyncLogger.getInstance();
    protected final PizzaIngredientFactory ingredientFactory;

    private  final String name;

    public Pizza(String name, PizzaIngredientFactory ingredientFactory) {
        this.name = name;
        this.ingredientFactory = ingredientFactory;
    }
    public String getName(){
        return name;
    }
    public void prepare(){
        ingredientFactory.createDough().prepareDough();
        ingredientFactory.createSauce().prepareSauce();
    }
    public void bake() {
        logger.log("bake " + name);
    }

    public void cut() {
        logger.log("cut " + name);
    }

    public void box() {
        logger.log("box " + name);
    }

    @Override
    public String toString() {
        return name;
    }
}
