package Bookmyshowp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {

	
	@FindBy(xpath=("//div[text()='Sign in']"))
	private WebElement signin;
	
	@FindBy(xpath=("//input[@id='mobileNo']"))
	private WebElement signindata;
	
	@FindBy(xpath=("//button[text()='Continue']"))
	private WebElement continu;

	
	public Signin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void sign() {
		signin.click();
	}
	
	public void signindata() {
		signindata.sendKeys("9146607948");
	}
	public void continues() {
		continu.click();
	}
}