package CreationalPattern.SimpleFactoryPattern;

/**
 * @author Avnish
 * @date 20-10-2026
 */
public class Main {

    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        Pizza pizza = pizzaFactory.orderPizza(PizzaType.CHEESE);
        System.out.println("Pizza is ready!");
    }

}
