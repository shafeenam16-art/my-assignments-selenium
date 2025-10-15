package Week5.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS");
	    fromStation.sendKeys("\n");
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU");
		toStation.sendKeys("\n"); 
		WebElement sortOnDate = driver.findElement(By.id("chkSelectDateOnly"));
		if (sortOnDate.isSelected()) {
		    sortOnDate.click();
		}
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")
	        ));

	    List<WebElement> trainList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
	    System.out.println("Train names from MAS to MDU: \n");
	    
	    Set<String> uniqueNames = new HashSet<>();
	    boolean hasDuplicates = false;
	    for (WebElement train : trainList) {
	    	String trainName = train.getText().trim();
            if (!trainName.isEmpty()) {
                System.out.println(trainName);

                if (!uniqueNames.add(trainName)) {
                    System.out.println(" Duplicate found: " + trainName);
                    hasDuplicates = true;
	        }
	    } 
	    if (!hasDuplicates) {
	        System.out.println("No duplicate train names found.");
	    }
	    driver.quit();
                }
	}         
        
}

	


