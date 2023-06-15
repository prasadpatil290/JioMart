package SeleniumTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BookMyshow {
	
	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver1.exe");
		WebDriver driver = new FirefoxDriver();    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));		
		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

//		To put location		
		WebElement cl = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		cl.sendKeys("latur");
//	
		Thread.sleep(3000);
		
		WebElement Loc = driver.findElement(By.xpath("//span[@class='sc-hizQCF eTPTpG']"));
		Loc.click();                                   
		
		//Another way by selecting city 
//		driver.findElement(By.xpath("//span[@class='sc-bbkauy bLXDgz']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//div[@class='sc-dznXNo hzBPnN'])[32]")).click();
		
		Thread.sleep(3000);

		//To search
		driver.findElement(By.xpath("//span[@class='sc-fcdeBU cNeUMt']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@class='sc-cmIlrE kLLiBb']")).click();
	
		Thread.sleep(2000);

		//Movie name search
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Adipurush");
		
		//search.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='sc-kAdXeD fZtDlY'])[1]")).click();

		Thread.sleep(2000);
		
		//Book Tickets
		
		driver.findElement(By.xpath("(//button[@data-phase='postRelease'])[1]")).click();
		
		Thread.sleep(4000);
		
		//HIDDEN POP UP
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		
		Thread.sleep(3000);
        
		//SELECT SHOW TIME
		driver.findElement(By.xpath("(//a[@class='showtime-pill'])[1]")).click();
		
		Thread.sleep(3000);

		//No. OF SEATS
		driver.findElement(By.xpath("//li[@id='pop_2']")).click();

		Thread.sleep(3000);

		//quantity confirm
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();

		Thread.sleep(4000);
		
		//Select seats
		driver.findElement(By.xpath("//div[@id='A_8_0313']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@id='btmcntbook'])[1]")).click();

		Thread.sleep(4000); 

		driver.findElement(By.xpath("//div[@id='basCheckbox']")).click();
		
		Thread.sleep(3000); 
		
		//Payment
		driver.findElement(By.xpath("//div[@id='prePay']")).click();

		Thread.sleep(2000); 

		driver.findElement(By.xpath("//div[@id='prePay']")).click();
		
		Thread.sleep(1000); 
		
		//Payee details
		
		WebElement iframe = driver.findElement(By.xpath("//body[@class='payments']']"));
		driver.switchTo().frame(iframe);
		
		Thread.sleep(3000);
		
		//body[@class='payments']
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("ram007@gmail.com");
		
		Thread.sleep(1000); 

		driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("9900790007");
		
		Thread.sleep(500); 

		driver.findElement(By.xpath("//div[@id='dContinueContactSec']")).click();
		
		Thread.sleep(500); 

	}
}
