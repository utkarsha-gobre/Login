package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrmContactPageHandle {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\Software\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/");
		
		
        driver.findElement(By.name("username")).sendKeys("Speedway2016");
	    
	    driver.findElement(By.name("password")).sendKeys("speedway@2016"); 

	    
	    driver.findElement(By.cssSelector(".btn.btn-small")).click();
	    
 driver.switchTo().frame("mainpanel");
	    
	    WebElement contacts = driver.findElement(By.xpath("//a[@title='Contacts']"));
	    
	    Actions act = new Actions(driver);
	    
	    act.moveToElement(contacts).build().perform();
	    
	    driver.findElement(By.linkText("New Contact")).click();
	    //for title

	    //driver.switchTo().frame("mainpanel");
	   
	    WebElement titleDropdown = driver.findElement(By.name("title"));
	    
	    Select sel = new Select(titleDropdown);
	    
	    sel.selectByVisibleText("Miss");
	    
	    //sel.selectByIndex(2);
	    
	    driver.findElement(By.name("first_name")).sendKeys("Utkarsha");
	    driver.findElement(By.name("surname")).sendKeys("Gobre");
	    
	    driver.findElement(By.xpath("//input[@name='nickname']")).sendKeys("abc");
	    driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys("Infosys");
	    
	    driver.findElement(By.xpath("//input[@name='company_position']")).sendKeys("Manager");
        driver.findElement(By.xpath("//input[@name='department']")).sendKeys("IT");
        driver.findElement(By.name("contact_lookup_sup")).sendKeys("abc");
        driver.findElement(By.name("contact_lookup_ass")).sendKeys("abc");
        driver.findElement(By.name("contact_lookup_ref")).sendKeys("TCS");
        
        WebElement owner = driver.findElement(By.xpath("//select[@name='owner_user_id']"));
       Select sel1 = new Select(owner);
       sel.selectByVisibleText("GANESH KAKADE (Speedway2016)");
        sel.selectByValue("434871");
        
      // driver.findElement(By.xpath("//select[@name='owner_user_id']")).sendKeys("GANESH KAKADE (Speedway2016)");
   //     driver.findElement(By.xpath("//select[@name='owner_user_id']")).click();
        
        WebDriverWait wait = new WebDriverWait(driver,200);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[name='category']")));
 //for category
        WebElement category = driver.findElement(By.cssSelector("[name='category']"));
        
        Select sel2 = new Select(category);
                       
        sel.selectByVisibleText("Friend");
        
       // sel.selectByIndex(0);
 //for Status
        WebElement status = driver.findElement(By.name("Status"));
        
        Select sel3 = new Select(status);
        sel.selectByValue("Active");
 //for phone
        driver.findElement(By.name("phone")).sendKeys("07227-10875");
        
 //for mobile
        driver.findElement(By.name("mobile")).sendKeys("1234567890");
        
 //for home phone
        driver.findElement(By.name("home_phone")).sendKeys("1234567890");
        
 // for fax
        driver.findElement(By.name("fax")).sendKeys("abc");
        
//for email
        driver.findElement(By.name("email")).sendKeys("Deme@123");
        
 //email alt
        driver.findElement(By.name("email_alt")).sendKeys("Deme@123");
        
 //for radio button status mail
        boolean rdoButtonStatus= driver.findElement(By.name("receive_email")).isSelected();
        
        if(rdoButtonStatus==false)
        {
        	driver.findElement(By.name("receive_email")).click();
        }
 //for radio button receiver sms 
        
        boolean rdoButtonStatus1 = driver.findElement(By.name("receive_sms")).isSelected();
        
        if(rdoButtonStatus1==false)
        {
        	driver.findElement(By.name("receive_sms"));
        }
//for radio button allow calls 
        boolean  rdoButtonStatus2 =driver.findElement(By.name("allows_call")).isSelected();
        
        if(rdoButtonStatus1==false)
        {
        	driver.findElement(By.name("allows_call"));
        }
  //for id
        driver.findElement(By.name("im_id")).sendKeys("Deme@123");
        
  //for  Select messenger network

       WebElement messenger = driver.findElement(By.name("im_netowrk"));
       
       Select sel4 = new Select(messenger);
       
       sel.selectByVisibleText("Yahoo Messenger");
       
   //for skype id
       driver.findElement(By.id("skype_id")).sendKeys("abc");
       
  //for Select source
       WebElement source = driver.findElement(By.name("source"));
       Select sel5 = new Select(source);
       
       sel.deselectByValue("Event");
       
       //for birthday 
       driver.findElement(By.name("birthday"));
       driver.findElement(By.cssSelector("[title='Date selector']")).click();
       
       
       
    //for identifier   
       driver.findElement(By.name("identifier")).sendKeys("abc");
       
	  }   
       
	}
   
        
        
        
        



	    

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	


