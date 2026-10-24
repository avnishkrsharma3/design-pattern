package StructuralPattern.DecoratorPattern;

/**
 * @author Avnish
 * @date 24-10-2026
 */
public abstract class PaymentProcessorDecorator implements PaymentProcessor {
    protected final PaymentProcessor wrappedPaymentProcessor;
    public PaymentProcessorDecorator(PaymentProcessor paymentProcessor) {
        this.wrappedPaymentProcessor = paymentProcessor;
    }
}
