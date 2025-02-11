package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.util;

public class InpatientReferralWorklistPages extends BasePage {

	public InpatientReferralWorklistPages(WebDriver driver) {
		super(driver);
		
	}
	util utilobj=new util();
	public void dotestcaseforInpatientReferralWorklist() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_imgbtnRefresh")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonCancel")).click();
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_txtDate")), driver,"");
		Thread.sleep(2000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_txtDate")), driver,"30-Jul-2021");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_txtDate")).click();
		Robot robot= new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table[2]/tbody/tr[1]/td/div/div/table/tbody/tr[2]/td[1]/a/span")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("ctl00_cphpage_btnBack")).click();
	}
	
	

}
