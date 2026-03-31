/*Nama Anggota Kelompok : 
1.Haikal Rafli Sembiring (24060124130079)
2.Muhammad Zaidan Alfarizi(24060124130102)
3.Mohammad Sulthon Ariefin(24060124130104)
4.Rio Setiawan Hastanu Putra (24060124130068)

*/

public class Loan {
  private String loanId;
  private double amount;
  private double interestRate;
  private int termMonths;
  private java.util.Date startDate;
  private String status;
  private Customer customer;

  /* Konstruktor */
  public Loan(String loanId, double amount, Customer customer, int termMonths, java.util.Date startDate, double interestRate) {
    this.loanId = loanId;
    this.amount = amount;
    this.customer = customer;
    this.termMonths = termMonths;
    this.startDate = startDate;
    this.interestRate = interestRate;
    this.status = "Aktif";
  }

  /* Selektor */
  public String getLoanId() {
    return loanId;
  }

  public double getAmount() {
    return amount;
  }

  public double getInterestRate() {
    return interestRate;
  }

  public int getTermMonths() {
    return termMonths;
  }

  public java.util.Date getStartDate() {
    return startDate;
  }

  public String getStatus() {
    return status;
  }

  public Customer getCustomer() {
    return customer;
  }

  /* Method Tambahan */
  public double calculateMonthlyPayment() {
    if(amount <= 0 || termMonths <= 0) {
      return 0.0f;
    }

    
    if(interestRate == 0){
      return amount / termMonths;
    }
    double cicilan = interestRate / 12 / 100;
    
    return (double) (amount * cicilan / (1-Math.pow(1 - cicilan, termMonths)));
  }

  public void makePayment(double paymentAmount) {
    if(paymentAmount > 0) {
      amount -= paymentAmount;
      
      if(amount <= 0) {
        amount = 0;
        status = "Lunas";
      }
      else{
        status = "Aktif";
      }

    }
  }

  public boolean isOverdue() {
    if(startDate == null){
      System.out.println("Start date belum diatur.");
      return false;
    }

    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(startDate);
    cal.add(java.util.Calendar.MONTH, termMonths);

    java.util.Date dueDate = cal.getTime();
    java.util.Date today = new java.util.Date();

    return today.after(dueDate) && status == "Aktif";
  }

}
