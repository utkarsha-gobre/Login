package Login;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

	System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\Software\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.close();
	}

}
