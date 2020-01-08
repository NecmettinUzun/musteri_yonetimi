package musteri_yonetimi.main;

public class NotificationServiceManager {

	private INotificationService notificationType;
	
	public NotificationServiceManager(INotificationService notificationType) {
		this.notificationType = notificationType;
	}
	
	public void sentNotification(Musteri musteri) {
		this.notificationType.sentNotification(musteri);
	}
}
