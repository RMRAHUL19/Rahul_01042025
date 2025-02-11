package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class InpatientManagement_UpdateBedpages {
	
	
	WebDriver driver;
	
	public InpatientManagement_UpdateBedpages(WebDriver driver){
		
		this.driver= driver;
		
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Update Bed Status')]")
	@CacheLookup
	WebElement UpdateBedStatus;
	
	
	@FindBy(how=How.XPATH,using="//select[@id='ctl00_cphpage_ddlBedName']")
	@CacheLookup
	WebElement BedName;
	
	
	
	@FindBy(how=How.XPATH,using="//select[@id='ctl00_cphpage_ddlChangetoStatus']")
	@CacheLookup
	WebElement ChangetoStatus;
	
	
	@FindBy(how=How.XPATH,using="//select[@id='ctl00_cphpage_ddlInformedDoctors']")
	@CacheLookup
	WebElement InformtoDoctor;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_cphpage_btnSave']")
	@CacheLookup
	WebElement btnSave;
	@FindBy(how=How.ID,using="ctl00_cphpage_ddlChangetoStatus")
	@CacheLookup
	WebElement changestatus;
	
	@FindBy(how=How.ID,using="ctl00_cphpage_txtStatusOnArrivalRemarks")
	@CacheLookup
	WebElement Arrivalstatus;
	@FindBy(how=How.ID,using="ctl00_cphpage_btnClear")
	@CacheLookup
	WebElement Clear;
	
	
	
  
  public void UpdateBedwordpress(String Bed_Name,String InformDoctor) throws InterruptedException, AWTException {
	  
	  Actions action1= new Actions(driver);
	  action1.moveToElement(InpatientManagement).build().perform();
	  Thread.sleep(2000);
	  
	  Actions action2= new Actions(driver);
	  action2.moveToElement(UpdateBedStatus).click().build().perform();
	  Thread.sleep(3000);
	  
	  //Updating a bed status from allocated to occupied
	  
	  Select select=new Select(BedName);
	  select.selectByVisibleText(Bed_Name);
	  Thread.sleep(2000);
	  
	  
	 Select select1= new Select(ChangetoStatus);
	 select1.selectByVisibleText("To Be Cleaned");
	 Thread.sleep(2000);
	 select1.selectByVisibleText("Not InUse");
	 Thread.sleep(2000);
	 select1.selectByVisibleText("Vacant");
	 //selecting a doctor from drop down
	 
	 Select select2= new Select(InformtoDoctor);
	 select2.selectByVisibleText(InformDoctor);
	 Thread.sleep(2000);
	 Arrivalstatus.sendKeys("Test Remarks");
	 Thread.sleep(2000);
	 Clear.click();
	 //btnSave.click();
	 Thread.sleep(2000);
	 
	 
	 Robot robot= new Robot();
	 robot.keyPress(KeyEvent.VK_ENTER);
	 Thread.sleep(2000);
		
	  
	  
  }
}
