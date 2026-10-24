package StructuralPattern.AdapterPattern;

import java.math.BigDecimal;

/**
 * @author Avnish
 * @date 24-10-2026
 */
public class Main {
    public static void main(String[] args) {
        LegacyPaymentSystem legacyPaymentSystem = new LegacyPaymentSystem();
        PaymentProcessor legacyPaymentAdapter = new LegacyPaymentAdapter(legacyPaymentSystem);
        PaymentProcessor modernPaymentProcessor = new ModernPaymentProcessor();
        BigDecimal amount = new BigDecimal(100);
        legacyPaymentAdapter.pay(amount);
        BigDecimal amount2= new BigDecimal(new String("100.124"));
        modernPaymentProcessor.pay(amount2);
    }
}
