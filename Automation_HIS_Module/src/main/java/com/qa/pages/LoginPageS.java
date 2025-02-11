package com.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPageS {

	WebDriver driver;

	public LoginPageS(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "IDToken1")
	@CacheLookup
	WebElement username;

	@FindBy(how = How.ID, using = "IDToken2")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.NAME, using = "Login.Submit")
	@CacheLookup
	WebElement login;

	@FindBy(how = How.LINK_TEXT, using = "Applications")
	@CacheLookup
	WebElement Applications;

	@FindBy(how = How.LINK_TEXT, using = "Insurance")
	@CacheLookup
	WebElement Insurance;

	public void verifyHomepage(String username1, String password1) throws InterruptedException {
		username.sendKeys(username1);
		Thread.sleep(1000);
		password.sendKeys(password1);
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
        
//selecting the domain of Insurance from Applications drop down
		Actions action = new Actions(driver);
		action.moveToElement(Applications).build().perform();;
		
		//Thread.sleep(2000);

		Actions action1 = new Actions(driver);
		action1.moveToElement(Insurance).click().build().perform();
		
		Select userlocation1 = new Select(driver.findElement(By.id("ddlLocation")));
		userlocation1.selectByVisibleText("RO-Rajendra Place");
		
		
		Select userRole1 = new Select(driver.findElement(By.name("ddlRole")));
		userRole1.selectByVisibleText("Dealing Assistant (Registration)");
	//	Thread.sleep(2000);

	}

}
