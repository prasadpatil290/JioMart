//package TestingKhsn;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Aamzon.Login;
//import KhanAcademy.Teachers;
//
//public class Testingkhan1 {
//	
//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();       
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.khanacademy.org/login");
//		driver.manage().window().maximize();
//		
//		Login auth = new Login(driver);
//		
//		auth.login();
//		
//		auth.enterusername();
//		auth.enterpassword();
//		auth.loginbutton();
//		
//		Teachers te = new Teachers(driver);
//		te.teach();
//        te.Enterclasscode();
// 
//		
//	}
//
//}
