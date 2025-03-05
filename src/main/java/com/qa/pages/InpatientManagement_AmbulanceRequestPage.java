package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InpatientManagement_AmbulanceRequestPage extends BasePage
{

	public InpatientManagement_AmbulanceRequestPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By Locationsearchimagebutton= By.id("ctl00_cphpage_imgHospital");
	public WebElement getLocationsearchimagebutton() {
		return getElement(Locationsearchimagebutton);
	}
	private By LocationSearchtextbox= By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getLocationSearchtextbox() {
		return getElement(LocationSearchtextbox);
	}
	private By LocationsearchButton= By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_btnSearch");
	public WebElement getLocationsearchButton() {
		return getElement(LocationsearchButton);
	}
	private By LocationRadiobutton= By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getLocationRadiobutton() {
		return getElement(LocationRadiobutton);
	}
	private By LocationSelectButton= By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	public WebElement getLocationSelectButton() {
		return getElement(LocationSelectButton);
	}
	private By BedNameImageButton= By.id("ctl00_cphpage_imgBedNo");
	public WebElement getBedNameImageButton() {
		return getElement(BedNameImageButton);
	}
	private By BedAdmissionTextBox= By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl01_txtCriteria");
	public WebElement getBedAdmissionTextBox() {
		return getElement(BedAdmissionTextBox);
	}
	private By BedSearchButton= By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_btnSearch");
	public WebElement getBedSearchButton() {
		return getElement(BedSearchButton);
	}
	private By BedRadioButton= By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getBedRadioButton() {
		return getElement(BedRadioButton);
	}
	private By BedSelectButton= By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	public WebElement getBedSelectButton() {
		return getElement(BedSelectButton);
	}
	private By PatientConditionTextBox= By.id("ctl00_cphpage_txtPatientcondition");
	public WebElement getPatientConditionTextBox() {
		return getElement(PatientConditionTextBox);
	}
	private By PatientAdressTextBox= By.id("ctl00_cphpage_txtAddress");
	public WebElement getPatientAdressTextBox() {
		return getElement(PatientAdressTextBox);
	}
	private By StateDLL= By.id("ctl00_cphpage_ddlPresentLGDState");
	public WebElement getStateDLL() {
		return getElement(StateDLL);
	}
	private By DistrictDLL= By.id("ctl00_cphpage_ddlPresentLGDDistrict");
	public WebElement getDistrictDLL() {
		return getElement(DistrictDLL);
	}
	private By Pincodetextbox= By.id("ctl00_cphpage_txtPresentPinCode");
	public WebElement getPincodetextbox() {
		return getElement(Pincodetextbox);
	}
	private By Requireddate= By.id("ctl00_cphpage_txtRequireddate");
	public WebElement getRequireddate() {
		return getElement(Requireddate);
	}
	private By Requireddatecurrentdate= By.id("ctl00_cphpage_CalendarExtender1_today");
	public WebElement Requireddatecurrentdate() {
		return getElement(Requireddatecurrentdate);
	}
	private By Recivedddate= By.id("ctl00_cphpage_txtrecieveddate");
	public WebElement getRecivedddate() {
		return getElement(Recivedddate);
	}
	private By Recivedddatecurrentdate= By.id("ctl00_cphpage_CalendarExtender2_today");
	public WebElement getRecivedddatecurrentdate() {
		return getElement(Recivedddatecurrentdate);
	}	
	private By Remarkstextbox= By.id("ctl00_cphpage_txtRemarks");
	public WebElement getRemarkstextbox() {
		return getElement(Remarkstextbox);
	}
	private By SaveButton= By.id("ctl00_cphpage_btnSave");
	public WebElement getSaveButton() {
		return getElement(SaveButton);
	}
	private By ImageProcess= By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[2]/div[1]/img");
	public WebElement getImageProcess() {
		return getElement(ImageProcess);
	}
	private By SuccusOkButton= By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getSuccusOkButton() {
		return getElement(SuccusOkButton);
	}
	private By ChangeLocationLink= By.id("ctl00_lnkbtnChangeHospital");
	public WebElement getChangeLocationLink() {
		return getElement(ChangeLocationLink);
	}
	private By AssignmentLink= By.id("ctl00_cphpage_gdvResults_ctl02_lbAssignment");
	public WebElement getAssignmentLink() {
		return getElement(AssignmentLink);
	}
	private By AmbulanceDLL= By.id("ddlAmbulance");
	public WebElement getAmbulanceDLL() {
		return getElement(AmbulanceDLL);
	}
	private By DriverName= By.id("txtDriverName");
	public WebElement getDriverName() {
		return getElement(DriverName);
	}
	private By InitialKilometer= By.id("txtKilometerReding");
	public WebElement getInitialKilometer() {
		return getElement(InitialKilometer);
	}
	private By FinalKilometer= By.id("txtFinalReading");
	public WebElement getFinalKilometer() {
		return getElement(FinalKilometer);
	}
	private By FromTimeHour= By.id("tpFromTime_txtHour");
	public WebElement getFromTimeHour() {
		return getElement(FromTimeHour);
	}
	private By ToTimeHour= By.id("tpToTime_txtHour");
	public WebElement getToTimeHour() {
		return getElement(ToTimeHour);
	}
	private By TextRemarks= By.id("txtRemarks");
	public WebElement getTextRemarks() {
		return getElement(TextRemarks);
	}
	private By saveButton= By.id("btnSave");
	public WebElement getsaveButton() {
		return getElement(saveButton);
	}
	
//	/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div/table/tbody/tr/td[12]
	
	

	
	
}
