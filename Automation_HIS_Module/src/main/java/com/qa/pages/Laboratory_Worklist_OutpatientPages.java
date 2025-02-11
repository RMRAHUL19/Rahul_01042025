package com.qa.pages;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;    

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class Laboratory_Worklist_OutpatientPages extends BasePage {
	
	public Laboratory_Worklist_OutpatientPages(WebDriver driver) {
		super(driver);
	}
	util utilobj = new util();
	/*laboratory*/
	  
	   
	
	private By labotatory_reqno=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/a");
	
	private By laboratory_Requisition_Details_IP_OP_SCcheckboxcheckbox=By.xpath("/html/body/form/div[3]/div/div[1]/div/table/tbody/tr[2]/td[10]/table/tbody/tr/td[2]/input");
	private By laboratory_Requisition_Details_savebutton=By.id("btnSave");
	private By laboratory_sample_knowladge_outpatient_okbutton=By.id("ctl00_cphpage_btnOk");
	private By laboratory_sample_knowladge_outpatient_acknowladgeallbutton=By.id("ctl00_cphpage_btnAcknowledgeAll");
	private By laboratory_outpatient_worklist_ip_no=By.id("ctl00_cphpage_OPWorklistSearch_dlData_ctl09_txtCriteria"); 
	private By laboratory_sample_knowladge_outpatient_acknowladgepopok=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	private By laboratory_sample_knowladge_outpatient_IPNo=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[4]/input");
	
	/*laboratotary*/
	 
	public WebElement getlaboratory_sample_knowladge_outpatient_acknowladgepopokLink() {
		return getElement(laboratory_sample_knowladge_outpatient_acknowladgepopok);
	}
	public WebElement getlaboratory_outpatient_worklist_ip_noLink() {
		return getElement(laboratory_outpatient_worklist_ip_no);
	}
	public WebElement getlaboratory_sample_knowladge_outpatient_acknowladgeallbuttonLink() {
		return getElement(laboratory_sample_knowladge_outpatient_acknowladgeallbutton);
	}
	public WebElement getlaboratory_sample_knowladge_outpatient_okbutton() {
		return getElement(laboratory_sample_knowladge_outpatient_okbutton);
	}
	public WebElement getlabotatory_reqnoLink() {
		return getElement(labotatory_reqno);
	}
	public WebElement getlaboratory_Requisition_Details_IP_OP_SCcheckboxLinkcheckbox() {
		return getElement(laboratory_Requisition_Details_IP_OP_SCcheckboxcheckbox);
	}
	public WebElement getlaboratory_Requisition_Details_savebuttonLink() {
		return getElement(laboratory_Requisition_Details_savebutton);
	}
	private By Laboratory_Req_fromDate=By.id("ctl00_cphpage_OPWorklistSearch_dlData_ctl00_txtDate");
	public WebElement getLaboratory_Req_fromDateLink() {
		return getElement(Laboratory_Req_fromDate);
	}
	private By Laboratory_Req_ToDate=By.id("ctl00_cphpage_OPWorklistSearch_dlData_ctl05_txtDate");
	public WebElement getLaboratory_Req_ToDateLink() {
		return getElement(Laboratory_Req_ToDate);
	}
	private By Laboratory_shedule_FromDate=By.id("ctl00_cphpage_OPWorklistSearch_dlData_ctl01_txtDate");
	public WebElement getLaboratory_shedule_FromDateLink() {
		return getElement(Laboratory_shedule_FromDate);
	}
	private By Laboratory_shedule_ToDate=By.id("ctl00_cphpage_OPWorklistSearch_dlData_ctl06_txtDate");
	public WebElement getLaboratory_shedule_ToDateLink() {
		return getElement(Laboratory_shedule_ToDate);
	}
	private By Laboratory_IPNumber=By.id("ctl00_cphpage_OPWorklistSearch_dlData_ctl09_txtCriteria");
	public WebElement getLaboratory_IPNumberLink() {
		return getElement(Laboratory_IPNumber);
	}
	private By Laboratory_OKButton=By.id("ctl00_cphpage_OPWorklistSearch_btnOK");
	public WebElement getLaboratory_OKButtonLink() {
		return getElement(Laboratory_OKButton);
	}
	private By laboratory_Requisition_Details_IP_OP_SAcheckbox=By.xpath("/html/body/form/div[3]/div/div[1]/div/table/tbody/tr[2]/td[11]/input");
	public WebElement getlaboratory_Requisition_Details_IP_OP_SAcheckboxLink() {
		return getElement(laboratory_Requisition_Details_IP_OP_SAcheckbox);
	}
	public WebElement getlaboratory_sample_knowladge_outpatient_IPNo_textboxLink() {
		return getElement(laboratory_sample_knowladge_outpatient_IPNo);
	}
	private By laboratory_Requisition_Details_IP_OP_SC_Fromdate=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[2]/input");
	public WebElement getlaboratory_Requisition_Details_IP_OP_SC_FromdateLink() {
		return getElement(laboratory_Requisition_Details_IP_OP_SC_Fromdate);
	}
	private By laboratory_Requisition_Details_IP_OP_SC_Todate=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[4]/input");
	public WebElement getlaboratory_Requisition_Details_IP_OP_SC_TodateLink() {
		return getElement(laboratory_Requisition_Details_IP_OP_SC_Todate);
	}
	private By laboratory_Requisition_Details_IP_OP_SC_AcknowladgeCheckbox=By.id("ctl00_cphpage_gdvSearchResult_ctl02_CbxAcknowledgment");
	public WebElement laboratory_Requisition_Details_IP_OP_SC_AcknowladgeCheckboxLink() {
		return getElement(laboratory_Requisition_Details_IP_OP_SC_AcknowladgeCheckbox);
	}
	
	
	

	public void laboratorylink() throws InterruptedException {
		//getlaboratory_outpatient_worklist_ip_noLink().sendKeys("1199900090");
		
   	 Thread.sleep(5000);
   	getLaboratory_Req_fromDateLink().clear();
   	Thread.sleep(2000);
	getLaboratory_Req_fromDateLink().sendKeys("28-May-2021");
	Thread.sleep(2000);
	getLaboratory_Req_ToDateLink().clear();
	Thread.sleep(2000);
	getLaboratory_Req_ToDateLink().sendKeys("28-May-2021");
	Thread.sleep(2000);
	getLaboratory_shedule_FromDateLink().clear();
	Thread.sleep(2000);
	getLaboratory_shedule_FromDateLink().sendKeys("28-May-2021");
	Thread.sleep(2000);
	getLaboratory_shedule_ToDateLink().clear();
	Thread.sleep(2000);
	getLaboratory_shedule_ToDateLink().sendKeys("28-May-2021");
	Thread.sleep(5000);
	getLaboratory_IPNumberLink().sendKeys("1111111111");
	Thread.sleep(2000);
	 getLaboratory_OKButtonLink().click();
	 Thread.sleep(1000);
	
	
	
   	String parent3 = driver.getWindowHandle();
   	
	utilobj.Window(driver);
	Thread.sleep(2000);
	getlabotatory_reqnoLink().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	Thread.sleep(2000);
    utilobj.JSClick(getlaboratory_Requisition_Details_IP_OP_SCcheckboxLinkcheckbox(), driver);
	
   	Thread.sleep(5000);
   	utilobj.JSClick(getlaboratory_Requisition_Details_savebuttonLink(), driver);
   	
   	Thread.sleep(2000);
   	utilobj.JSClick(getlaboratory_Requisition_Details_IP_OP_SAcheckboxLink(), driver);
   	
   	Thread.sleep(2000);
   	utilobj.JSClick(getlaboratory_Requisition_Details_savebuttonLink(), driver);
   	
   	Thread.sleep(2000);
   	utilobj.JSClick(getlaboratory_Requisition_Details_IP_OP_SAcheckboxLink(), driver);
   	
   	Thread.sleep(2000);
   	utilobj.JSClick(getlaboratory_Requisition_Details_savebuttonLink(), driver);
   	
	Thread.sleep(2000);
	utilobj.JSClick(getlaboratory_Requisition_Details_IP_OP_SCcheckboxLinkcheckbox(), driver);
	
	Thread.sleep(2000);
	utilobj.JSClick(getlaboratory_Requisition_Details_savebuttonLink(), driver);
	
	Thread.sleep(2000);
   	driver.close();
   	driver.switchTo().window(parent3);
   	Thread.sleep(5000);
   		
   	   	
   }
	public void laboratory_sample_acknowledgeall_outpatient() throws InterruptedException {
		Thread.sleep(2000);
		getlaboratory_Requisition_Details_IP_OP_SC_FromdateLink().clear();
		Thread.sleep(2000);
		getlaboratory_Requisition_Details_IP_OP_SC_TodateLink().clear();
		Thread.sleep(2000);
		getlaboratory_sample_knowladge_outpatient_IPNo_textboxLink().sendKeys("1199900090");;
		Thread.sleep(2000);
		getlaboratory_sample_knowladge_outpatient_okbutton().click();
	   	Thread.sleep(5000);
	   	utilobj.JSViewHorizontal(driver);
	   	Thread.sleep(2000);
	   	utilobj.JSClick(laboratory_Requisition_Details_IP_OP_SC_AcknowladgeCheckboxLink(),driver);
	   	   	Thread.sleep(5000);
	   //	getlaboratory_sample_knowladge_outpatient_acknowladgeallbuttonLink().click();
	   	Thread.sleep(5000);
	   	//getlaboratory_sample_knowladge_outpatient_acknowladgepopokLink().click();
         
	}
	

}
