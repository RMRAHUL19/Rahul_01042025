package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.util;

public class OTPriscriptionPages extends BasePage{
	util utilobj=new util();
	public OTPriscriptionPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void testcaseforOTPriscription() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_imgsearchuhid")).click();
		Thread.sleep(2000);
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl03_ddlCriteria")), driver, "Equals");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		//utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl03_ddlCriteria")), driver, "Equals");
		
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl03_txtCriteria")), driver, "1199900090");
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_btnSearch")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")), driver);
		
		
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);

		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_gdvInvestigations_ctl02_imgbtnSearchItem")), driver);

		Thread.sleep(2000);

		// utilobj.ChildWindowforPrescription(driver);
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("txtName")), driver, "cbc");
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("btnSearch")), driver);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ChkSelect4")), driver);
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("btnSelect")), driver);
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		//utilobj.SwitchToChildWindow(driver, " 	Investigations ");
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_gdvInvestigations_ctl02_lblInvestigation")), driver, "COMPLETE BLOOD COUNT ROUTINE, CBC ROUTINE");
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_gdvInvestigations_ctl02_lblspcimen")), driver, "BLOOD WHOLE EDTA");
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_txtDoctor")), driver, "Dr. Tester  ");
		Thread.sleep(2000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnSave")), driver);
		Thread.sleep(2000);
		//driver.close();
		
	}

}
