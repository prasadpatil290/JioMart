package HomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import HomePageBase.Dropdown1;


public class Dropdown1Test {
		
		WebDriver driver;
		Dropdown1 Dr;
		static ExtentTest test;
		static ExtentHtmlReporter reporter;
		

		@BeforeClass
		public void beforeClass() {
			
			System.out.println("before class is running");
			
			reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
			ExtentReports extend = new ExtentReports();
			extend.attachReporter(reporter);
			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);       
			driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("before method is running");
			driver.get("https://www.jiomart.com");
		}
		
		@Test
		public void DD1() throws InterruptedException {
			System.out.println("test method is running");
			Dr = new Dropdown1(driver);
			Thread.sleep(2000);
			Dr.Grocerie();
			Dr.listt();
			String url = driver.getCurrentUrl(); // Actual
			System.out.println(url);
			Assert.assertEquals(url, "https://www.jiomart.com/");
			Assert.assertTrue(true,"url not valid");
		}
	
		@AfterMethod
		public void afterMethod() {
					
		}
		@AfterClass
		public void afterclass() {
			driver.close();
		}
}
