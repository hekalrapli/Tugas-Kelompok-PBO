/*Nama Anggota Kelompok : 
1.Haikal Rafli Sembiring (24060124130079)
2.Muhammad Zaidan Alfarizi(24060124130102)
3.Mohammad Sulthon Ariefin(24060124130104)
4.Rio Setiawan Hastanu Putra (24060124130068)

*/
public class Card {
    
      /* Atribut */

   private String cardNumber;
   private String pin;
   private Account linkedAccount;
    
   /*Method */

   /*Konstruktor */
    public Card(){

        
    }
public Card(String cardNumber, String pin, Account account) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.linkedAccount = account;

    }

    /*Selektor */
   public String getCardNumber() {
        return this.cardNumber;
    }
    public String getPin() {
        return this.pin;
    }

    public Account getLinkedAccount() {
        return this.linkedAccount;
    }

  


    public boolean verifyPin(String inputPin) {
        return this.pin == inputPin;
    }
    
    public void changePin(String newPin) {
        if (newPin != null && newPin.length() == 6 && newPin.matches("\\d+")) {
            this.pin = newPin;
            System.out.println("PIN berhasil diubah.");
        } else {
            System.out.println("Gagal: PIN harus terdiri dari 6 digit angka.");
        }
    }
    
}
