package com.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class Laboratory_WorklistInpatientPages extends BasePage {

	public Laboratory_WorklistInpatientPages(WebDriver driver) {
	super(driver);
	}
	util utilobj = new util();
	public String color;
	
	private By change_facility_location_link=By.id("ctl00_lnkbtnChangeHospital");
	public WebElement getchange_facility_location_linkLink() {
		return getElement(change_facility_location_link);
			}
	private By Inpatient=By.id("ctl00_cphpage_imgInPatient");
	public WebElement getInpatientLink() {
		return getElement(Inpatient);
	}
	private By reqNo=By.xpath("//html//body//div[@id='wrapper']//div[@id='ctl00_UpdContentPage']//div[@id='ctl00_cphpage_pnlIPworklist']//div//table[@id='ctl00_cphpage_gdvIPWorklist']//tbody//tr//td//a");
	//private By reqNo=By.cssSelector("//a[normalize-space()='2021057536100192']");
	public WebElement getreqNoLink() 
	{
		return getElement(reqNo);
	}
	public void doChangeHospitalLocation() throws InterruptedException {
		Thread.sleep(1000);
		utilobj.JSClick(getchange_facility_location_linkLink(), driver);
		//getchange_facility_location_linkLink().click();
	}
	private By Requisition_close_button=By.id("btnClose");
	public WebElement getRequisition_close_buttonLink() {
		return getElement(Requisition_close_button);
	}
	 
	private By Inpatient_Admission_notxtbox=By.id("ctl00_cphpage_IPWorklistSearch_dlData_ctl08_txtCriteria");
	public WebElement getInpatient_Admission_notxtboxLink() {
		return getElement(Inpatient_Admission_notxtbox);
	}
	private By Inpatient_Patient_Nametxtbox =By.id("ctl00_cphpage_IPWorklistSearch_dlData_ctl09_txtCriteria");
	public WebElement getInpatient_Patient_NametxtboxLink() {
		return getElement(Inpatient_Patient_Nametxtbox);
	}
	private By Inpatient_Insurance_notxtbox=By.id("ctl00_cphpage_IPWorklistSearch_dlData_ctl11_txtCriteria");
	public WebElement getInpatient_Insurance_notxtboxLink() {
		return getElement(Inpatient_Insurance_notxtbox);
	}
	private By Inpatient_Admission_no=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[3]");
	public WebElement getInpatient_Admission_noLink() {
		return getElement(Inpatient_Admission_no);
	}
	private By Inpatient_Insurance_no=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[6]");
	public WebElement getInpatient_Insurance_noLink() {
		return getElement(Inpatient_Insurance_no);
	}
	private By Inpatient_OkButton=By.id("ctl00_cphpage_IPWorklistSearch_btnOK");
	public WebElement getInpatient_OkButtonLink() {
		return getElement(Inpatient_OkButton);
	}
	private By Inpatient_MymsgBoxInfo_ButtonOK=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getInpatient_MymsgBoxInfo_ButtonOKLink() {
		return getElement(Inpatient_MymsgBoxInfo_ButtonOK);
	}
	private By Inpatient_Patient_name=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[4]/span");
		public WebElement getInpatient_Patient_nameLink() {
			return getElement(Inpatient_Patient_name);
		}
		private By laboratory_Requisition_Details_IP_OPSC_checkbox =By.id("gvTestOrderItems_ctl02_chksamplecollect");
		public WebElement getlaboratory_Requisition_Details_IP_OPSC_checkboxLink() {
			return getElement(laboratory_Requisition_Details_IP_OPSC_checkbox);
			
		}
		private By laboratory_Requisition_Details_IP_OP_savebutton =By.id("btnSave");
		public WebElement getlaboratory_Requisition_Details_IP_OP_savebuttonLink() {
			return getElement(laboratory_Requisition_Details_IP_OP_savebutton);
		}
		private By laboratory_requisition_details_ip_op_tableRow=By.xpath("/html/body/form/div[3]/div/div[1]/div/table/tbody/tr[2]");
		public WebElement getlaboratory_requisition_details_ip_op_tableRowLink() {
			return getElement(laboratory_requisition_details_ip_op_tableRow);
		}
		private By  laboratory_requisition_details_IP_OP_SA_CheckBox=By.id("gvTestOrderItems_ctl02_chksampleack");
		public WebElement getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink() {
			return getElement(laboratory_requisition_details_IP_OP_SA_CheckBox);
		}
		
		public void testcaseforInpatientworkList() throws InterruptedException {
		
//		Thread.sleep(2000);
//		getInpatientLink().click();
//		Thread.sleep(2000);
//		//utilobj.JSClick(getreqNoLink(), driver);
//		//getreqNoLink().click();
//		//System.out.println(getreqNoLink().getText());
//		 //Thread.sleep(5000);
//		getInpatient_Admission_notxtboxLink().sendKeys(getInpatient_Admission_noLink().getText());
//		Thread.sleep(2000);
//		getInpatient_OkButtonLink().click();
//		Thread.sleep(2000);
//		getInpatient_Admission_notxtboxLink().clear();
//		Thread.sleep(2000);
//		getInpatient_Insurance_notxtboxLink().sendKeys(getInpatient_Insurance_noLink().getText());
//		Thread.sleep(2000);
//		getInpatient_OkButtonLink().click();
//		Thread.sleep(3000);
//		getInpatient_Insurance_notxtboxLink().clear();
//		Thread.sleep(3000);
//		getInpatient_Patient_NametxtboxLink().sendKeys(getInpatient_Patient_nameLink().getText());
//		Thread.sleep(3000);
//		getInpatient_OkButtonLink().click();
//		Thread.sleep(3000);
//		
//		utilobj.JSClick(getInpatient_MymsgBoxInfo_ButtonOKLink(), driver);
//		Thread.sleep(2000);
//		getInpatient_Patient_NametxtboxLink().clear();
//		Thread.sleep(2000);
//		getInpatient_OkButtonLink().click();
//		//getInpatient_MymsgBoxInfo_ButtonOKLink().click();
//		
		
		
		
		Thread.sleep(1000);
	   	String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);
		getreqNoLink().click();
	    System.out.println(getreqNoLink().getText());
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		
		
		utilobj.JSClick(getlaboratory_Requisition_Details_IP_OPSC_checkboxLink(), driver);//click on sc
		
		Thread.sleep(1000);
		utilobj.JSClick(getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);//click save button
		
		Thread.sleep(1000);
		utilobj.JSClick(getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink(), driver);//click on SA
		Thread.sleep(1000);
		utilobj.JSClick(getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);//click on save button
		Thread.sleep(1000);
		utilobj.JSClick(getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink(), driver);//click on SA
		Thread.sleep(1000);
		utilobj.JSClick(getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);//click on save button
		Thread.sleep(1000);
		utilobj.JSClick(getlaboratory_Requisition_Details_IP_OPSC_checkboxLink(), driver);//click on sc
		Thread.sleep(1000);
		utilobj.JSClick(getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);//click on save button
		Thread.sleep(1000);
		getRequisition_close_buttonLink().click();

		
      Thread.sleep(1000);
	   	driver.switchTo().window(parent3);
	   	Thread.sleep(5000);
	   	
	   	
	   	
	}
	
	


}
