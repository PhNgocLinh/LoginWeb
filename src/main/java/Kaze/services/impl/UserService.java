package Kaze.services.impl;

import Kaze.dao.IUserDao;
import Kaze.dao.impl.UserDaoImpl;
import Kaze.models.UserModel;
import Kaze.services.IUserService;

public class UserService implements IUserService{
	IUserDao userDao = new UserDaoImpl();
	

	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.FindByUserName(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;
		}
		return null;
	}

	@Override
	public UserModel FindByUserName(String username) {
		return userDao.findbyUserName(username);
	}

	@Override
	public void insert(UserModel user) {
		userDao.insert(user);
	}

	@Override
	public void insertregister(UserModel user) {
		userDao.insertregister(user);
		
	}

	@Override
	public void update(UserModel user) {
		UserModel oldUser = userDao.findById(user.getId());
		oldUser.setEmail(user.getEmail());
		oldUser.setFullname(user.getFullname());
		oldUser.setUsername(user.getUsername());
		oldUser.setPassword(user.getPassword());
		oldUser.setPhone(user.getPhone());
		oldUser.setRoleid(user.getRoleid());
		oldUser.setStatus(user.getStatus());
		oldUser.setImages(user.getImages());
		userDao.update(user);
	}

	@Override
	public void udatestatus(UserModel user) {
		userDao.udatestatus(user);
		
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public boolean register(String email, String password, String username, String fullname, String code) {
		return false;
//		if (userDao.checkExistEmail(email)) {
//			return false;
//		}
//		if (userDao.checkExistUsername(username)) {
//			return false;
//		}
//		userDao.insertregister(new  (username, email, fullname, password, 0, 1, code));
//		return true;
	}

	@Override
	public boolean checkExistEmail(String email) {
		return userDao.checkExistEmail(email);
	}

	@Override
	public boolean checkExistUsername(String username) {
		return userDao.checkExistUsername(username);
	}

	@Override
	public boolean checkExistPhone(String phone) {
		return userDao.checkExistPhone(phone);
	}

	@Override
	public boolean changePassword(String email, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	 public boolean changePassword(String email, String newPassword) {
//        return userDao.changePassword(email, encodePassword(newPassword));

	

}
