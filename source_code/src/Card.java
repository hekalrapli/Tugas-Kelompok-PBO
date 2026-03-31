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
