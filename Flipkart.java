package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{

	public static void main(String[] args) {

	{
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	
	//driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
	
	
	}
	}
}
