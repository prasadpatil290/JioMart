package Byju;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Regit {

	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement name;

	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mob;

	@FindBy(xpath = "//button[@class='btn']")
	private WebElement validate;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement mail;

	@FindBy(xpath = "//select[@name='state']")
	private WebElement enterstate;

	@FindBy(xpath = "//button[@type='submit'][1]")
	private WebElement submit;

//	@FindBy(xpath = "//select[@name='grade']")
//	private WebElement selectgrade;
//
//	@FindBy(xpath = "//label[@for='trial-grade-0']")
//	private WebElement rdioBtn;
//
//	@FindBy(xpath = "//label[@for='trial-topic-card-2548318-0']")
//	private WebElement chosTpic;
//
//	@FindBy(xpath = "(//label[@for='trial-slot-card-7658597'])")
//	private WebElement timslt;
//
//	@FindBy(xpath = "//button[@data-text='Book Now']")
//	private WebElement confirm;

	// Step 2 : Initialization of Global Variable (data member)

	public Regit(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait = new WebDriverWait(driver, (30));
	}

	// Step 3 : Method creation

	public void childname() {
		name.sendKeys("kothale");
	}

	public void entermob() {
		mob.sendKeys("9970282314");
	}

	public void validatemob() {
		validate.click();
	}

	public void email() {
		mail.sendKeys("yesrk786@gmail.com");
	}

	public void state() {
		Select sc = new Select(enterstate);
		sc.selectByValue("Maharashtra");
	}

	public void submitf() {
		submit.click();
	}

//	public void grade() {
//		Select grd = new Select(selectgrade);
//		grd.selectByVisibleText("GATE");
//	}

//	public void radiobtn() {
//		if (rdioBtn.isEnabled()) {
//			System.out.println(rdioBtn.getText());
//		}
//		wait.until(ExpectedConditions.elementToBeClickable(rdioBtn));
//		rdioBtn.click();
//	}
//
//	public void chosstopic() {
//		if (chosTpic.isDisplayed()) {
//			System.out.println("Your Topic is =" + chosTpic.getText());
//		}
//		wait.until(ExpectedConditions.elementToBeClickable(chosTpic));
//		chosTpic.click();
//	}
//
//	public void timslot() {
//		if (timslt.isDisplayed()) {
//			System.out.println("Your Time Slot is " + timslt.getText());
//		}
//		wait.until(ExpectedConditions.elementToBeClickable(timslt));
//		timslt.click();
//	}
//
//	public void Bokcls() {
//		boolean result = confirm.isEnabled();
//		if (result == true) {
//			System.out.println("its persent on screen");
//		} else {
//			System.out.println("its not persent on screen");
//		}
//		wait.until(ExpectedConditions.elementToBeClickable(confirm));
//		confirm.click();
//	}
}
