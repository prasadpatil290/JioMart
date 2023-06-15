package BrokenLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class brokenlink {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
	
	driver.get("https://www.jiomart.com");
	
	driver.manage().window().maximize();
	
    List<WebElement> links = driver.findElements(By.tagName("a"));

    System.out.println(links.size());

    for (int i = 0; i<=links.size(); i++) {
                 
    	System.out.println(links.get(i).getText());
    
    }
    
	}
}
    
    
    
    
    
    
    
    
    