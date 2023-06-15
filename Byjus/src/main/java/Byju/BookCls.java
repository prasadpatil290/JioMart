package Byju;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookCls {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = "//label[@for='trial-grade-0']")
	private WebElement rdioBtn;

	@FindBy(xpath = "//label[@for='trial-topic-card-2548318-0']")
	private WebElement chosTpic;

	@FindBy(xpath = "(//label[@for='trial-slot-card-7658597'])")
	private WebElement timslt;

	@FindBy(xpath = "//button[@data-text='Book Now']")
	private WebElement confirm;
	
	public BookCls(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		wait = new WebDriverWait(driver,(30));
		
	}
	
	public void radiobtn() {
		if (rdioBtn.isEnabled()) {
			System.out.println(rdioBtn.getText());
		}
		wait.until(ExpectedConditions.elementToBeClickable(rdioBtn));
		rdioBtn.click();
	}

	public void chosstopic() {
		if (chosTpic.isDisplayed()) {
			System.out.println("Your Topic is =" + chosTpic.getText());
		}
		wait.until(ExpectedConditions.elementToBeClickable(chosTpic));
		chosTpic.click();
	}
	
	public void timslot() {
		if (timslt.isDisplayed()) {
			System.out.println("Your Time Slot is " + timslt.getText());
		}
		wait.until(ExpectedConditions.elementToBeClickable(timslt));
		timslt.click();
	}

	public void Bokcls() {
		boolean result = confirm.isEnabled();
		if (result == true) {
			System.out.println("its persent on screen");
		} else {
			System.out.println("its not persent on screen");
		}
		wait.until(ExpectedConditions.elementToBeClickable(confirm));
		confirm.click();
	}

}
