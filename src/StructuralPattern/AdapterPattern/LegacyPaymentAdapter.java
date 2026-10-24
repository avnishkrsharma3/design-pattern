package StructuralPattern.AdapterPattern;

import java.math.BigDecimal;

/**
 * @author Avnish
 * @date 24-10-2026
 */
public class LegacyPaymentAdapter implements PaymentProcessor {

    private final LegacyPaymentSystem legacyPaymentSystem;


    public LegacyPaymentAdapter(LegacyPaymentSystem legacyPaymentSystem) {
       // store the dependency
        this.legacyPaymentSystem = legacyPaymentSystem;
    }

    @Override
    public void pay(BigDecimal amount) {
        // Hint 1: Convert rupees to paise.
        // Hint 2: Convert the result to a String.
        // Hint 3: Call the legacy system's method.
        amount = amount.multiply(new BigDecimal(100));
        String amountString = amount.toPlainString();
        this.legacyPaymentSystem.makePayment(amountString);
    }
}
