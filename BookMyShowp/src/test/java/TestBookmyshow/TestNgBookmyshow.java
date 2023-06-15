package TestBookmyshow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Bookmyshowp.Location;
import Bookmyshowp.Searchmovie;
import Bookmyshowp.Signin;

public class TestNgBookmyshow {
	
	WebDriver driver;
	Location Loca;
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class is running");
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();       
	   
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/explore/home/"); 
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("before method is running");	
		
		Location Lo = new Location(driver);
		Lo.location();
		Lo.clickloc();
		
		Searchmovie ser = new Searchmovie(driver);
		ser.location();
		ser.clickser();
		
		
//		Signin S = new Signin(driver);
//		S.sign();
//		S.signindata();
//		S.continues();
		
	}
	
	@Test
	public void test() {
		System.out.println("test method is running");
		
		Loca = new Location(driver);
		Loca.location();
		
		String url = driver.getCurrentUrl(); // Actual
		if(url.equals("https://in.bookmyshow.com/explore/home/ambajogai")) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test Case is failed");
		}
	}

	@AfterMethod
	public void afterMethod() {
//		Logout log = new Logout(driver);
//		log.Prof();
//		log.Log();			
	}
	
	@AfterClass
	public void afterclass() {
		driver.close();
	}
}
