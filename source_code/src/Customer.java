public class Customer {
  private String customerId;
  private String name;
  private String email;
  private String phone;

  /* Konstruktor */
  public Customer() {}

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

  public void updateContact(String newEmail, String newPhone) {
    this.email = newEmail;
    this.phone = newPhone;
  }
}
