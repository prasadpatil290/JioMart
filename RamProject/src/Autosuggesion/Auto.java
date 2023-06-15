package Autosuggesion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Auto {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String expText = "redmi note 10";
		Thread.sleep(2000);

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(2000);

		List<WebElement> MultipleElements = driver.findElements(By.xpath("((//ul[@role='listbox'])[1]/li)"));
		Thread.sleep(2000);

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
