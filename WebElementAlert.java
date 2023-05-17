package Login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAlert {

	public static void main(String[] args) {
    
    System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");//main url
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));//this is also for 1st link
		
		//driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();//1st link
		
		driver.findElement(By.cssSelector(".btn.btn-danger")).click();//for button
		
		Alert alt = driver.switchTo().alert();//this is interact for ok
		
		String alertText = alt.getText();
		
		alt.accept();
		
		if(alertText.contains("Your name is cannot be blank"))
		{
		System.out.println("test case is pass");	
		}
		
	}

}
