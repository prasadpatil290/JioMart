package Autosuggesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow {
	
	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();     
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));		
		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

//		To put location		
		WebElement cl = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		cl.sendKeys("A");
		
		List<WebElement> MultipleElements = driver.findElements(By.xpath("(//ul[@class='sc-guztPN kPdrCe'])/li"));
		String expText = "A";
		for (WebElement singLeElement : MultipleElements) {
			String actText = singLeElement.getText();
			System.out.println(singLeElement.getText());
			if (actText.equalsIgnoreCase(expText)) {
				singLeElement.click();
				break;
			}
		}
	
	
	}

}
