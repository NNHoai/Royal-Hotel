package springmvc.dao;

public interface LoginDao {
	boolean validateUser(String username, String password);
	
	int checkExistsUser(String username);
	
	public int getRole(String username);
}
