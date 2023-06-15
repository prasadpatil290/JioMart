package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Methods of Webdriver
public class AllMethods {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		   
	driver.get("https://www.facebook.com/r.php");
	
	Thread.sleep(300);
	
	driver.navigate().refresh();
	
	String Url= driver.getCurrentUrl();
	System.out.println(Url);
	
	String title= driver.getTitle();
	System.out.println(title);
		
	Dimension d = new Dimension(800,800);
	driver.manage().window().setSize(d);
	
	driver.manage().window().maximize();
	
	Thread.sleep(500);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raj");
	
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Gajanan@gmail.com");
	
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Gajanan@gmail.com");
	
	//driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("cgyunv234d");
	
	driver.findElement(By.xpath("//input[contains(@data-type,'pa')]")).sendKeys("67gshbhd8");
	
	WebElement x = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select a = new Select(x);
	a.selectByIndex(22);       // index starts with 0 so index 22 = 23 date
	
	WebElement y = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select b = new Select(y);
	b.selectByVisibleText("Jul");        //select by Visible text
	
	WebElement z = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select c = new Select(z);
	c.selectByValue("1998");
	
	WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	male.click();
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
