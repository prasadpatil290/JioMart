package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       
		   
		driver.get("https://www.amazon.in/ap/signin?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dgw_sgn_ib%3F_encoding%3DUTF8%26pf_rd_p%3D5ec38633-5399-4fd2-91c1-bc3f1865a6a9%26pd_rd_wg%3D3VfOZ%26pf_rd_r%3DHA6Y7KBAQNNCFKGBAG1R%26content-id%3Damzn1.sym.5ec38633-5399-4fd2-91c1-bc3f1865a6a9%26pd_rd_w%3Dhag7i%26pd_rd_r%3D04a8c71d-fae3-4911-b566-9ebb487969eb&openid.assoc_handle=inflex&openid.pape.max_auth_age=0&pf_rd_r=HA6Y7KBAQNNCFKGBAG1R&pf_rd_p=5ec38633-5399-4fd2-91c1-bc3f1865a6a9&pd_rd_r=04a8c71d-fae3-4911-b566-9ebb487969eb&pd_rd_w=hag7i&pd_rd_wg=3VfOZ&ref_=pd_gw_unk"); 
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input [@type='email']")).sendKeys("9146607948");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shop@9970");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		Thread.sleep(1000);
		
		driver.get("https://www.amazon.in/American-Tourister-AMT-SCH-03/dp/B07CGSJNML/ref=zg-bs_luggage_sccl_1/257-9646937-6096041?pd_rd_w=1qcCT&content-id=amzn1.sym.56cde3ad-3235-46d2-8a20-4773248e8b83&pf_rd_p=56cde3ad-3235-46d2-8a20-4773248e8b83&pf_rd_r=P3TN6TCH12MHMBEPNV07&pd_rd_wg=R2Jch&pd_rd_r=85995de5-3ab1-40d5-9ccf-ebdd131f07e3&pd_rd_i=B07CGSJNML&psc=1");
		
		//driver.findElement(By.xpath("//span[@class='_54nh'][text()='Log Out']")).click();
		
		//driver.close();
		
	}
		

}

