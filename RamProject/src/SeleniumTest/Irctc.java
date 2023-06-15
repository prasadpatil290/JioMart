package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Irctc {
	
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();       
	   
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	Thread.sleep(3000);
	
//	String Url=driver.getCurrentUrl();
//	System.out.println(Url);
//	
//	String title=driver.getTitle();
//	System.out.println(title);
	
	driver.findElement(By.xpath("//input[@role='searchbox'][1]")).sendKeys("PARBHANI JN - PBN");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@role='option'][2]")).click();
	
	driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ')]")).sendKeys("AHMEDABAD JN - ADI");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@role='option'][1]")).click();
	
	driver.findElement(By.xpath("//label[@for='dateSpecific']")).click();

	driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
	
	
	//driver.findElement(By.xpath("//input[@type='text'][3]")).click();
	//driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("23/10/2022");
	
	//driver.findElement(By.xpath("//input[@type='text'][3]")).click();
	//driver.findElement(By.xpath("//p-calender[@dateformat='dd/mm/yy']")).sendKeys("23/10/2022");
		
	
	//p-calender[@dateformat='dd/mm/yy']
	//driver.findElement(By.xpath("//span[contains(@class,'ui-dropdown-trigger-icon ui-')][1]")).click();
	
	//driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-11 ui')]")).click();
	//driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-11 ui')]")).sendKeys("Sleeper (SL)");	
	//driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-11 ui')]][4]")).click();
	
	
	WebElement element =driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c65-11 ui')]"));
	Select ele = new Select(element);
	ele.selectByVisibleText("Sleeper (SL)");
	driver.findElement(By.xpath("//span[contains(@class='ng-tns-c65-11']")).sendKeys("GENRAL");
	driver.findElement(By.xpath("//span[contains(@class='ng-tns-c65-11']")).click();
	
	WebElement city= driver.findElement(By.xpath("//select[@class='custom-select']"));
	Select ct = new Select(city);
	ct.selectByVisibleText("Spain");
	}
}

