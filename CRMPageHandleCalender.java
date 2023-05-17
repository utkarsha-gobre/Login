package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CRMPageHandleCalender {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	    driver.get("https://classic.freecrm.com/");
	    
	    driver.findElement(By.name("username")).sendKeys("Speedway2016");			    
	    driver.findElement(By.name("password")).sendKeys("speedway@2016")	;    
	    driver.findElement(By.cssSelector(".btn.btn-small")).click();
	    
	    driver.switchTo().frame("mainpanel");
	    
	//for view today    
	  //  WebElement calender = driver.findElement(By.xpath("//a[@title='Calendar']"));
	    
	  //  Actions act = new Actions(driver);
	    //act.moveToElement(calender).build().perform();
	//    driver.findElement(By.linkText("View Today")).click();
	    
	    
	    
	    
	// for month view
	  //  WebElement calender1 = driver.findElement(By.xpath("//a[@title='Calendar']"));
	    
	//    Actions act1 = new Actions(driver);
	    
	 //   act1.moveToElement(calender1).build().perform();
	    
	 //   driver.findElement(By.linkText("Month View")).click();
	    
	    
	    
	    
	    
	    
	    //for new event
	    
	    WebElement calender2 = driver.findElement(By.xpath(""));
	    Actions act2 = new Actions(driver);
	    act2.moveToElement(calender2).build().perform();
	    driver.findElement(By.linkText("New Event")).click();
	    
	    
	    
	    
	}

}













