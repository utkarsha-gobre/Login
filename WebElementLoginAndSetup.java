package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLoginAndSetup {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
			
		    ChromeDriver driver = new ChromeDriver();
			
		    driver.get("https://classic.freecrm.com/");
		    
		    driver.findElement(By.name("username")).sendKeys("Speedway2016");
		    
		    driver.findElement(By.name("password")).sendKeys("speedway@2016");
		    
		    driver.findElement(By.cssSelector(".btn.btn-small")).click();
		    
		    Thread.sleep(2000);
		    driver.switchTo().frame("mainpanel");
		    
		    driver.findElement(By.xpath("//a[@class='topnavlink'][1]")).click();
		    
		    Thread.sleep(2000);
		    driver.close();
		    
	}

}
