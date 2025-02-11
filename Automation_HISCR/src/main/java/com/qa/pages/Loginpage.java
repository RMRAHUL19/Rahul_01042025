package com.qa.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.ReadDataFile;
import com.qa.util.util;

public class Loginpage extends BasePage {
	
	util utilobj = new util();
	ReadDataFile readdata = new ReadDataFile();
	private By username = By.id("IDToken1");
	private By password = By.id("IDToken2");
	private By loginbtn = By.xpath("//*[@id='wraper']/table/tbody/tr/td[2]/table[1]/tbody/tr[4]/td/table/tbody/tr/td[1]/div/input");
	//private By loginbtn = By.xpath("//*[@id='btnLogin']");
	
	
	public Loginpage(WebDriver driver) {
		super(driver);
	
	}

	
	public WebElement getUsername() {
		
		//String ui = readdata.readDataFile("LoginPage", 1, "uidd", "LoginPage");
		//String pw = readdata.readDataFile("LoginPageTest", 1, "pwdd", "doLoginTest");
		
		return getElement(username);
	}

	
	public WebElement getPassword() {
		
		
		return getElement(password);	}

	/**
	 * @return the loginbtn
	 */
	public WebElement getLoginbtn() {
		return getElement(loginbtn);	

	}

	public HomePage doLogin(String uid, String pwd) 
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginbtn));
		getUsername().sendKeys(uid);
		getPassword().sendKeys(pwd);
		
		utilobj.JSClick(getLoginbtn(), driver);
		
		//getLoginbtn().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Applications")));
		return new HomePage(driver);
		
	}
	
	
	
}
