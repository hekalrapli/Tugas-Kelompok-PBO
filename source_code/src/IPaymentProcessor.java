public interface IPaymentProcessor {
    /* Method */
    boolean processPayment(double amount, String billerId);
}
