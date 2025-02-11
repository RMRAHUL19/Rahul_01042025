package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class Medical_Death_Record_Pages extends BasePage {
	public Medical_Death_Record_Pages( WebDriver driver) {
		super(driver);
	}
	util utilobj = new util();
	private By Death_Record_admission_searchimg=By.id("ctl00_cphpage_imgSearchAdmNo");
	public WebElement getDeath_Record_admission_searchimg() {
		return getElement(Death_Record_admission_searchimg);
	}
	private By Death_Record_admissionNo_searchbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getDeath_Record_admissionNo_searchbox() {
		return getElement(Death_Record_admissionNo_searchbox);
	}
	private By Death_Record_admissionNo_searchbutton=By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	public WebElement getDeath_Record_admissionNo_searchbutton() {
		return getElement(Death_Record_admissionNo_searchbutton);
	}
	private By Death_Record_admissionsearch_checkbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getDeath_Record_admissionsearch_checkbox() {
		return getElement(Death_Record_admissionsearch_checkbox);
	}
	private By Death_Record_admission_selectbutton=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getDeath_Record_admission_selectbutton() {
		return getElement(Death_Record_admission_selectbutton);
	}
	private By Death_Record_autopsycheckbox=By.id("ctl00_cphpage_chkbxPosrmortemCarried");
	public WebElement getDeath_Record_autopsycheckbox() {
		return getElement(Death_Record_autopsycheckbox);
	}
	private By Death_Record_imidiatecause=By.id("ctl00_cphpage_txtCauseOfDeath");
	public WebElement getDeath_Record_imidiatecause() {
		return getElement(Death_Record_imidiatecause);
	}
	private By Death_Record_Mannerofdeath=By.id("ctl00_cphpage_ddlMannerOfDeath");
	public WebElement getDeath_Record_Mannerofdeath() {
		return getElement(Death_Record_Mannerofdeath);
	}
	private By Death_Record_PrintButton=By.id("ctl00_cphpage_btnPrint");
	public WebElement getDeath_Record_PrintButton() {
		return getElement(Death_Record_PrintButton);
	}
	private By Death_Record_SavetButton=By.id("ctl00_cphpage_btnSave");
	public WebElement getDeath_Record_SavetButton() {
		return getElement(Death_Record_SavetButton);
	}
	private By Death_Record_ClearButton=By.id("ctl00_cphpage_btnClear");
	public WebElement getDeath_Record_ClearButton() {
		return getElement(Death_Record_ClearButton);
	}
	
	public void testcase_for_MedicalDeathRecordPages() throws InterruptedException {
		Thread.sleep(2000);
		getDeath_Record_admission_searchimg().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_ddlCriteria")), driver, "Equals");
		Thread.sleep(2000);
		getDeath_Record_admissionNo_searchbox().sendKeys("EMR011600005");
		Thread.sleep(2000);
		getDeath_Record_admissionNo_searchbutton().click();
		Thread.sleep(2000);
		getDeath_Record_admissionsearch_checkbox().click();
		Thread.sleep(2000);
		getDeath_Record_admission_selectbutton().click();
		Thread.sleep(2000);
		getDeath_Record_autopsycheckbox().click();
		Thread.sleep(2000);
		//getDeath_Record_imidiatecause().sendKeys("Test Immediate Cause");
		Thread.sleep(2000);
		//utilobj.selectDropdown(getDeath_Record_Mannerofdeath(), driver, "Natural");
		driver.findElement(By.id("ctl00_cphpage_imgDoctorName")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys("Du112233");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSelect")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtDeathDateTime")).sendKeys("01-Dec-2021");
		
		Thread.sleep(2000);
//		utilobj.SwitchToChildWindow(driver, "");
//		Thread.sleep(2000);
//	driver.manage().window().maximize();
//	Thread.sleep(2000);
//	driver.close();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver, "Dhanwantri");
//	Thread.sleep(2000);
	//getDeath_Record_SavetButton().click();
	Thread.sleep(2000); 	
	//getDeath_Record_PrintButton().click();
	getDeath_Record_ClearButton().click();
	
	
	
	}
	
	
}	


