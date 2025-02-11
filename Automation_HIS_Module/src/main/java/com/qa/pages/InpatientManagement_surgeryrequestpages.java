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
import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.time.LocalDate;

public class InpatientManagement_surgeryrequestpages {
  
	
WebDriver driver;
	
	public InpatientManagement_surgeryrequestpages(WebDriver driver){
		
		this.driver= driver;
		
	}
 
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Surgery Request')]")
	@CacheLookup
	WebElement SurgeryRequest;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_imgSearchAdmissionNo']")
	@CacheLookup
	WebElement Admissionnosearchicon;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl03_ddlCriteria")
	@CacheLookup
	WebElement Dropdown;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl03_txtCriteria")
	@CacheLookup
	WebElement Bednametxtbox;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']")
	@CacheLookup
	WebElement Search;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobtn;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_btnSelect']")
	@CacheLookup
	WebElement Select;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_txtOrderDatetime")
	@CacheLookup
	WebElement Dateselect;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_gdvProcedureResult_ctl02_imgSearchProcedure']")
	@CacheLookup
	WebElement SearchProcedure;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_ddlCriteria")
	@CacheLookup
	WebElement Dropdown2;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl02_txtCriteria")
	@CacheLookup
	WebElement SurgeryNametxtbox;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch']")
	@CacheLookup
	WebElement Search1;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl05_rdbTemp")
	@CacheLookup
	WebElement Radiobtn1;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
	@CacheLookup
	WebElement Select1;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_gdvProcedureResult_ctl02_chkIsAnastasiaRequired']")
	@CacheLookup
	WebElement checkbox;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_btnSave']")
	@CacheLookup
	WebElement Save;
	
	
	
    public void surgeryrequest(String Bed_Name) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(SurgeryRequest).click().build().perform();
		Thread.sleep(3000);
	
			
		Admissionnosearchicon.click();
		Thread.sleep(2000);
		
		Select select=new Select(Dropdown);
		select.selectByVisibleText("Contains");
		Thread.sleep(1000);
		
		Bednametxtbox.sendKeys(Bed_Name);
		Thread.sleep(1000);
		
		Search.click();
		Thread.sleep(4000);
		
		Radiobtn.click();
		Thread.sleep(1000);
		
		Select.click();
		Thread.sleep(4000);
		
	     //Selecting the date of surgery	
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		//Getting current date
		Calendar cal = Calendar.getInstance();
		//Displaying current date in the desired format
		System.out.println("Current Date: "+sdf.format(cal.getTime()));
		   
		//Number of Days to add
	    cal.add(Calendar.DAY_OF_MONTH, 1);  
		//Date after adding the days to the current date
		String newDate = sdf.format(cal.getTime());  
		//Displaying the new Date after addition of Days to current date
		System.out.println("Date after Addition: "+newDate);   
		
		
		Dateselect.clear();
		Dateselect.sendKeys(newDate);
		//Thread.sleep(2000);
		
		SearchProcedure.click();
		Thread.sleep(1000);
		
		//Selecting the surgery
		Select select1=new Select(Dropdown2);
		select1.selectByVisibleText("Contains");
		Thread.sleep(1000);
		
		SurgeryNametxtbox.sendKeys("app");
		Thread.sleep(1000);
		
		
		Search1.click();
		Thread.sleep(5000);
		
		Radiobtn1.click();
		Thread.sleep(1000);
		
		Select1.click();
		Thread.sleep(2000);
		
		checkbox.click();
		Thread.sleep(1000);
		
		
		Save.click();
		Thread.sleep(4000);
		
	    Robot robot= new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
		
	}
		
}


