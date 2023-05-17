package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementClickOnArrow {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		
	    driver.get("https://classic.freecrm.com/");
	    
	    Thread.sleep(5000);

	    
	    driver.findElement(By.cssSelector("[data-slide='next']")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.cssSelector("[class='fa fa-chevron-right']")).click();
	    
	    Thread.sleep(5000);

	    driver.findElement(By.cssSelector("[data-slide='next']")).click();
	    
	    Thread.sleep(5000);

	    driver.close();

	}

}
