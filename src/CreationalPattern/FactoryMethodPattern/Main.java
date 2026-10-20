package CreationalPattern.FactoryMethodPattern;

import CreationalPattern.FactoryMethodPattern.Product.Pizza;
import CreationalPattern.FactoryMethodPattern.Product.PizzaType;
import CreationalPattern.FactoryMethodPattern.Store.ChicagoPizzaStore;
import CreationalPattern.FactoryMethodPattern.Store.NYPizzaStore;
import CreationalPattern.FactoryMethodPattern.Store.PizzaStore;

/**
 * <b>Client</b> of the Factory Method pattern.
 * <p>
 * The client works with the abstract {@link PizzaStore} and the {@link Pizza}
 * interface only. It never mentions {@code NYStyleCheesePizza} or any other
 * concrete product, which is exactly why a new store can be plugged in later
 * without changing a single line of this class.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public class Main {

    public static void main(String[] args) {

        // The client only knows the abstract Creator.
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("=== Ordering from the NY store ===");
        Pizza nyCheesePizza = nyStore.orderPizza(PizzaType.CHEESE);
        Pizza nyVeggiePizza = nyStore.orderPizza(PizzaType.VEGGIE);

        System.out.println();
        System.out.println("=== Ordering from the Chicago store ===");
        Pizza chicagoCheesePizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        Pizza chicagoClamPizza = chicagoStore.orderPizza(PizzaType.CLAM);

        System.out.println();
        System.out.println("=== Same request, different product ===");
        System.out.println("NY      cheese pizza -> " + nyCheesePizza.getClass().getSimpleName());
        System.out.println("Chicago cheese pizza -> " + chicagoCheesePizza.getClass().getSimpleName());

        System.out.println();
        System.out.println("=== A store only serves what is on its menu ===");
        try {
            nyStore.orderPizza(PizzaType.CLAM);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}
