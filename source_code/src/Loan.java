public class Loan {
  private String loanId;
  private float amount;
  private float interestRate;
  private int termMonths;
  private java.util.Date startDate;
  private String status;
  private Customer customer;

  /* Konstruktor */
  public Loan(String loanId, Customer customer) {
    this.loanId = loanId;
    this.customer = customer;
  }

  /* Selektor */
  public String getLoanId() {
    return loanId;
  }

  public float getAmount() {
    return amount;
  }

  public float getInterestRate() {
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

  /* Mutator */
  public void setAmount(float amount) {
    this.amount = amount;
  }

  public void setInterestRate(float interestRate) {
    this.interestRate = interestRate;
  }

  public void setTermMonths(int termMonths) {
    this.termMonths = termMonths;
  }

  public void setStartDate(java.util.Date startDate) {
    this.startDate = startDate;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  /* Method Tambahan */
  public float calculateMonthlyPayment() {
    if(amount <= 0 || termMonths <= 0) {
      return 0.0f;
    }

    float cicilan = interestRate / 12 / 100;

    if(interestRate == 0){
      return amount / termMonths;
    }
    
    return (float) (amount * cicilan / (1-Math.pow(1 - cicilan, -termMonths)));
  }

  public void makePayment(float paymentAmount) {
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
