package StructuralPattern.AdapterPattern;

import java.math.BigDecimal;

/**
 * @author Avnish
 * @date 24-10-2026
 */
public class ModernPaymentProcessor implements PaymentProcessor {


    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Processing modern payment of " +  amount + ".");
    }
}
