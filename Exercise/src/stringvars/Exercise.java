public class Account {
	private String fiName;
	private String laName;
	private String user;
	private String email;
	private String firmPassword;
	private String accountType;
	private String password;
public Account(String fiName, String laName, String user, 
		String email, String firmPassword,String accountType, String password) {
	this.setFiName(fiName);
	this.setLaName(laName);
	this.setUser(user);
	this.setEmail(email);
	this.setFirmPassword(firmPassword);
	this.setPassword(password);
	this.setAccountType(accountType);
	
}

	public void setPassword(String Password) {
		this.password = Password;
	}
	public String getpassword() {
		return password;
	}

public void setAccountType(String accountType2) {
	this.accountType = accountType2;
	
}
public String getAccountType() {
	return accountType;
}
//end of accountType
public void setFirmPassword(String firmPassword2) {
	this.firmPassword = firmPassword2;
	
}
public String getFirmPassword() {
	return firmPassword;
	//end of confirmed password
}
public void setEmail(String email2) {
	this.email = email2;
	
}
public String getEmail() {
	return email;
}
//end of email
public void setUser(String user2) {
	this.user=(user2);
	user2.compareToIgnoreCase(user);
	
}
public String getUser() {
	return user;
}
public void setLaName(String laName2) {
	this.laName=laName2;
	
}
public String getlaName() {
	return laName;
}
public void setFiName(String fiName2) {
	this.fiName=fiName2;
}
public String getfiName() {
	return fiName;
}
public String toString() {
	return this.fiName + " " + this.laName +" " + this.email + this.user +" " + this.firmPassword +
			" " + this.password;
	
}

}
