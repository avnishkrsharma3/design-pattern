package CreationalPattern.SimpleFactoryPattern;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class SimplePizzaFactory {

    public Pizza createPizza(PizzaType type) {
        if (type == null) {
            throw new IllegalArgumentException("Pizza type cannot be null");
        }
        switch (type) {
            case CHEESE:
                return new CheesePizza();
            case PEPPERON:
                return new PeppperonPizza();
            case VEGGIE:
                return new VeggiePizza();
            case CLAM:
                return new ClamPizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
