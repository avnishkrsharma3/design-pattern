package CreationalPattern.AbstractFactoryPattern.Factory;

import CreationalPattern.AbstractFactoryPattern.Product.Ingredient.ChicagoDough;
import CreationalPattern.AbstractFactoryPattern.Product.Ingredient.ChicagoSauce;
import CreationalPattern.AbstractFactoryPattern.Product.Ingredient.Dough;
import CreationalPattern.AbstractFactoryPattern.Product.Ingredient.Sauce;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ChicagoDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }
}
