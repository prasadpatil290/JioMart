package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Locate5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
	   
		driver.get("https://meet.google.com/"); 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,10000)");   //scroll down pixels
		
		Thread.sleep(2000);
		
		WebElement lang = driver.findElement(By.xpath("//Select[@name='lang-selector']"));
		Select sel = new Select(lang);
		sel.selectByVisibleText("अंग्रेज़ी (अमेरिका) - English (United States)");
		

		driver.findElement(By.xpath("(//input[@placeholder='Enter meeting code'])[2]")).sendKeys("nbe-pooo-onh");

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[@class='cta_text'])[4]")).click();
		
		driver.close();
	}

}
