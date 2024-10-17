package Aggregation;

public class Customer {

	private String userName;
	private String userPassword;
	
	Customer(String userName, String userPassword)
	{
		setUserName(userName);
		setUserPassword(userPassword);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	} 
	
	
}
