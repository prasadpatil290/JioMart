package Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
		
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
			
		WebDriver driver = new ChromeDriver(options);       
			
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		driver.manage().window().maximize();
			
		driver.get("https://www.facebook.com/"); 
			
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9146607948");
//Explaination		
//Explicit wait is nothing but whatever element is not locting it will wait for specified time like here 5 seconds then it will give exception like Expected condition failed: waiting for visibility of element located by By.xpath: //input[@type='t'] (tried for 5 second(s) with 500 milliseconds interval)
		
		//driver.findElement(By.xpath("//input[@type='t']"));
		WebDriverWait ref = new WebDriverWait(driver, Duration.ofSeconds(10)); //Not inspectable code to chk diff
		WebElement pass = ref.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='t']")));
		pass.sendKeys("67786588");		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ram@3570");
			
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(3000);
		
		System.out.println("Logged in Succesfully");
	}
}
