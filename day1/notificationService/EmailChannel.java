public class EmailChannel implements NotificationChannel {
    @Override
    public void sendNotification(String recipient, String message) {
        // Implementation for sending email
        System.out.println("Sending email to " + recipient + ": " + message);
    }
    
}
