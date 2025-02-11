package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getSynInsurancedataToHISPages extends BasePage {

	public getSynInsurancedataToHISPages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	//syn insurance data to HIS
		private By SIDH_insuranceNOTextBox=By.id("ctl00_cphpage_txtIPNO");
		private By SIDH_LiveList=By.id("ctl00_cphpage_lnkbtnIPNo");
		private By SIDH_SelcetButton=By.id("ctl00_cphpage_gdvIns_ctl02_btnselect");
		private By SIDH_ClearButton=By.id("ctl00_cphpage_btnClear");
		private By SIDH_UpdatePatientDemograpiDetailButton=By.id("ctl00_cphpage_btnupdate");	
		//syn INsurance data To His
		public WebElement getSIDH_insuranceNOTextBox() {
			return getElement(SIDH_insuranceNOTextBox);
		}
		public WebElement getSIDH_LiveList() {
			return getElement(SIDH_LiveList);
		}
		public WebElement getSIDH_SelcetButton() {
			return getElement(SIDH_SelcetButton);
		}
		public WebElement getSIDH_ClearButton() {
			return getElement(SIDH_ClearButton);
		}
		public WebElement getSIDH_UpdatePatientDemograpiDetailButton() {
			return getElement(SIDH_UpdatePatientDemograpiDetailButton);
		}
}
