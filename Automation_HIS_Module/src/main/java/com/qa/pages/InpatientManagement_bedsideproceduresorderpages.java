package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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

import com.qa.util.util;

public class InpatientManagement_bedsideproceduresorderpages {
  
	    WebDriver driver;
		
		public InpatientManagement_bedsideproceduresorderpages(WebDriver driver){
			
			this.driver= driver;
			
		}
		util utillobj=new util();
	 
		
		@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
		@CacheLookup
		WebElement InpatientManagement;
		
		@FindBy(how= How.XPATH, using="//a[contains(text(),'Bedside Procedures Order')]")
		@CacheLookup
		WebElement BedsideProceduresOrder;
		
		
		@FindBy(how= How.ID, using="ctl00_cphpage_imgSearchAdmissionNo")
		@CacheLookup
		WebElement SearchAdmission;
		@FindBy(how= How.ID, using="ctl00_cphpage_imgSearchAdmissionNo")
		@CacheLookup
		WebElement SearchAdmission1;
		
		
		@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria")
		@CacheLookup
		WebElement DropDown;
		@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria")
		@CacheLookup
		WebElement DropDown2;
		
		
		@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria")
		@CacheLookup
		WebElement PatientNameIP;
		
		@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria")
		@CacheLookup
		WebElement PatientNameIP1;
		
