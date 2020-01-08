package musteri_yonetimi.main;

public class Musteri {

	private String name;
	private String firstName;
	private String address;
	private String notificationType;
	
	
	@Override
	public String toString() {
		return "Musteri [name=" + name + ", firstName=" + firstName + ", address=" + address + ", notificationType="
				+ notificationType + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNotificationType() {
		return notificationType;
	}
	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}
	
	
}
