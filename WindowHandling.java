package Week4.day2;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.irctc.co.in");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windows=new ArrayList<>(windowHandles);
		driver.switchTo().window(windows.get(0));
		System.out.println("Child window title:   "+driver.getTitle());
		driver.close();
		driver.switchTo().window(windows.get(1));
		System.out.println(" parent window closed successfully");
		driver.quit();
		
		

		
	}
}