		@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch")
		@CacheLookup
		WebElement SearchBtn;
		@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch")
		@CacheLookup
		WebElement SearchBtn1;
		
		
		@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
		@CacheLookup
		WebElement Radiobtnselect;
		@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
		@CacheLookup
		WebElement Radiobtnselect2;
		
		
		@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
		@CacheLookup
		WebElement Select;
		@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
		@CacheLookup
		WebElement Select2;
		
		
		@FindBy(how= How.ID, using="ctl00_cphpage_txtOrderDatetime")
		@CacheLookup
		WebElement Dateselect;
		@FindBy(how= How.ID, using="ctl00_cphpage_txtOrderDatetime")
		@CacheLookup
		WebElement Dateselect1;
		
		
		@FindBy(how= How.CSS, using="#ctl00_cphpage_gdvProcedureResult_ctl02_imgSearchProcedure")
		@CacheLookup
		WebElement ProcedureSearch;
		@FindBy(how= How.CSS, using="#ctl00_cphpage_gdvProcedureResult_ctl02_imgSearchProcedure")
		@CacheLookup
		WebElement ProcedureSearch1;
		
		
		@FindBy(how= How.CSS, using="#ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria")
		@CacheLookup
		WebElement DropDown1;
		@FindBy(how= How.CSS, using="#ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria")
		@CacheLookup
		WebElement DropDown3;
		
		
		@FindBy(how= How.CSS, using="#ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria")
		@CacheLookup
		WebElement ProcedureName;
		@FindBy(how= How.CSS, using="#ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria")
		@CacheLookup
		WebElement ProcedureName1;
		
		
		@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']")
		@CacheLookup
		WebElement ProcedureBtnSearch;
		@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']")
		@CacheLookup
		WebElement ProcedureBtnSearch1;
		
		
		@FindBy(how= How.CSS, using="#ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
		@CacheLookup
		WebElement Radiobtnselect1;
		@FindBy(how= How.CSS, using="#ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
		@CacheLookup
		WebElement Radiobtnselect3;
		
		
		@FindBy(how= How.CSS, using="#ctl00_cphpage_ucCommonSearch_btnSelect")
		@CacheLookup
		WebElement Select1;
		@FindBy(how= How.CSS, using="#ctl00_cphpage_ucCommonSearch_btnSelect")
		@CacheLookup
		WebElement Select3;
		
		@FindBy(how= How.CSS, using="#ctl00_cphpage_btnSave")
		@CacheLookup
		WebElement Save;
		@FindBy(how= How.ID, using="ctl00_cphpage_gdvProcedureResult_ctl02_imgbtnProcRemove")
		@CacheLookup
		WebElement RemoveProccesor;
		@FindBy(how= How.ID, using="ctl00_cphpage_btnView")
		@CacheLookup
		WebElement View;
		@FindBy(how= How.ID, using="ctl00_cphpage_btnMainClear")
		@CacheLookup
		WebElement Clear;
		@FindBy(how= How.ID, using="ctl00_cphpage_btnDelete")
		@CacheLookup
		WebElement Delete;
		@FindBy(how= How.ID, using="ctl00_cphpage_btnBack")
		@CacheLookup
		WebElement Back;
		
		@FindBy(how= How.XPATH, using="/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[1]/div/div/div/table/tbody/tr[1]/td/table/tbody/tr[3]/td[1]/table/tbody/tr/td[2]/select/option[3]")
		@CacheLookup
		WebElement DropdownclauseValue;
		
		@FindBy(how= How.ID, using="ctl00_cphpage_MyMessageBoxInfo_ButtonOK")
		@CacheLookup
		WebElement SuccessMessageOkButton;
		
		
		
		public void bedsideproceduresorderwordpress(String Procedure_Name) throws InterruptedException, AWTException{
			
			Actions action= new Actions(driver);
			action.moveToElement(InpatientManagement).build().perform();
			Thread.sleep(1000);
			
			Actions action1= new Actions(driver);
			action1.moveToElement(BedsideProceduresOrder).click().build().perform();
			Thread.sleep(3000);
			
			SearchAdmission.click();
			Thread.sleep(3000);
			WebDriverWait wait=new WebDriverWait(driver, 300);
			wait.until(ExpectedConditions.visibilityOf(PatientNameIP));
		 
			Actions ac=new Actions(driver);
			ac.moveToElement(DropDown).click().moveToElement(DropdownclauseValue).click().build().perform();
			
			Thread.sleep(2000);
			
			//Searching the patient
			PatientNameIP.sendKeys("test");
			Thread.sleep(1000);
			
			SearchBtn.click();
			Thread.sleep(5000);
			
			wait.until(ExpectedConditions.visibilityOf(Radiobtnselect));
			//Selecting the patient 
			Radiobtnselect.click();
			Thread.sleep(6000);
			
			Select.click();
			Thread.sleep(7000);
			wait.until(ExpectedConditions.invisibilityOf(Select));
			//Selecting the date of bedside procedures
			Thread.sleep(1000);
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
			
			Dateselect.clear();
			Dateselect.click();
			Dateselect.sendKeys(newDate);
			Thread.sleep(1000);
			
			//Selecting the bedside procedure
			ProcedureSearch.click();
			Thread.sleep(2000);
			
			/*Select select1= new Select(DropDown1);
			select1.selectByVisibleText("Starts With");
			Thread.sleep(1000);*/
//			DropDown1.sendKeys("Starts With");
//			Thread.sleep(1000);
//			
			ProcedureName.sendKeys(Procedure_Name);
			Thread.sleep(2000);
			
			ProcedureBtnSearch.click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(Radiobtnselect1));
			//Selecting the procedure
			Radiobtnselect1.click();
			Thread.sleep(1000);
		
			Select1.click();
	
			Thread.sleep(4000);
				driver.findElement(By.id("ctl00_cphpage_btnSave")).click();;//save
			//Save.click();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessageOkButton));
			Thread.sleep(1000);
			SuccessMessageOkButton.click();
			
			
		}
		
}
//Thread.sleep(3000);
//View.click();
//Thread.sleep(3000);
//Clear.click();
//
//Thread.sleep(2000);
//
//
//SearchAdmission1.click();
//Thread.sleep(3000);
//DropDown2.sendKeys("Starts With");
//Thread.sleep(1000);
//
////Searching the patient
//PatientNameIP1.sendKeys("test");
//Thread.sleep(1000);
//
//SearchBtn1.click();
//Thread.sleep(5000);
//
////Selecting the patient 
//Radiobtnselect3.click();
//Thread.sleep(6000);
//
//Select3.click();
//Thread.sleep(7000);
//
//
//System.out.println("Date after Addition: "+newDate);  
//
//Dateselect1.clear();
//Dateselect1.click();
//Dateselect1.sendKeys(newDate);
//Thread.sleep(1000);
//
////Selecting the bedside procedure
//ProcedureSearch1.click();
//Thread.sleep(2000);
//
///*Select select1= new Select(DropDown1);
//select1.selectByVisibleText("Starts With");
//Thread.sleep(1000);*/
//DropDown3.sendKeys("Starts With");
//Thread.sleep(1000);
//
//ProcedureName1.sendKeys(Procedure_Name);
//Thread.sleep(2000);
//
//ProcedureBtnSearch1.click();
//Thread.sleep(3000);
//
////Selecting the procedure
//driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
//Thread.sleep(1000);
//
//Select2.click();
