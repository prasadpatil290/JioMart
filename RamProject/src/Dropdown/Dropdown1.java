package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//hANDLING A DROPDOWN
public class Dropdown1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");

		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver();         
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions a = new Actions(driver);
		a.moveToElement(login).perform();
		
		WebElement orders = driver.findElement(By.xpath("//div[text()='Orders']"));
		//a.contextClick(orders).perform();
		a.clickAndHold(orders).perform();
	}
}
