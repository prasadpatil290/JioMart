package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectYear {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			   
		driver.get("https://www.facebook.com/r.php");
		
		Thread.sleep(300);
		
		
		//I want to print year

		WebElement year= driver.findElement(By.xpath("(//select[@name='birthday_year'])"));
		
		Select ele = new Select(year);
		
		List<WebElement> options = ele.getOptions();
		System.out.println(options);
		
		int size = options.size();  //It will give only size like no. of elements present
		System.out.println("size of year is=" + size);
		
		System.out.println();
		
		for(int i=0; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		
		
		//I want to print day

		WebElement day= driver.findElement(By.xpath("(//select[@name='birthday_day'])"));
				
		Select ele1 = new Select(day);
		
		List<WebElement> options1 = ele1.getOptions();
		System.out.println(options1);
		
		int Size = options1.size();  //It will give only size like no. of elements present
		System.out.println("size of day is=" + Size);
		System.out.println();
		
		for(int j=0; j<options1.size()-1; j++) {
			System.out.println(options1.get(j).getText());
		}
		
		//I want to print month
		WebElement month= driver.findElement(By.xpath("(//select[@name='birthday_month'])"));
		
		Select ele2 = new Select(month);
		
		List<WebElement> options2 = ele2.getOptions();
		System.out.println(options2);
		
		int Size2 = options2.size();  //It will give only size like no. of elements present
		System.out.println("size of month is=" + Size2);
		System.out.println();
		
		for(int k=0; k<options2.size(); k++) {
			System.out.println(options2.get(k).getText());
		}
	}                                             
}




