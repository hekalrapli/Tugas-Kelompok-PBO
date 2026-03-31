/*Nama Anggota Kelompok : 
1.Haikal Rafli Sembiring (24060124130079)
2.Muhammad Zaidan Alfarizi(24060124130102)
3.Mohammad Sulthon Ariefin(24060124130104)
4.Rio Setiawan Hastanu Putra (24060124130068)

*/

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

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount > getBalance()) {
            throw new Exception("Penarikan gagal: Saldo tidak cukup.");
        }
        super.withdraw(amount);
    }
}