package Testingamaz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazon.Login;


public class Testing1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
	   
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fie%3DUTF8%26tag%3Dgoogmantxtmob50-21%26ascsubtag%3D_k_CjwKCAjw8JKbBhBYEiwAs3sxN2BXdv8KcdTQTImP3k9yWguloUR0N1ZUpFaV8h7XAAPU9EQT0LqkiBoCijoQAvD_BwE_k_%26gclid%3DCjwKCAjw8JKbBhBYEiwAs3sxN2BXdv8KcdTQTImP3k9yWguloUR0N1ZUpFaV8h7XAAPU9EQT0LqkiBoCijoQAvD_BwE%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&"); 
		driver.manage().window().maximize();
		
		Login login = new Login(driver);
		login.enterusername();
		login.continu();
		
		Login signin = new Login(driver);
		signin.enterpass();
		
		Login submit = new Login(driver);
		submit.submit();
	}
}
