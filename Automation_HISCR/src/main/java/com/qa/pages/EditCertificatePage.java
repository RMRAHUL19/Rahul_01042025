package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditCertificatePage extends BasePage {

	public EditCertificatePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	                                              
	private By EditCertificate_SearchImage=By.id("ctl00_cphpage_ImgSearchCertificateno");
	private By EditCertificate_Insurance_NO_DLL=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_ddlCriteria");
	                                                   
	private By EditCertificate_Certification_NO_TextBox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	                                                                
	private By EditCertificate_Certification_No_SearchButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	private By EditCertificate_Certification_No_RadioButton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	private By EditCertificate_Certification_No_SelectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	                                                                
	private By EditCertificate_RadioButtonSpellchange=By.id("ctl00_cphpage_rbnspellchange");
	private By EditCertificate_RadioButtonCencetCertificate=By.id("ctl00_cphpage_rbncancelcert");
	private By EditCertificate_RadioButton_CertificateTypeChange=By.id("ctl00_cphpage_rbntypechange");
	private By EditCertificate_RadioButton_DOA_DOCChanged=By.id("ctl00_cphpage_rbnDOA");
	private By EditCertificate_RadioButton_DDLTypeChange=By.id("ctl00_cphpage_ddltypechange");
	private By EditCertificate_RadioButton_ButtonUpdate=By.id("ctl00_cphpage_btnUpdate");
	private By EditMeterNityCertificate_RemarksTextBox=By.id("ctl00_cphpage_txtMaternityRemrks");
	
	
	
	public WebElement getEditCertificate_SearchImage() {
		return getElement(EditCertificate_SearchImage);

	}
	public WebElement getEditCertificate_Insurance_NO_DLL() {
		return getElement(EditCertificate_Insurance_NO_DLL);

	}
	public WebElement getEditCertificate_Certification_NO_TextBox() {
		return getElement(EditCertificate_Certification_NO_TextBox);

	}
	public WebElement getEditCertificate_Certification_No_SearchButton() {
		return getElement(EditCertificate_Certification_No_SearchButton);

	}
	public WebElement getEditCertificate_Certification_No_RadioButton() {
		return getElement(EditCertificate_Certification_No_RadioButton);

	}
	public WebElement getEditCertificate_Certification_No_SelectButton() {
		return getElement(EditCertificate_Certification_No_SelectButton);

	}
	public WebElement getEditCertificate_RadioButtonSpellchange() {
		return getElement(EditCertificate_RadioButtonSpellchange);

	}
	public WebElement getEditCertificate_RadioButtonCencetCertificate() {
		return getElement(EditCertificate_RadioButtonCencetCertificate);

	}
	public WebElement getEditCertificate_RadioButton_CertificateTypeChange() {
		return getElement(EditCertificate_RadioButton_CertificateTypeChange);

	}
	public WebElement getEditCertificate_RadioButton_DOA_DOCChanged() {
		return getElement(EditCertificate_RadioButton_DOA_DOCChanged);

	}
	public WebElement getEditCertificate_RadioButton_DDLTypeChange() {
		return getElement(EditCertificate_RadioButton_DDLTypeChange);

	}
	public WebElement getEditCertificate_RadioButton_ButtonUpdate() {
		return getElement(EditCertificate_RadioButton_ButtonUpdate);

	}
	public WebElement getEditMeterNityCertificate_RemarksTextBoxElement(){
		return getElement(EditMeterNityCertificate_RemarksTextBox);

	}
	

}
