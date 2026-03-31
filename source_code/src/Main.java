/*Nama Anggota Kelompok : 
1.Haikal Rafli Sembiring (24060124130079)
2.Muhammad Zaidan Alfarizi(24060124130102)
3.Mohammad Sulthon Ariefin(24060124130104)
4.Rio Setiawan Hastanu Putra (24060124130068)

*/
import java.util.Date;

public class Main {

     public static void main(String[] args) {

          /* ========CUSTOMER=========  */
        Customer customer1 = new Customer("C001", "antonpanjaitan@gmail.com", "086745678453");
        customer1.setName("Anton Binsar Panjaitan");
        Customer customer2 = new Customer("C002", "sherina@students.ub.ac.id", "086745678453");
        customer2.setName("Sherina Izzati");

        System.out.println("=======CUSTOMER======");
        System.out.println("Nama Customer : " + customer1.getName());
        System.out.println("Nomor Telepon  : " + customer1.getPhone());
        System.out.println("Email  : " + customer1.getEmail());

        System.out.println();
        System.out.println("Nama Customer : " + customer2.getName());
        System.out.println("Nomor Telepon  : " + customer2.getPhone());
        System.out.println("Email  : " + customer2.getEmail());
        
        
        System.out.println();
        System.out.println("=======ACCOUNT========");
              System.out.println();
        SavingsAccount tabungan1 = new SavingsAccount("SA-001", 5000000,0.5);
        CheckingAccount giro1 = new CheckingAccount("CA-001",2000000,1000000);
        System.out.println("=======SAVINGACCOUNT========");
        System.out.println("Nomor Rekening : " + tabungan1.getAccountNumber());
        System.out.println("Saldo : " + String.format("Rp%,.2f", tabungan1.getBalance()));
          System.out.println();

     try {
          tabungan1.deposit(2000000);
          System.out.println("Deposit Berhasil");
         
        }catch(Exception e) {
          System.out.println(e.getMessage());
        }
        for (Transaction t : tabungan1.getTransactions()) {
    t.printReceipt();
     System.out.println("Total Saldo : " + String.format("Rp%,.2f", tabungan1.getBalance()));
}
System.out.println();



        System.out.println("==========GIROACCOUNT==========");
        System.out.println("Nomor Rekening : " + giro1.getAccountNumber());
        System.out.println("Saldo : " + String.format("Rp%,.2f", giro1.getBalance()));
        System.out.println("Overdraft Limit : " + String.format("Rp%,.2f", giro1.getOverdraftLimit()));
        
            System.out.println();
        

        try {
          giro1.withdraw(1500000);
          System.out.println("Withdraw berhasil");
          
        }catch(Exception e) {
          System.out.println(e.getMessage());
        }

               for (Transaction t : giro1.getTransactions()) {
    t.printReceipt();
    System.out.println("Saldo : " + String.format("Rp%,.2f", giro1.getBalance()));
    
}
System.out.println();




         System.out.println("=============INTERFACE=============");
        giro1.processPayment(250000, "UNDIP-1957");
         System.out.println("Saldo : " + String.format("Rp%,.2f", giro1.getBalance()));
         System.out.println();


            System.out.println("=============CARD=============");
        Card kartu1  = new Card("4111-1111-1111-1111", "130624",tabungan1);


        System.out.println("Nomor kartu : " + kartu1.getCardNumber());
        System.out.println("Akun terhubung : " + kartu1.getLinkedAccount().getAccountNumber());
        boolean checkPin = kartu1.verifyPin("130624");
        System.out.println("Verifikasi PIN: " + (checkPin ? "Benar" : "Salah"));
        kartu1.changePin("654321");
      

       System.out.println();
          System.out.println("=============LOAN=============");
        java.util.Date startDate = new Date();
        Loan pinjaman1 = new Loan("L001", 10000000, customer1, 12, startDate, 5);
        customer1.addLoan(pinjaman1);
        System.out.printf("%-29s : %s\n", "Pinjaman ID", pinjaman1.getLoanId());
System.out.printf("%-29s : Rp%,.2f\n", "Jumlah pinjaman", pinjaman1.getAmount());
System.out.printf("%-29s : Rp%,.2f\n", "Cicilan/bulan", pinjaman1.calculateMonthlyPayment());
System.out.printf("%-29s : %s\n", "Status", pinjaman1.getStatus());
System.out.printf("%-29s : %b\n", "Terlambat", pinjaman1.isOverdue());
System.out.printf("%-29s : Rp%,.2f\n", "Total pinjaman Customer " + customer1.getCustomerId(), customer1.totalLoan());

pinjaman1.makePayment(9500000); 

System.out.println(); 
System.out.printf("%-20s : %s\n", "Status setelah bayar", pinjaman1.getStatus());
System.out.printf("%-20s : Rp%,.2f\n", "Total sisa cicilan", pinjaman1.getAmount());


        System.out.println("\n========= CABANG ===========");
        Branch cabang1 = new Branch("BUB-01", "Bank Brawijaya Kota Malang", "Jl. Veteran No.1 Kota Malang", customer1);
        cabang1.addCustomer(customer2);
        System.out.println("Kode cabang : " + cabang1.getBranchCode());
        System.out.println("Nama cabang : " + cabang1.getBranchName());
        System.out.println("Alamat      : " + cabang1.getAddress());
        cabang1.printAllCustomers();

     }
}