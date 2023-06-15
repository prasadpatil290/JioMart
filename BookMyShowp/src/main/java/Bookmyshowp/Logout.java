package Bookmyshowp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
		
		@FindBy(xpath="(//div[@class='sc-gmeYpB jVkKUA'])[2]")
		private WebElement clkprofile;
		
		@FindBy(xpath="//button[@class='sc-kAzzGY sc-kXeGPI hmFgNi']")
		private WebElement logout;
		

		//Step 2 - Initialization of Variables
		
		public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		
		//Step 3 -Method Creation
		
		public void Prof() {
			clkprofile.click();
		}
		
		
		public void Log() {
			logout.click();
		}
	}

