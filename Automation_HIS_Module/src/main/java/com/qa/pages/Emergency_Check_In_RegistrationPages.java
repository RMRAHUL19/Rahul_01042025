package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.util;

public class Emergency_Check_In_RegistrationPages extends BasePage {

	public Emergency_Check_In_RegistrationPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	util utilobj = new util();
	
	private By ECRIP_titleDDL = By.id("ctl00_cphpage_ddlTitle");
	public WebElement getECRIP_titleDDL() {
		return getElement(ECRIP_titleDDL);
	}
	private By ECRIP_Firstname = By.id("ctl00_cphpage_txtFirstName");
	public WebElement getECRIP_Firstname() {
		return getElement(ECRIP_Firstname);
	}
	private By ECRIP_Lastname = By.id("ctl00_cphpage_txtLastName");
	public WebElement getECRIP_Lastname() {
		return getElement(ECRIP_Lastname);
	}
	private By ECRIP_Age = By.id("ctl00_cphpage_txtAge");
	public WebElement getECRIP_Age() {
		return getElement(ECRIP_Age);
	}
	private By ECRIP_genderDDL = By.id("ctl00_cphpage_ddlGender");
	public WebElement getECRIP_genderDDL() {
		return getElement(ECRIP_genderDDL);
	}
	private By ECRIP_AdmisiontypeDDL = By.id("ctl00_cphpage_ddlAdmissionType");
	public WebElement getECRIP_AdmisiontypeDDL() {
		return getElement(ECRIP_AdmisiontypeDDL);
	}
	private By ECRIP_AdmisionsrcDDl = By.id("ctl00_cphpage_ddlAdmissionSrc");
	public WebElement getECRIP_AdmisionsrcDDl() {
		return getElement(ECRIP_AdmisionsrcDDl);
	}
	private By ECRIP_SuccesmsgOKBUTTON = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getECRIP_SuccesmsgOKBUTTON() {
		return getElement(ECRIP_SuccesmsgOKBUTTON);
	}
	private By ECRIP_InformationmsgOKBUTTON = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");
	public WebElement getECRIP_InformationmsgOKBUTTON() {
		return getElement(ECRIP_InformationmsgOKBUTTON);
	}
	private By ECRIP_Addresstxtbox = By.id("ctl00_cphpage_txtPresentAddress1");
	public WebElement getECRIP_Addresstxtbox() {
		return getElement(ECRIP_Addresstxtbox);
	}
	private By ECRIP_AdmissionNotxtbox = By.id("ctl00_cphpage_txtAdmissionNo");
	public WebElement getECRIP_AdmissionNotxtbox() {
		return getElement(ECRIP_AdmissionNotxtbox);
	}
	private By ECRIP_UHIDNotxtbox = By.id("ctl00_cphpage_txtUHID");
	public WebElement getECRIP_UHIDNotxtbox() {
		return getElement(ECRIP_UHIDNotxtbox);
	}
	private By ECRIP_IMGadmissionSearch = By.id("ctl00_cphpage_imgadmissionsearch");
	public WebElement getECRIP_IMGadmissionSearch() {
		return getElement(ECRIP_IMGadmissionSearch);
	}
	private By ECRIP_IMGadmissionSearch_txtbox = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	                                                    
	public WebElement getECRIP_IMGadmissionSearch_txtbox() {
		return getElement(ECRIP_IMGadmissionSearch_txtbox);
	}
	private By ECRIP_IMGadmissionSearch_Searchbutton = By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
	                                                          
