package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//How to drag and drop
public class Dradndrop {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
		   
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement amt = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement place = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions a = new Actions(driver);
		
		//a.moveToElement(amt).clickAndHold().moveToElement(place).release().perform();
		
		a.dragAndDrop(amt, place).perform();
		
		WebElement amt1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement place1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		a.dragAndDrop(amt1, place1).perform();
		
		WebElement amt2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement place2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		a.dragAndDrop(amt2, place2).perform();
		
		WebElement amt3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement place3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		a.dragAndDrop(amt3, place3).perform();
	}

}
