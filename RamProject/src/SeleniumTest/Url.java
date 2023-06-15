package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
	   
		driver.get("https://www.facebook.com/r.php"); 
		Thread.sleep(3000);
		
		driver.getCurrentUrl();
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		String expurl="https://www.facebook.com/r.php";
		
		if(url.equalsIgnoreCase(expurl)) {
			System.out.println("Navigated to correct page");
		}
		else {
			System.out.println("Navigated to wrong page");
		}		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/accounts/login/?next=%2Fr.php%2F&source=desktop_nav");
	
		Thread.sleep(3000);

		boolean result=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("Element is enabled");
		}
		else {
			System.out.println("Element is not enabled");
		}
	}
}
	