	public WebElement getECRIP_IMGadmissionSearch_Searchbutton() {
		return getElement(ECRIP_IMGadmissionSearch_Searchbutton);
	}
	private By ECRIP_IMGadmissionSearch_Radiobutton = By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getECRIP_IMGadmissionSearch_Radiobutton() {
		return getElement(ECRIP_IMGadmissionSearch_Radiobutton);
	}
	private By ECRIP_IMGadmissionSearch_Selectbutton = By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getECRIP_IMGadmissionSearch_Selectbutton() {
		return getElement(ECRIP_IMGadmissionSearch_Selectbutton);
	}
	private By ECRIP_IMG_UHIDSearch_Selectbutton = By.id("ctl00_cphpage_imgsearchUHID");
	public WebElement getECRIP_IMG_UHIDSearch_Selectbutton() {
		return getElement(ECRIP_IMG_UHIDSearch_Selectbutton);
	}
	private By ECRIP_lnkbtnMLCdetails = By.id("ctl00_cphpage_lnkbtnMLCdetails");
	public WebElement getECRIP_lnkbtnMLCdetails() {
		return getElement(ECRIP_lnkbtnMLCdetails);
	}
	private By ECRIP_lnkbtnContactdetails = By.id("ctl00_cphpage_lnkbtnContactDetails");
	public WebElement getECRIP_lnkbtnContactdetails() {
		return getElement(ECRIP_lnkbtnContactdetails);
	}
	private By ECRIP_lnkbtnPassportdetails = By.id("ctl00_cphpage_lnkbtnPassportDetails");
	public WebElement getECRIP_lnkbtnPassportdetails() {
		return getElement(ECRIP_lnkbtnPassportdetails);
	}
	private By ECRIP_lnkbtnAllergiesdetails = By.id("ctl00_cphpage_lnkbtnAllergies");
	public WebElement getECRIP_lnkbtnAllergiesdetails() {
		return getElement(ECRIP_lnkbtnAllergiesdetails);
	}
	private By ECRIP_lnkbtnEmployeedetails = By.id("ctl00_cphpage_lnkbtnEmployee");
	public WebElement getECRIP_lnkbtnEmployeedetails() {
		return getElement(ECRIP_lnkbtnEmployeedetails);
	}
	
	
	private By ECRIP_InsuranceNotxtbox = By.id("ctl00_cphpage_txtInsuranceNo");

	public WebElement getECRIP_InsuranceNotxtbox() {
		return getElement(ECRIP_InsuranceNotxtbox);
	}
	private By ECRIP_InsuranceNolinkbutton = By.id("ctl00_cphpage_lnkbtnIPNo");

	public WebElement getECRIP_InsuranceNolinkbutton() {
		return getElement(ECRIP_InsuranceNolinkbutton);
	}
	private By ECRIP_InsuranceNo_UHIDchekbox = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl04_chkUHID");

	public WebElement getECRIP_InsuranceNo_UHIDchekbox() {
		return getElement(ECRIP_InsuranceNo_UHIDchekbox);
	}
	private By ECRIP_InsuranceNo_LiveListbtnselect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");

	public WebElement getECRIP_InsuranceNo_LiveListbtnselect() {
		return getElement(ECRIP_InsuranceNo_LiveListbtnselect);
	}
	private By ECRIP_Specialisation_DDL = By.id("ctl00_cphpage_ddlSpecialisation");

	public WebElement getECRIP_Specialisation_DDL() {
		return getElement(ECRIP_Specialisation_DDL);
	}
	private By ECRIP_Unit_DDL = By.id("ctl00_cphpage_ddlUnit");

	public WebElement  getECRIP_Unit_DDL() {
		return getElement(ECRIP_Unit_DDL);
	}
	private By ECRIP_SaveButton = By.id("ctl00_cphpage_btnSave");
	
	public WebElement  getECRIP_SaveButton() {
		return getElement(ECRIP_SaveButton);
	}
	private By ECRIP_ClearButton = By.id("ctl00_cphpage_btnClear");

	public WebElement  getECRIP_ClearButton() {
		return getElement(ECRIP_ClearButton);
	}
	private By ECRIP_PrintButton = By.id("ctl00_cphpage_btnPrint");

	public WebElement  getECRIP_PrintButton() {
		return getElement(ECRIP_PrintButton);
	}
	private By ECRIP_DepositeButton = By.id("ctl00_cphpage_btnDepositDetails");

