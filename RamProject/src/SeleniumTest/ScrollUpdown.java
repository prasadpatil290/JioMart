package SeleniumTest;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpdown {
	
	public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.album.alexflueras.ro/index.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,5000)");   //scroll down pixels
		
		Thread.sleep(2000);	

		js.executeScript("window.scrollBy(0,-2000)");   //scroll up
		
		Thread.sleep(2000);	
		
		js.executeScript("window.scrollBy(6000,0)");   //scroll right
		
		Thread.sleep(2000);	

		js.executeScript("window.scrollBy(-2000,0)");   //scroll right
		
		Thread.sleep(2000);	
		
		js.executeScript("window.scrollBy(4500,0)");   //scroll right

		Thread.sleep(2000);	

		js.executeScript("window.scrollBy(-3000,0)");  //scroll left
		
		Thread.sleep(2000);	
		
		driver.close();
		
	}
}
