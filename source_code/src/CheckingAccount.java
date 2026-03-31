/*Nama Anggota Kelompok : 
1.Haikal Rafli Sembiring (24060124130079)
2.Muhammad Zaidan Alfarizi(24060124130102)
3.Mohammad Sulthon Ariefin(24060124130104)
4.Rio Setiawan Hastanu Putra (24060124130068)

*/
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
    public boolean processPayment(double amount, String billerId) {
        try {
            this.withdraw(amount);
            System.out.println("Pembayaran sebesar " + String.format("Rp%,.2f", amount) + " ke " + billerId + " berhasil.");
            return true;
        } catch (Exception e) {
            System.out.println("Pembayaran gagal: Saldo dan Overdraft tidak cukup.");
            return false;
        }
    }

    @Override
    public double calculateInterest() {
        return 0;
    };

}
