import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {

     /* Atribut */

   private String transactionId;
   private LocalDate date;
   private double amount;
   private String type;
    
   /*Method */

   /*Konstruktor */
    public Transaction(){

        
    }
public Transaction(String id, LocalDate date, double amount, String type) {
        this.transactionId = id;
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    /*Selektor */
    public String getTransactionId() {
        return this.transactionId;
    }
    public LocalDate getDate() {
        return this.date;
    }
    public double getAmount() {
        return this.amount;
    }
    public String getType() {
        return this.type;
    }

    /*Mutator */
    public void setDate(LocalDate date) {
         this.date = date;
    }
    public void setType(String type) {
         this.type = type;
    }
    
    public void printReceipt() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("==================================");
        System.out.println("         STRUK TRANSAKSI          ");
        System.out.println("==================================");
        System.out.println("ID Transaksi : " + this.transactionId);
        System.out.println("Tanggal      : " + formattedDate);
        System.out.println("Tipe         : " + this.type);
        System.out.println("Nominal      : Rp" + String.format("%,.2f", this.amount));
        System.out.println("==================================");
        System.out.println("   Terima Kasih Telah Bertransaksi ");
        System.out.println("==================================\n");
    }
}
