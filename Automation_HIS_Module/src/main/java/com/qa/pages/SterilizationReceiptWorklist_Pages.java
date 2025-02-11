package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class SterilizationReceiptWorklist_Pages extends BasePage {
	util utilobj = new util();

	public SterilizationReceiptWorklist_Pages(WebDriver driver) {
		super(driver);
		
	}
	
	private By sterlizationReciptWorkList_mymsgok=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getsterlizationReciptWorkList_mymsgok() {
		return getElement(sterlizationReciptWorkList_mymsgok);
	}
	private By sterlizationReciptWorkList_Fromdate_txtbox=By.id("ctl00_cphpage_txtFromdate");
	public WebElement getsterlizationReciptWorkList_Fromdate_txtbox() {
		return getElement(sterlizationReciptWorkList_Fromdate_txtbox);
	}
	
	private By sterlizationReciptWorkList_todate_txtbox=By.id("ctl00_cphpage_txtTodate");
	public WebElement getsterlizationReciptWorkList_todate_txtbox() {
		return getElement(sterlizationReciptWorkList_todate_txtbox);
	}
	private By sterlizationReciptWorkList_btnOK=By.id("ctl00_cphpage_btnOk");
	public WebElement getsterlizationReciptWorkList_btnOK() {
		return getElement(sterlizationReciptWorkList_btnOK);
	}
	private By sterlizationReciptWorkList_IssueID=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[3]/a");
	public WebElement getSterlizationReciptWorkList_IssueID() {
		return getElement(sterlizationReciptWorkList_IssueID);
	}
	private By sterlizationReciptWorkList_Acknowladge=By.id("ctl00_cphpage_btnAcknowledge");
	public WebElement getsterlizationReciptWorkList_Acknowladge() {
		return getElement(sterlizationReciptWorkList_Acknowladge);
	}
	public void testcaseforSterilizationReceiptWorklist_Pages() throws InterruptedException {
		Thread.sleep(2000);
		 getsterlizationReciptWorkList_mymsgok().click();
		 Thread.sleep(2000);
		getsterlizationReciptWorkList_Fromdate_txtbox().clear();
		Thread.sleep(2000);		
		getsterlizationReciptWorkList_Fromdate_txtbox().sendKeys("08-Jun-2021");
		Thread.sleep(2000);
		getsterlizationReciptWorkList_todate_txtbox().clear();
		Thread.sleep(2000);
		getsterlizationReciptWorkList_todate_txtbox().sendKeys("09-Jun-2021");
		Thread.sleep(2000);
		getsterlizationReciptWorkList_btnOK().click();
        Thread.sleep(2000);
        getSterlizationReciptWorkList_IssueID().click();
        Thread.sleep(2000);		
		utilobj.SwitchToChildWindow(driver, " 	AcknowledgeSterilizationReceipt - Dhanwantri ");
		Thread.sleep(2000);
		//getsterlizationReciptWorkList_Acknowladge().click();
		Thread.sleep(2000);
		driver.close();
		utilobj.SwitchToChildWindow(driver, "Dhanwantri");
		//137
		//105
	}
	
	
	
	

	
	

}