	public WebElement  getECRIP_DepositeButton() {
		return getElement(ECRIP_DepositeButton);
	}
	private By ECRIP_SuccesMYmessageBoxokbutton = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");

	public WebElement  getECRIP_SuccesMYmessageBoxokbutton() {
		return getElement(ECRIP_SuccesMYmessageBoxokbutton);
	}
	private By ECRIP_IPNumberradiobutton = By.id("ctl00_cphpage_rbl_0");

	public WebElement  getECRIP_IPNumberradiobutton() {
		return getElement(ECRIP_IPNumberradiobutton);
	}
	
	
	
	
	public void testcaseforeEmergency_Check_In_RegistrationPages() throws InterruptedException {//EMR072200001
		Thread.sleep(2000);
		utilobj.selectDropdown(getECRIP_titleDDL(), driver, "Dr.");
		Thread.sleep(2000);
		getECRIP_Firstname().sendKeys("Father");
		Thread.sleep(2000);
	    getECRIP_Age().sendKeys("30");
	    Thread.sleep(2000);
	    getECRIP_Lastname().sendKeys("UHID");
	    Thread.sleep(2000);
	    getECRIP_Age().sendKeys("30");
	    Thread.sleep(2000);
	    utilobj.selectDropdown(getECRIP_genderDDL(), driver, "Male");
	    Thread.sleep(2000);
	    getECRIP_Addresstxtbox().sendKeys("Test Automation Streat");
	    Thread.sleep(2000);
	    utilobj.selectDropdown(getECRIP_Specialisation_DDL(), driver, "General Medicine");
	    
	    Thread.sleep(2000);
	    utilobj.selectDropdown(getECRIP_Unit_DDL(), driver, "MEDICINE");
	    Thread.sleep(2000);
	    getECRIP_SaveButton().click();
	    WebDriverWait wait=new WebDriverWait(driver, 300);
	    wait.until(ExpectedConditions.visibilityOf(getECRIP_InformationmsgOKBUTTON()));
	    getECRIP_InformationmsgOKBUTTON().click();
	    Thread.sleep(2000);
	    getECRIP_SuccesmsgOKBUTTON().click();
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")));
	   
	    
		String admission=getECRIP_AdmissionNotxtbox().getAttribute("value");
		Thread.sleep(2000);
		String UHID=getECRIP_UHIDNotxtbox().getAttribute("value");
		Thread.sleep(2000);
		utilobj.JSClick(getECRIP_ClearButton(),driver);
		Thread.sleep(5000);
		getECRIP_IMGadmissionSearch().click();//search by admission number
		Thread.sleep(2000);
		getECRIP_IMGadmissionSearch_txtbox().sendKeys(admission);
		Thread.sleep(2000);
		getECRIP_IMGadmissionSearch_Searchbutton().click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(getECRIP_IMGadmissionSearch_Radiobutton()));
		getECRIP_IMGadmissionSearch_Radiobutton().click();
		Thread.sleep(2000);
		getECRIP_IMGadmissionSearch_Selectbutton().click();
		Thread.sleep(2000);//clear button
		utilobj.JSClick(getECRIP_ClearButton(),driver);
		Thread.sleep(5000);
		utilobj.JSClick(getECRIP_IMG_UHIDSearch_Selectbutton(), driver);
		//getECRIP_IMG_UHIDSearch_Selectbutton().click();
		Thread.sleep(5000);//search by UHID number
		getECRIP_IMGadmissionSearch_txtbox().sendKeys(UHID);
		Thread.sleep(5000);
		getECRIP_IMGadmissionSearch_Searchbutton().click();
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(getECRIP_IMGadmissionSearch_Radiobutton()));
		getECRIP_IMGadmissionSearch_Radiobutton().click();
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(getECRIP_IMGadmissionSearch_Selectbutton()));
		getECRIP_IMGadmissionSearch_Selectbutton().click();
		Thread.sleep(5000);
		utilobj.JSClick(getECRIP_ClearButton(),driver);
		Thread.sleep(5000);//search by IPNO
		getECRIP_InsuranceNotxtbox().sendKeys("1199900090");
		Thread.sleep(5000);
		getECRIP_InsuranceNolinkbutton().click();
		Thread.sleep(5000);
		getECRIP_InsuranceNo_UHIDchekbox().click();
		Thread.sleep(5000);
		getECRIP_InsuranceNo_LiveListbtnselect().click();
		Thread.sleep(5000);
		utilobj.JSClick(getECRIP_ClearButton(),driver);
		Thread.sleep(5000);
		utilobj.JSClick(getECRIP_IMG_UHIDSearch_Selectbutton(), driver);
		Thread.sleep(2000);
		getECRIP_IMGadmissionSearch_txtbox().sendKeys(UHID);
		Thread.sleep(5000);
		getECRIP_IMGadmissionSearch_Searchbutton().click();
		Thread.sleep(5000);
		getECRIP_IMGadmissionSearch_Radiobutton().click();
		Thread.sleep(5000);
		getECRIP_IMGadmissionSearch_Selectbutton().click();
		Thread.sleep(5000);
	getECRIP_SaveButton().click();//modyfying
	Thread.sleep(5000);
	getECRIP_SuccesMYmessageBoxokbutton().click();
	Thread.sleep(5000);
	utilobj.JSClick(getECRIP_PrintButton(),driver);//print
	Thread.sleep(5000);
	utilobj.SwitchToChildWindow(driver, "PrintReports.aspx");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
	Thread.sleep(5000);
	utilobj.SwitchToChildWindow(driver, "EmergencyAdmission");
	Thread.sleep(5000);
