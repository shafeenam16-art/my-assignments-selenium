package week2.day2210925;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadAssignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("guest");

		// Launch Browser
		ChromeDriver driver = new ChromeDriver(opt);

		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter the username
		WebElement usernameField = driver.findElement(By.id("username"));

		usernameField.sendKeys("DemoCSR");

		// Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		
		
		// getTitle
		String titleOfPage = driver.getTitle();
		System.out.println("The title of page is: " + titleOfPage);

		// Click CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on the Leads Link
		driver.findElement(By.linkText("Leads")).click();

		// Click Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter the Companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Enter the Firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mymoon");

		// Enter the Lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("shafeena");

		// Step1: Find the element
		WebElement dropDownElement1 = driver.findElement(By.id("createLeadForm_dataSourceId"));

		// Step2: Create the Object
		Select options = new Select(dropDownElement1);

		// Step3: Use the method
		// By index
		// options.selectByIndex(2);

		// By Text
		// options.selectByVisibleText("Existing Customer");

		// By Value
		options.selectByValue("LEAD_COLDCALL");

		// Click CreateLead button
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("Lead Created");
		Thread.sleep(5000);
		driver.close();

	}

}