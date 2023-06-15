package Bookmyshowp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchmovie {
	
	
		@FindBy(xpath=("//span[@class='sc-fcdeBU cNeUMt']"))
		private WebElement search;
	
		@FindBy(xpath="//input[@class='sc-cmIlrE kLLiBb']")
		private WebElement clicksearch;
		
		public Searchmovie(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		public void location() {
			search.click();
		}
		public void clickser() {
			clicksearch.click();
		}
		
//		To search
//				driver.findElement(By.xpath("//span[@class='sc-fcdeBU cNeUMt']")).click();
//				driver.findElement(By.xpath("//input[@class='sc-cmIlrE kLLiBb']")).click();

}
