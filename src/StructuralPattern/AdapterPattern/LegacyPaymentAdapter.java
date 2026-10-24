package StructuralPattern.AdapterPattern;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        BigDecimal amountPaise = amount
                .movePointRight(2)
                .setScale(0, RoundingMode.UNNECESSARY);

        String amountString = amountPaise.toPlainString();
        this.legacyPaymentSystem.makePayment(amountString);
    }
}
