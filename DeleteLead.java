package Week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {
    public static void main(String[] args) {
    	ChromeOptions opt = new ChromeOptions();

		opt.addArguments("guest");

		// Launch Browser
		ChromeDriver driver = new ChromeDriver(opt);

    	driver.manage().window().maximize();

        // 1. Open Leaftaps login page
        driver.get("http://leaftaps.com/opentaps/control/login");

        // 2. Login
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // 3. Go to CRM/SFA
        driver.findElement(By.linkText("CRM/SFA")).click();

        // 4. Go to Leads -> Find Leads
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();

        // 5. Enter Lead ID and search
        driver.findElement(By.name("id")).sendKeys("10143");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        // 6. Click first result
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

        // 7. Click Delete
        driver.findElement(By.linkText("Delete")).click();

        System.out.println("Lead 10143 deleted successfully.");

        driver.quit();
    }
}
