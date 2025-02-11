package com.qa.pages;

import java.awt.AWTException;
import java.util.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.util.util;

public class InpatientManagement_warddashboardpages {
  
WebDriver driver;
	
	public InpatientManagement_warddashboardpages(WebDriver driver){
		
		this.driver= driver;
		
	}
 util utilobj=new util();
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Ward Dash Board')]")
	@CacheLookup
	WebElement WardDashBoard;
	
	
	@FindBy(how= How.XPATH, using="//a[@id='ctl00_cphpage_gdvDashBoard_ctl02_lnkslot6']")
	@CacheLookup
	WebElement Link;
	
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_gdvPatients_ctl02_admissionNo")
	@CacheLookup
	WebElement Admissionnolink;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_grdVital_ctl02_txtValue")
	@CacheLookup
	WebElement Temperaturetxtbox;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_grdVital_ctl03_txtValue']")
	@CacheLookup
	WebElement Pulsetxtbox;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_btnSave']")
	@CacheLookup
	WebElement Save;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_MyMessageBoxInfo_ButtonOK")
	@CacheLookup
	WebElement OK;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_btnClear")
	@CacheLookup
	WebElement Backbtn;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnPreviousDate")
	@CacheLookup
	WebElement PreviousDate ;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnCurrentDate")
	@CacheLookup
	WebElement CurrentDate ;
	@FindBy(how= How.ID, using="/html/body/div[1]/form/div[4]/div[2]/div/div/h1/span")
	@CacheLookup
	WebElement Screenname ;
	
	
	
	public void warddashboardwordpress(String Temperature, String Pulse) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(WardDashBoard).click().build().perform();
		Thread.sleep(3000);
		

		//Get all the links with the link text of value 1 in the webelement link
        List<WebElement> link=driver.findElements(By.linkText("1"));
		System.out.println(link.size());
		
		for(int i=0;i<link.size();i++)
    	{
			if(!(link.get(i).getText().isEmpty()))
			{
				System.out.println(link.get(i).getText());
				if(link.get(i).getText()=="1")
					Thread.sleep(2000);
			
				link.get(i).click();
				Thread.sleep(2000);
			
			   
		        Admissionnolink.click();
		        Thread.sleep(6000);
		        WebDriverWait wait=new WebDriverWait(driver, 300);
		        wait.until(ExpectedConditions.visibilityOf(Backbtn));
		        Backbtn.click();
	    	    Thread.sleep(2000);
	    		break;
			}
    	}	
		        
		
		
	    
	   
					 
	}
	
}
	


