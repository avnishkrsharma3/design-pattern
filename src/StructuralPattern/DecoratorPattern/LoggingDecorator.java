package StructuralPattern.DecoratorPattern;

import java.math.BigDecimal;

/**
 * @author Avnish
 * @date 24-10-2026
 */
public class LoggingDecorator extends PaymentProcessorDecorator {

    public LoggingDecorator(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    public void pay(BigDecimal amount) throws InterruptedException {
        System.out.println("Payment processing started for " + "amount .");
        wrappedPaymentProcessor.pay(amount);
        System.out.println("Payment processing finished for " + "amount .");
    }
}
