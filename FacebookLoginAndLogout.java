package Login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginAndLogout {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    driver.findElement(By.name("email")).sendKeys("utkarshagobre3@gmail.com");
	    
	    driver.findElement(By.name("pass")).sendKeys("Utkarsha@***");
	    
	   String pwh = driver.getWindowHandle();
	   
	   System.out.println(pwh);
	               
	    driver.findElement(By.name("login")).click();
	    
	    Set<String>window = driver.getWindowHandles();
	    
	    for(String win:window)
	    {
	    	If(!win.equals(pwh));
	    {
	    	driver.switchTo().window(pwh);
	    	System.out.println(pwh);
	    		
	    	}
	    }
	    driver.findElement(By.cssSelector("[placeholder='Search Facebook']")).click();
	    
	    
	    
	}

	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
