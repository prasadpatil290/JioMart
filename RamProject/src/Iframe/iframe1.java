package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);   //shift focus from main page to iframe
		
		Thread.sleep(3000);
					
		driver.findElement(By.xpath("//button[@type='button']")).click();
			
		Thread.sleep(3000);
		
		//driver.switchTo().defaultContent();  //Shift focus from iframe to main page
		
		driver.switchTo().parentFrame(); ////second way to Shift focus from iframe to main page
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@id='tryhome']")).click(); //confirming whether focus is back to main page or not
	}


}
/**NOTE- If we try to automate directly then it will give exceptions/#no_such_element */