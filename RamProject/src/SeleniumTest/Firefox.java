package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver1.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		System.out.println("Opened successfully");
		driver.close();
		
	}
}