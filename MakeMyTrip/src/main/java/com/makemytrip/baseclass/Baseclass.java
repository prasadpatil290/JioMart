package com.makemytrip.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	// Base class consist of Mandatory code that run every time like open browser
	// Use extends keyword to inherited Base class
	// Declared Globally
	public WebDriver driver;
	public static Properties p;

	public void initializeBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getDataFromPropertyFile("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static String getDataFromPropertyFile(String url) throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\ramko\\eclipse-workspace\\SRC\\MakeMyTrip\\Configuration\\config.properties");

		p = new Properties();
		p.load(file);

		String value = p.getProperty(url);
		return value;
	}
}
