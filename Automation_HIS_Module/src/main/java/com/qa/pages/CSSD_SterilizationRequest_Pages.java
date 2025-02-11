package com.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.util;

public class CSSD_SterilizationRequest_Pages extends BasePage {

	public CSSD_SterilizationRequest_Pages(WebDriver driver) {
		
		super(driver);
	}
	CSSD_Sterilization_Pages CSSDSterilizationPages;
	util utilobj = new util();
	public String order_No=null;
	public String date1=null;
	public String date=null;
	private By CSSD_Sterilization_ItemDDL=By.id("ctl00_cphpage_gdvItemProfiles_ctl02_ddlItemType");
	public WebElement getCSSD_Sterilization_ItemDDL() {
		return getElement(CSSD_Sterilization_ItemDDL);
	}
	private By CSSD_Sterilization_imgProfileItemSearch=By.id("ctl00_cphpage_gdvItemProfiles_ctl02_imgProfileItemSearch");
	public WebElement getCSSD_Sterilization_imgProfileItemSearch() {
		return getElement(CSSD_Sterilization_imgProfileItemSearch);
	}
	private By CSSD_Sterilization_itemNameTxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getCSSD_Sterilization_itemNameTxtbox() {
		return getElement(CSSD_Sterilization_itemNameTxtbox);
	}
	private By CSSD_Sterilization_itemsearch_buttonSearch=By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	public WebElement getCSSD_Sterilization_itemsearch_buttonSearch() {
		return getElement(CSSD_Sterilization_itemsearch_buttonSearch);
	}
	private By CSSD_Sterilization_itemsearch_Radiobutton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl11_rdbTemp");
	public WebElement getCSSD_Sterilization_itemsearch_Radiobutton() {
		return getElement(CSSD_Sterilization_itemsearch_Radiobutton);
	}
	
	private By CSSD_Sterilization_itemsearch_buttonSelect=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getCSSD_Sterilization_itemsearch_buttonSelect() {
		return getElement(CSSD_Sterilization_itemsearch_buttonSelect);
	}
	private By CSSD_Sterilization_QuantityTxtbox=By.id("ctl00_cphpage_gdvItemProfiles_ctl02_txtQty");
	public WebElement getCSSD_Sterilization_QuantityTxtbox() {
		return getElement(CSSD_Sterilization_QuantityTxtbox);
	}
	private By CSSD_Sterilization_PriorityDLL=By.id("ctl00_cphpage_gdvItemProfiles_ctl02_ddlPriority");
	public WebElement getCSSD_Sterilization_PriorityDLL() {
		return getElement(CSSD_Sterilization_PriorityDLL);
	}
	private By CSSD_Sterilization_Reqirdate=By.id("ctl00_cphpage_gdvItemProfiles_ctl02_txtReqDateTime");
	public WebElement getCSSD_Sterilization_Reqirdate() {
		return getElement(CSSD_Sterilization_Reqirdate);
	}
	private By CSSD_Sterilization_RemarksTxtbox=By.id("ctl00_cphpage_txtRemarks");
	public WebElement getCSSD_Sterilization_RemarksTxtbox() {
		return getElement(CSSD_Sterilization_RemarksTxtbox);
	}
	private By CSSD_Sterilization_ButtonSave=By.id("ctl00_cphpage_btnSave");
	public WebElement getCSSD_Sterilization_ButtonSave() {
		return getElement(CSSD_Sterilization_ButtonSave);
	}
	
	private By CSSD_Sterilization_OrderNotxtbox=By.id("ctl00_cphpage_txtOrderNo");
	public WebElement getCSSD_Sterilization_OrderNotxtbox() {
		return getElement(CSSD_Sterilization_OrderNotxtbox);
}
	private By CSSD_SterilizationRequiest_DateTime=By.id("ctl00_cphpage_txtDateTime");
	public WebElement getCSSD_SterilizationRequiest_DateTime() {
		return getElement(CSSD_SterilizationRequiest_DateTime);
}
	private By CSSD_SterilizationRequiest_QOH=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/fieldset/div/div/table/tbody/tr[2]/td[5]");
	public WebElement getCSSD_SterilizationRequiest_QOH() {
		return getElement(CSSD_SterilizationRequiest_QOH);
}
	private By CSSD_SterilizationRequiest_Mymsgbox_buttonOK=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getCSSD_SterilizationRequiest_Mymsgbox_buttonOK() {
		return getElement(CSSD_SterilizationRequiest_Mymsgbox_buttonOK);
		
}
	
	
	
	//SterilizationRequestWorklist Locator
	private By CSSD_SterilizationRequiestworkList_fromdate=By.id("ctl00_cphpage_txtFromdate");
	public WebElement getCSSD_SterilizationRequiestworkList_fromdate() {
		return getElement(CSSD_SterilizationRequiestworkList_fromdate);
}
	
	
	private By CSSD_SterilizationRequiestworkList_orderno=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/table/tbody/tr[2]/td[1]/a");
	public WebElement getCSSD_SterilizationRequiestworkList_orderno() {
		return getElement(CSSD_SterilizationRequiestworkList_orderno);
}
	private By CSSD_SterilizationRequiestworkList_Acknowladge=By.id("ctl00_cphpage_btnAcknowledge");
	public WebElement getCSSD_SterilizationRequiestworkList_Acknowladge() {
		return getElement(CSSD_SterilizationRequiestworkList_Acknowladge);
}
	
