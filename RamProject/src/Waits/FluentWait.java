package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
//Check in RedBus Projects
public class FluentWait {
	
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
		
		//driver.findElement(By.xpath("//input[@type='t']"));
		//Fluent wait
		
		 // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>
		   		.withTimeout(Duration.ofSeconds(30L))
		       .pollingEvery(Duration.ofSeconds(5L))
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });
		
		
		
		
		WebDriverWait ref = new WebDriverWait(driver, Duration.ofSeconds(5)); //Not inspectable code to chk diff
		WebElement pass = ref.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='t']")));
		pass.sendKeys("67786588");		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ram@3570");
			
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(3000);
		
		System.out.println("Logged in Succesfully");
	}
}


