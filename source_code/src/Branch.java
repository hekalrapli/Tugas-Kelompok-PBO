/*Nama Anggota Kelompok : 
1.Haikal Rafli Sembiring (24060124130079)
2.Muhammad Zaidan Alfarizi(24060124130102)
3.Mohammad Sulthon Ariefin(24060124130104)
4.Rio Setiawan Hastanu Putra (24060124130068)

*/
import java.util.ArrayList;

public class Branch {
        /* Atribut */
        private String branchCode;
        private String branchName;
        private String address;
        ArrayList<Customer> listCustomer;
    
        /* Konstruktor */
        public Branch(String branchCode){
            this.branchCode = branchCode;
            this.branchName = "";
            this.address = "";
            this.listCustomer = new ArrayList<>();
        }

        public Branch(String branchCode, String branchName, String address, Customer c){
            this.branchCode = branchCode;
            this.branchName = branchName;
            this.address = address;
            this.listCustomer = new ArrayList<>();
            this.listCustomer.add(c);
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

        public void printAllCustomers() {
    System.out.println("Daftar Customer di Cabang " + this.branchName + ":");
    for (Customer c : listCustomer) {
        // Asumsi kelas Customer punya method getNama() atau similar
        System.out.println("- " + c.getName()); 
    }
}
}
