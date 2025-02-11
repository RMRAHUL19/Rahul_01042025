package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class DownloadCRCItemListpage extends BasePage{
	util utilobj=new util();
	public DownloadCRCItemListpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By DownloadCRCItemListpage_categoryDDL=By.id("ctl00_cphpage_ddlCategory");
	public WebElement getDownloadCRCItemListpage_categoryDDL() {
		return  getElement(DownloadCRCItemListpage_categoryDDL);
	}
	
	private By DownloadCRCItemListpage_ActiveRateContectDDL=By.id("ctl00_cphpage_ddlRCList");
	public WebElement getDownloadCRCItemListpage_ActiveRateContectDDL() {
		return  getElement(DownloadCRCItemListpage_ActiveRateContectDDL);
	}
	private By DownloadCRCItemListpage_downloadButton=By.id("ctl00_cphpage_btnSubmit");
	public WebElement getDownloadCRCItemListpage_downloadButton() {
		return  getElement(DownloadCRCItemListpage_downloadButton);
	}
public void testcaseforDownloadCRCItemListpage() throws InterruptedException, AWTException {
	Thread.sleep(2000);
	utilobj.selectDropdown(getDownloadCRCItemListpage_categoryDDL(), driver, "Allopathic");
	Thread.sleep(4000);
	utilobj.selectDropdown(getDownloadCRCItemListpage_categoryDDL(), driver, "Ayurvedic");
	Thread.sleep(4000);
	utilobj.selectDropdown(getDownloadCRCItemListpage_ActiveRateContectDDL(), driver, "All");
	Thread.sleep(4000);
	getDownloadCRCItemListpage_downloadButton().click();
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_DOWN);
//	Thread.sleep(4000);
//	rb.keyPress(KeyEvent.VK_TAB);
//	Thread.sleep(4000);
//	rb.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(4000);
	rb.keyPress(KeyEvent.VK_ENTER);
	
	}
	

}
