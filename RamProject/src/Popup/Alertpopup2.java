package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		
		alt.sendKeys("ram");
		
		Thread.sleep(1000);
		
		alt.accept();
		
		Thread.sleep(1000);

		//driver.close();	
	}
}