package Homepage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Jiomartoys {

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

		driver.get("https://www.jiomart.com");

		driver.manage().window().maximize();

		String url = driver.getCurrentUrl(); // Actual
		System.out.println(url);


		WebElement Toys = driver.findElement(By.linkText("Sports, Toys & Luggage"));
		System.out.println("===========" + Toys.getText() + "========");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(Toys).build().perform();

		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.xpath("//li[@id='nav_cat_8584']/div/ul/li/a"));
		List<WebElement> Hidlist = driver.findElements(By.xpath("//a[@class='header-nav-l3-item-link__right']"));
		for (WebElement e : list) {
			Thread.sleep(500);
			for (WebElement ee : Hidlist) {
				Thread.sleep(500);
				act.moveToElement(ee).build().perform();
				System.out.println(ee.getText());
			}
			act.moveToElement(e).build().perform();
			System.out.println(e.getText());
		}
	}

}
