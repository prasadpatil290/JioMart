package Autosuggesion;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class AutoJioMart {

	public static void main(String[] args) throws InterruptedException {
//		WebElement ChkBox;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.get("https://www.jiomart.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> slides = driver.findElements(By.xpath("//span[@class='swiper-pagination-bullet']"));
		
		for(WebElement s : slides) {
			Thread.sleep(200);
			s.click();
			String slide = s.getAttribute("class");
			String label = s.getAttribute("aria-label");
			if(slide.contains("swiper-pagination-bullet-active")) {
				System.out.println("Clicked on= " + label);
			}
		}
		
		Thread.sleep(2000);
		
		
		WebElement Groceries = driver.findElement(By.id("nav_link_2"));
		System.out.println("===========" + Groceries.getText() + "========");
		Actions act = new Actions(driver);
		act.moveToElement(Groceries).build().perform();

		List<WebElement> list = driver.findElements(By.xpath("//li[@id='nav_cat_2']/div/ul/li/a"));

		for (WebElement e : list) {
			Thread.sleep(500);
			act.moveToElement(e).build().perform();
			System.out.println(e.getText());
		}
		Thread.sleep(5000);


		WebElement cl = driver.findElement(By.xpath("//input[@class='aa-Input search_input']"));
		cl.sendKeys("sam");

		Thread.sleep(3000);

		List<WebElement> MultipleElements = driver
				.findElements(By.xpath("(//li[@class='aa-Item search-result-list-item'])"));
		String expText = "samsung";
		for (WebElement singLeElement : MultipleElements) {
			String actText = singLeElement.getText();
			Thread.sleep(100);
			System.out.println(singLeElement.getText());
			if (actText.equalsIgnoreCase(expText)) {
				Thread.sleep(1000);
				singLeElement.click();
				break;
			}
		}

		Thread.sleep(1000);

		WebElement e = driver.findElement(By.xpath("//span[@class='ais-HierarchicalMenu-label']"));
		e.click();

		Thread.sleep(1000);
		System.out.println("a");

		WebElement ChkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

		Thread.sleep(1000);

		try {
			System.out.println("b");
			ChkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
			ChkBox.click();
			System.out.println("c");
		} catch (Exception E) {
			System.out.println("-----------Message is----------" + E.getMessage());
			System.out.println("-----------Cause is----------" + E.getCause());
		}

		WebElement M = driver.findElement(By.linkText("Mobiles & Tablets"));
		M.click();
		//Actions act = new Actions(driver);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		List<WebElement> MobileListBox = driver.findElements(By.xpath("//li[@class='ais-InfiniteHits-item jm-col-4 jm-mt-base']"));

		for (WebElement MobLiBox : MobileListBox) {
			Thread.sleep(1000);
			act.moveToElement(MobLiBox).build().perform();
			js.executeScript("window.scrollBy(0,1000)");   //scroll down pixels
			System.out.println("");
			System.out.println(MobLiBox.getText());
		}

	}
}
