package model;

public class User {
	
	private String userID;
	
	private String fullName;
	
	private String password;
	
	public User(String userID, String fullName, String password) {
		super();
		this.userID = userID;
		this.fullName = fullName;
		this.password = password;
	}

	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
