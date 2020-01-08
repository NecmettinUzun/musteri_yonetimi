package musteri_yonetimi.main;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		
		int selected = 0;
		System.out.println("1:login 2:new customer");
		Scanner s = new Scanner(System.in);
		selected = s.nextInt();
		s.close();
		
		
		switch (selected) {
		case 1:
			login();
			break;
		case 2:
			createCustomer();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + selected);
		}
	}

	private static  void login() {
		
		ISessionManagement sessionManagement = new SessionManagementImpl();
		Musteri musteri = new Musteri();
		musteri.setName("Murat");
		musteri.setFirstName("uzun");
		SessionManagementService sessionManagementService = new SessionManagementService(sessionManagement);
		sessionManagementService.login(musteri);
	}
	
	private static void createCustomer() {
		
		Musteri musteri = new Musteri();
		musteri.setName("Ali");
		musteri.setFirstName("uzun");
		musteri.setAddress("Ýstanbul");
		musteri.setNotificationType("SMS");
		
		IDAOService dbDaoService = new MySQLDAOService();
		DaoManagementService daoService = new DaoManagementService(dbDaoService);
		daoService.createUser(musteri);
	}
}
