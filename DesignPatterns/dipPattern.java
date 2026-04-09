interface Notification{
   void sendNotifications(String msg, String recipient);
}
class EmailNotifications implements Notification{
   public void sendNotifications(String msg, String recipient){
      System.out.println("Sending email to: "+recipient+",  Message: "+ msg);
   }
}
class SMSNotifications implements Notification{
   public void sendNotifications(String msg, String recipient){
      System.out.println("Sending SMS to: "+recipient+",  Message: "+ msg);
   }
}

class NotificationService{
   private Notification notifications;
   //Dependency Injection
    public NotificationService(Notification notifications) {
      this.notifications = notifications;
   }
   public void sendNotifications(String msg, String recipient){
      notifications.sendNotifications(msg, recipient);
   }
   
}
public class dipPattern {
   public static void main(String args[]){
      Notification emailnotification = new EmailNotifications();
      NotificationService emailservice = new NotificationService(emailnotification);
      emailservice.sendNotifications("Hello via email", "Manohar Singh");

      Notification smsnotification = new SMSNotifications();
      NotificationService smsservice = new NotificationService(smsnotification);
      smsservice.sendNotifications("Hello via sms", "Neeraj Singh");
       
   }
}
