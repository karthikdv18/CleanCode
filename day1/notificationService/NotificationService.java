import java.util.List;

public class NotificationService {
    private List<NotificationChannel> notificationChannels;

    public NotificationService(List<NotificationChannel> notificationChannels) {
        this.notificationChannels = notificationChannels;
    }

    public void sendNotifications(String recipient, String message) {
        for (NotificationChannel channel : notificationChannels) {
            channel.sendNotification(recipient, message);
        }
    }
}
