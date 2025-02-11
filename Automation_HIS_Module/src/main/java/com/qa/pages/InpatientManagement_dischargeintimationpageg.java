package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class InpatientManagement_dischargeintimationpageg {
    
	
WebDriver driver;
	
	public InpatientManagement_dischargeintimationpageg(WebDriver driver){
		
		this.driver= driver;
		
	}
 
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.LINK_TEXT, using="Discharge Intimations")
	@CacheLookup
	WebElement DischargeIntimation;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_gdvDischargeIntimationWorkList_ctl02_lblOrderNo")
	@CacheLookup
	WebElement Orderno;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_txtRemarks")
	@CacheLookup
	WebElement Remarks;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_btnSave")
	@CacheLookup
	WebElement Save;
	
	
	public void dischargeintimationwordpress() throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(2000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(DischargeIntimation).click().build().perform();
		Thread.sleep(3000);
		
		Actions action2= new Actions(driver);
		action2.moveToElement(Orderno).click().build().perform();
		Thread.sleep(3000);
		
		Remarks.sendKeys("Patient Discharge");
	    Thread.sleep(4000);
		
		//Save.click();
		Thread.sleep(3000);
		
		
	    Robot robot= new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
		
	}
		
}

