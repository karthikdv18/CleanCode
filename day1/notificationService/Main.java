import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NotificationChannel emailChannel = new EmailChannel();
        NotificationChannel smsChannel = new SMSChannel();
        NotificationChannel pushChannel = new PushNotificationChannel();

        NotificationService notificationService = new NotificationService(
                Arrays.asList(emailChannel, smsChannel, pushChannel)
        );

        String recipient = "user@example.com";
        String message = "This is an important update!";
        
        notificationService.sendNotifications(recipient, message);
    }
}
