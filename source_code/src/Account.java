import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Account {
   /* Atribut */

   private String accountNumber;
   private double balance;
   private List<Transaction> transactions = new ArrayList<>();
    
   /*Method */

   /*Konstruktor */
    public Account(){    
    }
    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        
    }

    /*Selektor */
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }


 
    public void deposit(double amount) throws Exception {
        if(amount <=0) {
            throw new Exception("Nominal deposit harus lebih dari nol");
        }
        balance += amount;
    
        transactions.add(new Transaction("T" + Instant.now().getEpochSecond(), LocalDate.now(),amount,"Deposit"));
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Nominal penarikan harus lebih dari nol");
        }

        this.balance -= amount;
        transactions.add(new Transaction("T" + Instant.now().getEpochSecond(), LocalDate.now(),amount,"Withdraw"));
    }
    public abstract double calculateInterest();

    
}
