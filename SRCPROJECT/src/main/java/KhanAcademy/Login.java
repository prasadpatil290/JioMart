package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	//Step 1 : Declaration of variable globally (data members)
	
	@FindBy(xpath="//a[@id='login-or-signup']")
	private WebElement loginlink;
	
	@FindBy(xpath="(//input[@id='uid-login-form-0-wb-id-identifier-field'][1])")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	//Step 2 : Initialization of Global Variable (data member)
	
	public Login(WebDriver driver) { 
		PageFactory.initElements(driver,this);
	}
	
	//Step 3 : Method creation
	
	public void login() {
		loginlink.click();
	}
	
	public void enterusername() {
		username.sendKeys("yesrk786@gmail.com");
	}
	
	public void enterpassword() {
		password.sendKeys("Learn@1234");
	}
	
	public void loginbutton() {
		loginButton.click();
	}
}
