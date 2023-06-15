package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {
		
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
		   
		driver.get("https://skpatro.github.io/demo/links/"); //I am on main page
		
		driver.manage().window().maximize();
	}
}

	
	
		

