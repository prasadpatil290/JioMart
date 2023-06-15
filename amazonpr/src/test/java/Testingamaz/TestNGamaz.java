package Testingamaz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazon.Login;



public class TestNGamaz {
	
	
	WebDriver driver;
	Login login1;	

	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fie%3DUTF8%26tag%3Dgoogmantxtmob50-21%26ascsubtag%3D_k_CjwKCAjw8JKbBhBYEiwAs3sxN2BXdv8KcdTQTImP3k9yWguloUR0N1ZUpFaV8h7XAAPU9EQT0LqkiBoCijoQAvD_BwE_k_%26gclid%3DCjwKCAjw8JKbBhBYEiwAs3sxN2BXdv8KcdTQTImP3k9yWguloUR0N1ZUpFaV8h7XAAPU9EQT0LqkiBoCijoQAvD_BwE%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&"); 
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method is running");
		
		Login L= new Login(driver);
		L.enterusername();
		L.continu();
		
		Login signin = new Login(driver);
		signin.enterpass();
		
		Login submit = new Login(driver);
		submit.submit();
	}
	
	@Test
	public void test() {
		System.out.println("test method is running");
		
		login1 = new Login(driver);
		login1.submit();
		
		String url = driver.getCurrentUrl(); // Actual
	
		boolean result=(url.equals("https://www.amazon.in/"));
		Assert.assertEquals(url,"https://www.amazon.in/");
		Assert.assertTrue(true);
		//Assert.fail();     if we want to fail test case intensionally
//		if(url.equals("https://www.amazon.in/")) {
//			System.out.println("Test case is passed");
//		}
//		else {
//			System.out.println("Test Case is failed");
//		}
	}
	@AfterMethod
	public void afterMethod() {
					
	}
	@AfterClass
	public void afterclass() {
		//driver.close();
	}
}
