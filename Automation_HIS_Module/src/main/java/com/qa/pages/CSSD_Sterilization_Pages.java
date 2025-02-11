package com.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class CSSD_Sterilization_Pages extends BasePage {

	public CSSD_Sterilization_Pages(WebDriver driver) {
		super(driver);
		
	}
	public String date1=null;
	public String date2=null;
	util utilobj = new util();
	
	private By CSSD_Sterilization_Machine_name_searchimg=By.id("ctl00_cphpage_imgMachinename");
	public WebElement getCSSD_Sterilization_Machine_name_searchimg() {
		return getElement(CSSD_Sterilization_Machine_name_searchimg);
}
	private By CSSD_Sterilization_Machine_name_searchtxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getCSSD_Sterilization_Machine_name_searchtxtbox() {
		return getElement(CSSD_Sterilization_Machine_name_searchtxtbox);
}
	private By CSSD_Sterilization_Machine_name_searchbutton=By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
	public WebElement getCSSD_Sterilization_Machine_name_searchbutton() {
		return getElement(CSSD_Sterilization_Machine_name_searchbutton);
}
	
	private By CSSD_Sterilization_Machine_name_Radiobutton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	public WebElement getCSSD_Sterilization_Machine_name_Radiobutton() {
	return getElement(CSSD_Sterilization_Machine_name_Radiobutton);
}
	private By CSSD_Sterilization_Machine_name_selectbutton=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	public WebElement getCSSD_Sterilization_Machine_name_selectbutton() {
		return getElement(CSSD_Sterilization_Machine_name_selectbutton);
}
	private By CSSD_Sterilization_BoardGenaricname_ddl=By.id("ctl00_cphpage_ddlboards");
	public WebElement getCSSD_Sterilization_BoardGenaricname_ddl() {
		return getElement(CSSD_Sterilization_BoardGenaricname_ddl);
}
	private By CSSD_Sterilization_DateTime=By.id("ctl00_cphpage_txtDatetime");
	public WebElement getCSSD_Sterilization_DateTime() {
		return getElement(CSSD_Sterilization_DateTime);
}
	private By CSSD_Sterilization_Loaddatee=By.id("ctl00_cphpage_txtLoaddate");
	public WebElement getCSSD_Sterilization_Loaddatee() {
		return getElement(CSSD_Sterilization_Loaddatee);
}
	private By CSSD_Sterilization_verifyByimgsearch=By.id("ctl00_cphpage_imgButtonVerifiedby");
	public WebElement getCSSD_Sterilization_verifyByimgsearch() {
		return getElement(CSSD_Sterilization_verifyByimgsearch);
}
	private By CSSD_Sterilization_verifyByFullNametxtbox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria");
	public WebElement getCSSD_Sterilization_verifyByFullNametxtbox() {
		return getElement(CSSD_Sterilization_verifyByFullNametxtbox);
}
private By CSSD_Sterilization_verifyByFullNamesearchbutton=By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
public WebElement getCSSD_Sterilization_verifyByFullNamesearchbutton() {
	return getElement(CSSD_Sterilization_verifyByFullNamesearchbutton);
}
private By CSSD_Sterilization_verifyByFullNameradioButton=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
public WebElement getCSSD_Sterilization_verifyByFullNameradioButton() {
	return getElement(CSSD_Sterilization_verifyByFullNameradioButton);
}
private By CSSD_Sterilization_verifyByFullNameEmpCode=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
public WebElement getCSSD_Sterilization_verifyByFullNameEmpCode() {
	return getElement(CSSD_Sterilization_verifyByFullNameEmpCode);
}

private By CSSD_Sterilization_verifyByFullName_selectButton=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
public WebElement CSSD_Sterilization_verifyByFullName_selectButton() {
	return getElement(CSSD_Sterilization_verifyByFullName_selectButton);
}
private By CSSD_Sterilization_FromRequestDepartmantImgsearch=By.id("ctl00_cphpage_imgitemsoftrequests");
public WebElement getCSSD_Sterilization_FromRequestDepartmantImgsearch() {
	return getElement(CSSD_Sterilization_FromRequestDepartmantImgsearch);
}
private By CSSD_Sterilization_FromRequestDepartmantREQDATETIME=By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtDate");
public WebElement getCSSD_Sterilization_FromRequestDepartmantREQDATETIME() {
	return getElement(CSSD_Sterilization_FromRequestDepartmantREQDATETIME);
}
private By CSSD_Sterilization_FromRequestDepartmantsearchButton=By.id("ctl00_cphpage_ucCommonSearch_btnSearch");
public WebElement getCSSD_Sterilization_FromRequestDepartmantsearchButton() {
	return getElement(CSSD_Sterilization_FromRequestDepartmantsearchButton);
}
private By CSSD_Sterilization_FromRequestDepartmantItemCheckBox=By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_chkTemp");
public WebElement getCSSD_Sterilization_FromRequestDepartmantItemCheckBox() {
	return getElement(CSSD_Sterilization_FromRequestDepartmantItemCheckBox);
}
private By CSSD_Sterilization_FromRequestDepartmantItemselectButton=By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
public WebElement getCSSD_Sterilization_FromRequestDepartmantItemselectButton() {
	return getElement(CSSD_Sterilization_FromRequestDepartmantItemselectButton);
}
private By CSSD_Sterilization_FromRequestDepartmantSterlizeQty=By.id("ctl00_cphpage_gdvSearchResults_ctl02_txtSterilizeQty");
public WebElement getCSSD_Sterilization_FromRequestDepartmantSterlizeQty() {
	return getElement(CSSD_Sterilization_FromRequestDepartmantSterlizeQty);
}
private By CSSD_Sterilization_FromRequestDepartmantSaveButton=By.id("ctl00_cphpage_btnSave");
public WebElement getCSSD_Sterilization_FromRequestDepartmantSaveButton() {
	return getElement(CSSD_Sterilization_FromRequestDepartmantSaveButton);
}
private By CSSD_Sterilization_FromRequestDepartmantexpiryDate=By.id("ctl00_cphpage_gdvSearchResults_ctl02_txtexpirydate");
public WebElement getCSSD_Sterilization_FromRequestDepartmantexpiryDate() {
	return getElement(CSSD_Sterilization_FromRequestDepartmantexpiryDate);
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
	private By CSSD_SterilizationSterlizeIsue_IsueQuantity=By.id("ctl00_cphpage_gdvItemProfiles_ctl02_txtIssueQty");
	public WebElement getCSSD_SterilizationSterlizeIsue_IsueQuantity() {
		return getElement(CSSD_SterilizationSterlizeIsue_IsueQuantity);
}
	private By CSSD_SterilizationSterlizeIsue_OkButton=By.id("ctl00_cphpage_btnOk");
	public WebElement getCSSD_SterilizationSterlizeIsue_OkButton() {
		return getElement(CSSD_SterilizationSterlizeIsue_OkButton);
}
	
	private By CSSD_SterilizationSterlizeIsue_SaveButton=By.id("ctl00_cphpage_btnSave");
	public WebElement getCSSD_SterilizationSterlizeIsue_SaveButton() {
		return getElement(CSSD_SterilizationSterlizeIsue_SaveButton);
}
	
	
public void testcaseforsterilazationpage() throws InterruptedException {
	Thread.sleep(2000);
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	Thread.sleep(2000);
	String date = (String) jsExecutor.executeScript("return document.getElementById('ctl00_cphpage_txtDatetime').value");
	Thread.sleep(2000);
	date1=date.substring(0, 11);
	Thread.sleep(2000);

	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
	//Getting current date
	Calendar cal = Calendar.getInstance();
	//Displaying current date in the desired format
	System.out.println("Current Date: "+sdf.format(cal.getTime()));
			   
	//Number of Days to add
    cal.add(Calendar.DAY_OF_MONTH, 4);  
	//Date after adding the days to the current date
	String newDate = sdf.format(cal.getTime());  
    //Displaying the new Date after addition of Days to current date
	System.out.println("Date after Addition: "+newDate); 
	
	getCSSD_Sterilization_Machine_name_searchimg().click();
	Thread.sleep(2000);
	getCSSD_Sterilization_Machine_name_searchtxtbox().sendKeys("autocl");
	Thread.sleep(2000);
	getCSSD_Sterilization_Machine_name_searchbutton().click();
	Thread.sleep(2000);
	getCSSD_Sterilization_Machine_name_Radiobutton().click();
	Thread.sleep(2000);
	getCSSD_Sterilization_Machine_name_selectbutton().click();
	Thread.sleep(10000);
	System.out.println("i m hear");
	utilobj.selectDropdown(getCSSD_Sterilization_BoardGenaricname_ddl(), driver, "ABC sterl inst");
	System.out.println("i m hear after");
	
	Thread.sleep(2000);
	getCSSD_Sterilization_Loaddatee().sendKeys(date1);
	Thread.sleep(2000);
	getCSSD_Sterilization_verifyByimgsearch().click();
	Thread.sleep(2000);
	getCSSD_Sterilization_verifyByFullNameEmpCode().sendKeys("1111111111");
	Thread.sleep(2000);
	getCSSD_Sterilization_verifyByFullNametxtbox().sendKeys("Test");
	Thread.sleep(2000);
	getCSSD_Sterilization_verifyByFullNamesearchbutton().click();
	Thread.sleep(2000);
	getCSSD_Sterilization_verifyByFullNameradioButton().click();
	Thread.sleep(2000);
	CSSD_Sterilization_verifyByFullName_selectButton().click();
	Thread.sleep(2000);
	getCSSD_Sterilization_FromRequestDepartmantImgsearch().click();
	Thread.sleep(2000);
	getCSSD_Sterilization_FromRequestDepartmantREQDATETIME().sendKeys(date1);
	Thread.sleep(2000);
	getCSSD_Sterilization_FromRequestDepartmantsearchButton().click();
	Thread.sleep(2000);
	getCSSD_Sterilization_FromRequestDepartmantItemCheckBox().click();
	Thread.sleep(2000);
	getCSSD_Sterilization_FromRequestDepartmantItemselectButton().click();
	Thread.sleep(2000);
	getCSSD_Sterilization_FromRequestDepartmantSterlizeQty().clear();
	Thread.sleep(2000);
	getCSSD_Sterilization_FromRequestDepartmantSterlizeQty().sendKeys("2");
	Thread.sleep(5000);	
	getCSSD_Sterilization_FromRequestDepartmantexpiryDate().clear();
	Thread.sleep(1000);
	getCSSD_Sterilization_FromRequestDepartmantexpiryDate().sendKeys(newDate);
	Thread.sleep(5000);
	//getCSSD_Sterilization_FromRequestDepartmantSaveButton().click();
	//Thread.sleep(5000);
	
	
	
}
public void testCaseForCSSD_SterilizationRequestWorklistAftersterlize_Pages() throws InterruptedException {
	Thread.sleep(2000);
	getCSSD_SterilizationRequiestworkList_fromdate().sendKeys(date1);
	Thread.sleep(2000);
	getCSSD_SterilizationSterlizeIsue_OkButton().click();
	Thread.sleep(2000);
	getCSSD_SterilizationRequiestworkList_orderno().click();
	Thread.sleep(2000);
	utilobj.SwitchToChildWindow(driver, "Acknowledge Sterilization Request - Dhanwantri");
	Thread.sleep(2000);
//	getCSSD_SterilizationSterlizeIsue_IsueQuantity().sendKeys("2");
//	Thread.sleep(2000);
	getCSSD_SterilizationRequiestworkList_Acknowladge().click();
	Thread.sleep(2000);
	driver.close();
	Thread.sleep(2000);
	utilobj.SwitchToChildWindow(driver,"Sterilization Issues - Dhanwantri ");
}
	
	
	
	
}
