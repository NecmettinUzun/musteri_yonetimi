package musteri_yonetimi.main;

public class DaoManagementService {

	private IDAOService daoInterface;
	
	public DaoManagementService(IDAOService daoInterface) {
		this.daoInterface = daoInterface;
	}
	
	
	public void createUser(Musteri musteri) {
		this.daoInterface.create(musteri);
	}
	
	public void updateUser(Musteri musteri) {
		this.daoInterface.update(musteri);
	}
	
	public void deleteUser(Musteri musteri) {
		this.daoInterface.delete(musteri);
	}
}
