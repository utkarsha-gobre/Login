package Login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAlert4 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//for alert handle 
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		driver.findElement(By.cssSelector("[class='btn btn-danger']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		Alert alt = driver.switchTo().alert();
        String alertTxt = alt.getText();
        System.out.println(alertTxt);
        driver.close();
        
        
		
	}

}
