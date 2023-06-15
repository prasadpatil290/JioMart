package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectable2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			   
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
		
		Thread.sleep(300);
		
		driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("ramkothale7@gmail.com");
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
		//--------NOT COMPLETED-----------//             
		WebElement Checkbox = driver.findElement(By.xpath("(span[@class='T-Jo J-J5-Ji T-Jo-auq'])"));
		
		Select ele = new Select(Checkbox);
		
		//Multiselectable is that element is selecting multiple checkbox
		
		
		boolean result = ele.isMultiple();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("Listbox is multiselectable");
		}
		else {
			System.out.println("Listbox is not multiselectable");
		}
	}
}
