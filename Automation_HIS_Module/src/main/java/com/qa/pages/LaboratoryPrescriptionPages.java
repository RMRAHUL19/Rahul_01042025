package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.util;

public class LaboratoryPrescriptionPages extends BasePage {

	public LaboratoryPrescriptionPages(WebDriver driver) {
		super(driver);
	}

	util utilobj = new util();

	String parent3=null;

	private By UHIDSearchBtn=By.id("ctl00_cphpage_imgsearchuhid");

	private By InsuranceEquals=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl03_ddlCriteria");

	private By InsuranceNo=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl03_txtCriteria");

	private By SearchBtn=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_btnSearch");

	private By RadioBtn=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");

	private By SelectBtn=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");

	private By DoctorSearch=By.id("ctl00_cphpage_imgDoctor");

	private By DoctorName=By.id("txtName");

	private By DoctorSearchBtn=By.id("btnSearch");

	private By DoctorChkBox=By.id("ChkSelect0");

	private By DoctorSelectBtn=By.id("btnSelect");

	private By InvestigationsSearch=By.id("ctl00_cphpage_gdvInvestigations_ctl02_imgbtnSearchItem");

	private By InvestigationText=By.id("txtName");

	private By InvestigationSearchBtn=By.id("btnSearch");

	private By CheckBox=By.id("ChkSelect0");

	private By InvestigationSelect=By.id("btnSelect");

	private By SaveBtn=By.id("ctl00_cphpage_btnSave");

	public WebElement getUHIDSearchBtn() {
		return getElement(UHIDSearchBtn);
	}

	public WebElement getInsuranceEquals() {
		return getElement(InsuranceEquals);
	}

	public WebElement getInsuranceNo() {
		return getElement(InsuranceNo);
	}

	public WebElement getSearchBtn() {
		return getElement(SearchBtn);
	}

	public WebElement getRadioBtn() {
		return getElement(RadioBtn);
	}


	public WebElement getSelectBtn() {
		return getElement(SelectBtn);
	}

	public WebElement getDoctorSearch() {
		return getElement(DoctorSearch);
	}

	public WebElement getDoctorName() {
		return getElement(DoctorName);
	}

	public WebElement getDoctorSearchBtn() {
		return getElement(DoctorSearchBtn);
	}

	public WebElement getDoctorChkBox() {
		return getElement(DoctorChkBox);
	}

	public WebElement getDoctorSelectBtn() {
		return getElement(DoctorSelectBtn);
	}

	public WebElement getInvestigationsSearch() {
		return getElement(InvestigationsSearch);
	}

	public WebElement getInvestigationText() {
		return getElement(InvestigationText);
	}

	public WebElement getInvestigationSearchBtn() {
		return getElement(InvestigationSearchBtn);
	}

	public WebElement getCheckBox() {
		return getElement(CheckBox);
	}

	public WebElement getInvestigationSelect() {
		return getElement(InvestigationSelect);
	}

	public WebElement getSaveBtn() {
		return getElement(SaveBtn);
	}
	private By Laboratory_prescription_Doctor=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td[2]/input[2]");
	public WebElement getLaboratory_prescription_Doctor() {
		return getElement(Laboratory_prescription_Doctor);
	}
	private By Laboratory_prescription_Doctor_Name=By.xpath("/html/body/form/div[4]/table/tbody/tr/td/table/tbody/tr/td[1]/input");
	public WebElement getLaboratory_prescription_Doctor_Name() {
		return getElement(Laboratory_prescription_Doctor_Name);
	}
	private By Laboratory_prescription_Doctor_=By.id("ctl00_cphpage_txtDoctor");
	public WebElement getLaboratory_prescription_Doctor_() {
		return getElement(Laboratory_prescription_Doctor_);
		//html/body/div[1]/form/div[4]/div[2]/div/div/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td[2]/input[1]
	}
	private By Laboratory_prescription_investigationTextbox=By.id("ctl00_cphpage_gdvInvestigations_ctl02_lblInvestigation");
	public WebElement getLaboratory_prescription_investigationTextbox() {
		return getElement(Laboratory_prescription_investigationTextbox);
	//	/html/body/form/div[4]/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/input
	}
	private By Laboratory_prescription_SampleTextbox=By.id("ctl00_cphpage_gdvInvestigations_ctl02_lblspcimen");
	public WebElement getLaboratory_prescription_SampleTextbox() {
		return getElement(Laboratory_prescription_SampleTextbox);
	//	/html/body/form/div[4]/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/input
	}
	
	
	
	

	public void doLabPrescriptionPageTest(String IPNumber, String DoctorName, String Prescription) throws InterruptedException, AWTException {
		
			
		Thread.sleep(3000);	
		getUHIDSearchBtn().click();
		Thread.sleep(3000);
		getInsuranceEquals().sendKeys("Equals");
		Thread.sleep(3000);
		getInsuranceNo().sendKeys(IPNumber);
		Thread.sleep(3000);
		getSearchBtn().click();
		Thread.sleep(3000);
		getRadioBtn().click();
		Thread.sleep(3000);
		getSelectBtn().click();		
		Thread.sleep(3000);
		getLaboratory_prescription_Doctor_().sendKeys("Dr. ESIC Test ");
		Thread.sleep(3000);
		utilobj.JSEnterText(getLaboratory_prescription_investigationTextbox(), driver, "ACETYLCHOLINE RECEPTOR BLOCKING ANTIBODY; ACHR BLOCKING ANTIBODY");
		//utilobj.JSClick(getInvestigationsSearch(),driver);
		Thread.sleep(3000);
		utilobj.JSEnterText(getLaboratory_prescription_SampleTextbox(), driver, "SERUM, PLAIN VIAL / PLAIN SELF-FILLING PRE VACCUM SPECIMEN TUBE");
		Thread.sleep(3000);
		getSaveBtn().click();
	   
//	    getInvestigationText().sendKeys("blo");
		
		
//		utilobj.JSClick(getInvestigationsSearch(),driver);
//		Thread.sleep(1000);
//		driver.switchTo().alert();
		
		
		      
		//Thread.sleep(1000);
//		utilobj.JSEnterText(getInvestigationText(), driver,"blo");
		//getInvestigationText().sendKeys("blo");
		//Thread.sleep(1000);
		//getInvestigationSearchBtn().click();
		//Thread.sleep(1000);
		
		
		
		

/**/
//String parent3 = driver.getWindowHandle();
//		
//		utilobj.Window(driver);
//		
//	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		utilobj.SwitchToChildWindow(driver, parent3);
//		utilobj.JSClick(getInvestigationsSearch(),driver);
//		utilobj.ChildWindow(driver);
//
//		Thread.sleep(1000);
//		System.out.println(driver.getTitle());
//		getInvestigationText().sendKeys("blo");
//		
//		Thread.sleep(1000);
//		
//		Thread.sleep(1000);
//		getInvestigationSearchBtn().click();
//		Thread.sleep(1000);
//		getCheckBox().click();
//		Thread.sleep(2000);
//
//			Thread.sleep(5000);
//		getInvestigationSelect().click();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
//		driver.switchTo().window(parent3);
//		Thread.sleep(1000);
//		System.out.println(driver.getTitle());
//		getSaveBtn().click();


}
}

	
