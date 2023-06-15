package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);

		driver.close();
		
	}
}
