package com.makemytrip.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.makemytrip.baseclass.Baseclass;

public class Homepage extends Baseclass {

	 WebDriver driver;
	 WebDriverWait wait;

	@FindBy(xpath = "//i[@class='wewidgeticon we_close']")
	private WebElement closeFrame;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait = new WebDriverWait(driver, (20));
	}

	public void ClsFme() {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
		closeFrame.click();
	}

}
