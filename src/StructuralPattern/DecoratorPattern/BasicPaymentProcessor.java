package StructuralPattern.DecoratorPattern;

import java.math.BigDecimal;

/**
 * @author Avnish
 * @date 24-10-2026
 */
public class BasicPaymentProcessor implements PaymentProcessor {
    public void pay(BigDecimal amount) {
        System.out.println("Basic Payment Processor is making payment of " + amount);
    }
}
