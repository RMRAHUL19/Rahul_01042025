package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class CSSD_ItemRequestworklist_Pages extends BasePage {

	public CSSD_ItemRequestworklist_Pages(WebDriver driver) {
		super(driver);
		
	}
	util utilobj = new util();
	private By cssd_itemrequestworklist_orderNo=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[1]/a");
	public WebElement getcssd_itemrequest_orderNo() {
		return getElement(cssd_itemrequestworklist_orderNo);
	}
	private By cssd_itemrequestworklist_ItemIssueQuantity=By.id("gdvSearchResult_ctl02_txtIssuQty");
	public WebElement getcssd_itemrequestworklist_ItemIssueQuantity() {
		return getElement(cssd_itemrequestworklist_ItemIssueQuantity);
	}
	private By cssd_itemrequestworklist_ItemIssueSaveButton=By.id("btnSave");
	public WebElement getcssd_itemrequestworklist_ItemIssueSaveButton() {
		return getElement(cssd_itemrequestworklist_ItemIssueSaveButton);
	}
	public void testcaseforCSSD_ItemRequestworklist_Pages() throws InterruptedException {
		utilobj.JSClick(getcssd_itemrequest_orderNo(), driver);
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, " 	Item Issues - Dhanwantri ");
		Thread.sleep(2000);
		utilobj.JSEnterText(getcssd_itemrequestworklist_ItemIssueQuantity(), driver, "1");
		Thread.sleep(2000);
		utilobj.JSClick(getcssd_itemrequestworklist_ItemIssueSaveButton(), driver);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, "Dhanwantri");
	}
	
	

}
