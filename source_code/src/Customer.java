public class Customer {

  private String customerId;
  private String name;
  private String email;
  private String phone;
  private java.util.List<Loan> loan;

  /* Konstruktor */
  public Customer(String customerId, String email, String phone) {
    this.customerId = customerId;
    this.email = email;
    this.phone = phone;
    this.loan = new java.util.ArrayList<>();
  }

  /* Selektor */
  public String getCustomerId() {
    return customerId;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPhone() {
    return phone;
  }

  public java.util.List<Loan> getLoan() {
    return loan;
  }

  /* Mutator */
  public void setName(String name) {
    this.name = name;
  }

  /* Method Tambahan */
  public void updateContact(String newEmail) {
    this.email = newEmail;
  }

  //Overloading
  public void updateContact(String newEmail, String newPhone) {
    this.email = newEmail;
    this.phone = newPhone;
  }

  public void addLoan(Loan l) {
    loan.add(l);
  }

  public double totalLoan() {
    double totAmount = 0;
    for(Loan l : loan) {
      totAmount += l.getAmount();
    }
    return totAmount;
  }
}
