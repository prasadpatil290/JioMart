package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMethod {
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/r.php");
			
	WebElement male=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	male.click();
	boolean result=male.isSelected();
	if(result==true) {
		System.out.println("Element is selected");
	}
	else {
		System.out.println("Element is not selected");
		}
	}
}
	
	
