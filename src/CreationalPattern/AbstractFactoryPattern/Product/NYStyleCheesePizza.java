package CreationalPattern.AbstractFactoryPattern.Product;

import CreationalPattern.AbstractFactoryPattern.Factory.PizzaIngredientFactory;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        super("NY Style Cheese Pizza", ingredientFactory);
    }

}
