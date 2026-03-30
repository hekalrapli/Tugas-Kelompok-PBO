public class Customer {
    /* Atribut */
    private String customerID;
    private String name;
    private String email;
    private String phone;

    /* Konstruktor */
    
    public Customer (){
        this.customerID = "";
        this.name = "";
        this.email = "";
        this.phone = "";
    }

    /* Method */

    /* Selektor */
    public String getCustomerID(){
        return this.customerID;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhone(){
        return this.phone;
    }

    /* Mutator */
    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void updateContact(String newEmail){
        this.email = newEmail;
    }

    public void updateContact(String newEmail, String newPhone){
        this.email = newEmail;
        this.phone = newPhone;
    }
}
