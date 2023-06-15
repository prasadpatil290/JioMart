package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
		   
		driver.get("https://www.flipkart.com/"); 
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9146607948");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shop@9970");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//span[@class='_54nh'][text()='Log Out']")).click();
		
		driver.close();
		
	}
		

}
