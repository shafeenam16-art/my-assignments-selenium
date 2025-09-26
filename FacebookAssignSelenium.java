package week2.day2210925;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignSelenium {
    public static void main(String[] args) throws InterruptedException {
        
        // Set path of ChromeDriver if required (only needed if not set in system PATH)
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Load the URL
        driver.get("https://en-gb.facebook.com/");
        
        // Maximize window
        driver.manage().window().maximize();
        
        // Click on "Create new account"
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        
        // Wait for the registration form to load
        Thread.sleep(2000);  // better to use WebDriverWait in real projects
        
        // Enter first name
        driver.findElement(By.name("firstname")).sendKeys("ShiekhHumaid");
        
        // Enter surname
        driver.findElement(By.name("lastname")).sendKeys("M");
        
        // Enter mobile number or email
        driver.findElement(By.name("reg_email__")).sendKeys("shafeenam16@gmail.com");
        
        // Enter password
        driver.findElement(By.name("reg_passwd__")).sendKeys("Humaid@22");
        
        // Handle drop downs for Date of Birth
        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select day = new Select(dayDropdown);
        day.selectByVisibleText("22");
        
        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select month = new Select(monthDropdown);
        month.selectByVisibleText("Aug");
        
        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select year = new Select(yearDropdown);
        year.selectByVisibleText("1996");
        
        // Select Gender (radio button)
        WebElement maleRadio = driver.findElement(By.id("Male"));
        maleRadio.click();
       
      
        // Wait before closing
        Thread.sleep(3000);
        
        // Close browser
        driver.quit();
    }
}


	
