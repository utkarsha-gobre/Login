package Login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneWindowHandle {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    
	//String  pwh = driver.getWindowHandle();	
//	System.out.println(pwh);
	
//	driver.findElement(By.linkText("Best Sellers")).click();
//	
	//Set<String> window = driver.getWindowHandles();
	
//	for(String win:window)
//	{
//		System.out.println(win);
//		driver.findElement(By.linkText("Hot New Releases")).click();
//	}
	
	//no need to use getwindowhandle*****************
	    
	driver.findElement(By.linkText("Best Sellers")).click();
	driver.findElement(By.linkText("Hot New Releases")).click();


	
	
	
	
	
	
	
	
	
	
	
	}

}
