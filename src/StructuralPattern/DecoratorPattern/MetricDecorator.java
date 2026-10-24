package StructuralPattern.DecoratorPattern;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;

/**
 * @author Avnish
 * @date 24-10-2026
 */
public class MetricDecorator extends PaymentProcessorDecorator {

    public MetricDecorator(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    public void pay(BigDecimal amount) throws InterruptedException {
        Instant start = Instant.now();
        System.out.println("I will calculate time duration");
        Thread.sleep(1002);
        wrappedPaymentProcessor.pay(amount);
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Time Duration taken to complete the transaction is " + duration);

    }
}
