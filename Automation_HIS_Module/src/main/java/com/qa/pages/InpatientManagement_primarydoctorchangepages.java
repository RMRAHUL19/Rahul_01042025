package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InpatientManagement_primarydoctorchangepages {
     
	
WebDriver driver;
	
	public InpatientManagement_primarydoctorchangepages(WebDriver driver){
		
		this.driver= driver;
		
	}
 
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Primary Doctor Change')]")
	@CacheLookup
	WebElement PrimaryDoctorChange;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_imgbtnPatientNo']")
	@CacheLookup
	WebElement Admissionnoicon;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_ddlCriteria")
	@CacheLookup
	WebElement Dropdown;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")
	@CacheLookup
	WebElement PatientNametxtbox;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSearch")
	@CacheLookup
	WebElement Search;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobtn;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
	@CacheLookup
	WebElement Select;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_gdvPrimaryDoctor_ctl03_txtPrimaryDoctor")
	@CacheLookup
	WebElement PrimaryDoctorNametxtbox;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_gdvPrimaryDoctor_ctl03_btnDoctor")
	@CacheLookup
	WebElement Primarydoctoricon;
	
	
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria")
	@CacheLookup
	WebElement Searchdoctorfirstname;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSearch")
	@CacheLookup
	WebElement Search1;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobtn1;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
	@CacheLookup
	WebElement Select1;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_btnSave")
	@CacheLookup
	WebElement Save;
	@FindBy(how= How.ID, using="ctl00_cphpage_MyMessageBox_ButtonOK")
	@CacheLookup
	WebElement MSGBtnOK;
	
	
	public void primarydoctorchangewordpress(String Doctor_Name) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(PrimaryDoctorChange).click().build().perform();
		Thread.sleep(2000);
		
		Admissionnoicon.click();
		
		
		Thread.sleep(2000);
		
		PatientNametxtbox.sendKeys("IP042200002");
		Thread.sleep(2000);
				
		Search.click();
		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(Radiobtn));
	
		Radiobtn.click();
		
		Thread.sleep(2000);
		Select.click();
		wait.until(ExpectedConditions.visibilityOf(Save));
	Save.click();
	wait.until(ExpectedConditions.visibilityOf(MSGBtnOK));
	MSGBtnOK.click();
	}
		
}


