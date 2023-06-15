package SeleniumTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class OpenEdgeBrowser {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.edge.driver","C:\\Selenium\\msedgedriver.exe");
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new EdgeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		System.out.println("----------------Opened successfully----------------");
		driver.get("https://www.facebook.com/r.php");
		System.out.println("----------------Closed successfully----------------");
		
		String x = driver.getTitle();
		System.out.println(x);
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.close();
		
		
	}
}





