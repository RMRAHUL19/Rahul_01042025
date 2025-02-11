package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CSSD_ItemProfileRequest_pages extends BasePage {

	public CSSD_ItemProfileRequest_pages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By cssd_ItemProfilenametxtbox=By.id("ctl00_cphpage_txtItemprofilename");
	public WebElement getcssd_ItemProfilenametxtbox() {
		return getElement(cssd_ItemProfilenametxtbox);
	}
	private By cssd_ItemNameImg=By.id("ctl00_cphpage_gdvSearchResult_ctl02_imgItem");
	public WebElement getcssd_ItemNameImg() {
		return getElement(cssd_ItemNameImg);
	}
	private By cssd_ItemNameImg2=By.id("ctl00_cphpage_gdvSearchResult_ctl03_imgItem");
	public WebElement getcssd_ItemNameImg2() {
		return getElement(cssd_ItemNameImg2);
	}
	
	private By cssd_ItemNameSearchtxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	//ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria
	public WebElement getcssd_ItemNameSearchtxtbox() {
		return getElement(cssd_ItemNameSearchtxtbox);
	}
	private By cssd_ItemNameSearchButton=By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	
	public WebElement getcssd_ItemNameSearchButton() {
		return getElement(cssd_ItemNameSearchButton);
	}
	private By cssd_ItemNameRadioButton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl11_rdbTemp");
	public WebElement getcssd_ItemNameRadioButton() {
		return getElement(cssd_ItemNameRadioButton);
	}
	private By cssd_ItemNameselectButton=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getcssd_ItemNameselectButton() {
		return getElement(cssd_ItemNameselectButton);
	}
	private By cssd_ItemQuantityTxtbox=By.id("ctl00_cphpage_gdvSearchResult_ctl02_txtQuantity");
	public WebElement getcssd_ItemQuantityTxtbox() {
		return getElement(cssd_ItemQuantityTxtbox);
	}
	private By cssd_ItemQuantityTxtboxforGenralTray=By.id("ctl00_cphpage_gdvSearchResult_ctl03_txtQuantity");
	public WebElement getcssd_ItemQuantityTxtboxforGenralTray() {
		return getElement(cssd_ItemQuantityTxtboxforGenralTray);
	}
	
	private By cssd_ItemRemarkstxtbox=By.id("ctl00_cphpage_txtRemarks");
	public WebElement getcssd_ItemRemarkstxtbox() {
		return getElement(cssd_ItemRemarkstxtbox);
	}
	private By cssd_SaveButton=By.id("ctl00_cphpage_btnSave");
	public WebElement getcssd_SaveButton() {
		return getElement(cssd_SaveButton);
	}
	private By cssd_PopUpSave=By.id("popupok");
	public WebElement cssd_PopUpSave() {
		return getElement(cssd_PopUpSave);
	}
	private By cssd_ItemNameGeneralTrayRadioButton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl03_rdbTemp");
	public WebElement getcssd_ItemNameGeneralTrayRadioButton() {
		return getElement(cssd_ItemNameGeneralTrayRadioButton);
	}
	
	public void testcaseforCssd_ItemProfileRequest_Pages() throws InterruptedException {
		getcssd_ItemProfilenametxtbox().sendKeys("My_profile");
		Thread.sleep(2000);
		getcssd_ItemNameImg().click();
		Thread.sleep(2000);
		getcssd_ItemNameSearchtxtbox().sendKeys("Scissor");
		Thread.sleep(2000);
		getcssd_ItemNameSearchButton().click();
		Thread.sleep(5000);
		getcssd_ItemNameRadioButton().click();
		Thread.sleep(2000);
		getcssd_ItemNameselectButton().click();
		Thread.sleep(2000);
		getcssd_ItemQuantityTxtbox().clear();
		Thread.sleep(5000);
		getcssd_ItemQuantityTxtbox().sendKeys("2");
		Thread.sleep(2000);
		getcssd_ItemNameImg2().click();
		Thread.sleep(2000);
		getcssd_ItemNameSearchtxtbox().sendKeys("Gene");
		Thread.sleep(2000);
		getcssd_ItemNameSearchButton().click();
		Thread.sleep(2000);
		getcssd_ItemNameGeneralTrayRadioButton().click();
		Thread.sleep(2000);
		getcssd_ItemNameselectButton().click();
		Thread.sleep(2000);
		getcssd_ItemQuantityTxtboxforGenralTray().clear();
		Thread.sleep(2000);
		getcssd_ItemQuantityTxtboxforGenralTray().sendKeys("1");
		Thread.sleep(2000);
		getcssd_ItemRemarkstxtbox().sendKeys("Test Remarks.....");
		Thread.sleep(2000);
		getcssd_SaveButton().click();
		Thread.sleep(2000);
		//cssd_PopUpSave().click();
		
		
		
		
	}
	
	
	

	
}
