package SeleniumTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser {
	
	public static void main(String[] args) throws InterruptedException{
			
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);        //Upcasting
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php"); //to launch URL and navigate to this page 
		Thread.sleep(3000);   //Time to exit web page after opening 3 sec=3000 milli sec
		
		//driver.close();       //To close single tab
		
		//driver.quit();        //To close whole webpage after 3 sec
		
		String Tittle=driver.getTitle();
		System.out.println(Tittle);        //Actual Tittle
		
		String ExpTittle="Sign up for Facebook | Facebook";  //Storing Expected o/p
		
		if(Tittle.equalsIgnoreCase(ExpTittle)) {
			System.out.println("Navigated to correct page");
		}
		else {
			System.out.println("Navigated to Wrong Page");
		}
		System.out.println("Time to Exit");
		
		
		driver.close(); 
	}
}
