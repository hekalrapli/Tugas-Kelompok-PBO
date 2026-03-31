public class SavingsAccount extends Account {
    /* Atribut */
    private double interestRate;

    /* Method */
    public SavingsAccount() {
        super();
        interestRate = 0.05;
    }

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    @Override
    public double calculateInterest() {
        return super.getBalance() * this.interestRate; 
    }
}