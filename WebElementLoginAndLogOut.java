package Login;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLoginAndLogOut {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://classic.freecrm.com/");
	    
	    driver.findElement(By.name("username")).sendKeys("Speedway2016");//username
	    
	    driver.findElement(By.name("password")).sendKeys("speedway@2016");//password
	    
	    driver.findElement(By.cssSelector("[value='Login']")).click();//login
	  
      Thread.sleep(5000);
	    driver.switchTo().frame("mainpanel");
	    
	    driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).click();//logout
	  
	  
    	  

      }
      
      //driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a"));
}
	
	
