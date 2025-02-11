package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class StaffLoginPage {

	WebDriver driver;

	public StaffLoginPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.NAME, using = "ddlLocation")
	@CacheLookup
	WebElement userlocation;

	@FindBy(how = How.NAME, using = "ddlRole")
	@CacheLookup
	WebElement userRole;

	@FindBy(how = How.NAME, using = "btnSubmit")
	@CacheLookup
	WebElement submit;

	public void StaffLoginWordpress() throws InterruptedException, AWTException {
		
		
		
		Select userlocation1 = new Select(driver.findElement(By.name("ddlLocation")));
		userlocation1.selectByVisibleText("RO-Rajendra Place");
		//Thread.sleep(1000);

		Select userRole1 = new Select(userRole);
		userRole1.selectByVisibleText("Dealing Assistant (Registration)");
		//Thread.sleep(1000);

		submit.click();
		//Thread.sleep(2000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

	}
}
