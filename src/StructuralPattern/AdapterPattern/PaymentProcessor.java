package StructuralPattern.AdapterPattern;

import java.math.BigDecimal;

/**
 * @author Avnish
 * @date 24-10-2026
 */
public interface PaymentProcessor {
    void pay(BigDecimal amount);
}
