package ObjectMethodsChallenge;

public class User {
	
	private int userID;
	private String username;
	private String firstName, secondName;
	
	User(int userID, String username, String firstName, String secondName){
		
		this.userID = userID;
		this.username = username;
		this.firstName = firstName;
		this.secondName = secondName;
		
	}
	
	void setUserID(int userID) {
		
		this.userID = userID;
	}
	
	int getUserID() {
		
		return userID;
	}

}
