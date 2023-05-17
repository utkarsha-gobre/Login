package Login;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSeleniumDropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.google.com/");
	    
	    String pwh = driver.getWindowHandle();
	    
	    driver.findElement(By.name("input")).click();
	    
	    Set<String> window = driver.getWindowHandles();
	    
	    for(String win : window)
	    {
	    	if(!win.equals(pwh))
	    	{
	    		driver.switchTo().window(win);
	    	}
	    }
	    driver.findElement(By.xpath("[class='SPZz6b']")).click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	//    driver.findElement(By.name("q")).sendKeys("selenium");
	    
	    Thread.sleep(5000);
	    
	  //  List<WebElement> searchResult =  driver.findElements(By.xpath("//li[@class='sbct']"));
	    
	 //  for (WebElement element : searchResult)
	 //  {
		   
	//	String  elementTxt =element.getText();
		
	//	System.out.println(elementTxt);
		   
		//  if(elementTxt.contains("Selenium"))
		//   {
		//	  element.click();
			   
		//   }
		   
	 //  }

	    
	   
	    
	    
	}

}
