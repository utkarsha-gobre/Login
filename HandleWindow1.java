package Login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\Software\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://demo.automationtesting.in/Windows.html");
	    
	    String pwh = driver.getWindowHandle();
	    
	    System.out.println(pwh);
	    
	    driver.findElement(By.cssSelector(".btn.btn-info")).click();
	    
	    Thread.sleep(2000);
	    
         Set< String > window  = driver.getWindowHandles()	;
         

 	    Thread.sleep(2000);

         
	
	for(String win : window)
	{
		System.out.println(win);
		
		if(!win.equals(pwh))
		{
			driver.switchTo().window(win);
		
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		}
	}
	
	}

}
