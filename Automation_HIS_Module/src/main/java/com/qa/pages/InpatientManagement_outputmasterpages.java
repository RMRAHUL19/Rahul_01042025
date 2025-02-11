package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class InpatientManagement_outputmasterpages {
 
	
WebDriver driver;
	
	public InpatientManagement_outputmasterpages(WebDriver driver){
		
		this.driver= driver;
		
	}
 
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Output Master')]")
	@CacheLookup
	WebElement OutputMaster;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_txtName']")
	@CacheLookup
	WebElement OutputMastertxtbox;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_btnSave']")
	@CacheLookup
	WebElement Save;
	
	
	public void outputmasterwordpress(String outputitem_database) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(OutputMaster).click().build().perform();
		Thread.sleep(3000);
		
		OutputMastertxtbox.sendKeys(outputitem_database);
		Thread.sleep(2000);
		
		Save.click();
		Thread.sleep(2000);
		
		
	    Robot robot= new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
		
	}
		
}
