public class Notification {
    private String notificationId;
    private String message;
    private String notificationType;

    public Notification(String notificationId, String message, String notificationType) {
        this.notificationId = notificationId;
        this.message = message;
        this.notificationType = notificationType;
    }

    public void sendNotification() {
        System.out.println("Notification: " + message);
    }
}
