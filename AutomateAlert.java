package Week4.day2;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class AutomateAlert {


	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert = driver.switchTo().alert();
	
		Alert promptAlert = null;
		promptAlert.accept();
		promptAlert.sendKeys("HELLO LEAFGROUND I AM SHAFEENA");
		String text = promptAlert.getText();
	        System.out.println(text);
	        
	        alert.dismiss();
	        driver.quit();
        
	}
}
