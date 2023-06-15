package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMinimize {
	
	public static void main(String[] args) throws InterruptedException{
			
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();        //Upcasting
	   
		driver.navigate().to("https://www.facebook.com/r.php");  //to launch URL and navigate to this page
		driver.manage().window().maximize();
		Thread.sleep(3000);   //Time to exit web page after opening 3 sec=3000 milli sec
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.close();
		driver.quit();
	}
}