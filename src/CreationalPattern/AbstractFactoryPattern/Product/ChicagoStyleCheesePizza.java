package CreationalPattern.AbstractFactoryPattern.Product;

import CreationalPattern.AbstractFactoryPattern.Factory.PizzaIngredientFactory;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        super("Chicago Style Cheese Pizza", ingredientFactory);
    }
}
