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

public class InpatientManagement_wardbedstatuspages {

	WebDriver driver;
	
	public InpatientManagement_wardbedstatuspages(WebDriver driver){
		
		this.driver= driver;
		
	}
	util utilobj = new util();
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Ward Bed Status')]")
	@CacheLookup
	WebElement WardBedStatus;
	
	
	@FindBy(how= How.XPATH, using="//tbody/tr[@id='ctl00_cphpage_lstViewWard_ctrl0_row']/th[1]/img[1]")
	@CacheLookup
	WebElement Plusicon;
	
	
	
	
	public void wardbedstatuswordpress() throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(WardBedStatus).click().build().perform();
		Thread.sleep(3000);
		
		
		Plusicon.click();
		Thread.sleep(2000);
		
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlView")), driver, "Icons");
		Thread.sleep(6000);
		for(int i=1;i<=13;i+=2) {
			
			if(i<11) {
			driver.findElement(By.id("ctl00_cphpage_lstLegend_ctrl0_ctl0"+i+"_imgLegendButton")).click();
			Thread.sleep(2000);
			}
			else {
				driver.findElement(By.id("ctl00_cphpage_lstLegend_ctrl0_ctl"+i+"_imgLegendButton")).click();
				Thread.sleep(2000);
				
			}
			
		}
				
	}
		
}

