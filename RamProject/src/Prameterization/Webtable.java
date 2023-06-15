package Prameterization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();       
			   
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			//driver.manage().window().maximize();
			
			List<WebElement> noofrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
			//Total no of rows present in table
			
			System.out.println("no of rows=" + noofrows.size());
			
			for(int i=1; i<noofrows.size(); i++) {
				List<WebElement> noofcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
				System.out.println(noofcells.size());
				
				for(int cell=0;cell<noofcells.size();cell++) {
					System.out.println(noofcells.get(cell).getText()+",");
				}
			System.out.println();
		}
	}
}

