package Week3.day2;

public class TestDataSuperClass {

   public void enterCredentials() {
        System.out.println("Entering credentials...");
    }

    public  void navigateToHomePage() {
        System.out.println("Navigating to Home Page...");
    }
	
	public static void main(String[] args) {
		// Superclass object
		TestDataSuperClass test = new TestDataSuperClass();
        test.enterCredentials();
        test.navigateToHomePage();

        System.out.println();

	}

}
