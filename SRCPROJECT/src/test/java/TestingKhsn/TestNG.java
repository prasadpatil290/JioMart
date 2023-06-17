package TestingKhsn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KhanAcademy.Login;
import KhanAcademy.Logout;
import KhanAcademy.Teachers;

public class TestNG {
	
	WebDriver driver;
	//Login login;
	Teachers teacher;

	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class is running");
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();       
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.khanacademy.org/login");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method is running");
		
		Login auth = new Login(driver);
		
		auth.login();
		
		auth.enterusername();
		auth.enterpassword();
		auth.loginbutton();
	}
	
	@Test
	public void teacher() {
		System.out.println("test method is running");
		
		teacher = new Teachers(driver);
		teacher.teach();
		
		String url = driver.getCurrentUrl(); // Actual
		
		boolean result=(url.equals("https://www.khanacademy.org/profile/me/teachers"));
		Assert.assertEquals(url, "https://www.khanacademy.org/profile/me/teacher");
		Assert.assertTrue(true, "url not valid");
		//Assert.assertTrue(true);
//		if(url.equals("https://www.khanacademy.org/profile/me/teachers")) {
//			System.out.println("Test case is passed");
//		}
//		else {
//			System.out.println("Test Case is failed");
	}
	@Test
	public void profile() {
		System.out.println("Test2 is running");
		
		teacher = new Teachers(driver);
		teacher.Profile();
		
		String url2 = driver.getCurrentUrl(); // Actual
		boolean result2=(url2.equals("https://www.khanacademy.org/profile/me/"));
		Assert.assertEquals(url2, "https://www.khanacademy.org/profile/me/");

//		if(url.equals("https://www.khanacademy.org/profile/me/")) {
//			System.out.println("Test case is passed");
//		}
//		else {
//			System.out.println("Test Case is failed");
	}
	@AfterMethod
	public void afterMethod() {
		Logout log = new Logout(driver);
		log.PRO();
		log.LT();			
	}
	@AfterClass
	public void afterclass() {
		driver.close();
	}
}


