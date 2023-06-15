package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
		   
		driver.get("https://www.meesho.com/auth?redirect=https%3A%2F%2Fwww.meesho.com%2F&source=profile&entry=header&screen=HP\r\n"); 
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9146607948");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@type=text]")).sendKeys("Sarees");

		
		//driver.findElement(By.xpath("//span[@class='_54nh'][text()='Log Out']")).click();
		
		//driver.close();
	}	

}