//	getECRIP_DepositeButton().click();//deposite button
//	Thread.sleep(5000);
//	utilobj.SwitchToChildWindow(driver,"DepositDetails-Dhanwantri");
//	Thread.sleep(5000);
//	driver.close();
//	Thread.sleep(5000);
//	utilobj.SwitchToChildWindow(driver, "EmergencyAdmission");
//	Thread.sleep(5000);
//	utilobj.JSClick(getECRIP_ClearButton(),driver);
//	Thread.sleep(2000);
//	utilobj.JSClick(getECRIP_IMG_UHIDSearch_Selectbutton(), driver);
//	Thread.sleep(2000);//search by UHID number
//	getECRIP_IMGadmissionSearch_txtbox().sendKeys(UHID);
//	Thread.sleep(2000);
//	getECRIP_IMGadmissionSearch_Searchbutton().click();
//	Thread.sleep(2000);
//	getECRIP_IMGadmissionSearch_Radiobutton().click();
//	Thread.sleep(2000);
//	getECRIP_IMGadmissionSearch_Selectbutton().click();
//	Thread.sleep(2000);
//	getECRIP_lnkbtnMLCdetails().click();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver," 	PatientAdditionalDetails-Dhanwantri ");
//	Thread.sleep(2000);
//	driver.close();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver, "EmergencyAdmission");
//	Thread.sleep(2000);
//	getECRIP_lnkbtnContactdetails().click();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver," 	PatientAdditionalDetails-Dhanwantri ");
//	driver.close();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver, "EmergencyAdmission");
//	Thread.sleep(2000);
//	getECRIP_lnkbtnPassportdetails().click();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver," 	PatientAdditionalDetails-Dhanwantri ");
//	Thread.sleep(2000);
//	driver.close();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver, "EmergencyAdmission");
//	Thread.sleep(2000);
//	getECRIP_lnkbtnAllergiesdetails().click();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver," 	PatientAdditionalDetails-Dhanwantri ");
//	driver.close();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver, "EmergencyAdmission");
//	Thread.sleep(2000);
//	getECRIP_lnkbtnEmployeedetails().click();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver," 	PatientAdditionalDetails-Dhanwantri ");
//	driver.close();
//	Thread.sleep(2000);
//	utilobj.SwitchToChildWindow(driver, "EmergencyAdmission");
//	Thread.sleep(2000);
//	
//	driver.close();
//	
	}
	
}
