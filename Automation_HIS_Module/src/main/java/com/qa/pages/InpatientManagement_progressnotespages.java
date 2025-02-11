package com.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.util;

public class InpatientManagement_progressnotespages {
  
	util utilobj=new util();
    WebDriver driver;
	
	public InpatientManagement_progressnotespages(WebDriver driver){
		
		this.driver= driver;
		
	}
 
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Progress Notes')]")
	@CacheLookup
	WebElement ProgressNotes;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_imgsearchadmissionno")
	@CacheLookup
	WebElement Admissionnosearchicon;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_ddlCriteria")
	@CacheLookup
	WebElement Dropdown1;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")
	@CacheLookup
	WebElement Admissionnotxtbox;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch")
	@CacheLookup
	WebElement Search;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobutton;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
	@CacheLookup
	WebElement Select;
	
	
	@FindBy(how= How.XPATH, using="//select[@id='ctl00_cphpage_ddlNotesType']")
	@CacheLookup
	WebElement NotesBy;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ImageButton1")
	@CacheLookup
	WebElement ObservationBySearchicon;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_txtObservationBy")
	@CacheLookup
	WebElement Doctornametxtbox;
	
	
	@FindBy(how= How.ID, using="btnSearch")
	@CacheLookup
	WebElement Searchbtn;
	
	
	@FindBy(how= How.ID, using="ChkSelect0")
	@CacheLookup
	WebElement Radiobtn;
	
	
	@FindBy(how= How.ID, using="btnSelect")
	@CacheLookup
	WebElement Selectbtn;
	
	
	@FindBy(how= How.XPATH, using="//textarea[@id='ctl00_cphpage_txtRemarks']")
	@CacheLookup
	WebElement Remarks;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_btnSave")
	@CacheLookup
	WebElement Save;
	
	@FindBy(how= How.ID, using="form1")
	@CacheLookup
	WebElement Form;
	@FindBy(how= How.ID, using="ctl00_cphpage_ddlBedName")
	@CacheLookup
	WebElement BedDll;
	@FindBy(how= How.XPATH, using="//html/body//div[1]//form//div[4]//div[2]//div[1]//div//div[1]//table//tbody//tr[1]//td[4]//select//option[@value='44602']")
	@CacheLookup
	WebElement BedDllvalue;
	
	@FindBy(how= How.ID, using="txtName")
	@CacheLookup
	WebElement ObserveByTextBox;
	@FindBy(how= How.ID, using="btnSearch")
	@CacheLookup
	WebElement ObserveBySearchButton;
	@FindBy(how= How.ID, using="ChkSelect0")
	@CacheLookup
	WebElement ObserveByRadioButton;
	@FindBy(how= How.ID, using="btnSelect")
	@CacheLookup
	WebElement ObserveBySelectButton;
	
	public void progressnoteswordpress(String Admission_No) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(ProgressNotes).click().build().perform();
		Thread.sleep(3000);
		
//		Admissionnosearchicon.click();
//		Thread.sleep(3000);
//		
//	
//		
//		Admissionnotxtbox.sendKeys(Admission_No);
//		Thread.sleep(1000);
//		
//		Search.click();
//		Thread.sleep(5000);
//		
//		Radiobutton.click();
//		Thread.sleep(2000);
//		
//		Select.click();
//		Thread.sleep(8000);
	
		Actions ac=new Actions(driver);
		ac.moveToElement(BedDll).click().moveToElement(BedDllvalue).click().build().perform();
		Thread.sleep(2000);
		
		//
		
		Thread.sleep(2000);
		NotesBy.sendKeys("Doctor");
		Thread.sleep(6000);
		
		  
				String parent4 = driver.getWindowHandle();

				utilobj.Window(driver);
				ObservationBySearchicon.click();
				Thread.sleep(2000);
				utilobj.ChildWindow(driver);
				Thread.sleep(2000);
				WebDriverWait wait=new WebDriverWait(driver, 300);
				wait.until(ExpectedConditions.visibilityOf(ObserveByTextBox));
				
						
				ObserveByTextBox.sendKeys("test");
				Thread.sleep(2000);
				ObserveBySearchButton.click();
				
				wait.until(ExpectedConditions.visibilityOf(ObserveByRadioButton));
				ObserveByRadioButton.click();
				Thread.sleep(2000);
				ObserveBySelectButton.click();
				Thread.sleep(4000);
				 driver.switchTo().window(parent4);
				 		 Thread.sleep(1000);
	       
		Remarks.sendKeys("test");
	
		
	    Save.click();
		Thread.sleep(4000);
		
		
	
		
	}
		
}
	


