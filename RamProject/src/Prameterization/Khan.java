package Prameterization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Not working site
public class Khan {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
		   
		driver.get("https://www.khanacademy.org/login"); 
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@class='_1azps1NaN'])[1]")).sendKeys("9146607948");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("((//input[@class='_1azps1NaN'])[2]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//span[@class='_54nh'][text()='Log Out']")).click();
		
		//driver.close();
	}	
}
