package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://jqueryui.com/droppable/");
	    
	    // for drag and drop 
	    driver.switchTo().frame(0);
	   WebElement  source = driver.findElement(By.id("draggable"));
	   
	   WebElement destination = driver.findElement(By.id("droppable"));
	   
	   Actions act = new Actions(driver);
	   
	   act.clickAndHold(source).release(destination).build().perform();
	    
	}

}
