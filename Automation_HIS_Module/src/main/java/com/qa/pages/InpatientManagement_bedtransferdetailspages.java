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

public class InpatientManagement_bedtransferdetailspages {
  
	
WebDriver driver;
	
	public InpatientManagement_bedtransferdetailspages(WebDriver driver){
		
		this.driver= driver;
		
	}
 
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.LINK_TEXT, using="Bed Transfer Details")
	@CacheLookup
	WebElement BedTransferDetails;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ibtnAdmission")
	@CacheLookup
	WebElement Admissionnoicon;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")
	@CacheLookup
	WebElement Admissionnotxtbox;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSearch")
	@CacheLookup
	WebElement Search;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_btnSave']")
	@CacheLookup
	WebElement Save;
	
	
	
	
	public void BedTransferDetails(String Admission_No) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(BedTransferDetails).click().build().perform();
		Thread.sleep(3000);
		
		Admissionnoicon.click();
		Thread.sleep(3000);
		
		Admissionnotxtbox.click();
		Thread.sleep(1000);
		
		Admissionnotxtbox.sendKeys(Admission_No);
		Thread.sleep(1000);
		
		Search.click();
		Thread.sleep(4000);
		
//		Save.click();
//		Thread.sleep(2000);
//		
//		
//	    Robot robot= new Robot();
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    Thread.sleep(1000);
		
	}
		
}


