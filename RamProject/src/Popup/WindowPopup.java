package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
		   
		driver.get("https://skpatro.github.io/demo/links/"); //I am on main page
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='New Tab']")).click(); 
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(ids);
		
		String child = al.get(1);    //To get address of child window or new popup
		
		driver.switchTo().window(child); //Focus is on child window
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(al.get(0));  //Now focus is on our main window
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click(); //Recheck whether we really on main page validate using any one element on webpage 

		driver.close();
	}
}
