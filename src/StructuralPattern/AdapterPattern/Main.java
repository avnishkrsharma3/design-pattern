package StructuralPattern.AdapterPattern;

import java.math.BigDecimal;

/**
 * @author Avnish
 * @date 24-10-2026
 */
public class Main {
    public static void main(String[] args) {
        LegacyPaymentSystem legacyPaymentSystem = new LegacyPaymentSystem();
        LegacyPaymentAdapter legacyPaymentAdapter = new LegacyPaymentAdapter(legacyPaymentSystem);
        BigDecimal amount = new BigDecimal(100);
        legacyPaymentAdapter.pay(amount);
    }
}
