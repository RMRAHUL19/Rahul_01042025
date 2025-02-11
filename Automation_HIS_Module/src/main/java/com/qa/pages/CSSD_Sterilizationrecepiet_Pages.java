package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class CSSD_Sterilizationrecepiet_Pages extends BasePage {

	public CSSD_Sterilizationrecepiet_Pages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	util utilobj = new util();
	private By CSSD_Sterilization_issuID=By.id("ctl00_cphpage_gdvSterilizationIssues_ctl02_lbIssueNo");
	public WebElement getCSSD_Sterilization_issuID() {
		return getElement(CSSD_Sterilization_issuID);
}
	

}
