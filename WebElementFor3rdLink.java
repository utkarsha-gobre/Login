package Login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFor3rdLink {

	public static void main(String[] args) {
		 System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
			
		    ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Alerts.html");//main url
			
			driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
			
			driver.findElement(By.cssSelector(".btn.btn-primary")).click();
			
			Alert alt = driver.switchTo().alert();
			
			 String alertText = alt.getText();
			 
			 alt.accept();//it click on OK button
			 
			 
			 
			 
	}

}
