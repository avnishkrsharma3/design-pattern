package StructuralPattern.AdapterPattern;

/**
 * @author Avnish
 * @date 24-10-2026
 */
// I cann't modify this legacy class
public class LegacyPaymentSystem {

    public void makePayment(String amountInPaise) {
        System.out.println("Making Payment of " +  amountInPaise + " paise.");
    }
    public LegacyPaymentSystem(){

    }
}
