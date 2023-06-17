//package KhanAcademy;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Codeadd {
//	
//	//Step 1 : Declaration of variable globally (data members)
//	
//	
//		@FindBy(xpath="//input[@maxlength='8']")
//		private WebElement addcode;
//		
//		@FindBy(xpath="(//button[@role='button'])")
//		private WebElement continues;
//				
//		//Step 2 : Initialization of Global Variable (data member)
//		
//		public Codeadd(WebDriver driver) { 
//			PageFactory.initElements(driver,this);
//		}
//		
//		//Step 3 : Method creation
//		
//		
//		public void Addcode() {
//			addcode.sendKeys("TU78hso9");
//		}
//		
//		public void Continues() {
//			continues.click();
//		}
//	}
