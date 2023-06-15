package SeleniumTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {
	
	 public static void main(String[] args) throws InterruptedException, IOException{
			
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);	
		driver.navigate().to("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		
		for (int i=10; i>1; i--) {     //For taking multiple screenshots

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(5);    //Lenght of random digits or char 5
				
		File destination =new File("C:\\Users\\ramko\\OneDrive\\Pictures\\Screenshots\\ScreenshotsBySellenium\\ScreenshotNo"+random+".jpeg");
		
		FileHandler.copy(src,destination);
		
		
		
		System.out.println("Screenshot Taken");
		
		}
			
	 }
}
