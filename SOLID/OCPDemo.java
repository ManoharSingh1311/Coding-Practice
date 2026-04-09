interface Payment {
   void pay(int amount);
}

class UPIPayment implements Payment{
   public void pay(int amount){
      System.out.println("Paid " + amount + " using UPI");
   }
}

class CardPayment implements Payment{
   public void pay(int amount){
      System.out.println("Paid " + amount + " using Card");
   }
}

class CashPayment implements Payment{
   public void pay(int amount){
      System.out.println("Paid " + amount + " using Cash");
   }
}
public class OCPDemo {

   public static void main(String[] args) {

      Payment p;

      p = new UPIPayment();
      p.pay(500);

      p = new CardPayment();
      p.pay(1000);

      p = new CashPayment();
      p.pay(200);
   }
}


class CryptoPayment implements Payment{
   public void pay(int amount){
      System.out.println("Paid using Crypto");
   }
}