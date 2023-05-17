package Login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffMailCreateHandle {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\Software\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Utkarsha");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Demo@123");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Demo123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Demo123");
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Demo@123");
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	
	     WebElement  security   = driver.findElement(By.xpath("//select[@style='width:285px;']"));
	    Select sel = new Select(security);
	    
	    sel.selectByVisibleText("What is your favourite food?");
	    
	    
	    driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("Demo@123");
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Sita");
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("1231234567");
	   Thread.sleep(50);
	//   WebElement day =driver.findElement(By.name("DOB_Daycaf62ef9"));
	
	 
	//Select sel1 = new Select(day);	
//	sel.selectByVisibleText("05");
	
	
	WebElement month = driver.findElement(By.xpath("//select[@onchange='fieldTrack(this);'][2]"));
	Select sel2 = new Select(month);

	//sel.selectByVisibleText("JUL");
	sel.selectByValue("03");
	
	
	WebElement year = driver.findElement(By.xpath("//select[@onchange='fieldTrack(this);'][3]"));
	Select sel3 = new Select(year);

	sel.selectByVisibleText("2000");
	
	
	//for radio button 
	
	boolean rdoButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	
	if(rdoButton==false)
	{
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		
	}
	List<WebElement> country = driver.findElements(By.id("country"));
	
	for(WebElement element:country)
	{
		if(country.contains("Australia")) 
		{
			element.click();		
	}
		
	List<WebElement> city = driver.findElements(By.xpath("//select[@style='width:183px;']"));
	
	for(WebElement element1 :city)
	{
		if(city.contains("Bangalore"));
		{
			element1.click();
		}
	}
	
	
	}
	
	}
	}