	private By CSSD_SterilizationSterlizeIsue_SaveButton=By.id("ctl00_cphpage_btnSave");
	public WebElement getCSSD_SterilizationSterlizeIsue_SaveButton() {
		return getElement(CSSD_SterilizationSterlizeIsue_SaveButton);
}
	private By CSSD_SterilizationSterlizeIsue_IsueQuantity=By.id("ctl00_cphpage_gdvItemProfiles_ctl02_txtIssueQty");
	public WebElement getCSSD_SterilizationSterlizeIsue_IsueQuantity() {
		return getElement(CSSD_SterilizationSterlizeIsue_IsueQuantity);
}
	private By CSSD_SterilizationSterlizeIsue_okButton=By.id("ctl00_cphpage_btnOk");
	public WebElement getCSSD_SterilizationSterlizeIsue_okButton() {
		return getElement(CSSD_SterilizationSterlizeIsue_okButton);
}
	
	
	
	
	
	
	
	public void testCaseForCSSD_Sterilization_Pages() throws InterruptedException {
		Thread.sleep(1000);
		utilobj.selectDropdown(getCSSD_Sterilization_ItemDDL(), driver, "Item");
		Thread.sleep(2000);
		getCSSD_Sterilization_imgProfileItemSearch().click();
		Thread.sleep(2000);
		getCSSD_Sterilization_itemNameTxtbox().sendKeys("Scissor");
		Thread.sleep(2000);
		getCSSD_Sterilization_itemsearch_buttonSearch().click();
		Thread.sleep(2000);
		getCSSD_Sterilization_itemsearch_Radiobutton().click();
		Thread.sleep(2000);
		getCSSD_Sterilization_itemsearch_buttonSelect().click();
		Thread.sleep(3000);
		getCSSD_Sterilization_QuantityTxtbox().sendKeys("1");
		Thread.sleep(2000);
		
		utilobj.selectDropdown(getCSSD_Sterilization_PriorityDLL(), driver, "Normal");		
		Thread.sleep(2000);
		System.out.println(getCSSD_SterilizationRequiest_DateTime().getText());
		Thread.sleep(2000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		String date = (String) jsExecutor.executeScript("return document.getElementById('ctl00_cphpage_txtDateTime').value");
		Thread.sleep(2000);
		System.out.println(date);
		Thread.sleep(2000);
		
		
		 date1=date.substring(0, 11);
		Thread.sleep(2000);
		System.out.println(date1);
		Thread.sleep(2000);
		getCSSD_Sterilization_Reqirdate().sendKeys(date1);
		Thread.sleep(2000);
		getCSSD_Sterilization_RemarksTxtbox().sendKeys("Test Remarks");
		Thread.sleep(2000);
		
		
		
		getCSSD_Sterilization_ButtonSave().click();
		Thread.sleep(2000);
		getCSSD_SterilizationRequiest_Mymsgbox_buttonOK().click();
		Thread.sleep(2000);
		order_No=driver.findElement(By.id("ctl00_cphpage_txtOrderNo")).getText();
		Thread.sleep(5000);
	     System.out.println(order_No);
	    
	    
	    	
		//Thread.sleep(1000);
		//getCSSD_Sterilization_OrderNotxtbox().click();
		
		
		
	}
	
			
	public void testCaseForCSSD_SterilizationRequestWorklist_Pages() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		Thread.sleep(2000);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMMM-yyyy");
		  Calendar cal1 = Calendar.getInstance();
		  String Date11 = sdf1.format(cal1.getTime());
		  System.out.println(Date11);
		  cal1.add(Calendar.DAY_OF_MONTH, -2930);
		  String newDate1 = sdf1.format(cal1.getTime());
		  System.out.println(newDate1);
		Thread.sleep(2000);
		getCSSD_SterilizationRequiestworkList_fromdate().clear();
		Thread.sleep(2000);
		getCSSD_SterilizationRequiestworkList_fromdate().sendKeys(newDate1);
		Thread.sleep(2000);
		utilobj.JSClick(getCSSD_SterilizationSterlizeIsue_okButton(), driver);
		Thread.sleep(5000);
		
		
		getCSSD_SterilizationRequiestworkList_orderno().click();
	Thread.sleep(2000);		utilobj.SwitchToChildWindow(driver, "Acknowledge Sterilization Request - Dhanwantri");
		Thread.sleep(2000);
//		getCSSD_SterilizationRequiestworkList_Acknowladge().click();
		Thread.sleep(2000);
	driver.close();
	Thread.sleep(1000);
		utilobj.SwitchToChildWindow(driver,"Dhanwantri");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_btnClear")).click();
		
	}
	
	
	
	
}
