package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiSelectable {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			   
		driver.get("https://www.facebook.com/r.php");
		
		Thread.sleep(300);
	
		WebElement year= driver.findElement(By.xpath("(//select[@name='birthday_year'])"));
		
		Select ele = new Select(year);
		
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
