package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class LinkUHIDtoIP_NoPages extends BasePage {

	public LinkUHIDtoIP_NoPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	util utillobj=new util();
	private By PatientDetail_ImgSearch=By.id("ctl00_cphpage_imgsearchuhid");
	private By PatientSearch_uhidTextBox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	private By PatientSearch_btnSearch=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	private By PatientSearch_LBLResult=By.id("ctl00_cphpage_hisDataSearchCtrl_lblResult");
	private By GetDependentpatient_detail_textBox=By.id("ctl00_cphpage_txtIPNo");
	private By GetDependentpatient_detail_Button=By.id("ctl00_cphpage_btnGetDep");
	private By List_List_radioButton=By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl05_chkUHID");
	private By List_List_ButtonSelect=By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	private By List_List_ClearButton=By.id("ctl00_cphpage_btnclearIPDetails");
	private By List_List_ClosedButton=By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnClose");
	
	private By PatientSearch_DDL=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_ddlCriteria");
	private By PatientSearch_RadioButton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	private By PatientSearch_SelectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	private By Insurancedetail_clearIPDetail=By.id("ctl00_cphpage_btnclearIPDetails");
	private By clear_Button=By.id("ctl00_cphpage_btnClear");
	
	
	public WebElement getclear_Button() {
		return getElement(clear_Button);
	}
	public WebElement getList_List_ClosedButton() {
		return getElement(List_List_ClosedButton);
	}
	public WebElement getPatientDetail_ImgSearch() {
		return getElement(PatientDetail_ImgSearch);
	}
	public WebElement getPatientSearch_DDL() {
		return getElement(PatientSearch_DDL);
	}
	public WebElement getPatientSearch_uhidTextBox() {
		return getElement(PatientSearch_uhidTextBox);
	}
	public WebElement getPatientSearch_btnSearch() {
		return getElement(PatientSearch_btnSearch);
	}
	public WebElement getPatientSearch_LBLResult() {
		return getElement(PatientSearch_LBLResult);
	}
	public WebElement getGetpatient_detail_textBox() {
		return getElement(GetDependentpatient_detail_textBox);
	}
	public WebElement getGetDependentpatient_detail_Button() {
		return getElement(GetDependentpatient_detail_Button);
	}
	public WebElement getList_List_radioButton() {
		return getElement(List_List_radioButton);
	}
	public WebElement getPatientSearch_RadioButton() {
		return getElement(PatientSearch_RadioButton);
	}
	public WebElement getList_List_ButtonSelect() {
		return getElement(List_List_ButtonSelect);
	}
	public WebElement getList_List_ClearButton() {
		return getElement(List_List_ClearButton);
	}
	public WebElement getInsurancedetail_clearIPDetail() {
		return getElement(Insurancedetail_clearIPDetail);
	}
	public WebElement getPatientSearch_SelectButton() {
		return getElement(PatientSearch_SelectButton);
	}/*mearg UHID*/
	private By registration=By.linkText("Registration");
	private By Merge_UHID=By.linkText("Merge UHID");
	public WebElement getregistration() {
		return getElement(registration);
	}
	public WebElement getMerge_UHID() {
		return getElement(Merge_UHID);
	}
	
}
