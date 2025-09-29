package Week3;

public class Chrome1 extends Browser {
public void openIncognito() {
	System.out.println("Open incognito tab");
}
public static void main(String[] args) {
	Chrome1 chromeOptions = new Chrome1();
	chromeOptions.openIncognito();
	chromeOptions.openURL();
	
	
}
}
