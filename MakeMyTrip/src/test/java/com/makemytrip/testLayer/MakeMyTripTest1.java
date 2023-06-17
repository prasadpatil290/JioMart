package com.makemytrip.testLayer;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.makemytrip.baseclass.Baseclass;
import com.makemytrip.pagelayer.Homepage;

public class MakeMyTripTest1 extends Baseclass {

	WebDriver driver;
	Homepage Hp;

//	@BeforeTest
//	public void beforeClass() throws IOException {
//
//		System.out.println("before class is running");
//		initializeBrowser();
//		Hp = new Homepage(driver);
//	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException {
		System.out.println("before method is running");
//		driver.get("https://www.makemytrip.com/");
		initializeBrowser();
		Hp = new Homepage(driver);
		Thread.sleep(3000);
		Hp.ClsFme();
	}

	@Test
	public void MMTH() throws InterruptedException {
		System.out.println("test method is running");

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}

//	@AfterTest
//	public void afterclass() {
//		Hp=null;
//		driver=null;
//	}

}
