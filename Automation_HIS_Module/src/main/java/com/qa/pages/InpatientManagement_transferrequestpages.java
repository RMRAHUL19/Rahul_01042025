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

import com.qa.util.util;


public class InpatientManagement_transferrequestpages {
  
	
WebDriver driver;
	
	public InpatientManagement_transferrequestpages(WebDriver driver){
		
		this.driver= driver;
		
	}
 util utilobj=new util();
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Transfer Request')]")
	@CacheLookup
	WebElement TransferRequest;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ImgBtnAdmin")
	@CacheLookup
	WebElement AdmissionNoSearchIcon;
	
	
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
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ddlWardT")
	@CacheLookup
	WebElement WardSelect;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ddlRequestTypeT")
	@CacheLookup
	WebElement RequestType;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_txtRemarks")
	@CacheLookup
	WebElement Remarks;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_btnSave")
	@CacheLookup
	WebElement Save;
	@FindBy(how= How.ID, using="ctl00_cphpage_ddlBedTypeT")
	@CacheLookup
	WebElement BedTypeDDL;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnView")
	@CacheLookup
	WebElement View;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnBack")
	@CacheLookup
	WebElement Back;
	@FindBy(how= How.XPATH, using="/html/body/div[1]/form/div[4]/div[2]/div/div[1]/div/table/tbody/tr[2]/td[2]")
	@CacheLookup
	WebElement Request;
	@FindBy(how= How.ID, using="ctl00_cphpage_MyMessageBox_ButtonOK")
	@CacheLookup
	WebElement MymessageboxOK;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnClear")
	@CacheLookup
	WebElement Clear;
	@FindBy(how= How.ID, using="ctl00_cphpage_txtFrmDate")
	@CacheLookup
	WebElement FromDate;
	@FindBy(how= How.ID, using="ctl00_cphpage_txtToDate")
	@CacheLookup
	WebElement ToDate;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnOK")
	@CacheLookup
	WebElement BtnOK;
	
	
	
	
	
	
	
	public void transferrequestwordpress(String Admission_No) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(TransferRequest).click().build().perform();
		Thread.sleep(3000);
		
		AdmissionNoSearchIcon.click();
		Thread.sleep(3000);
		
		
		Admissionnotxtbox.sendKeys(Admission_No);
		Thread.sleep(1000);
		
		Search.click();
		Thread.sleep(6000);
		
		Radiobtn.click();
		Thread.sleep(1000);
		
		Select.click();
		Thread.sleep(4000);
		
		Select select=new Select(RequestType);
		select.selectByVisibleText("Transfer To New Bed");
		Thread.sleep(1000);
		
		Select select1= new Select(WardSelect);
		select1.selectByVisibleText("CASUALTY / EMERGENCY");
		Thread.sleep(1000);
		utilobj.selectDropdown(BedTypeDDL, driver, "COVID-19 IPD");
		Thread.sleep(1000);
		Remarks.sendKeys("Test");
		Thread.sleep(1000);
		View.click();
		Thread.sleep(1000);
		MymessageboxOK.click();
		Thread.sleep(1000);
		Clear.click();
		Thread.sleep(1000);
		FromDate.sendKeys("01-Jul-2021");
		Thread.sleep(1000);
		ToDate.sendKeys("30-Jul-2021");
		Thread.sleep(1000);
		BtnOK.click();
		Thread.sleep(1000);
		
		String parent3 = driver.getWindowHandle();
		Thread.sleep(1000);
		utilobj.Window(driver);
		Thread.sleep(1000);
		Request.click();
		Thread.sleep(1000);
		utilobj.ChildWindow(driver);
		
		Thread.sleep(1000);
		driver.switchTo().window(parent3);

		
		Thread.sleep(1000);
		Back.click();
		
		//Save.click();
		Thread.sleep(3000);
		
		
	    Robot robot= new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
		
	}
	
}
