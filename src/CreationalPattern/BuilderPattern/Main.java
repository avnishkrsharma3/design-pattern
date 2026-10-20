package CreationalPattern.BuilderPattern;

import java.math.BigDecimal;

/**
 * <b>Client</b> of the Builder pattern.
 * <p>
 * Every demo below shows one thing the Builder buys us over a plain
 * constructor.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public class Main {

    public static void main(String[] args) {

        // ---------------------------------------------------------------
        // 1. Optional fields: traceId is simply not set, nothing breaks.
        //    With a constructor you would have to pass null in its place.
        // ---------------------------------------------------------------
        System.out.println("=== 1. Optional fields ===");
        PaymentRequest upi = new PaymentRequest.Builder("PAY-101", new BigDecimal("2500.00"))
                .currency("INR")
                .description("Electricity bill")
                .retryEnabled(true)
                .build();
        upi.display();

        // ---------------------------------------------------------------
        // 2. The same "shape" of object, different values.
        //    The call sites are self documenting, no argument order to remember.
        // ---------------------------------------------------------------
        System.out.println();
        System.out.println("=== 2. Same shape, different values ===");
        PaymentRequest card = new PaymentRequest.Builder("PAY-102", new BigDecimal("99.99"))
                .currency("USD")
                .description("Card payment")
                .traceId("trace-abc-123")
                .retryEnabled(false)
                .build();
        card.display();

        // ---------------------------------------------------------------
        // 3. Validation happens at build() time, not while the object is
        //    half built. The request is either complete and valid, or it
        //    never exists.
        // ---------------------------------------------------------------
        System.out.println();
        System.out.println("=== 3. Validation at build() time ===");
        try {
            new PaymentRequest.Builder("PAY-103", new BigDecimal("-2500.00"))
                    .currency("INR")
                    .build();
            System.out.println("should never reach here");
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        try {
            new PaymentRequest.Builder("   ", new BigDecimal("10.00")).build();
            System.out.println("should never reach here");
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        // ---------------------------------------------------------------
        // 4. toBuilder() derives a modified copy of an existing request.
        //    The original object is immutable and stays untouched.
        // ---------------------------------------------------------------
        System.out.println();
        System.out.println("=== 4. toBuilder() creates a modified copy ===");
        PaymentRequest retry = upi.toBuilder()
                .description("Electricity bill - retry")
                .retryEnabled(false)
                .build();
        retry.display();
        System.out.println("Original is untouched: " + upi.getDescription());

        System.out.println();
        System.out.println("=== toString() ===");
        System.out.println(upi);
    }
}
