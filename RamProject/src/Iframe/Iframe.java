package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
			
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(iframe);
		
		Thread.sleep(3000);
					
		driver.findElement(By.xpath("//a[@href='https://vctcpune.com/courses/'][1]")).click();
			
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("RAM");
	}

}
