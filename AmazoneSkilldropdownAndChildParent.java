package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazoneSkilldropdownAndChildParent {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\Software\\src\\Login\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    
	    //for skillDropdown search
	    
	  WebElement  skillDropdown = driver.findElement(By.cssSelector("[title='Search in']"));
	  
	Select sel = new Select(skillDropdown);
	
	sel.selectByVisibleText("Beauty");
	
	//sel.selectByIndex(2);
	
	//Select best Sellers by using window
	
	
	
	
	
	
	
	}

}
