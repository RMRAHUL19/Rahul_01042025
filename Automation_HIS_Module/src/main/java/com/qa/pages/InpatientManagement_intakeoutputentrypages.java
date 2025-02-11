package com.qa.pages;

import static org.testng.Assert.expectThrows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.util;


public class InpatientManagement_intakeoutputentrypages {
  
	
    WebDriver driver;
    util utilobj=new util();
	
	public InpatientManagement_intakeoutputentrypages(WebDriver driver){
		
		this.driver= driver;
		
	}
 
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'InPatient Management')]")
	@CacheLookup
	WebElement InpatientManagement;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Intake Output Entry')]")
	@CacheLookup
	WebElement IntakeOutputEntry;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_imgbtnSearchAdmissionNo']")
	@CacheLookup
	WebElement AdmissionNoSearch;
	
	
	@FindBy(how= How.ID, using="ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")
	@CacheLookup
	WebElement IPNoSearchtxtbox;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_btnSearch']")
	@CacheLookup
	WebElement Searchbtn;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp']")
	@CacheLookup
	WebElement Radiobtnselect;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_btnSelect']")
	@CacheLookup
	WebElement Selectbtn;
	
	@FindBy(how= How.XPATH, using="/html/body/div[1]/form/div[4]/div[2]/div/div[1]/div/div/table/tbody/tr[2]/td[2]/input")
	@CacheLookup
	WebElement IntakeNameSelect;
	
	@FindBy(how= How.CSS, using="#ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria")
	@CacheLookup
	WebElement intakenametxtbox;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_btnSearch']")
	@CacheLookup
	WebElement intakeitemsearch;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl03_rdbTemp']")
	@CacheLookup
	WebElement IntakeNameradiobtn;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_gdvIntakeOuput_ctl02_txtQty']")
	@CacheLookup
	WebElement Quantity;
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_ucCommonSearch_btnSelect']")
	@CacheLookup
	WebElement Selectbtn1;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='ctl00_cphpage_btnSave']")
	@CacheLookup
	WebElement Save;
	@FindBy(how= How.ID, using="ctl00_cphpage_btnClear")
	@CacheLookup
	WebElement Clear;
	@FindBy(how= How.ID, using="ctl00_cphpage_MyMessageBox_ButtonOK")
	@CacheLookup
	WebElement SuccusMessageOkButton;
	
	@FindBy(how= How.ID, using="/html/body/div[1]/form/div[4]/div[2]/div/div[6]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")
	@CacheLookup
	WebElement BlackOverLay;
	
	
	
	public void intakeoutputwordpress(String IP_No, String intake_item) throws InterruptedException, AWTException{
		
		Actions action= new Actions(driver);
		action.moveToElement(InpatientManagement).build().perform();
		Thread.sleep(2000);
		
		Actions action1= new Actions(driver);
		action1.moveToElement(IntakeOutputEntry).click().build().perform();
		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(AdmissionNoSearch));
		Thread.sleep(4000);
		
		//Entering the IP No to search a patient
		
		AdmissionNoSearch.click();
		
		wait.until(ExpectedConditions.visibilityOf(IPNoSearchtxtbox));
		Thread.sleep(3000);
		

		
		IPNoSearchtxtbox.sendKeys("IP0");
		Thread.sleep(2000);
		
		Searchbtn.click();//IP111900031
		wait.until(ExpectedConditions.visibilityOf(Radiobtnselect));
		Thread.sleep(2000);
		
		
		Radiobtnselect.click();
		Thread.sleep(2000);
		
		Selectbtn.click();
//		wait.until(ExpectedConditions.invisibilityOf(BlackOverLay));
		Thread.sleep(5000);
		
		//selecting an intake name
		utilobj.JSClick(IntakeNameSelect, driver);
		//IntakeNameSelect.click();
		
		
		
		Thread.sleep(4000);
		intakenametxtbox.sendKeys(intake_item);
		Thread.sleep(2000);
		
		intakeitemsearch.click();
		wait.until(ExpectedConditions.visibilityOf(IntakeNameradiobtn));
		Thread.sleep(2000);
		
		IntakeNameradiobtn.click();
		Thread.sleep(2000);
		
		Selectbtn1.click();
//		wait.until(ExpectedConditions.invisibilityOf(BlackOverLay));
		Thread.sleep(5000);
		
//		Actions action3= new Actions(driver);
//		action3.moveToElement(Quantity).click().build().perform();
		
		Quantity.clear();
		Thread.sleep(2000);
		Quantity.sendKeys("40");
		Thread.sleep(2000);
		
		Save.click();
//		wait.until(ExpectedConditions.visibilityOf(SuccusMessageOkButton));
		Thread.sleep(4000);
		SuccusMessageOkButton.click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_rdIntakeOuput_1")).click();//output entry
		Thread.sleep(4000);
		//input[@id='ctl00_cphpage_imgbtnSearchAdmissionNo']
		AdmissionNoSearch.click();
		
		wait.until(ExpectedConditions.visibilityOf(IPNoSearchtxtbox));
		Thread.sleep(3000);
		

		
		IPNoSearchtxtbox.sendKeys("IP0");
		Thread.sleep(2000);
		
		Searchbtn.click();//IP111900031
		wait.until(ExpectedConditions.visibilityOf(Radiobtnselect));
		Thread.sleep(2000);
		
		
		Radiobtnselect.click();
		Thread.sleep(2000);
		
		Selectbtn.click();
//		wait.until(ExpectedConditions.invisibilityOf(BlackOverLay));
		Thread.sleep(5000);

		
		IntakeNameSelect.click();
		wait.until(ExpectedConditions.visibilityOf(intakenametxtbox));
		Thread.sleep(2000);
		
		
		intakenametxtbox.sendKeys("Vomit");
		Thread.sleep(2000);
		
		intakeitemsearch.click();
		wait.until(ExpectedConditions.visibilityOf(IntakeNameradiobtn));
		Thread.sleep(2000);
		
		IntakeNameradiobtn.click();
		Thread.sleep(2000);
		
		Selectbtn1.click();
//		wait.until(ExpectedConditions.invisibilityOf(BlackOverLay));
		Thread.sleep(4000);		
		Quantity.clear();
		Thread.sleep(2000);
		Quantity.sendKeys("40");
		Thread.sleep(2000);
		
		Save.click();
		wait.until(ExpectedConditions.visibilityOf(SuccusMessageOkButton));
		Thread.sleep(2000);
		SuccusMessageOkButton.click();
    
		
	}
	
}
