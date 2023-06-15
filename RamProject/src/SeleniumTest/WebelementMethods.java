package SeleniumTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			   
		driver.get("https://www.facebook.com/r.php");
		
		Thread.sleep(300);
		
		WebElement result=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		String att=result.getAttribute("name");
		System.out.println(att);
		
		WebElement result1=driver.findElement(By.xpath("//input[@type='text']"));
		String att1=result1.getAttribute("name");
		System.out.println(att1);
		
		
//Selecting and Checking wheather radio buttons
		
		WebElement male=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		male.click();
		boolean result2=male.isSelected();
		if(result2==true) {
			System.out.println("Element is selected");
		}
		else {
			System.out.println("Element is not selected");
		}
	}
}