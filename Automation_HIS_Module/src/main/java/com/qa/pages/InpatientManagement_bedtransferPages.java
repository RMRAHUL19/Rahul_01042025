package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.util.util;

public class InpatientManagement_bedtransferPages {
 
	
WebDriver driver;
	
	public InpatientManagement_bedtransferPages(WebDriver driver){
		
		this.driver= driver;
		
	}
 
	util utilobj=new util();
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	
	@FindBy(how= How.LINK_TEXT, using="Bed Transfer")
	@CacheLookup
	WebElement BedTransfer;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ImgBtnAdmissionNo']")
	@CacheLookup
	WebElement Admissionnoicon;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria")
	@CacheLookup
	WebElement Dropdown1;
	@FindBy(how= How.XPATH, using="/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[1]/div/div/div/table/tbody/tr[1]/td/table/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/select/option[3]")
	@CacheLookup
	WebElement Dropdown1Value;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")
	@CacheLookup
	WebElement Admisionnametextbox;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch")
	@CacheLookup
	WebElement Search;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobtn;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
	@CacheLookup
	WebElement Select;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ddlWardT")
	@CacheLookup
	WebElement Wardselect;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ddlBedTransfer")
	@CacheLookup
	WebElement Bedselect;
	@FindBy(how= How.XPATH, using="/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[2]/tbody/tr/td[3]/fieldset/table/tbody/tr[1]/td[4]/select/option[2]")
	@CacheLookup
	WebElement BedselectValue;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_btnSave")
	@CacheLookup
	WebElement Transfer;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnClear")
	@CacheLookup
	WebElement clear;
	
	
	public void bedtransferwordpress(String Admission_Name,String Ward_Name) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(BedTransfer).click().build().perform();
		Thread.sleep(3000);
		
		Admissionnoicon.click();
		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(Admisionnametextbox));
		
		
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		ac.moveToElement(Dropdown1).click().build().perform();
		Thread.sleep(1000);
		ac.moveToElement(Dropdown1Value).click().build().perform();
		Thread.sleep(1000);
     Admisionnametextbox.sendKeys(Admission_Name);
		Thread.sleep(3000);
		
		Search.click();
		Thread.sleep(6000);
		
		Radiobtn.click();
		Thread.sleep(2000);
		
		Select.click();
		wait.until(ExpectedConditions.invisibilityOf(Select));
		
		Select select1= new Select(Wardselect);
		select1.selectByVisibleText(Ward_Name);
		Thread.sleep(4000);
		Actions ac2=new Actions(driver);
		ac2.moveToElement(Bedselect).click().moveToElement(BedselectValue).click().build().perform();
		

		Thread.sleep(2000);
		Transfer.click();
		Thread.sleep(2000);
		
		
	    Robot robot= new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
		
	}
		
}

	
		
		
		