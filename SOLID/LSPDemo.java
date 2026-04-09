class Bird{
   void move(){
      System.out.println("Bird moves");
   }
}

class FlyingBird extends Bird{
   void move(){
      System.out.println("Bird flies");
   }
}

class Penguin extends Bird{
   void move(){
      System.out.println("Penguin swims");
   }
}
public class LSPDemo{
   public static void main(String[] args) {

      Bird b1 = new FlyingBird();
      b1.move();

      Bird b2 = new Penguin();
      b2.move();
   }
}