package musteri_yonetimi.main;

public class SessionManagementService {

	
	private ISessionManagement sessionManagement;
	
	public SessionManagementService(ISessionManagement sessionManagement) {
		this.sessionManagement = sessionManagement;
	}
	
	public void login(Musteri musteri) {
		this.sessionManagement.login(musteri);
	}
	
	public void logout(Musteri musteri) {
		this.sessionManagement.logout(musteri);
	}
}
