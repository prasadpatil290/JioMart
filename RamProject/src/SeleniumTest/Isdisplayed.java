package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement display=driver.findElement(By.xpath("(//input[@type='text'])[6])"));
		boolean result=display.isDisplayed();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("Element is displayed");
		}
		else {
			System.out.println("Element is not displayed");
		}
	}
}

