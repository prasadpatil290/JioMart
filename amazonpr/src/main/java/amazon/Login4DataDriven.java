package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login4DataDriven {

	// Step 1 : Declaration of variable globally (data members)

	@FindBy(xpath = "//input[@type='email']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continu;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	// Step 2 : Initialization of Global Variable (data member)

	public Login4DataDriven(WebDriver driver) { 
				PageFactory.initElements(driver,this);
			}

	// Step 3 : Method creation

	public void enterusername(String UN) {
		username.sendKeys(UN);
	}

	public void continu() {
		continu.click();
	}

	public void enterpass(String pwd) {
		pass.sendKeys(pwd);
	}

	public void submit() {
		submit.click();
	}

}

// driver.findElement(By.xpath("//input
// [@type='email']")).sendKeys("9146607948");
//
// Thread.sleep(500);
//
// driver.findElement(By.xpath("//input[@id='continue']")).click();
//
// driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shop@9970");
//
// Thread.sleep(1000);
//
// driver.findElement(By.xpath("//input[@type='submit']")).click();
