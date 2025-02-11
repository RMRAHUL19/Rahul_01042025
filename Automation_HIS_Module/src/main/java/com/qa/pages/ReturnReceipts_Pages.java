package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class ReturnReceipts_Pages extends BasePage {

	public ReturnReceipts_Pages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	util utilobj = new util();
	private By ReturnRecipt_mymsgok=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getReturnRecipt_mymsgok() {
		return getElement(ReturnRecipt_mymsgok);
	}
	private By ReturnRecipt_FromeDate=By.id("ctl00_cphpage_txtFromdate");
	public WebElement getReturnRecipt_FromeDate() {
		return getElement(ReturnRecipt_FromeDate);
	}
	private By ReturnRecipt_OkButton=By.id("ctl00_cphpage_btnOk");
	public WebElement getReturnRecipt_OkButton() {
		return getElement(ReturnRecipt_OkButton);
	}
	private By ReturnRecipt_OrderNo=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[2]/a");
	public WebElement getReturnRecipt_OrderNo() {
		return getElement(ReturnRecipt_OrderNo);
	}
	private By ReturnRecipt_AcknowledgeReturnReceiptstxtRemarks=By.id("txtRemarks");
	public WebElement getReturnRecipt_AcknowledgeReturnReceiptstxtRemarks() {
		return getElement(ReturnRecipt_AcknowledgeReturnReceiptstxtRemarks);
	}
	
	private By ReturnRecipt_AcknowledgeReturnReceiptsAcknowladgeButton=By.id("btnAcknowledge");
	public WebElement getReturnRecipt_AcknowledgeReturnReceiptsAcknowladgeButton() {
		return getElement(ReturnRecipt_AcknowledgeReturnReceiptsAcknowladgeButton);
	}
	
	
	
	//01-Jan-2012  	AcknowledgeReturnReceipts -  Dhanwantri txtRemarks btnAcknowledge
	public void testcaseforReturnReciept() throws InterruptedException {
		Thread.sleep(2000);
		
		getReturnRecipt_mymsgok().click();
		Thread.sleep(2000);
		getReturnRecipt_FromeDate().clear();
		Thread.sleep(2000);
		getReturnRecipt_FromeDate().sendKeys("01-Jan-2012");
		Thread.sleep(2000);
		getReturnRecipt_OkButton().click();
		Thread.sleep(2000);
		getReturnRecipt_OrderNo().click();
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, " 	AcknowledgeReturnReceipts -  Dhanwantri ");
		Thread.sleep(2000);
		getReturnRecipt_AcknowledgeReturnReceiptstxtRemarks().sendKeys("Test Remarks....");
		Thread.sleep(2000);
		//getReturnRecipt_AcknowledgeReturnReceiptsAcknowladgeButton().click();
		Thread.sleep(2000);
		driver.close();
		utilobj.SwitchToChildWindow(driver, "Dhanwantri");
		
		
		
		
	}
}
