package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import com.qa.util.util;

public class InpatientManagement_wardunitspages {
  
	
WebDriver driver;
	
	public InpatientManagement_wardunitspages(WebDriver driver){
		
		this.driver= driver;
		
	}
	util utilobj=new util();
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Ward Units')]")
	@CacheLookup
	WebElement WardUnits;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_imgSearchUnit")
	@CacheLookup
	WebElement UnitNameicon;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")
	@CacheLookup
	WebElement UnitNametxtbox;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSearch")
	@CacheLookup
	WebElement Search;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobtn;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
	@CacheLookup
	WebElement Select;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_tabSearch_tabPnlDoctors_chkDoctors_3")
	@CacheLookup
	WebElement Checkbox ;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_btnSave")
	@CacheLookup
	WebElement Modify ;
	@FindBy(how= How.ID, using="__tab_ctl00_cphpage_tabSearch_tabPnlBeds")
	@CacheLookup
	WebElement Bed ;
	@FindBy(how= How.ID, using="ctl00_cphpage_tabSearch_tabPnlBeds_ddlWard")
	@CacheLookup
	WebElement ddlward ;
	@FindBy(how= How.ID, using="ctl00_cphpage_tabSearch_tabPnlBeds_gdvBeds_ctl07_chkBed")
	@CacheLookup
	WebElement bedcheckbox ;
	
	
	public void wardunitswordpress(String unitname) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(WardUnits).click().build().perform();
		Thread.sleep(3000);
		
		UnitNameicon.click();
		Thread.sleep(2000);
		
		UnitNametxtbox.sendKeys(unitname);
		Thread.sleep(3000);
		
		Search.click();
		Thread.sleep(3000);
		
		Radiobtn.click();
		Thread.sleep(3000);
		
		Select.click();
		Thread.sleep(3000);
		
		Checkbox.click();
		Thread.sleep(3000);
		Bed.click();
		Thread.sleep(3000);
		utilobj.selectDropdown(ddlward, driver, "Female medical ward");
		Thread.sleep(3000);
		bedcheckbox.click();
		Thread.sleep(3000);
	   Modify.click();
		Thread.sleep(3000);
	
		
		
	   driver.findElement(By.id("ctl00_cphpage_MyMessageBox_ButtonOK")).click();
	   Thread.sleep(2000);
	    driver.findElement(By.id("ctl00_cphpage_imgSearchUnit")).click();
	   
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys("Surgery");
		
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSearch")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSelect")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_btnClear")).click();
		Thread.sleep(1000);
		
	}
		
}
