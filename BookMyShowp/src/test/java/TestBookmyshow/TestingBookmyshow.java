package TestBookmyshow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Bookmyshowp.Location;

public class TestingBookmyshow {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       		

		driver.get("https://in.bookmyshow.com/explore/home/"); 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		Location Loc = new Location(driver);
		Loc.location();
		Loc.clickloc();
		
		Thread.sleep(10);
		
//		Signin S = new Signin(driver);
//		S.sign();
//		Thread.sleep(10);
//		S.signindata();
//		S.continues();
//		
//		SearchMovie sm = new SearchMovie(driver);
//		sm.location();
//		sm.clickser();
	}
}
