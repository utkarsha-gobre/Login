package Login;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
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
	    
	    //nickname
	    driver.findElement(By.xpath("//input[@name='nickname']")).sendKeys("abc");

	    driver.findElement(By.xpath("(//input[@value='Lookup'])[1]")).click();
	    
// driver.switchTo().frame("mainpanel");	 
	    	 
	   
	   String pwh = driver.getWindowHandle();


	   driver.switchTo().window(pwh);
	   
	   WebElement search = driver.findElement(By.xpath("//input[@name='search']"));

	   Actions act1 = new Actions(driver);
	  

	 act.moveToElement(search).build().perform();
	    
	    	    	    	    

	 driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Infosys");
	    	   	    


	 driver.findElement(By.id("lookupSearchForm")).click();	    
	    
	   driver.switchTo().window(pwh);
	    	    	    	    	    	 
	   driver.switchTo().frame("mainpanel");

//for company position 
	    
	    driver.findElement(By.xpath("//input[@name='company_position']")).sendKeys("Manager");
        driver.findElement(By.xpath("//input[@name='department']")).sendKeys("IT");
        driver.findElement(By.name("contact_lookup_sup")).sendKeys("abc");
        driver.findElement(By.name("contact_lookup_ass")).sendKeys("abc");
        driver.findElement(By.name("contact_lookup_ref")).sendKeys("abc");
        
 //for category
        WebElement catogary = driver.findElement(By.name("category"));
        
        Select sel1 = new Select(catogary);
        
        sel.selectByVisibleText("Friend");
 //for Status
        WebElement status = driver.findElement(By.name("Status"));
        
        Select sel2 = new Select(status);
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
       
       Select sel3 = new Select(messenger);
       
       sel.selectByVisibleText("Yahoo Messenger");
       
   //for skype id
       driver.findElement(By.id("skype_id")).sendKeys("abc");
       
  //for Select source
       WebElement source = driver.findElement(By.name("source"));
       Select sel4 = new Select(source);
       
       sel.deselectByValue("Event");
       
       //for birthday 
       driver.findElement(By.name("birthday"));
       driver.findElement(By.cssSelector("[title='Date selector']")).click();
       
       
       
    //for identifier   
       driver.findElement(By.name("identifier")).sendKeys("abc");
       
       
       
       
        
        
        
        
        
//driver.

		  // driver.switchTo().

	// driver.findElement(By.xpath("(//td[@align='center'])[3]")).sendKeys("Infosys");
 // driver.findElement(By.id("search")).click();
//	    driver.findElement(By.cssSelector("[name='client_lookup']")).sendKeys("Infosys");
	//      driver.findElement(By.cssSelector("[type='submit']")).click();
	//	driver.findElement(By.xpath("(//input[@value='Save'])[2]")).click();
		
//	 Alert alt = driver.switchTo().window("");
	 
//	 String alertTxt = alt.getText();
	 
//	 alt.sendKeys("Infosys");
	 
	 
	
		}
	}
	
	    
	    
	    
	    
	    
	


