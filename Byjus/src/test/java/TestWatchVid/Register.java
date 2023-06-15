package TestWatchVid;

import java.time.Duration;

//HOW TO GENRATE Log4j

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Byju.BookCls;
import Byju.Regit;

public class Register {

	WebDriver driver;
	Regit Reg;
	SoftAssert assertt;
	WebDriverWait wait;
	BookCls bokcls;

	// For Log4j
	Logger logger = LogManager.getLogger(Register.class); // Log4j

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.out.println("before class is running");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		logger.info("Chrome Browser opened");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN-Brand-BYJU%27S-USD-Exact&utm_term=byjus&gclid=Cj0KCQjwy5maBhDdARIsAMxrkw30p2qYMoe8xOHblLDi_uHpY-rPiZwNcjD2aSjj0kksaMtQvK4RH9EaAthoEALw_wcB");

		logger.info("Expected site opened");
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {

		System.out.println("before method is running");
		Thread.sleep(3000);
		Reg = new Regit(driver);
		bokcls = new BookCls(driver);
		logger.info("Entering info in Byjus Class Schedule form");

		Reg.childname();
		Thread.sleep(2000);
		Reg.entermob();
		Thread.sleep(1000);
		Reg.email();
		Thread.sleep(1000);
		Reg.state();
		Thread.sleep(1000);
		Reg.validatemob();
		Thread.sleep(10000);
		logger.info("Mobile Number validated");
		Thread.sleep(5000);
		bokcls.radiobtn();
		Thread.sleep(1000);
		Reg.submitf();
		logger.info("Byjus Form Submitted successfully");
		Thread.sleep(1000);
		bokcls.chosstopic();
		Thread.sleep(1000);
		bokcls.timslot();
		Thread.sleep(1000);
		bokcls.Bokcls();
		Thread.sleep(2000);

	}
	@Test(priority = 1)
	public void byju() {
		System.out.println("test method 1 is running");
		Reg.submitf();
		String title = driver.getTitle(); // Actual
		System.out.println(title);
		assertt = new SoftAssert();
		assertt.assertEquals(title, "Register a Free Demo Class - BYJU'S Classes");
		assertt.assertAll();
	}
	@Test(priority = 2)
	public void byju1() {
		System.out.println("test method 2 is running");
		bokcls.radiobtn();
		String url = driver.getCurrentUrl(); // Actual
		System.out.println(url);
		assertt = new SoftAssert();
		assertt.assertTrue(true, url);
		assertt.assertAll();

	}

	@AfterMethod
	public void afterMethod() {

	}

	@AfterClass
	public void afterclass() {
		// driver.close();
	}
}
