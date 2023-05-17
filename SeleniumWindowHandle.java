package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWindowHandle {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.selenium.dev/downloads/");
	    
	    driver.findElement(By.linkText("Documentation")).click();
	    driver.findElement(By.linkText("W3C WebDriver specification")).click();
	    
	}

}
