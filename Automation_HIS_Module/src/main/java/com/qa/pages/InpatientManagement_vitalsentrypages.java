package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qa.util.util;

public class InpatientManagement_vitalsentrypages {
	
	WebDriver driver;
	util utilobj=new util();
	public InpatientManagement_vitalsentrypages(WebDriver driver){
		this.driver= driver;
	}
	
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Vitals Entry')]")
	@CacheLookup
	WebElement VitalsEntry;
	
	@FindBy(how= How.XPATH, using="//select[@id='ctl00_cphpage_ddlBedName']")
	@CacheLookup
	WebElement Bed;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_grdVital_ctl02_txtValue']")
	@CacheLookup
	WebElement TempValue;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_grdVital_ctl03_txtValue']")
	@CacheLookup
	WebElement Pulse;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_grdVital_ctl04_txtValue']")
	@CacheLookup
	WebElement RespiratoryRate;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_grdVital_ctl05_txtValue']")
	@CacheLookup
	WebElement MeanBP;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_grdVital_ctl06_txtValue']")
	@CacheLookup
	WebElement SPO2;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_grdVital_ctl07_txtValue']")
	@CacheLookup
	WebElement SystolicBP;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_grdVital_ctl08_txtValue']")
	@CacheLookup
	WebElement DiastolicBP;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_grdVital_ctl09_txtValue']")
	@CacheLookup
	WebElement BMI;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_btnSave']")
	@CacheLookup
	WebElement Save;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnClear")
	@CacheLookup
	WebElement Clear;
	@FindBy(how= How.ID, using="ctl00_cphpage_ddlBedName")
	@CacheLookup
	WebElement BedDll;
	@FindBy(how= How.XPATH, using="//html//body//div[1]//form//div[4]//div[2]//div//div[1]//div[1]//table//tbody//tr//td//table//tbody//tr[1]//td[4]//select//option[@value='44602']")
	@CacheLookup                    
	WebElement BedDllvalue;
	
	public void vitalsentrywordpress(String Bed_Name,String temp,String pulse,String resprate,String meanBP,
			String spo2,String systBP,String diaBP,String bmi) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(VitalsEntry).click().build().perform();
		Thread.sleep(4000);
		
		
		//Enter the value and remarks for the patient
		
		TempValue.sendKeys(temp);
		Thread.sleep(1000);
		Pulse.sendKeys(pulse);
		Thread.sleep(1000);
		RespiratoryRate.sendKeys(resprate);
		Thread.sleep(1000);
		MeanBP.sendKeys(meanBP);
		Thread.sleep(1000);
		SPO2.sendKeys(spo2);
		Thread.sleep(1000);
		SystolicBP.sendKeys(systBP);
		Thread.sleep(1000);
		DiastolicBP.sendKeys(diaBP);
		Thread.sleep(1000);
		BMI.sendKeys(bmi);
		Thread.sleep(1000);
		Clear.click();
		Thread.sleep(5000);
//		driver.findElement(By.id("ctl00_cphpage_imgsearchadmissionno")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys("IP102100018");
//		Thread.sleep(1000);
//		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSelect")).click();
//		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		ac.moveToElement(BedDll).click().build().perform();
		Thread.sleep(2000);
		ac.moveToElement(BedDllvalue).click().build().perform();
		
		Thread.sleep(5000);
		//Enter the value and remarks for the patient
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl02_txtValue")).sendKeys(temp);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl02_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl03_txtValue")).sendKeys(pulse);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl03_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl04_txtValue")).sendKeys(resprate);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl04_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl05_txtValue")).sendKeys(meanBP);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl05_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl06_txtValue")).sendKeys(spo2);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl06_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl07_txtValue")).sendKeys(systBP);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl07_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl08_txtValue")).sendKeys(diaBP);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl08_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl09_txtValue")).sendKeys(bmi);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_grdVital_ctl09_txtRemarks")).sendKeys("Remarks");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
		Thread.sleep(1000);
		utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
		
		
			
		
	
	
	}
	
}
