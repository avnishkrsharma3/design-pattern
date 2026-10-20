package CreationalPattern.AbstractFactoryPattern.Factory;

import CreationalPattern.AbstractFactoryPattern.Product.Ingredient.Dough;
import CreationalPattern.AbstractFactoryPattern.Product.Ingredient.Sauce;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
}
