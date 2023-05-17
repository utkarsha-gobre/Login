package Login;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneWindowHandleParentChild {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    
	   String pwh  = driver.getWindowHandle();//for parent window
	   
	   driver.findElement(By.linkText("Mobiles")).click();
	   
	  Set<String> window = driver.getWindowHandles();//for parent window
	  
	  for(String win : window)
	  {
		  //System.out.println(pwh);
		  
		  if(!win.equals(pwh)) 
		  {
		  
		  
			  driver.switchTo().window(win);
				driver.findElements(By.xpath("(//span[@class='nav-a-content'])[3]"));
				//  Set<String> window1 = driver.getWindowHandles();

		  }
	  }
		//driver.findElements(By.xpath("(//span[@class='nav-a-content'])[3]"));
	
}
}
//driver.findElements(By.xpath("(//span[@class='nav-a-content'])[3]"));