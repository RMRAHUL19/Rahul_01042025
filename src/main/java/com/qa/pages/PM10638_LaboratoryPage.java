package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PM10638_LaboratoryPage extends BasePage {

	public PM10638_LaboratoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/* BulkResult screen testname search */
	private By Laboratory_BulkResult_imgTestNameSearch=By.id("ctl00_cphpage_imgTestNameSearch");
	public WebElement getLaboratory_test_imgTestNameSearchLink() {
		return getElement(Laboratory_BulkResult_imgTestNameSearch);
	}
	private By Laboratory_BulkResult_imgTestNameSearch_Name_textbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	public WebElement getLaboratory_test_imgTestNameSearch_Name_textbox() {
		return getElement(Laboratory_BulkResult_imgTestNameSearch_Name_textbox);
	}
	private By Laboratory_BulkResult_imgTestNameSearch_search_button=By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	public WebElement getLaboratory_test_imgTestNameSearch_search_buttonLink() {
		return getElement(Laboratory_BulkResult_imgTestNameSearch_search_button); 
	}
	private By Laboratory_BulkResult_insuranceNotxtbox=By.id("ctl00_cphpage_txtInsuarnce");
	public WebElement getLaboratory_Test_insuranceNotxtbox() {
		return getElement(Laboratory_BulkResult_insuranceNotxtbox);
	}
	private By Laboratory_BulkResult_OkButton=By.id("ctl00_cphpage_btnOK");
	public WebElement getLaboratory_BulkResult_OkButtonLink() {
		return getElement(Laboratory_BulkResult_OkButton);
	}
	private By Laboratory_BulkResult_txtFromDate=By.id("ctl00_cphpage_txtFromDate");
	public WebElement getLaboratory_BulkResult_txtFromDateLink() {
		return getElement(Laboratory_BulkResult_txtFromDate);
	}
	private By Laboratory_BulkResult_txtToDate=By.id("ctl00_cphpage_txtToDate");
	public WebElement geLaboratory_BulkResult_txtToDate() {
		return getElement(Laboratory_BulkResult_txtToDate);
	}
	private By Laboratory_BulkResult_privew=By.id("ctl00_cphpage_btnPreview");
	public WebElement getLaboratory_BulkResult_privewLink() {
		return getElement(Laboratory_BulkResult_privew);
	}
	private By Laboratory_BulkResult_save=By.id("ctl00_cphpage_btnSave");
	public WebElement getLaboratory_BulkResult_saveLink() {
		return getElement(Laboratory_BulkResult_save);
	}	
	private By Laboratory_BulkResult_verifycheckbox=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr/td/div/div/table/tbody/tr[1]/th[9]/span/input");
	public WebElement getLaboratory_BulkResult_verifycheckboxLink() {
		return getElement(Laboratory_BulkResult_verifycheckbox);
	}
}
