package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithoutWaits {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		  //sleep for 5 seconds
        Thread.sleep(5000);

        //open gmail.com
        driver.get("https://www.gmail.com");

        //sleep for 5 seconds
        Thread.sleep(5000);

        //enter the user name in the Email field
       driver.findElement(By.id("Email")).sendKeys("username");

        //sleep for 5 seconds
        Thread.sleep(5000);

        //enter the password in the password field
       driver.findElement(By.id("Passwd")).sendKeys("password");

        //sleep for 5 seconds
        Thread.sleep(5000);

        //sends the enter to the password field
        //sendKeys always append the text present in the element
        //it never erases the text in the element
        driver.findElement(By.id("Passwd")).click();
	}

}
