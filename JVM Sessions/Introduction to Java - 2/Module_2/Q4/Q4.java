package Module_2.Q4;



public class Q4 {
    public static void Factory(){
       FactoryNotification factory = new FactoryNotification();
       Notification not1 = factory.createNotification("Email");
       not1.notifyuser();
       Notification not2 = factory.createNotification("SMS");
       not2.notifyuser();
    }
}
