package Bookmyshowp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Location {
	
	@FindBy(xpath=("//span[@class='sc-bbkauy bLXDgz']"))
	private WebElement location;
	
	@FindBy(xpath="(//div[@class='sc-dznXNo hzBPnN'])[42]")
	private WebElement clickloc;
	
	
	public Location(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void location() {
		location.click();
	}
	
	public void clickloc() {
		clickloc.click();
	}
//	driver.findElement(By.xpath("//span[@class='sc-bbkauy bLXDgz']")).click();
//	driver.findElement(By.xpath("(//div[@class='sc-dznXNo hzBPnN'])[32]")).click();	
}