package CreationalPattern.BuilderPattern;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * The <b>Product</b> of the Builder pattern.
 * <p>
 * If we created this object with a plain constructor, every added field would
 * mean another constructor overload, and a constructor with several String and
 * numeric arguments becomes hard to read correctly:
 *
 * <pre>{@code
 * // the "before" - 8 positional arguments, 3 of them null, order matters
 * new PaymentRequest("PAY-101", 2500.00, "INR", "Electricity bill", null, null, true, false);
 * }</pre>
 *
 * The Builder removes that problem:
 *
 * <pre>{@code
 * // the "after" - named, readable, order independent
 * new PaymentRequest.Builder("PAY-101", new BigDecimal("2500.00"))
 *         .currency("INR")
 *         .description("Electricity bill")
 *         .retryEnabled(true)
 *         .build();
 * }</pre>
 *
 * <b>Why this class is safe to share:</b> it is {@code final}, every field is
 * {@code final} and there are no setters, so once {@code build()} returns the
 * object can never change. The mutable state lives only in the {@link Builder},
 * which is short lived and thrown away.
 *
 * @author Avnish
 * @date 20-10-2026
 */
public final class PaymentRequest {

    /**
     * Currency used when the caller does not specify one.
     */
    public static final String DEFAULT_CURRENCY = "INR";

    private final String paymentId;
    private final BigDecimal amount;
    private final String currency;
    private final String description;
    private final String traceId;
    private final boolean retryEnabled;

    /**
     * The product constructor is <b>private</b>: the only way to obtain a
     * {@code PaymentRequest} is through a {@link Builder}, which guarantees the
     * object is always fully initialised and always valid.
     * <p>
     * The validation lives here on purpose. It runs exactly once, at
     * {@code build()} time, and it protects the invariant no matter how the
     * object was created.
     */
    private PaymentRequest(Builder builder) {

        this.paymentId = Objects.requireNonNull(builder.paymentId, "paymentId is required");
        this.amount = Objects.requireNonNull(builder.amount, "amount is required");

        if (paymentId.isBlank()) {
            throw new IllegalArgumentException("Payment ID is required");
        }
        if (amount.signum() < 0) {
            throw new IllegalArgumentException("Amount must be greater than or equal to zero");
        }

        this.currency = builder.currency;
        this.description = builder.description;
        this.traceId = builder.traceId;
        this.retryEnabled = builder.retryEnabled;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getDescription() {
        return description;
    }

    public String getTraceId() {
        return traceId;
    }

    public boolean isRetryEnabled() {
        return retryEnabled;
    }

    /**
     * Creates a new {@link Builder} pre-filled with the values of this request.
     * <p>
     * Handy to derive a slightly different request (a retry, a correction)
     * without repeating every field and without mutating this immutable
     * object.
     *
     * @return a builder seeded with this request's values.
     */
    public Builder toBuilder() {
        return new Builder(paymentId, amount)
                .currency(currency)
                .description(description)
                .traceId(traceId)
                .retryEnabled(retryEnabled);
    }

    @Override
    public String toString() {
        return "PaymentRequest{paymentId='" + paymentId
                + "', amount=" + amount
                + ", currency='" + currency
                + "', description='" + description
                + "', traceId='" + traceId
                + "', retryEnabled=" + retryEnabled + '}';
    }

    public void display() {
        System.out.println("Payment Id    : " + paymentId);
        System.out.println("Amount        : " + amount);
        System.out.println("Currency      : " + currency);
        System.out.println("Description   : " + description);
        System.out.println("Trace Id      : " + traceId);
        System.out.println("Retry Enabled : " + retryEnabled);
    }

    /**
     * The <b>Builder</b>.
     * <p>
     * It is a {@code static} nested class on purpose. A non static inner class
     * would keep a reference to the enclosing instance alive for no reason.
     * <p>
     * The fields are mutable - that is the whole point - while the product it
     * produces is not.
     */
    public static class Builder {

        private String paymentId;
        private BigDecimal amount;
        private String currency = DEFAULT_CURRENCY;
        private String description;
        private String traceId;
        private boolean retryEnabled;

        /**
         * Required fields go into the constructor, optional ones are set
         * through the fluent setters. This way the compiler itself tells the
         * caller what is mandatory.
         */
        public Builder(String paymentId, BigDecimal amount) {
            this.paymentId = paymentId;
            this.amount = amount;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public Builder retryEnabled(boolean retryEnabled) {
            this.retryEnabled = retryEnabled;
            return this;
        }

        /**
         * Validates the collected state and produces the immutable product.
         *
         * @return a fully built and valid {@link PaymentRequest}.
         * @throws NullPointerException     if a required field is missing.
         * @throws IllegalArgumentException if a required field is blank or the amount is negative.
         */
        public PaymentRequest build() {
            return new PaymentRequest(this);
        }
    }

}
