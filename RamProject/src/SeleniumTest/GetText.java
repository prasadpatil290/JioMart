package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/r.php");
		
	WebElement text=driver.findElement(By.xpath("//div[@class='_52lo']"));
	String result=text.getText();
	String result1=text.getTagName();
	System.out.println("Tag Name=" +result1); 
	System.out.println(result);	
	}		
}