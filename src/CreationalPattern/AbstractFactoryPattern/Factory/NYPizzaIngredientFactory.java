package CreationalPattern.AbstractFactoryPattern.Factory;

import CreationalPattern.AbstractFactoryPattern.Product.Ingredient.Dough;
import CreationalPattern.AbstractFactoryPattern.Product.Ingredient.NYDough;
import CreationalPattern.AbstractFactoryPattern.Product.Ingredient.NYSauce;
import CreationalPattern.AbstractFactoryPattern.Product.Ingredient.Sauce;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }
}
