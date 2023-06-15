package Homepage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart4Table {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		String url = driver.getCurrentUrl(); // Actual
		System.out.println(url);

		Thread.sleep(1000);

		WebElement popup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Thread.sleep(1000);
		popup.click();
		Thread.sleep(1000);

	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement ele = driver.findElement(By.partialLinkText("Buy Laptop on EMI"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		
		
		
		
		
//		List<WebElement> noofrows = driver.findElements(By.linkText("Mobile Brands://br"));
//		//Total no of rows present in table
//		
//		System.out.println("no of rows=" + noofrows.size());
//		
//		for(int i=1; i<noofrows.size(); i++) {
//			List<WebElement> noofcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
//			System.out.println(noofcells.size());
//			
//			for(int cell=0;cell<noofcells.size();cell++) {
//				System.out.println(noofcells.get(cell).getText()+",");
//			}
//		System.out.println();
		
	}
}
