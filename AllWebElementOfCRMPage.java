package Login;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllWebElementOfCRMPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		
	    driver.get("https://classic.freecrm.com/");
	    
	    //for home page
	    
	    driver.findElement(By.linkText("Home")).click();
	    
        driver.findElement(By.name("username")).sendKeys("Speedway2016");
	    
	    driver.findElement(By.name("password")).sendKeys("speedway@2016");
	    
	    Thread.sleep(2000);
	    
	    //for  page sign up option 

	    
	    driver.findElement(By.linkText("Sign Up")).click();
	    
	    driver.findElement(By.id("payment_plan_id")).click();
	    
	   WebElement skillsDropDown = driver.findElement(By.cssSelector("[id='payment_plan_id']"))	;
	    
		Select sel = new Select(skillsDropDown);
		
		//sel.selectByVisibleText("Edition");
		
		sel.selectByVisibleText("Free Edition");
		
		
		
	    driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Utkarsha");
	    
	    driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Gobre");

	    driver.findElement(By.name("email")).sendKeys("Demo@123");
	    
	    driver.findElement(By.name("email_confirm")).sendKeys("Demo@123");
	    
        driver.findElement(By.name("username")).sendKeys("Speedway2016");
	    
	    driver.findElement(By.name("password")).sendKeys("speedway@2016");
	    
	    driver.findElement(By.name("passwordconfirm")).sendKeys("speedway@2016");
	    
	    driver.findElement(By.name("agreeTerms")).click();
	    
	   driver.findElement(By.cssSelector(".btn.btn-warning")).click();

	    //for Pricing
	   
	   driver.findElement(By.linkText("Pricing")).click();
	   Thread.sleep(2000);
	   
	   //for Features
	   
	   driver.findElement(By.linkText("Features")).click();
	   Thread.sleep(2000);

	   
	  //for customers
	   
	   driver.findElement(By.linkText("Customers")).click();
	   Thread.sleep(2000);

	   driver.findElement(By.cssSelector("[class='mouse']")).click();
	   Thread.sleep(2000);

       driver.close();	   
	   
	   //for
	   
	   driver.findElement(By.linkText("Contact")).click();

	   

	   
	   
	   
	   
	   
		
		
		
		

	    
	    

	}

}
