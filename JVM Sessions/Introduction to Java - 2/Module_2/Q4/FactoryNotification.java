package Module_2.Q4;

public class FactoryNotification {
    public Notification createNotification(String type) {
        if(type == null || type.isEmpty())
        {
            return null;
        }
        if(type.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        } else if(type.equalsIgnoreCase("Email")){
            return new EmailNotification();
        }
        return null;
    }
}
