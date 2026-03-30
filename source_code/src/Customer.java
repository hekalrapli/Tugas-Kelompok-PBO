public class Customer {
  private String customerId;
  private String name;
  private String email;
  private String phone;
  private java.util.List<Loan> loan;

  /* Konstruktor */
  public Customer() {
    this.loan = new java.util.ArrayList<>();
  }

  public Customer(String customerId) {
    this.customerId  = customerId;
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

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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
}
