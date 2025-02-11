package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.util;

public class Check_In_Admission_of_Reffered_PatientsPages extends BasePage {

	public Check_In_Admission_of_Reffered_PatientsPages(WebDriver driver) {
		super(driver);
		
	}
	util utilobj = new util();
	private By CIAORP_InsuranceNotxtbox = By.id("ctl00_cphpage_txtIPNO");

	public WebElement getCIAORP_InsuranceNotxtbox() {
		return getElement(CIAORP_InsuranceNotxtbox);
	}
	private By CIAORP_InsuranceLivelistLink = By.id("ctl00_cphpage_lnkbtnIPNo");

	public WebElement getCIAORP_InsuranceLivelistLink() {
		return getElement(CIAORP_InsuranceLivelistLink);
	}
	private By CIAORP_Livelist_chkboxselect = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");

	public WebElement getCIAORP_Livelist_chkboxselect() {
		return getElement(CIAORP_Livelist_chkboxselect);
	}
	private By CIAORP_LiveList_selectButton = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");

	public WebElement getCIAORP_LiveList_selectButton() {
		return getElement(CIAORP_LiveList_selectButton);
	}
	private By CIAORP_Admit_Link = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/div/table/tbody/tr[2]/td[11]/a");

	public WebElement getCIAORP_Admit_Link() {
		return getElement(CIAORP_Admit_Link);
	}
	private By CIAORP_Admit_addmissionDLL = By.id("ctl00_cphpage_ddlAdmissionType");

	public WebElement getCIAORP_Admit_addmissionDLL() {
		return getElement(CIAORP_Admit_addmissionDLL);
	}
	private By CIAORP_Admit_UnitDLL = By.id("ctl00_cphpage_ddlUnit");

	public WebElement getCIAORP_Admit_UnitDLL() {
		return getElement(CIAORP_Admit_UnitDLL);
	}
	private By CIAORP_Admit_buttonsave = By.id("ctl00_cphpage_btnSave");

	public WebElement getCIAORP_Admit_buttonsave() {
		return getElement(CIAORP_Admit_buttonsave);
	}
	private By CIAORP_Admit_RefrellsourceofaddmissionDLL = By.id("ctl00_cphpage_ddlAdmissionSrc");

	public WebElement getCIAORP_Admit_RefrellsourceofaddmissionDLL() {
		return getElement(CIAORP_Admit_RefrellsourceofaddmissionDLL);
	}
	private By CIAORP_Admit_buttonprint = By.id("ctl00_cphpage_btnPrint");

	public WebElement getCIAORP_Admit_buttonprint() {
		return getElement(CIAORP_Admit_buttonprint);
	}
	private By CIAORP_Admit_informationpopupyesButton = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");

	public WebElement getCIAORP_Admit_informationpopupyesButton() {
		return getElement(CIAORP_Admit_informationpopupyesButton);
	}
	private By CIAORP_Admit_UhidCheckBox = By.id("ctl00_cphpage_txtUHID");

	public WebElement getCIAORP_Admit_UhidCheckBox() {
		return getElement(CIAORP_Admit_UhidCheckBox);
	}
	private By CIAORP_Admit_UhidOKbutton = By.id("ctl00_cphpage_btnOk");

	public WebElement getCIAORP_Admit_UhidOKbutton() {
		return getElement(CIAORP_Admit_UhidOKbutton);
	}
	private By CIAORP_Admit_UhidClearbutton = By.id("ctl00_cphpage_btnClear");

	public WebElement getCIAORP_Admit_UhidClearbutton() {
		return getElement(CIAORP_Admit_UhidClearbutton);
	}
	
	
	
	public void testcaseforCheck_In_Admission_of_Reffered_PatientsPages() throws InterruptedException {
		Thread.sleep(4000);
//		getCIAORP_Admit_UhidCheckBox().sendKeys("AP01.0005004545");
//		Thread.sleep(4000);
//		getCIAORP_Admit_UhidOKbutton().click();
//		Thread.sleep(4000);
//		getCIAORP_Admit_UhidClearbutton().click();
//		Thread.sleep(4000);		
		getCIAORP_InsuranceNotxtbox().sendKeys("1199900090");
		Thread.sleep(4000);			
		getCIAORP_InsuranceLivelistLink().click();
		 WebDriverWait wait=new WebDriverWait(driver,300);
		 wait.until(ExpectedConditions.visibilityOf(getCIAORP_Livelist_chkboxselect()));
		getCIAORP_Livelist_chkboxselect().click();
		Thread.sleep(4000);
		
		getCIAORP_LiveList_selectButton().click();
		wait.until(ExpectedConditions.visibilityOf(getCIAORP_Admit_Link()));
		getCIAORP_Admit_UhidClearbutton().click();//clr button
    	Thread.sleep(4000);	
		getCIAORP_InsuranceNotxtbox().sendKeys("1199900090");
		Thread.sleep(4000);			
		getCIAORP_InsuranceLivelistLink().click();
		wait.until(ExpectedConditions.visibilityOf(getCIAORP_Livelist_chkboxselect()));
		getCIAORP_Livelist_chkboxselect().click();
		Thread.sleep(4000);
		getCIAORP_LiveList_selectButton().click();
		wait.until(ExpectedConditions.visibilityOf(getCIAORP_Admit_Link()));
		getCIAORP_Admit_Link().click();
		wait.until(ExpectedConditions.visibilityOf(getCIAORP_Admit_addmissionDLL()));
		utilobj.selectDropdown(getCIAORP_Admit_addmissionDLL(), driver, "On Transfer/Referral");
		Thread.sleep(3000);
		utilobj.selectDropdown(getCIAORP_Admit_RefrellsourceofaddmissionDLL(), driver, "Transfer from a hospital");
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_PermanentSameAsPresent")), driver);
		Thread.sleep(3000);
		utilobj.selectDropdown(getCIAORP_Admit_UnitDLL(), driver, "Dummyunit");
		Thread.sleep(2000);
		//getCIAORP_Admit_buttonsave().click();
//		Thread.sleep(2000);
//		getCIAORP_Admit_informationpopupyesButton().click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
//		Thread.sleep(2000);
//		getCIAORP_Admit_buttonprint().click();
//		Thread.sleep(2000);
//		utilobj.SwitchToChildWindow(driver, "PrintReports.aspx");
//		driver.manage().window().maximize();
//		driver.close();
//		utilobj.SwitchToChildWindow(driver, "Dhanwantri");
	utilobj.MoveElement(driver.findElement(By.linkText("Registration")), driver);
	Thread.sleep(2000);
	utilobj.JSClick(driver.findElement(By.linkText("Check-In / Admission of Reffered Patients")), driver);
	Thread.sleep(2000);
	}
	
	

}
