package HomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import HomePageBase.Dropdown1;

public class Dropdown1TestCrossB {
	WebDriver driver;
	Dropdown1 Dr;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;

	@Parameters("browser")

	@BeforeTest

	public void openBrowser(String browsername) {

		System.out.println(browsername);

		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);

		if (browsername.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		}

		if (browsername.equals("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver1.exe");
			driver = new FirefoxDriver();

		}
		
		driver.manage().window().maximize();
		driver.get("https://www.jiomart.com");
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {

		Dr = new Dropdown1(driver);
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {

		System.out.println("before method is running");
		Thread.sleep(3000);
		Dr.Grocerie();
		Dr.listt();
	}

	@Test
	public void DD1() {
		System.out.println("test method is running");
		String url = driver.getCurrentUrl(); // Actual
		System.out.println(url);
		Assert.assertEquals(url, "https://www.jiomart.com/");
		Assert.assertTrue(true, "url not valid");
	}

	@AfterMethod
	public void afterMethod() {

	}

	@AfterClass
	public void afterclass() {
		Dr = null;
		driver=null;
	}

	@AfterTest
	public void afterTest() {
		driver.close();
		System.gc();
	}
}
