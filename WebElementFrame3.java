package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFrame3 {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
	WebElement frameElement	= driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Utkarsha");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Practice Site")).click();
		
	}

}
