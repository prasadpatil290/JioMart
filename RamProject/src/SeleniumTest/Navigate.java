package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
		
	 public static void main(String[] args) throws InterruptedException{
			
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/American-Tourister-AMT-SCH-03/dp/B07CGSJNML/ref=zg-bs_luggage_sccl_1/257-9646937-6096041?pd_rd_w=1qcCT&content-id=amzn1.sym.56cde3ad-3235-46d2-8a20-4773248e8b83&pf_rd_p=56cde3ad-3235-46d2-8a20-4773248e8b83&pf_rd_r=P3TN6TCH12MHMBEPNV07&pd_rd_wg=R2Jch&pd_rd_r=85995de5-3ab1-40d5-9ccf-ebdd131f07e3&pd_rd_i=B07CGSJNML&psc=1");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		
		driver.close();
	}
}
