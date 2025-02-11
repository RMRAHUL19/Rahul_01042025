package com.qa.pages;

import static org.testng.Assert.assertEquals;

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
import org.testng.Assert;

import com.qa.util.util;


public class InpatientManagement_alotbedpages {
	
	WebDriver driver;
	
	public InpatientManagement_alotbedpages(WebDriver driver){
		
		this.driver= driver;
		
	}
	util utilobj = new util();
 
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	                              
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Allot Bed')]")
	@CacheLookup
	WebElement AlottBed;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_cphpage_txtFromDate']")
	@CacheLookup
	WebElement FromDate;
	
	
	@FindBy(how=How.XPATH, using="//div[@id='ctl00_cphpage_calExfromDate_day_1_5']")
	@CacheLookup
	WebElement FromDateSelect;
	
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_cphpage_txtToDate']")
	@CacheLookup
	WebElement ToDate;
	
	@FindBy(how=How.XPATH, using="//div[@id='ctl00_cphpage_calExToDate_day_1_5']")
	@CacheLookup
	WebElement ToDateSelect;

	
	@FindBy(how=How.XPATH, using="//input[@id='popup_ok']")
	@CacheLookup
	WebElement OK;
	
	@FindBy(how=How.ID, using="popup_message")
	@CacheLookup
	WebElement Popup;
	
	@FindBy(how=How.CSS, using="#ctl00_cphpage_btnOk")
	@CacheLookup
	WebElement OKbutton;
	
	
	@FindBy(how=How.ID, using="ctl00_cphpage_gdvSearchResult_ctl02_lnkbtnAdmissionNo")
	@CacheLookup
	WebElement AdmissionNo;
	
	@FindBy(how=How.ID, using="ctl00_cphpage_ddlBedName")
	@CacheLookup
	WebElement BedName ;
	
	
	
	@FindBy(how=How.ID, using="#ctl00_cphpage_btnSave")
	@CacheLookup
	WebElement Save ;
	@FindBy(how=How.ID, using="ctl00_cphpage_btnBack")
	@CacheLookup
	WebElement Back ;
	@FindBy(how=How.ID, using="ctl00_cphpage_btnClear")
	@CacheLookup
	WebElement Clear ;
	
	@FindBy(how=How.ID, using="ctl00_cphpage_txtFromDate")
	@CacheLookup
	WebElement FromDateTxtBOX ;
	@FindBy(how=How.ID, using="ctl00_cphpage_txtToDate")
	@CacheLookup
	WebElement ToDateTxtBox ;
	@FindBy(how=How.ID, using="ctl00_cphpage_btnOk")
	@CacheLookup
	WebElement OKButton ;
	@FindBy(how=How.ID, using="popup_ok")
	@CacheLookup
	WebElement WarningOKButton ;
	
	
	
	
	public void InpatientManagementmenuwordpress(String Bed_Name) throws InterruptedException, AWTException{
	 
	Actions action= new Actions(driver);
	action.moveToElement(InpatientManagement).build().perform();
	Thread.sleep(2000);
	
	Actions action1= new Actions(driver);
	action1.moveToElement(AlottBed).click().build().perform();
	Thread.sleep(2000);
	WarningOKButton.click();
	Thread.sleep(2000);
	Clear.click();
	Thread.sleep(2000);
	
	FromDateTxtBOX.sendKeys("01-Jun-2021");
	Thread.sleep(2000);
	ToDateTxtBox.sendKeys("30-Jun-2021");
	Thread.sleep(2000);
	OKbutton.click();
	Thread.sleep(2000);

	Thread.sleep(3000);
//	String typevalue= OK.getAttribute("type");
//	 if(typevalue.equalsIgnoreCase("button"))
//	 {
//    //  Assert.assertEquals(typevalue,"button");
//	//  {
//		 OK.click();
//		 driver.quit();
//		 
	//  }		
	  
//	 }
	
//	 else
	
	AdmissionNo.click();
	Thread.sleep(3000);
	
	//Selecting a bed from drop down
//	Select s=new Select(BedName);
//	s.selectByIndex(0);
   utilobj.selectDropdown(BedName, driver, "fbed15");
	Thread.sleep(2000);
	Back.click();
	//Save.click();
    Thread.sleep(2000);
	
    Robot robot= new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
	
  }
}
