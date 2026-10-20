package CreationalPattern.AbstractFactoryPattern;

import CreationalPattern.AbstractFactoryPattern.Factory.ChicagoPizzaIngredientFactory;
import CreationalPattern.AbstractFactoryPattern.Factory.NYPizzaIngredientFactory;
import CreationalPattern.AbstractFactoryPattern.Factory.PizzaIngredientFactory;
import CreationalPattern.AbstractFactoryPattern.Product.ChicagoStyleCheesePizza;
import CreationalPattern.AbstractFactoryPattern.Product.NYStyleCheesePizza;
import CreationalPattern.AbstractFactoryPattern.Product.Pizza;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class Main {
    public static void main(String[] args) {
        PizzaIngredientFactory nyFactory = new NYPizzaIngredientFactory();
        PizzaIngredientFactory chicagoFactory = new ChicagoPizzaIngredientFactory();
        Pizza nyPizza = new NYStyleCheesePizza(nyFactory);
        Pizza chicagoPizza = new ChicagoStyleCheesePizza(chicagoFactory);

        System.out.println("=== NY Pizza ===");
        nyPizza.prepare(); nyPizza.bake(); nyPizza.cut(); nyPizza.box();

        System.out.println("=== Chicago Pizza ===");
        chicagoPizza.prepare(); chicagoPizza.bake(); chicagoPizza.cut(); chicagoPizza.box();


    }

}
