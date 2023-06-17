package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teachers {
	
	//To declare gloabal variable
	@FindBy(xpath="//span[text()='Teachers']")
	private WebElement teacher;
	
	@FindBy (xpath="//a[@role='button']")
	private WebElement enterClassCode;
	
	@FindBy (xpath="//span[text()='Profile']")
	private WebElement profile;
	
	//Initialization of variable
	public Teachers(WebDriver driver) { 
		PageFactory.initElements(driver,this);
	}
	
	//Method creation
	public void teach() {
		teacher.click();	
	}
	public void EnterclassCode() {
		enterClassCode.click();
	}
	public void Profile() {
		profile.click();
	}
}

	


