package SeleniumTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	
public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@role='presentation']"));
		driver.switchTo().frame(iframe);
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();

		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);	

		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("Youtube");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='wM6W7d']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,5000)");   //scroll down pixels
		
		Thread.sleep(2000);	

		js.executeScript("window.scrollBy(0,-2000)");   //scroll up
		
		Thread.sleep(2000);	
		
		WebElement search1 = driver.findElement(By.xpath("//input[@id='search'][1]"));
		search1.sendKeys("pathan");
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='sbqs_c']")).click();

		Thread.sleep(2000);

}
}
