package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class MAPage9 extends BasePage {

	util utilobj = new util();

	public MAPage9(WebDriver driver) {
		super(driver);

	}
	private By btnNext=By.id("ctl00_cphpage_btnNext");
	public WebElement getbtnNext() {
		return getElement(btnNext);
	}
	private By btnYes1=By.id("ctl00_cphpage_btnYes1");
	public WebElement getbtnYes1() {
		return getElement(btnYes1);
	}
}