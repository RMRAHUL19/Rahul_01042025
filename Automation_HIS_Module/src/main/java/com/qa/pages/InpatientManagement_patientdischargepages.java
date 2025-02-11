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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class InpatientManagement_patientdischargepages {
      
	
WebDriver driver;
	
	public InpatientManagement_patientdischargepages(WebDriver driver){
		
		this.driver= driver;
		
	}
 
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.LINK_TEXT, using="Patient Discharge")
	@CacheLookup
	WebElement PatientDischarge;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ImgBtnAdmin")
	@CacheLookup
	WebElement Admissionnosearchicon;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")
	@CacheLookup
	WebElement Admissionnotxtbox;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSearch")
	@CacheLookup
	WebElement Search;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobtn;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
	@CacheLookup
	WebElement Select;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ddlRequestType")
	@CacheLookup
	WebElement Requesttype;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_txtRemarks")
	@CacheLookup
	WebElement Remarks;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_btnSave")
	@CacheLookup
	WebElement Save;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnView")
	@CacheLookup
	WebElement view;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnClear")
	@CacheLookup
	WebElement clear;
	
	
	
	public void patientdischargewordpress(String Admission_No) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(PatientDischarge).click().build().perform();
		Thread.sleep(3000);
		
		Admissionnosearchicon.click();
		Thread.sleep(3000);
		
		Admissionnotxtbox.sendKeys(Admission_No);
		Thread.sleep(1000);
		
		Search.click();
		Thread.sleep(3000);
		
		//Not able to fetch the data write the code, later on for radio btn select
		Radiobtn.click();
		Thread.sleep(1000);
		
		Select.click();
		Thread.sleep(6000);
		
		Select select= new Select(Requesttype);
		select.selectByVisibleText("Normal Discharge");
		Thread.sleep(1000);
		
		Remarks.sendKeys("test remark");
		Thread.sleep(1000);
		view.click();
		clear.click();
//		Save.click();
		Thread.sleep(3000);
		
//	    Robot robot= new Robot();
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    Thread.sleep(1000);
		
	}
		
}
