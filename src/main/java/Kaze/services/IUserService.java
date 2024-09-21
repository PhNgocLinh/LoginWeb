package Kaze.services;

import Kaze.models.UserModel;

public interface IUserService {
	UserModel login(String username, String password);
	
	UserModel FindByUserName (String username);
	
	void insert(UserModel user);
	
	void insertregister(UserModel user);
	
	void update (UserModel user);
	
	void udatestatus (UserModel user);
	
	void delete (int id);
	
	boolean register (String email, String password, String username, String fullname, String code);
	
	boolean checkExistEmail(String email);
	
	boolean checkExistUsername(String username);
	
	boolean checkExistPhone(String phone);

	boolean changePassword(String email, String newPassword);
	
	
		
}


