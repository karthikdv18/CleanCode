public class PushNotificationChannel implements NotificationChannel {

    @Override
    public void sendNotification(String recipient, String message) {
        // Push notification-specific logic (e.g., short text with actions or links)
        System.out.println("Sending push notification to " + recipient + ": " + message);
    }
}
