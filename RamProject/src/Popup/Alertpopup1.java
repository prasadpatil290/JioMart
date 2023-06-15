package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("ram");
		
		Thread.sleep(1000);
		
		alt.dismiss();
		
		Thread.sleep(1000);

		driver.close();
		
	}
}