package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getdemographicDetailPages extends BasePage {

	public getdemographicDetailPages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	//update demographic detail               
		private By UDD_AdmissionNoSearch=By.id("ctl00_cphpage_imgEmrno");
		private By UDD_AdmissionNoTextBox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
		private By UDD_AdmissionNobtnSearch=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
		private By UDD_AdmissionNoRadioButton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
		private By UDD_AdmissionNobtnSelect=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
		private By UDD_SaveButton=By.id("ctl00_cphpage_btnSave");
		private By UDD_ClearButton=By.id("ctl00_cphpage_btnClear");
		private By feedback_succesOKButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
		//update demographic detail
		public WebElement getUDD_AdmissionNoIMGSearch() {
			return getElement(UDD_AdmissionNoSearch);
		}
		public WebElement getUDD_AdmissionNoTextBox() {
			return getElement(UDD_AdmissionNoTextBox);
		}
		public WebElement getUDD_AdmissionNobtnSearch() {
			return getElement(UDD_AdmissionNobtnSearch);
		}
		public WebElement getUDD_AdmissionNoRadioButton() {
			return getElement(UDD_AdmissionNoRadioButton);
		}
		public WebElement getUDD_AdmissionNobtnSelect() {
			return getElement(UDD_AdmissionNobtnSelect);
		}
		public WebElement getUDD_SaveButton() {
			return getElement(UDD_SaveButton);
		}
		public WebElement getUDD_ClearButton() {
			return getElement(UDD_ClearButton);
		}
		public WebElement getfeedback_succesOKButton() {
			return getElement(feedback_succesOKButton);
		}
		

}
