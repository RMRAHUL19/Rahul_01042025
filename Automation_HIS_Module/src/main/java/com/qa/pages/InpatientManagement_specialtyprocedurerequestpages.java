package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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

import com.qa.util.util;

public class InpatientManagement_specialtyprocedurerequestpages {
  
    WebDriver driver;
	
	public InpatientManagement_specialtyprocedurerequestpages(WebDriver driver){
		
		this.driver= driver;
		
	}
	util utillobj=new util();
 
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Specialty Procedure Request')]")
	@CacheLookup
	WebElement SpecialtyProcedureRequest;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_imgSearchBedNo']")
	@CacheLookup
	WebElement SearchBed;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_ddlCriteria")
	@CacheLookup
	WebElement DropDown;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")
	@CacheLookup
	WebElement Bednametxtbox;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']")
	@CacheLookup
	WebElement Searchbtn;
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch")
	@CacheLookup
	WebElement AdmissionSearchbtn;
	
	
	@FindBy(how= How.CSS, using="#ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobtnselect;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_btnSelect']")
	@CacheLookup
	WebElement Selectbtn;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_txtOrderDatetime")
	@CacheLookup
	WebElement DateSelect;
	@FindBy(how= How.ID, using="ctl00_cphpage_txtOrderDatetime")
	@CacheLookup
	WebElement DateSelect2;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00$cphpage$hisTimeSelect_txtHour']")
	@CacheLookup
	WebElement Hour;
	@FindBy(how= How.XPATH, using="//input[@id='ctl00$cphpage$hisTimeSelect_txtHour']")
	@CacheLookup
	WebElement Hour2;
	
	@FindBy(how= How.CSS, using="#ctl00_cphpage_gdvProcedureResult_ctl02_imgSearchProcedure")
	@CacheLookup
	WebElement SearchProcedureicon;
	@FindBy(how= How.CSS, using="#ctl00_cphpage_gdvProcedureResult_ctl02_imgSearchProcedure")
	@CacheLookup
	WebElement SearchProcedureicon2;
	
	@FindBy(how= How.XPATH, using="//select[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria']")
	@CacheLookup
	WebElement Dropdown2;
	@FindBy(how= How.XPATH, using="//select[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria']")
	@CacheLookup
	WebElement Dropdown3;
	
	
	@FindBy(how= How.CSS, using="#ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria")
	@CacheLookup
	WebElement ProcedureNametxtbox;
	@FindBy(how= How.CSS, using="#ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria")
	@CacheLookup
	WebElement ProcedureNametxtbox2;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']")
	@CacheLookup
	WebElement Searchbtn1;
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']")
	@CacheLookup
	WebElement Searchbtn2;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobtnselect1;
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobtnselect2;
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobtnselect3;

	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_btnSelect']")
	@CacheLookup
	WebElement Select1;
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
	@CacheLookup
	WebElement Select2;
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
	@CacheLookup
	WebElement Select3;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_btnSave']")
	@CacheLookup
	WebElement Save;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnMainClear")
	@CacheLookup
	WebElement clear;
	@FindBy(how= How.ID, using="ctl00_cphpage_imgSearchAdmissionNo")
	@CacheLookup
	WebElement AdmissionNO;
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria")
	@CacheLookup
	WebElement UHIDTxtBox;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_MyMessageBoxInfo_ButtonOK")
	@CacheLookup
	WebElement SuccessMessageOkButton;
	
	
	
	public void specialtyprocedurewordpress(String Procedure_Name) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(SpecialtyProcedureRequest).click().build().perform();
		Thread.sleep(3000);
		
		//selecting the bed from search
		SearchBed.click();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(Bednametxtbox));
		Bednametxtbox.sendKeys("female med bed 002");//female med bed 002 
		Thread.sleep(1000);
		
		Searchbtn.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(Radiobtnselect));
		Radiobtnselect.click();
		Thread.sleep(1000);
		
		Selectbtn.click();
		Thread.sleep(3000);
		
		//Selecting the date of surgery	
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		//Getting current date
		Calendar cal = Calendar.getInstance();
		//Displaying current date in the desired format
		System.out.println("Current Date: "+sdf.format(cal.getTime()));
				   
		//Number of Days to add
	    cal.add(Calendar.DAY_OF_MONTH, 1);  
		//Date after adding the days to the current date
		String newDate = sdf.format(cal.getTime());  
	    //Displaying the new Date after addition of Days to current date
		System.out.println("Date after Addition: "+newDate);  
		
		DateSelect.clear();
		Thread.sleep(1000);
		DateSelect.click();
		Thread.sleep(1000);
		DateSelect.sendKeys(newDate);
		Thread.sleep(1000);
		Hour.click();
		
				
		SearchProcedureicon.click();
		Thread.sleep(1000);
		
		//Select select1= new Select(Dropdown2);
		//select1.selectByVisibleText("Contains");
		
		
		wait.until(ExpectedConditions.visibilityOf(ProcedureNametxtbox));
		ProcedureNametxtbox.sendKeys(Procedure_Name);
		Thread.sleep(1000);
		
		Searchbtn1.click();
		wait.until(ExpectedConditions.visibilityOf(Radiobtnselect1));
		Radiobtnselect1.click();
		Thread.sleep(1000);
		
		Select1.click();
		wait.until(ExpectedConditions.invisibilityOf(Select1));
		Thread.sleep(3000);
		utillobj.JSClick(Save, driver);
	
		wait.until(ExpectedConditions.visibilityOf(SuccessMessageOkButton));
		SuccessMessageOkButton.click();
		
	}
}
//clear.click();//clear the data
//Thread.sleep(4000);
//SearchBed.click();
//Thread.sleep(1000);
//Bednametxtbox.sendKeys("FEMALE BEDK MED 03");
//Thread.sleep(1000);
//Searchbtn.click();
//Thread.sleep(7000);
//
//Radiobtnselect.click();
//Thread.sleep(1000);
//
//Selectbtn.click();
//Thread.sleep(3000);
//Thread.sleep(1000);
//DateSelect2.clear();
//Thread.sleep(1000);
//DateSelect2.click();
//Thread.sleep(1000);
//DateSelect2.sendKeys(newDate);
//Thread.sleep(4000);
//Hour2.click();
//Thread.sleep(4000);
//
//SearchProcedureicon2.click();
//Thread.sleep(4000);
//
////Select select1= new Select(Dropdown2);
////select1.selectByVisibleText("Contains");DUMM.0000013178
//Dropdown3.sendKeys("Contains");
//Thread.sleep(1000);
//
//ProcedureNametxtbox2.sendKeys(Procedure_Name);
//Thread.sleep(1000);
//
//Searchbtn2.click();
//Thread.sleep(4000);
//
//Radiobtnselect3.click();
//Thread.sleep(1000);
//
//Select3.click();
//Thread.sleep(2000);
//utillobj.JSClick(Save, driver);
////Save.click();