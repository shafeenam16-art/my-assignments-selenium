package Week4.day2;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AssignWindowHandling {
  public static void main(String[] args) {
    
    ChromeOptions opt = new ChromeOptions();
    opt.addArguments("guest");
    ChromeDriver driver = new ChromeDriver(opt);

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("http://leaftaps.com/opentaps/control/login");
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.get(driver.getCurrentUrl());
driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.linkText("Merge Contacts")).click();
driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

String parentWindow = driver.getWindowHandle();
Set<String> windows = driver.getWindowHandles();
for (String window : windows) {
  if (!window.equals(parentWindow)) {
    driver.switchTo().window(window);
    break;
  }
}
driver.findElement(By.xpath("//a[@class='linktext']")).click();

driver.switchTo().window(parentWindow);
driver.findElements(By.xpath("//img[@alt='Lookup']")).get(1).click();

Set<String> windows2 = driver.getWindowHandles();
for (String window : windows2) {
  if (!window.equals(parentWindow)) {
    driver.switchTo().window(window);
    break;
  }
}
driver.findElement(By.xpath("//a[@class='linktext']")).click();
driver.switchTo().window(parentWindow);

driver.findElement(By.className("buttonDangerous")).click();
Alert alert = driver.switchTo().alert();
alert.accept();
System.out.println("Merge Contacts Successful");
driver.quit();
  }
}
