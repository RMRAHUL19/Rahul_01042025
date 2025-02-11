package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class InpatientManagement_intakemasterpages{
  
    WebDriver driver;
	
	public InpatientManagement_intakemasterpages(WebDriver driver){
		
		this.driver= driver;
		
	}
 
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Intake Master')]")
	@CacheLookup
	WebElement IntakeMaster;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_txtName']")
	@CacheLookup
	WebElement IntakeMastertxtbox;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_btnSave']")
	@CacheLookup
	WebElement Save;
	
	
	public void intakemasterwordpress(String intakeitem_database) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(IntakeMaster).click().build().perform();
		Thread.sleep(3000);
		
		IntakeMastertxtbox.sendKeys(intakeitem_database);
		Thread.sleep(2000);
		
		Save.click();
		Thread.sleep(2000);
		
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
			
	}
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

