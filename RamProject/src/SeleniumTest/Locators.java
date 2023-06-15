package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {
		
	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);       
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/"); 
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9146607948");
				
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ram@3570");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='_54nh'][text()='Log Out']")).click();
		
		driver.close();
		
	}
}

