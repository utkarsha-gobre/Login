package Login;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow2 {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://demo.automationtesting.in/Windows.html");
	    
	                 String  pwh  =  driver.getWindowHandle();//for parent window
	                 
	                 System.out.println(pwh);
	                 
	     driver.findElement(By.cssSelector(".btn.btn-info")).click();
	     
	       Set<String> window   = driver.getWindowHandles();//for child window
	                    
	     for(String win:window)  
	     {
	    	// System.out.println(pwh);
	    	 
	    	 if(!win.equals(pwh))
	    	 {
	    		 driver.switchTo().window(win);
	    		// System.out.println(pwh);
	    	 
	     
	          driver.findElement(By.name("navbarDropdown")).click();
	     }
	
	     }
	//List<WebElement> numoflist = driver.findElements(By.name("navbarDropdown"));
	
	
	
	}

}
