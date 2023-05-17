package Login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRediffMailWithAlert {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Speedway");
	    driver.findElement(By.xpath("//input[@value='Create my account >>']")).click();
	    
	    Alert alt = driver.switchTo().alert();
	    
	   String alertTxt = alt.getText();
	    alt.accept();
	    System.out.println(alertTxt);
	}

}
