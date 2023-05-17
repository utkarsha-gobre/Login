package Login;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CRMPageHandleContact {

	public static void main(String[] args) {

System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	    driver.get("https://classic.freecrm.com/");
	    
	    driver.findElement(By.name("username")).sendKeys("Speedway2016");			    
	    driver.findElement(By.name("password")).sendKeys("speedway@2016")	;    
	    driver.findElement(By.cssSelector(".btn.btn-small")).click();
	    
	    driver.switchTo().frame("mainpanel");
	    
	   WebElement contact =  driver.findElement(By.xpath("//a[@title='Contacts']"));
	    
	    Actions act = new Actions(driver);
	    act.moveToElement(contact).build().perform();
	    driver.findElement(By.linkText("New Contact")).click();
	  
	    
		
		
		
		
		
		
		
		
		
		
		
	}

}
