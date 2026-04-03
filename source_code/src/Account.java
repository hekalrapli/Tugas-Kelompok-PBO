/*Nama Anggota Kelompok : 
1.Haikal Rafli Sembiring (24060124130079)
2.Muhammad Zaidan Alfarizi(24060124130102)
3.Mohammad Sulthon Ariefin(24060124130104)
4.Rio Setiawan Hastanu Putra (24060124130068)

*/


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
    public Account(String accountNumber){
       this.accountNumber = accounNumber;
       this.balance = 0.0;
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
    public List<Transaction> getTransactions() {
    return this.transactions;
}


 
    public void deposit(double amount) throws Exception {
        if(amount <=0) {
            throw new Exception("Nominal deposit harus lebih dari nol");
        }
        balance += amount;
    
        transactions.add(new Transaction("T" + Instant.now().getEpochSecond(), LocalDate.now(),amount,"Deposit",this.accountNumber));
        
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Nominal penarikan harus lebih dari nol");
        }

        this.balance -= amount;
        transactions.add(new Transaction("T" + Instant.now().getEpochSecond(), LocalDate.now(),amount,"Withdraw",this.accountNumber));
    }

   
    public abstract double calculateInterest();

    
}
