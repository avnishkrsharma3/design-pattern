package StructuralPattern.DecoratorPattern;

import java.math.BigDecimal;

/**
 * @author Avnish
 * @date 24-10-2026
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        PaymentProcessor processor =
                new LoggingDecorator(
                        new MetricDecorator(
                                new BasicPaymentProcessor()
                        )
                );

        processor.pay(new BigDecimal("100.50"));
    }
}
