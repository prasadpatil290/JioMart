package SeleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoVelo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
   
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://vctcpune.com/"); 
		
		//driver.manage().window().maximize();

		Thread.sleep(500);

		driver.findElement(By.linkText("Start Selenium Practice")).click();
	
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@value='Radio2']")).click();

		Thread.sleep(2000);
		
		driver.quit();
		
	
	
	}
}
