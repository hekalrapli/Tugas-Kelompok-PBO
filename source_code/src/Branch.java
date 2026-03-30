import java.util.ArrayList;

public class Branch {
    /* Atribut */
    private String branchCode;
    private String branchName;
    private String address;
    ArrayList<Customer> listCustomer;

    /* Konstruktor */
    public Branch(){
        this.branchCode = "";
        this.branchName = "";
        this.address = "";
        this.listCustomer = new ArrayList<>();
    }

    /* Selektor */
    public String getBranchCode(){
        return this.branchCode;
    }

    public String getBranchName(){
        return this.branchName;
    }

    public String getAddress(){
        return this.address;
    }

    /* Mutator */
    public void setBranchCode(String branchCode){
        this.branchCode = branchCode;
    }

    public void setBranchName(String branchName){
        this.branchName = branchName;
    }

    public void setAddress(String address){
        this.address = address;
    }

    /* Fungsi */
    public void addCustomer(Customer c){
        this.listCustomer.add(c);
    }
}
