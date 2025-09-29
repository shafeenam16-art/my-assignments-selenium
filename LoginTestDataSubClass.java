package Week3.day2;

public class LoginTestDataSubClass extends TestDataSuperClass {
	
	 public  void enterUsername() {
	        System.out.println("Entering username...");
	    }

	   public void enterPassword() {
	        System.out.println("Entering password...");
	    }

	public static void main(String[] args) {
		LoginTestDataSubClass login = new LoginTestDataSubClass();
        login.enterUsername();
        login.enterPassword();
        login.enterCredentials(); 
        login.navigateToHomePage();
    }

	}


