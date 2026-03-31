public class CheckingAccount extends Account implements IPaymentProcessor {
    /* Atribut */
    private double overdraftLimit;

    /* Method */
    public CheckingAccount(){
        super();
        overdraftLimit = 500000;
    }

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount > overdraftLimit + getBalance()) {
            throw new Exception("Penarikan gagal: Saldo dan Overdraft tidak cukup.");
        }
        super.withdraw(amount);
    }
    
    @Override
    public double calculateInterest() {
        return 0;
    };

    @Override
    public boolean processPayment(double amount, String billerId) {
        try {
            this.withdraw(amount);
            System.out.println("Pembayaran sebesar " + amount + " ke " + billerId + " berhasil.");
            return true;
        } catch (Exception e) {
            System.out.println("Pembayaran gagal: Saldo dan Overdraft tidak cukup.");
            return false;
        }
    }

}
