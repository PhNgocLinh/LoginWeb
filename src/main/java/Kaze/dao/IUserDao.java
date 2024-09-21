package Kaze.dao;

import java.util.List;

import Kaze.models.UserModel;

public interface IUserDao {
	List<UserModel> findAll();
	UserModel findById (int id);
	void insert(UserModel user);
	UserModel findbyUserName(String username);
	void insertregister(UserModel user);
	void update (UserModel user);
	void udatestatus (UserModel user);
	void delete (int id);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
	boolean changePassword(String email, String newEncodedPassword);


}
