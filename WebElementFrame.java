package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");//main url
		
		WebElement frameelement = driver.findElement(By.name("singleframe"));
		
		driver.switchTo().frame(frameelement);
		
		driver.findElement(By.xpath("//iframe[@name='SingleFrame']")).sendKeys("Speedway");
		
		
		
	}
	
	
	

}
