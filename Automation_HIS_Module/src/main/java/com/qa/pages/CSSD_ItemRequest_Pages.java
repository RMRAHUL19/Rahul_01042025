package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class CSSD_ItemRequest_Pages extends BasePage {

	public CSSD_ItemRequest_Pages(WebDriver driver) {
		super(driver);
	}
	util utilobj = new util();
	private By cssd_itemrequest_ItemTypeddl=By.id("ctl00_cphpage_gdvSearchResults_ctl02_ddlItemType");
	public WebElement getcssd_itemrequest_ItemTypeddl() {
		return getElement(cssd_itemrequest_ItemTypeddl);
	}
	private By cssd_itemrequest_profileItemNamesearchImg=By.id("ctl00_cphpage_gdvSearchResults_ctl02_imgProfileItemSearch");
	public WebElement getcssd_itemrequest_profileItemNamesearchImg() {
		return getElement(cssd_itemrequest_profileItemNamesearchImg);
	}
	private By cssd_itemrequest_profileItemNamesearchtxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getcssd_itemrequest_profileItemNamesearchtxtbox() {
		return getElement(cssd_itemrequest_profileItemNamesearchtxtbox);
	}
	private By cssd_itemrequest_profileItemNamesearchButton=By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	public WebElement getcssd_itemrequest_profileItemNamesearchButton() {
		return getElement(cssd_itemrequest_profileItemNamesearchButton);
	}
	private By cssd_itemrequest_profileItemNamesearchradiobutton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl03_rdbTemp");
	public WebElement getcssd_itemrequest_profileItemNamesearchradiobutton() {
		return getElement(cssd_itemrequest_profileItemNamesearchradiobutton);
	}
	private By cssd_itemrequest_profileItemNamesearchSelectButton=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getcssd_itemrequest_profileItemNamesearchSelectButton() {
		return getElement(cssd_itemrequest_profileItemNamesearchSelectButton);
	
	}
	private By cssd_itemrequest_Quantity=By.id("ctl00_cphpage_gdvSearchResults_ctl02_txtQty");
	public WebElement getcssd_itemrequest_Quantity() {
		return getElement(cssd_itemrequest_Quantity);
	}
	private By cssd_itemrequest_PriorityDDL=By.id("ctl00_cphpage_gdvSearchResults_ctl02_ddlPriority");
	public WebElement getcssd_itemrequest_PriorityDDL() {
		return getElement(cssd_itemrequest_PriorityDDL);
	}
	private By cssd_itemrequest_RemarksTextBox=By.id("ctl00_cphpage_txtRemarks");
	public WebElement getcssd_itemrequest_RemarksTextBox() {
		return getElement(cssd_itemrequest_RemarksTextBox);
	}
	private By cssd_itemrequest_saveButton=By.id("ctl00_cphpage_btnSave");
	public WebElement getcssd_itemrequest_saveButton() {
		return getElement(cssd_itemrequest_saveButton);
	}
	public void testcaseforCSSDItemRequestpage() throws InterruptedException {
		utilobj.selectDropdown(getcssd_itemrequest_ItemTypeddl(), driver, "Profile");
		Thread.sleep(2000);
		getcssd_itemrequest_profileItemNamesearchImg().click();
		Thread.sleep(2000);
		getcssd_itemrequest_profileItemNamesearchtxtbox().sendKeys("test");
		Thread.sleep(2000);
		getcssd_itemrequest_profileItemNamesearchButton().click();
		Thread.sleep(2000);
		getcssd_itemrequest_profileItemNamesearchradiobutton().click();
		Thread.sleep(2000);
		getcssd_itemrequest_profileItemNamesearchSelectButton().click();
		Thread.sleep(2000);
		getcssd_itemrequest_Quantity().sendKeys("1");
		Thread.sleep(2000);
		utilobj.selectDropdown(getcssd_itemrequest_PriorityDDL(), driver, "Urgent");
		Thread.sleep(2000);
		getcssd_itemrequest_RemarksTextBox().sendKeys("Test Remarks.....");
		Thread.sleep(2000);
		getcssd_itemrequest_saveButton().click();
		Thread.sleep(2000);
		
		
	}
	
	
}
