package SmartCalendarpackage;
import java.util.ArrayList;
import java.util.List;

public class User {
	 int userID;
	    int userpwd;
	    String name;
	    String email;
	    List<User> userList = new ArrayList<>(); 

	    
	    public User(int userID, int userpwd, String name, String email) {
	        this.userID = userID;
	        this.userpwd = userpwd;
	        this.name = name;
	        this.email = email;
	        
	    }
	    
	    
	    public User() {
	        this.userID = 0;
	        this.userpwd = 0;
	        this.name = "";
	        this.email = "";
	    }

	    
	    public int getUserID() {
	        return userID;
	    }

	    
	    public void setUserID(int userID) {
	        this.userID = userID;
	    }

	    
	    public int getUserpwd() {
	        return userpwd;
	    }

	    
	    public void setUserpwd(int userpwd) {
	        this.userpwd = userpwd;
	    }

	    
	    public String getName() {
	        return name;
	    }

	    
	    public void setName(String name) {
	        this.name = name;
	    }

	    
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public boolean register(int userID, int userpwd, String name, String email) {
	        for (User user : userList) {
	            if (user.getUserID() == userID) {
	                System.out.println("User ID already exists. Registration failed.");
	                return false;
	            }
	        }

	        User newUser = new User(userID, userpwd, name, email);
	        userList.add(newUser);
	        System.out.println("Registration successful for user: " + name);
	        return true;
	    }

	    public boolean login(int userID, int userpwd) {
	        for (User user : userList) {
	            if (user.getUserID() == userID && user.getUserpwd() == userpwd) {
	                System.out.println("Login successful for user: " + user.getName());
	                return true;
	            }
	        }
	        System.out.println("Login failed. Invalid user ID or password.");
	        return false;
	    }

	    public boolean logout(int userID) {
	        for (User user : userList) {
	            if (user.getUserID() == userID) {
	                System.out.println("Logout successful for user: " + user.getName());
	                return true;
	            }
	        }
	        System.out.println("User not found. Logout failed.");
	        return false;
	    }
	}

	 
//	    public static void main(String[] args) {
//	    	User us1= new User();
//	    	User us2= new User();
//	        us1.register(27, 2772, "Sp", "sp27pluto@gmail.com");
//	        us2.register(28, 2882, "Selva Karthik", "skfanofsomeone@gmail.com");
	//
//	        
//	        us1.login(27, 2772); 
//	        us2.login(28, 1234); 
	//
//	        us1.logout(27); 
//	        us2.logout(29);
//	    }
	//}


