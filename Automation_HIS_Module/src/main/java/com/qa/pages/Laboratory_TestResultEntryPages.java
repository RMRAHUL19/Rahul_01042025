package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.util;

public class Laboratory_TestResultEntryPages extends BasePage {

	public Laboratory_TestResultEntryPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	util utilobj = new util();
	private By laboratory_testwiseresultentry_fromdatetextbox=By.id("ctl00_cphpage_txtFromDate");
	private By laboratory_testwiseresultentry_todatetextbox=By.id("ctl00_cphpage_txtToDate");
	 private By laboratory_testwiseresultentry_ipNumber=By.id("ctl00_cphpage_txtIpNo"); 
	 private By laboratory_testwiseresultentry_okbutton=By.id("ctl00_cphpage_btnOK");
	 private By laboratory_testwiseresultentry_patient_testdetail_test=By.xpath("//html//body//div[@id='']//tbody//tr/td/a");
	 private By laboratory_testwiseresultentry_patient_testdetail_testname=By.xpath("//html//body//div[@id='']//div[@id='ctl00_cphpage_tvPatientsn0Nodes']//table//tbody//tr//td//a");
	 private By laboratory_testwiseresultentry_patient_testdetail_testname_hemoglobintextbox=By.xpath("//html//body//div[@id='ctl00_cphpage_UserInfo']//div[@id='ctl00_cphpage_PannelFieldsList']//table[@id='ctl00_cphpage_gdvTests']//tbody/tr/td[@style='width:10px;']/input");
	 //private By laboratory_testwiseresultentry_patient_testdetail_testname_packedcellvolume=By.xpath("//html//body//div[@id='ctl00_cphpage_UserInfo']//div[@id='ctl00_cphpage_PannelFieldsList']//table[@id='ctl00_cphpage_gdvTests']//tbody/tr/td//input");
	 private By laboratory_testwiseresultentry_patient_testdetail_testname_packedcellvolume=By.id("ctl00_cphpage_gdvTests_ctl03_txtControl");
	 private By laboratory_testwiseresultentry_patient_testdetail_DoctorName=By.id("ctl00_cphpage_gdvDoctors_ctl15_chkDoctor");
	 private By laboratory_testwiseresultentry_patient_Privew=By.id("ctl00_cphpage_btnPreview");
	 //ddl
	  private By laboratory_testwiseresultentry_patient_result_blodgroup=By.id("ctl00_cphpage_gdvTests_ctl02_ddlControl");
	  public WebElement getlaboratory_testwiseresultentry_patient_result_blodgroupLink() {
		  return getElement(laboratory_testwiseresultentry_patient_result_blodgroup);
	  }
	  private By laboratory_testwiseresultentry_patient_result_blodRhFactor=By.id("ctl00_cphpage_gdvTests_ctl03_ddlControl");
	  public WebElement getlaboratory_testwiseresultentry_patient_result_blodRhFactorLink() {
		  return getElement(laboratory_testwiseresultentry_patient_result_blodRhFactor);
	  }
	  //end of ddl
	  public WebElement getlaboratory_testwiseresultentry_patient_PrivewLink() {
		  return getElement(laboratory_testwiseresultentry_patient_Privew);
	  }
	 public WebElement getlaboratory_testwiseresultentry_patient_testdetail_DoctorNameLink() {
		 return getElement(laboratory_testwiseresultentry_patient_testdetail_DoctorName);
	 }
	public WebElement getlaboratory_testwiseresultentry_patient_testdetail_testname_packedcellvolumeLink() {
		return getElement(laboratory_testwiseresultentry_patient_testdetail_testname_packedcellvolume);
	}
	public WebElement getlaboratory_testwiseresultentry_patient_testdetail_testname_hemoglobintextboxLink() 
	{
		return getElement(laboratory_testwiseresultentry_patient_testdetail_testname_hemoglobintextbox); 
	}
	public WebElement getlaboratory_testwiseresultentry_patient_testdetail_testnameLink() {
		 return getElement(laboratory_testwiseresultentry_patient_testdetail_testname);
	 }
	 public WebElement getlaboratory_testwiseresultentry_patient_testdetailLink() {
		 return getElement(laboratory_testwiseresultentry_patient_testdetail_test);
	 }
	 public WebElement getlaboratory_testwiseresultentry_okbuttonLink() {
		 return getElement(laboratory_testwiseresultentry_okbutton);
	 }
	 public WebElement getlaboratory_testwiseresultentry_ipNumberLink() {
		 return getElement(laboratory_testwiseresultentry_ipNumber);
	 }
	public WebElement getlaboratory_testwiseresultentry_todatetextboxLink() {
		return getElement(laboratory_testwiseresultentry_todatetextbox);
	}
	public WebElement getlaboratory_testwiseresultentry_fromdatetextboxLink() {
		return getElement(laboratory_testwiseresultentry_fromdatetextbox);
	}
	public void laboratory_TestWise_ResultEntry() throws InterruptedException {
		utilobj.JSEnterText(getlaboratory_testwiseresultentry_fromdatetextboxLink(), driver, "21-may-2021");
		Thread.sleep(5000);
		utilobj.JSEnterText(getlaboratory_testwiseresultentry_todatetextboxLink(), driver, "21-may-2021");
		
		getlaboratory_testwiseresultentry_ipNumberLink().sendKeys("1199900090");
		Thread.sleep(5000);
		getlaboratory_testwiseresultentry_okbuttonLink().click();
		Thread.sleep(5000);
		getlaboratory_testwiseresultentry_patient_testdetailLink().click();
		Thread.sleep(5000);
		getlaboratory_testwiseresultentry_patient_testdetail_testnameLink().click();
		Thread.sleep(5000);
		Select blodgroup=new Select(getlaboratory_testwiseresultentry_patient_result_blodgroupLink());
		blodgroup.selectByVisibleText("A");
		Thread.sleep(5000);
		Select blodrhfactor=new Select(getlaboratory_testwiseresultentry_patient_result_blodRhFactorLink());
		blodrhfactor.selectByVisibleText("Positive");
		Thread.sleep(2000);
		utilobj.JSClick(getlaboratory_testwiseresultentry_patient_testdetail_DoctorNameLink(), driver);
		Thread.sleep(2000);
		getlaboratory_testwiseresultentry_patient_PrivewLink().click();	
		Thread.sleep(5000);
		utilobj.SwitchToChildWindow(driver, "LabReport");
		Thread.sleep(500);
		driver.close();
		Thread.sleep(500);
		utilobj.SwitchToChildWindow(driver, "TestWiseResultEntry");
		Thread.sleep(500);
		
		
	}

}
