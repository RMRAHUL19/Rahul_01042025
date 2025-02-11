package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.util.util;

public class InpatientManagement_nursetaskspages {
  
WebDriver driver;
util utilobj = new util();
	public InpatientManagement_nursetaskspages(WebDriver driver){
		
		this.driver= driver;
		
	}
 
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Nurse Tasks')]")
	@CacheLookup
	WebElement NurseTasks;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_imgbtnBed")
	@CacheLookup
	WebElement Bedsearchicon;
	
	
	@FindBy(how= How.XPATH, using="//select[@id='ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_ddlCriteria']")
	@CacheLookup
	WebElement Dropdown1;
	
	@FindBy(how= How.XPATH, using="/html/body/div[1]/form/div[4]/div[2]/div/div[3]/div[1]/table/tbody/tr/td/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/div[1]/div/div/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/select/option[3]")
	@CacheLookup
	WebElement DropdownclauseValue;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria")
	@CacheLookup
	WebElement Patientnametxtbox;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch")
	@CacheLookup
	WebElement Search;
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")
	@CacheLookup
	WebElement Radiobtn1;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_btnSelect")
	@CacheLookup
	WebElement Select;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_txtFrmDate")
	@CacheLookup
	WebElement FromDate;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_txtToDate")
	@CacheLookup
	WebElement ToDate;
	
	
	@FindBy(how= How.XPATH, using="//select[@id='ctl00_cphpage_ddlFrequency']")
	@CacheLookup
	WebElement Frequency;
	
	
	@FindBy(how= How.XPATH, using="//select[@id='ctl00_cphpage_ddlTask']")
	@CacheLookup
	WebElement Task;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_btnOK']")
	@CacheLookup
	WebElement Ok;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_gdvDisplay_ctl02_txtInterval']")
	@CacheLookup
	WebElement Interval;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_btnSave']")
	@CacheLookup
	WebElement Save;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnClear")
	@CacheLookup
	WebElement Clear;
	@FindBy(how= How.ID, using="ctl00_cphpage_MyMessageBoxInfo_ButtonOK")
	@CacheLookup
	WebElement SuccessMessageOkButton;
	
	
	
	
	public void nursetaskswordpress(String Patient_Name) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(1000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(NurseTasks).click().build().perform();
		Thread.sleep(3000);
		
		Bedsearchicon.click();
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.moveToElement(Dropdown1).click().moveToElement(DropdownclauseValue).click().build().perform();
		
//		utilobj.selectDropdown(Dropdown1, driver, "Starts With");
		//Dropdown1.sendKeys("Starts With");
		Thread.sleep(3000);
		
		
		Patientnametxtbox.sendKeys("IP0");
		Thread.sleep(1000);
		
		Search.click();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(Radiobtn1));
		Radiobtn1.click();
		Thread.sleep(1000);
		
		Select.click();
		Thread.sleep(5000);
		
//		Selecting the dates from calendar From date and To date
		
		        //Selecting the date of surgery	
		        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		        //Getting current date
				Calendar cal = Calendar.getInstance();
				//Displaying current date in the desired format
				System.out.println("Current Date: "+sdf.format(cal.getTime()));
						   
				String newDate = sdf.format(cal.getTime());  
			    //Displaying the new Date after addition of Days to current date
				System.out.println("Date after Addition: "+newDate);  
				Thread.sleep(1000);
		FromDate.clear();
		Thread.sleep(1000);
		FromDate.click();
		Thread.sleep(1000);
		FromDate.sendKeys(newDate);
		Thread.sleep(1000);
		        
		//Selecting the date of surgery	
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMMM-yyyy");
        //Getting current date
		Calendar cal1 = Calendar.getInstance();
		//Displaying current date in the desired format
		System.out.println("Current Date: "+sdf1.format(cal1.getTime()));
				   
		//Number of Days to add
	    cal1.add(Calendar.DAY_OF_MONTH, 15);  
		//Date after adding the days to the current date
		String toDate = sdf.format(cal1.getTime());  
	    //Displaying the new Date after addition of Days to current date
		System.out.println("Date after Addition: "+toDate);  
		
		ToDate.clear();
		ToDate.click();
		ToDate.sendKeys(toDate);
		Thread.sleep(1000);
		
		Select select1= new Select(Frequency);
		select1.selectByVisibleText("BID");
		Thread.sleep(2000);
		
		Select select2= new Select(Task);
		select2.selectByVisibleText("Vitals");
		Thread.sleep(2000);
		
		Ok.click();
		Thread.sleep(3000);
		
		Interval.clear();
		Thread.sleep(3000);
		Interval.sendKeys("5");
		Thread.sleep(1000);		
	Save.click();
wait.until(ExpectedConditions.visibilityOf(SuccessMessageOkButton));
SuccessMessageOkButton.click();
		
	}
		
}

