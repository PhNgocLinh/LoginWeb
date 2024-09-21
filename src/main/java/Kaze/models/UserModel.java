package Kaze.models;

import java.io.Serializable;
import java.sql.Date;

public class UserModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String email;
	private String password;
	private String fullname;
	private String images;
	private int roleid;
	private String phone;
	private Date createdate;
	private String code;
	private int status;
	
	
	
	public UserModel() {
		super();
		
	}


	public UserModel(int id, String username, String email, String password, String fullname, String images, int roleid, String phone, Date createdate, String code, int status) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.images = images;
		this.roleid = roleid;
		this.phone = phone;
		this.createdate = createdate;
		this.code = code;
		this.status = status;
	}
	

	public UserModel(String username, String email, String password, String fullname, int roleid, String code) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.roleid = roleid;
		this.code = code;
	}


	public UserModel(String username, String email, String fullname, String code) {
		super();
		this.username = username;
		this.email = email;
		this.fullname = fullname;
		this.code = code;
	}





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}
	
	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}
	
	


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "UserModel [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", fullname=" + fullname + ", images=" + images + ", roleid=" + roleid + ", phone=" + phone
				+ ", createdate=" + createdate + ", code=" + code + ", status=" + status + "]";
	}


	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}


	

	
	

	
	

}
