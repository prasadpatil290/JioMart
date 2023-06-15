package SeleniumTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://zerodha.com/");
		Thread.sleep(2000);
		
		Dimension d= new Dimension(100, 350);
		
		driver.manage().window().setSize(d);
				
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.toString());
	}
}







