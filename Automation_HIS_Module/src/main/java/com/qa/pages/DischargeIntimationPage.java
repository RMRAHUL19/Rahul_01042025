package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class DischargeIntimationPage extends BasePage {
	
	util utilobj = new util();

	public DischargeIntimationPage(WebDriver driver) {
		super(driver);
	}

	//private By AdmissionNo = By.id("ctl00_cphpage_txtAdmNo");
	/*Discharge intimation home page*/
	private By AdmissionSearchBtn = By.id("ctl00_cphpage_ImgBtnAdmin");
	
	private By AdmissionSearchNo = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	
	private By SearchBtn = By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	
	private By ChkBox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");

	private By SelectBtn=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");

	private By RequestType=By.id("ctl00_cphpage_ddlRequestType");
	
	private By Remarks=By.id("ctl00_cphpage_txtRemarks");
	
	private By SaveBtn=By.id("ctl00_cphpage_btnSave");
	
	public WebElement getAdmissionSearchBtn() {
		return getElement(AdmissionSearchBtn);
	}
	
	public WebElement getAdmissionSearchNo() {
		return getElement(AdmissionSearchNo);
	}
	public WebElement getSearchBtn() {
		return getElement(SearchBtn);
	}
	
	public WebElement getChkBox() {
		return getElement(ChkBox);
	}
	
	public WebElement getSelectBtn() {
		return getElement(SelectBtn);
	}
	
	public WebElement getRequestType() {
		return getElement(RequestType);
	}
	
	public WebElement getRemarks() {
		return getElement(Remarks);
	}
	
	public WebElement getSaveBtn() {
		return getElement(SaveBtn);
	}
	
	public void doDischargeIntimationPage(String AdmissionNo, String RequestType, String Remarks) {

		try {
			
			
			//getAdmissionNo().sendKeys(AdmissionNo);
			utilobj.ActionClick(getAdmissionSearchBtn(), driver);
			Thread.sleep(3000);
			
			getAdmissionSearchNo().click();

			getAdmissionSearchNo().sendKeys(AdmissionNo);
			getSearchBtn().click();
			
			getChkBox().click();
			getSelectBtn().click();
			
			
			
			Thread.sleep(2000);
			
			//System.out.println(RequestType + getRequestType());
			utilobj.selectDropdown(getRequestType(), driver, RequestType);
			Thread.sleep(2000);

			getRemarks().sendKeys(Remarks);
			Thread.sleep(2000);
			//getSaveBtn().click();
		driver.findElement(By.id("ctl00_cphpage_btnClear")).click();
			

		}

		catch (Exception ex) {
			System.err.println(ex);
		}

	}
	
}

