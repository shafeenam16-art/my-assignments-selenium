package Week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead{
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
        driver.findElement(By.name("id")).sendKeys("10148");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        // 6. Click first result
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

        // 7. Click Edit
        driver.findElement(By.linkText("Edit")).click();

        // 8. Change Last Name to "Moideen"
        driver.findElement(By.id("updateLeadForm_lastName")).clear();
        driver.findElement(By.id("updateLeadForm_lastName")).sendKeys("Moideen");

        // 9. Click Update button
        driver.findElement(By.name("submitButton")).click();

        System.out.println("Lead 10148 edited successfully. Last name changed to Moideen.");

        // 10. Close browser
        driver.quit();
    }
}
