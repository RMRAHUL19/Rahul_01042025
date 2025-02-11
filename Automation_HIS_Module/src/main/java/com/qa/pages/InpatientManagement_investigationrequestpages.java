package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qa.util.util;

public class InpatientManagement_investigationrequestpages {
  
WebDriver driver;
	
	public InpatientManagement_investigationrequestpages(WebDriver driver){
		
		this.driver= driver;
		
	}
 util utilobj=new util();
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Investigation Request')]")
	@CacheLookup
	WebElement InvestigationRequest;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_imgAdmissionNo")
	@CacheLookup
	WebElement Admissionnosearchicon;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_ddlCriteria")
	@CacheLookup
	WebElement DropDown;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl06_txtCriteria")
	@CacheLookup
	WebElement IPnotxtbox;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch")
	@CacheLookup
	WebElement Search;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobtn;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
	@CacheLookup
	WebElement Select;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_imgDoctor")
	@CacheLookup
	WebElement DoctorNamesearchicon;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_txtDoctorName")
	@CacheLookup
	WebElement DoctorNametxtbox;
	
	
	@FindBy(how= How.ID, using="btnSearch")
	@CacheLookup
	WebElement Searchbtn;
	
	@FindBy(how= How.ID, using="ChkSelect0")
	@CacheLookup
	WebElement Radiobtn1;
	
	@FindBy(how= How.ID, using="btnSelect")
	@CacheLookup
	WebElement Selectbtn;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ddlPriority")
	@CacheLookup
	WebElement DropDown1;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_gdvTestOrderItems_ctl02_imgTestProfile")
	@CacheLookup
	WebElement TestProfilesearchicon;
	
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria")
	@CacheLookup
	WebElement DropDown2;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria")
	@CacheLookup
	WebElement TestNametxtbox;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch")
	@CacheLookup
	WebElement Searchbtn1;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_chkTemp")
	@CacheLookup
	WebElement Checkbox;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
	@CacheLookup
	WebElement Selectbtn1;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_btnSave")
	@CacheLookup
	WebElement Save;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnAddPresc")
	@CacheLookup
	WebElement addpricription;
	@FindBy(how= How.ID, using="ctl00_cphpage_gdvPrescribedlist_ctl02_chkAdd")
	@CacheLookup
	WebElement addpricriptionCheckBox1;
	@FindBy(how= How.ID, using="ctl00_cphpage_gdvPrescribedlist_ctl03_chkAdd")
	@CacheLookup
	WebElement addpricriptionCheckBox2;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnSetPresc")
	@CacheLookup
	WebElement Set;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnClear")
	@CacheLookup
	WebElement Clear;
	
	
	
	public void investigationrequestwordpress(String Admission_No) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(InvestigationRequest).click().build().perform();
		Thread.sleep(3000);
		
		//Selecting admission no from admission no search icon
		Admissionnosearchicon.click();
		Thread.sleep(3000);
		
	
		
		
		IPnotxtbox.sendKeys(Admission_No);
		Thread.sleep(1000);
		
		Search.click();
		Thread.sleep(4000);
		
		Radiobtn.click();
		Thread.sleep(1000);
		
		Select.click();
		Thread.sleep(4000);
		
		
        
        //Selecting doctor name from doctor search icon
	//	DoctorNamesearchicon.click();
	//	Thread.sleep(4000);
		
	//	Robot robot= new Robot();
	//	robot.keyPress(KeyEvent.VK_TAB);
		
	//	DoctorNametxtbox.click();
	//	Thread.sleep(1000);
		
	/*	DoctorNametxtbox.sendKeys("test");
		Thread.sleep(1000);
		
		Searchbtn.click();
		Thread.sleep(3000);
		
		Radiobtn1.click();
		Thread.sleep(1000);
		
		Selectbtn.click();
		Thread.sleep(2000); */
		
		//Selecting the priority from drop down
		Select select= new Select(DropDown1);
		select.selectByVisibleText("Routine");
		Thread.sleep(1000);
		
		//Selecting the test name for the patient
		TestProfilesearchicon.click();
		Thread.sleep(2000);
		
		DropDown2.sendKeys("Contains");
		Thread.sleep(1000);
		
		TestNametxtbox.sendKeys("test");
		Thread.sleep(1000);
		
		Searchbtn1.click();
		Thread.sleep(4000);
		
		
		Checkbox.click();
		Thread.sleep(1000);
		
		Selectbtn1.click();
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('ctl00_cphpage_txtDoctorName').value='Dr. ESIC Test Doctor';");
        Thread.sleep(2000);
		//Clicking on save button
		Save.click();
		Thread.sleep(3000);
//		addpricription.click();
//		addpricriptionCheckBox1.click();
//		Thread.sleep(2000);
//		addpricriptionCheckBox2.click();
//		Thread.sleep(2000);
//		Set.click();
//		Thread.sleep(2000);
//		Clear.click();
//	    Robot robot= new Robot();
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    Thread.sleep(2000);
		
	}
		
}
	
	
	
	