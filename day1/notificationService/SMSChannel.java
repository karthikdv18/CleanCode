public class SMSChannel implements NotificationChannel {
    @Override
    public void sendNotification(String recipient, String message) {
        // Implementation for sending SMS
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
    
}
