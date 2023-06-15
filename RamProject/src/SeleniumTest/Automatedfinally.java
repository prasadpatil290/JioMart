package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automatedfinally {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
		   
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ram Kothale");
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9123239007");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ram007@gmail.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("***#@1234");
		
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Viman Nagar,Pune");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='male']")).click();
		
		Thread.sleep(2000);
		
	    WebElement ch1 = driver.findElement(By.xpath("//input[@id='monday']"));
	    ch1.click();
	    
		Thread.sleep(2000);
	    
	    WebElement city= driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select ct = new Select(city);
		ct.selectByVisibleText("Spain");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for='selenium']")).click();
		
		driver.findElement(By.xpath("//label[@for='cucumber']")).click();
		
		driver.findElement(By.xpath("//label[@for='testng']")).click();

	    driver.findElement(By.xpath("//label[@for= '2years']")).click();
	    
	    System.out.println("Congratulations,Website is Automated Successfully");
	    
		Thread.sleep(5000);
		
	    driver.close();    
	}
}
