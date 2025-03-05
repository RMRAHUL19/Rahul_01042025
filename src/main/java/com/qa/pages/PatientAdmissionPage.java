package com.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

@SuppressWarnings("unused")
public class PatientAdmissionPage extends BasePage{
	util utilobj = new util();
	
	public PatientAdmissionPage(WebDriver driver) {
		super(driver);

	}
private By txtIPNO = By.id("ctl00_cphpage_txtInsuranceNo");

//Livelist Control

private By lnkbtnIPNo = By.id("ctl00_cphpage_lnkbtnIPNo");

private By hisLiveListControlchkUHID = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");

private By hisLiveListControlbtnSelect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
//Patient admission Screen
private By ddlAdmissionType =By.id("ctl00_cphpage_ddlAdmissionType");

private By ddlAdmissionSrc =By.id("ctl00_cphpage_ddlAdmissionSrc");

private By btnSave =By.id("ctl00_cphpage_btnSave");

private By ddlSpecialisation =By.id("ctl00_cphpage_ddlSpecialisation");

private By ddlUnit =By.id("ctl00_cphpage_ddlUnit");

private By pritnButton =By.id("ctl00_cphpage_btnPrint");
private By PermanentSameAsPresentRadiobutton =By.id("ctl00_cphpage_PermanentSameAsPresent");
private By MyMessageBoxInfoButtonYes =By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");
private By MyMessageBoxSuccusButtonYes =By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
                                            
private By patientAdmission_UHIDCheckBox =By.id("ctl00_cphpage_txtUHID");
private By patientAdmission_UHIDImgSearch =By.id("ctl00_cphpage_imgsearchUHID");
private By patientAdmission_UHIDSearchPOPTXTBOX =By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
private By patientAdmission_UHIDSearchButtonSearch =By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
private By patientAdmission_UHIDRadioButtonBox =By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
private By PatientAdmissionClearButton = By.id("ctl00_cphpage_btnClear");
private By patientAdmission_UHIDSearchBTNSelect =By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
private By patientAdmission_UHIDDepositedetail =By.id("ctl00_cphpage_btnDepositDetails");
private By ddlReligion =By.id("ctl00_cphpage_ddlReligion");
private By ButtonCancel =By.id("ctl00_cphpage_btnCancel");
private By Wardtypeddl =By.id("ctl00_cphpage_ddlWardType");
private By AdmissionCancelButton =By.id("ctl00_cphpage_btnCancel");
private By AdmissionNoTextBox=By.id("ctl00_cphpage_txtAdmissionNo");
//newborn
private By newBornCheckBox=By.id("ctl00_cphpage_chkNewBorn");
public WebElement getnewBornCheckBox() {
	return getElement(newBornCheckBox);
}
private By newBornImgBtn=By.id("ctl00_cphpage_imgbtnNewBorn");
public WebElement getnewBornImgBtn() {
	return getElement(newBornImgBtn);
}
private By newBornImgMotherAdmissionSearch=By.id("imgMothersadmissionNosearch");
public WebElement getnewBornImgMotherAdmissionSearch() {
	return getElement(newBornImgMotherAdmissionSearch);
}
private By newBornImgMotherAdmissionTextbox=By.id("ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
public WebElement getnewBornImgMotherAdmissionTextbox() {
	return getElement(newBornImgMotherAdmissionTextbox);
}
private By newBornImgMotherAdmissionBtnSearch=By.id("ucCommonSearch_btnSearch");
public WebElement getnewBornImgMotherAdmissionBtnSearch() {
	return getElement(newBornImgMotherAdmissionBtnSearch);
}
private By newBornImgMotherAdmissionRadioButton=By.id("ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
public WebElement getnewBornImgMotherAdmissionRadioButton() {
	return getElement(newBornImgMotherAdmissionRadioButton);
}
private By newBornImgMotherAdmissionSelectButton=By.id("ucCommonSearch_btnSelect");
public WebElement getnewBornImgMotherAdmissionSelectButton() {
	return getElement(newBornImgMotherAdmissionSelectButton);
}
private By newBornImgMotherAdmissionOkButton=By.id("btnOk");
public WebElement getnewBornImgMotherAdmissionOkButton() {
	return getElement(newBornImgMotherAdmissionOkButton);
}
private By newBornDOB=By.id("ctl00_cphpage_txtDOB");
public WebElement getnewBornDOB() {
	return getElement(newBornDOB);
}

//new born end
//admission search
private By AdmissionSearchImage=By.id("ctl00_cphpage_imgadmissionsearch");
public WebElement getAdmissionSearchImage() {
	return getElement(AdmissionSearchImage);
}
private By AdmissionSearchtextbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
public WebElement getAdmissionSearchtextbox() {
	return getElement(AdmissionSearchtextbox);
}
private By AdmissionSearchButton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
public WebElement getAdmissionSearchButton() {
	return getElement(AdmissionSearchButton);
}
private By AdmissionSearchRadioButton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
public WebElement getAdmissionSearchRadioButton() {
	return getElement(AdmissionSearchRadioButton);
}
private By AdmissionSearchSelectButton=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
public WebElement getAdmissionSearchSelectButton() {
	return getElement(AdmissionSearchSelectButton);
}





public WebElement getAdmissionNoTextBox() {
	return getElement(AdmissionNoTextBox);
}

public WebElement getAdmissionCancelButton() {
	return getElement(AdmissionCancelButton);
}
public WebElement getWardtypeddl() {
	return getElement(Wardtypeddl);
}
public WebElement getButtonCancel() {
	return getElement(ButtonCancel);
}
public WebElement getMyMessageBoxSuccusButtonYes() {
	return getElement(MyMessageBoxSuccusButtonYes);
}
public WebElement getddlReligion() {
	return getElement(ddlReligion);
}
public WebElement getpatientAdmission_UHIDDepositedetail() {
	return getElement(patientAdmission_UHIDDepositedetail);
}

public WebElement getpritnButton() {
	return getElement(pritnButton);
}
public WebElement getPatientAdmissionClearButton() {
	return getElement(PatientAdmissionClearButton);
}
public WebElement getpatientAdmission_UHIDSearchPOPTXTBOX() {
	return getElement(patientAdmission_UHIDSearchPOPTXTBOX);
}
public WebElement getpatientAdmission_UHIDSearchButtonSearch() {
	return getElement(patientAdmission_UHIDSearchButtonSearch);
}
public WebElement getpatientAdmission_UHIDRadioButtonBox() {
	return getElement(patientAdmission_UHIDRadioButtonBox);
}
public WebElement getpatientAdmission_UHIDImgSearch() {
	return getElement(patientAdmission_UHIDImgSearch);
}
public WebElement getpatientAdmission_UHIDCheckBox() {
	return getElement(patientAdmission_UHIDCheckBox);
}
public WebElement getpatientAdmission_UHIDSearchBTNSelect() {
	return getElement(patientAdmission_UHIDSearchBTNSelect);
}

public WebElement getTxtIPNO() {
	return getElement(txtIPNO);
}

public WebElement getLnkbtnIPNo() {
	return getElement(lnkbtnIPNo);
}

public WebElement getHisLiveListControlchkUHID() {
	return getElement(hisLiveListControlchkUHID);
}

public WebElement getHisLiveListControlbtnSelect() {
	return getElement(hisLiveListControlbtnSelect);
}

public WebElement getDdlAdmissionType() {
	return getElement(ddlAdmissionType);
}

public WebElement getDdlAdmissionSrc() {
	return getElement(ddlAdmissionSrc);
}
public WebElement getddlUnit() {
	return getElement(ddlUnit);
}

//public WebElement getDdlUnit() {
//	return  getElements(ddlUnit);
//}



public WebElement getddlSpecialisation() {
	return getElement( ddlSpecialisation);}

public WebElement getBtnSave() {
	return getElement(btnSave);
}

public WebElement getPermanentSameAsPresentRadiobutton() {
	return getElement(PermanentSameAsPresentRadiobutton);
}


public WebElement getMyMessageBoxInfoButtonYes() {
	return getElement(MyMessageBoxInfoButtonYes);
}







public String verifyPatientAdmissionPageTitle() {

	return driver.getTitle();

}

//public void doPatientAdmission(String IPnumber,String SpecialisationName,String AdmissionType,String AdmissionSrc,String DdlUnitName) {
//
//	try {
//		Thread.sleep(2000);//search by uhid
//		getpatientAdmission_UHIDImgSearch().click();
//		Thread.sleep(2000);
//		getpatientAdmission_UHIDSearchPOPTXTBOX().sendKeys("AP01.0005004545");
//		Thread.sleep(2000);
//		getpatientAdmission_UHIDSearchButtonSearch().click();
//		Thread.sleep(2000);
//		getpatientAdmission_UHIDRadioButtonBox().click();
//		Thread.sleep(2000);
//		getpatientAdmission_UHIDSearchBTNSelect().click();
//		Thread.sleep(10000);
//		getPatientAdmissionClearButton().click();
//		Thread.sleep(5000);//search by IP no
//		getTxtIPNO().sendKeys(IPnumber);
//		Thread.sleep(2000);
//		getLnkbtnIPNo().click();
//		Thread.sleep(2000);
//		getHisLiveListControlchkUHID().click();
//		Thread.sleep(2000);
//		getHisLiveListControlbtnSelect().click();
//		Thread.sleep(3000);
//		utilobj.JSClick(getPermanentSameAsPresentRadiobutton(), driver);
//		
//		Thread.sleep(2000);
//		getPatientAdmissionClearButton().click();
//		Thread.sleep(2000);
//		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_chkNewBorn")), driver);
//		Thread.sleep(2000);
//		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_txtFirstName")), driver,"baby");
//		Thread.sleep(2000);
//		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_txtLastName")), driver,"test");
//		Thread.sleep(2000);
//		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_txtMaidenName")), driver,"Mother Test");
//		Thread.sleep(2000);
////		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgbtnNewBorn")), driver);
////		Thread.sleep(2000);
////		utilobj.SwitchToChildWindow(driver, " 	NewBorn-Dhanwantri ");
////		Thread.sleep(2000);
////		utilobj.JSClick(driver.findElement(By.id("imgMothersadmissionNosearch")), driver);
//		
//		
//		
//		Thread.sleep(2000);
//		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
//		  Calendar cal = Calendar.getInstance();
//		  String Date = sdf.format(cal.getTime());
//		  Thread.sleep(2000);
//		  utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_txtDOB")), driver,Date);
//		  Thread.sleep(2000);
//		  
//		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_txtPresentAddress1")), driver,"Adress Test");
//		Thread.sleep(2000);
//		getPermanentSameAsPresentRadiobutton().click();
//		  Thread.sleep(2000);
//		
//		utilobj.selectDropdown(getDdlAdmissionType(), driver, AdmissionType);
//		Thread.sleep(2000);
//		utilobj.selectDropdown(getDdlAdmissionSrc(), driver, AdmissionSrc);
//		Thread.sleep(2000);
//		utilobj.selectDropdown(getddlSpecialisation(), driver, "Gynaecology Surgery");
//		Thread.sleep(5000);
//		utilobj.selectDropdown(getddlUnit(), driver, "gynaeunit");
//		Thread.sleep(5000);
//		getBtnSave().click();
//		Thread.sleep(2000);
//		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes")), driver);
//		Thread.sleep(2000);
//		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
//		
//		
//		
//		Thread.sleep(3000);//modify
//		getTxtIPNO().sendKeys(IPnumber);
//		Thread.sleep(2000);
//		getLnkbtnIPNo().click();
//		Thread.sleep(2000);
//		getHisLiveListControlchkUHID().click();
//		Thread.sleep(2000);
//		getHisLiveListControlbtnSelect().click();
//		Thread.sleep(3000);
//		getPermanentSameAsPresentRadiobutton().click();
//		Thread.sleep(2000);
//		utilobj.selectDropdown(getddlReligion(), driver, "BUDHISM");
//		Thread.sleep(3000);
//		utilobj.JSClick(getBtnSave(), driver);
//		
//		Thread.sleep(2000);
//		utilobj.JSClick(getMyMessageBoxSuccusButtonYes(), driver);
//		
//		 Thread.sleep(3000);//print
//		 utilobj.JSClick(getpritnButton(), driver);

//		Thread.sleep(2000);
//		utilobj.SwitchToChildWindow(driver, "PrintReports.aspx");
//		Thread.sleep(1000);
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.close();
//		Thread.sleep(1000);
//		utilobj.SwitchToChildWindow(driver, "Dhanwantri");
//		Thread.sleep(1000);//cencel
//		utilobj.JSClick(getButtonCancel(), driver);
//		Thread.sleep(1000);
//		utilobj.JSClick(getMyMessageBoxSuccusButtonYes(), driver);//deposite detail
//		Thread.sleep(1000);		
//		getpatientAdmission_UHIDDepositedetail().click();
//		utilobj.SwitchToChildWindow(driver, " 	DepositDetails-Dhanwantri ");
//		Thread.sleep(1000);		
//		driver.findElement(By.id("btnCancelDepositDetails")).click();
//		Thread.sleep(10000);
//		
//	}
//
//	catch(Exception ex) {
//		System.err.println(ex);
//	}
//
//}















}
