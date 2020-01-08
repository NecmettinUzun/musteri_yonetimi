package musteri_yonetimi.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DbServiceManager;
import db.MySQLService;

public class MySQLDAOService implements IDAOService{

	@Override
	public void create(Musteri musteri) {
		
		System.out.println(musteri.toString());
		
		MySQLService mySQLService = new MySQLService();
		DbServiceManager dbService = new DbServiceManager(mySQLService);
		
		Connection con = null;
		PreparedStatement prstm = null;
		try {
			con = dbService.getDbConnection();
			prstm = con.prepareStatement("INSERT INTO customer (name,surname,address,notification_type) VALUES(?,?,?,?)");
			
			prstm.setString(1, musteri.getName());
			prstm.setString(2, musteri.getFirstName());
			prstm.setString(3, musteri.getAddress());
			prstm.setString(4, musteri.getNotificationType());
			
			prstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbService.closeConnection(con);
		}
		
	}

	@Override
	public void delete(Musteri musteri) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Musteri musteri) {
		// TODO Auto-generated method stub
		
	}

}
