package Login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAlert2 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	driver.get(	"https://demo.automationtesting.in/Alerts.html");
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	
	driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	
	Alert alt = driver.switchTo().alert();
	
	String alertText = alt.getText();
	System.out.println(alertText);
	
	Thread.sleep(2000);
	alt.accept();
	}

}
