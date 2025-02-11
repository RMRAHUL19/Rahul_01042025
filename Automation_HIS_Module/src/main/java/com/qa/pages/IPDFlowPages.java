package com.qa.pages;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.input.CharSequenceInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.qa.util.util;

public class IPDFlowPages extends BasePage{
	String parent10;
	public IPDFlowPages(WebDriver driver) {
		super(driver);
		parent10="";
		
			}
	util utilobj = new util();
	
	/*UHID */
	private By changeLocation = By.id("ctl00_lnkbtnChangeHospital");
	private By SelectHospitalLocationDDL = By.id("ctl00_cphpage_ddlHospital");
	private By SelectFacilityLocationDDL = By.id("ctl00_cphpage_ddlFacility");
	private By SelectFacilityLocationSubmitButton = By.id("ctl00_cphpage_btnSubmit");
	
	
	private By Registration=By.linkText("Registration");
	private By patientAdmission=By.linkText("Patient Admission");
	private By ClinicalRecordLink=By.linkText("Clinical Records");
	private By DischargeIntimationLink=By.linkText("Discharge Intimation");
	private By Inpatient_EmergancyPatient=By.linkText("Inpatients/Emergency Patients");
	private By Title = By.id("ctl00_cphpage_ddlTitle");
	private By FirstName = By.id("ctl00_cphpage_txtFirstName");
	private By LastName = By.id("ctl00_cphpage_txtLastName");
	private By MarriageStatus = By.xpath("//*[@id='ctl00_cphpage_ddlMarriage']");
	private By Age = By.id("ctl00_cphpage_txtAge");
	private By PresentAddres = By.id("ctl00_cphpage_txtPresentAddress1");
	private By Savebutton = By.id("ctl00_cphpage_btnSaveDisplay");
	private By btnYes = By.id("ctl00_cphpage_btnYes1");
	private By InformationPopUp = By.id("ctl00_cphpage_btnYes");
	private By UHID_creation_printButton = By.id("ctl00_cphpage_btnPrint");
	private By UHID_creation_Uhid_txtbox = By.id("ctl00_cphpage_txtUhid");
	private By UHID_creation_Uhid_succes = By.id("ctl00_cphpage_btnOK11");
	private By UHID_creation_Uhid_OPDNumber = By.id("ctl00_cphpage_lnkbtnCheckIn");
	private By patientCheckInNumberUHIDTXTBOX=By.id("ctl00_cphpage_txtuhid");
	private By patientCheckInNumberSeviceOkButton=By.id("ctl00_cphpage_btnOK");
	private By patientCheckInNumberSaveButton=By.id("ctl00_cphpage_btnSaveDisplay");
	private By patientCheckInNumberinfoMsgboxcancelbutton=By.id("popup_cancel");
	private By patientCheckInNumberRegistration=By.id("ctl00_cphpage_lnkRegistration");
	private By UHID_creation_clearButton=By.id("ctl00_cphpage_btnClear");
	private By UHID_TextBox=By.id("ctl00_cphpage_txtUhid");
	private By inpatientManagement=By.linkText("InPatient Management");
	private By IPMDischargeIntemation=By.linkText("Discharge Intimations");
	private By ClinicalrecordDischargeIntemation=By.linkText("Discharge Intimations");
	public WebElement getClinicalrecordDischargeIntemationLink() {
		return getElement(ClinicalrecordDischargeIntemation);
	}
	public WebElement getSelectFacilityLocationSubmitButton() {
		return getElement(SelectFacilityLocationSubmitButton);
	}
	public WebElement getinpatientManagementLink() {
		
		return getElement(inpatientManagement);
	}
public WebElement getIPMDischargeintimationLink() {
		
		return getElement(IPMDischargeIntemation);
	}
	public WebElement getSelectHospitalLocationDDL() {
		return getElement(SelectHospitalLocationDDL);
	}
	public WebElement getSelectFacilityLocationDDL() {
		return getElement(SelectFacilityLocationDDL);
	}
	public WebElement getUHID_TextBox() {
		return getElement(UHID_TextBox);
	}
	public WebElement getregistrationLink() {
		return getElement(Registration);
	}
	public WebElement getpatientAdmission() {
		return getElement(patientAdmission);
	}
	public WebElement getClinicalRecordLink() {
		return getElement(ClinicalRecordLink);
	}
	public WebElement getDischargeIntimationLink() {
		return getElement(DischargeIntimationLink);
	}
	public WebElement getInpatientEmergancyPatientLink() {
		return getElement(Inpatient_EmergancyPatient);
	}
	public WebElement getchange_facility_location_linkLink() {
		return getElement(changeLocation);

	}

	
	public WebElement getUHID_creation_clearButton() {
		return getElement(UHID_creation_clearButton);
	}
	public WebElement getpatientCheckInNumberinfoMsgboxcancelbutton() {
		return getElement(patientCheckInNumberinfoMsgboxcancelbutton);
	}
	public WebElement getpatientCheckInNumberRegistration() {
		return getElement(patientCheckInNumberRegistration);
	}
	public WebElement getpatientCheckInNumberSaveButton() {
		return getElement(patientCheckInNumberSaveButton);
	}
	public WebElement getpatientCheckInNumberSeviceOkButton() {
		return getElement(patientCheckInNumberSeviceOkButton);
	}
	public WebElement getpatientCheckInNumberUHIDTXTBOX() {
		return getElement(patientCheckInNumberUHIDTXTBOX);
	}
	public WebElement getUHID_creation_Uhid_OPDNumber() {
		return getElement(UHID_creation_Uhid_OPDNumber);
	}
	public WebElement getUHID_creation_Uhid_succes() {
		return getElement(UHID_creation_Uhid_succes);
	}

	public WebElement getUHID_creation_Uhid_txtbox() {
		return getElement(UHID_creation_Uhid_txtbox);
	}
	public WebElement getUHID_creation_printButton() {
		return getElement(UHID_creation_printButton);
	}
	public WebElement getTitle() {
		return getElement(Title);
	}

	public WebElement getFirstName() {
		return getElement(FirstName);
	}

	public WebElement getLastName() {
		return getElement(LastName);
	}

	public WebElement getMarriageStatus() {
		return getElement(MarriageStatus);
	}

	public WebElement getAge() {
		return getElement(Age);
	}

	public WebElement getPresentAddres() {
		return getElement(PresentAddres);
	}

	public WebElement getSavebutton() {
		return getElement(Savebutton);
	}
	
	public WebElement getbtnYes() {
		return getElement(btnYes);
	}
	
	public WebElement getInformationPopUp() {
		return getElement(InformationPopUp);
	}
	

	public String verifyUHIDPageTitle() {

		return driver.getTitle();

	}
	/*Registration*/
	private By patientAdmission_UHIDImgSearch =By.id("ctl00_cphpage_imgsearchUHID");
	private By patientAdmission_UHIDSearchPOPTXTBOX =By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl00_txtCriteria");
	private By patientAdmission_UHIDSearchButtonSearch =By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_btnSearch");
	private By patientAdmission_UHIDRadioButtonBox =By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	private By patientAdmission_UHIDSearchBTNSelect =By.id("ctl00_cphpage_ucCommonSearch_btnSelect");
	private By ddlAdmissionType =By.id("ctl00_cphpage_ddlAdmissionType");
	private By ddlAdmissionSrc =By.id("ctl00_cphpage_ddlAdmissionSrc");
	private By ddlSpeciallization =By.id("ctl00_cphpage_ddlSpecialisation");
	private By ddlunit =By.id("ctl00_cphpage_ddlUnit");
	private By ddlwardType =By.id("ctl00_cphpage_ddlWardType");
	private By patientAdmission_permanantsameaspresent =By.id("ctl00_cphpage_PermanentSameAsPresent");
	private By patientAdmission_SaveButton =By.id("ctl00_cphpage_btnSave");
	private By patientAdmission_informationOKButton =By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");
	private By patientAdmission_succesokbutton =By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	private By patientAdmission_AdmissionNoTextBox =By.id("ctl00_cphpage_txtAdmissionNo");
	
	public WebElement getpatientAdmission_AdmissionNoTextBox() {
		return getElement(patientAdmission_AdmissionNoTextBox);
	}
	public WebElement getpatientAdmission_permanantsameaspresent() {
		return getElement(patientAdmission_permanantsameaspresent);
	}
	public WebElement getpatientAdmission_UHIDSearchPOPTXTBOX() {
		return getElement(patientAdmission_UHIDSearchPOPTXTBOX);
	}
	public WebElement getddlSpeciallization() {
		return getElement(ddlSpeciallization);
	}
	public WebElement getddlUnit() {
		return getElement(ddlunit);
	}
	public WebElement getddlwardType() {
		return getElement(ddlwardType);
	}
	public WebElement getpatientAdmission_UHIDSearchButtonSearch() {
		return getElement(patientAdmission_UHIDSearchButtonSearch);
	}
	public WebElement getpatientAdmission_UHIDRadioButtonBox() {
		return getElement(patientAdmission_UHIDRadioButtonBox);
	}
	public WebElement getpatientAdmission_UHIDImgSearch() {
		return getElement(patientAdmission_UHIDImgSearch);
	}
	
	public WebElement getpatientAdmission_UHIDSearchBTNSelect() {
		return getElement(patientAdmission_UHIDSearchBTNSelect);
	}
	public WebElement getDdlAdmissionType() {
		return getElement(ddlAdmissionType);
	}

	public WebElement getDdlAdmissionSrc() {
		return getElement(ddlAdmissionSrc);
	}
	public WebElement getpatientAdmission_SaveButton() {
		return getElement(patientAdmission_SaveButton);
	}
	public WebElement getpatientAdmission_informationOKButton() {
		return getElement(patientAdmission_informationOKButton);
	}
	public WebElement getpatientAdmission_succesokbutton() {
		return getElement(patientAdmission_succesokbutton);
	}
	/*ip casesheet*/
	private By popok = By.id("popup_ok");

	private By lableprecripstionlink = By.id("ctl00_cphpage_trvSectionst11");

	private By txtOrdPackSearch = By.id("txtOrdPackSearch");
	private By orderpack = By.id("97701");

	private By clickorderpackbutton = By.id("btnOrdpack"); // 97701

	private By orderpackselection = By.id("97701"); //

	private By btnISaveClose = By.id("btnISaveClose"); //
	private By btnclear=By.id("btnClear");
	private By btnclose=By.id("btnIClose");
	private By change_facility_location_link=By.id("ctl00_lnkbtnChangeHospital");
	
	
	public WebElement getbtn_close_Link() {
		return getElement(btnclose);
	}
	public WebElement getbtn_clear_Link() {
		return getElement(btnclear);
	}
	



	public WebElement getorderpackselection() {
		return getElement(orderpackselection);

	}

	public WebElement getbtnISaveClose() {
		return getElement(btnISaveClose);

	}

	public WebElement getpopok() {
		return getElement(popok);

	}

	public WebElement getlableprecripstionlink() {
		return getElement(lableprecripstionlink);

	}

	public WebElement gettxtOrdPackSearch() {
		return getElement(txtOrdPackSearch);

	}

	public WebElement getorderpack() {
		return getElement(orderpack);

	}

	public WebElement getclickorderpackbutton() {
		return getElement(clickorderpackbutton);

	}
	/*End ip casesheet*/
	/*inpatient management*/
	private By INpatientmanagementLink=By.linkText("InPatient Management");
	private By INpatientmanagementAllotBedLink=By.linkText("Allot Bed");
	private By INpatientmanagementAllotbedadmissionNO=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr/td/div/div/table/tbody/tr[2]/td[1]/a");
	
	private By INpatientmanagementAllotbedinformtionokbutton=By.id("popup_ok");
	private By INpatientmanagementAllotbed_bedName=By.id("ctl00_cphpage_ddlBedName");
	private By INpatientmanagementAllotbed_saveButton=By.id("ctl00_cphpage_btnSave");
	private By INpatientmanagementAllotbed_Succusokbutton=By.id("popup_ok");
	private By INpatientmanagementUpdateStatus=By.linkText("Update Bed Status");
	private By INpatientmanagementUpdateStatus_bednameDDL=By.id("ctl00_cphpage_ddlBedName");
	private By INpatientmanagementUpdateStatus_changetostatusddl=By.id("ctl00_cphpage_ddlChangetoStatus");
	private By INpatientmanagementUpdateStatus_saveButton=By.id("ctl00_cphpage_btnSave");
	private By InpatientEmargancyPatientSurgeryUnitpluebutton=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[2]/th[1]/img");
	private By InpatientEmargancyPatientSurgeryUnitBedIMG=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/table[2]/tbody/tr[1]/td/div/div/div[2]/table/tbody/tr[7]/td[2]/input");
	                                                                
	//popup_ok
	
	public WebElement getInpatientEmargancyPatientSurgeryUnitBedIMG() {
		return getElement(InpatientEmargancyPatientSurgeryUnitBedIMG);
	}
	public WebElement getINpatientmanagementUpdateStatus_saveButton() {
		return getElement(INpatientmanagementUpdateStatus_saveButton);
	}
	public WebElement getInpatientEmargancyPatientSurgeryUnitpluebuuton() {
		return getElement(InpatientEmargancyPatientSurgeryUnitpluebutton);
	}
	public WebElement getINpatientmanagementUpdateStatus_changetostatusddl() {
		return getElement(INpatientmanagementUpdateStatus_changetostatusddl);
	}
	public WebElement getINpatientmanagementLink() {
		return getElement(INpatientmanagementLink);
	}
	public WebElement getINpatientmanagementUpdateStatus() {
		return getElement(INpatientmanagementUpdateStatus);
	}
	public WebElement getINpatientmanagementUpdateStatus_bednametxtDDL() {
		return getElement(INpatientmanagementUpdateStatus_bednameDDL);
	}
	public WebElement getINpatientmanagementAllotBedLink() {
		return getElement(INpatientmanagementAllotBedLink);
	}
	public WebElement getINpatientmanagementAllotbedadmissionNO() {
		return getElement(INpatientmanagementAllotbedadmissionNO);
	}
	public WebElement getINpatientmanagementAllotbedinformtionokbutton() {
		return getElement(INpatientmanagementAllotbedinformtionokbutton);
	}
	public WebElement getINpatientmanagementAllotbed_bedName() {
		return getElement(INpatientmanagementAllotbed_bedName);
	}
	public WebElement getINpatientmanagementAllotbed_saveButton() {
		return getElement(INpatientmanagementAllotbed_saveButton);
	}
	public WebElement getINpatientmanagementAllotbed_Succusokbutton() {
		return getElement(INpatientmanagementAllotbed_Succusokbutton);
	}/*end inpatient management*/
	/*laboratory*/
	private By reqNo=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/a");
	public WebElement getreqNoLink() 
	{
		return getElement(reqNo);
	}
	private By laboratory_Requisition_Details_IP_OPSC_checkbox =By.id("gvTestOrderItems_ctl02_chksamplecollect");
	public WebElement getlaboratory_Requisition_Details_IP_OPSC_checkboxLink() {
		return getElement(laboratory_Requisition_Details_IP_OPSC_checkbox);
		
	}
	private By laboratory_Requisition_Details_IP_OP_savebutton =By.id("btnSave");
	public WebElement getlaboratory_Requisition_Details_IP_OP_savebuttonLink() {
		return getElement(laboratory_Requisition_Details_IP_OP_savebutton);
	}
	private By  laboratory_requisition_details_IP_OP_SA_CheckBox=By.id("gvTestOrderItems_ctl02_chksampleack");
	public WebElement getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink() {
		return getElement(laboratory_requisition_details_IP_OP_SA_CheckBox);
	}
	private By Requisition_close_button=By.id("btnClose");
	public WebElement getRequisition_close_buttonLink() {
		return getElement(Requisition_close_button);
		
	}
	private By imagingWorklist_ReqNO=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/a");
	public WebElement getimagingWorklist_ReqNO() {
		return getElement(imagingWorklist_ReqNO);
		
	}
	/*end laboratory*/
	
	
	
	public void testcaseforIPDFlowPagesUHID(String Title, String FirstName, String LastName, String MaritalStatus1, String Age,
			String Address) throws InterruptedException {
		utilobj.selectDropdown(getTitle(), driver, Title);
		Thread.sleep(3000);
		getFirstName().sendKeys(FirstName);
		Thread.sleep(3000);
		getLastName().sendKeys(LastName);
		
		Thread.sleep(3000);
		
		System.out.println(MaritalStatus1 + getMarriageStatus());
		utilobj.selectDropdown(getMarriageStatus(), driver, MaritalStatus1);
		Thread.sleep(3000);
		getAge().sendKeys(Age);
		Thread.sleep(3000);
		getPresentAddres().sendKeys(Address);
		Thread.sleep(3000);
		getSavebutton().click();
		Thread.sleep(3000);
		getbtnYes().click();
		Thread.sleep(3000);
		getInformationPopUp().click();
		Thread.sleep(3000);
		getUHID_creation_Uhid_succes().click();
		Thread.sleep(3000);
		}
	public String testcasegetUhid() throws InterruptedException {
		String typeValue=getUHID_TextBox().getAttribute("value");
		Thread.sleep(3000);
		System.out.println(typeValue);
		
		Thread.sleep(1000);
		return typeValue;
	}
	public void testcaseforIPDFlowPagesUHIDPatientAdmission(String s) throws InterruptedException {
//		Thread.sleep(3000);
//		utilobj.MoveElement(getregistrationLink(), driver);
//		Thread.sleep(3000);
//		utilobj.JSClick(getpatientAdmission(), driver);
		Thread.sleep(3000);
		//search by IP Number
		driver.findElement(By.id("ctl00_cphpage_txtInsuranceNo")).sendKeys("1100000034");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnSelect")).click();
//		getpatientAdmission_UHIDImgSearch().click();
//		Thread.sleep(3000);
//		getpatientAdmission_UHIDSearchPOPTXTBOX().sendKeys(s);
//		Thread.sleep(3000);
//		getpatientAdmission_UHIDSearchButtonSearch().click();
//		Thread.sleep(3000);
//		getpatientAdmission_UHIDRadioButtonBox().click();
//		Thread.sleep(3000);
//		getpatientAdmission_UHIDSearchBTNSelect().click();
		Thread.sleep(4000);
		getpatientAdmission_permanantsameaspresent().click();
		Thread.sleep(3000);
		utilobj.selectDropdown(getDdlAdmissionType(), driver, "On Transfer/Referral");
		Thread.sleep(3000);
		utilobj.selectDropdown(getDdlAdmissionSrc(), driver, "Transferred from a private hospital");
		Thread.sleep(3000);
		utilobj.selectDropdown(getddlSpeciallization(), driver, "General Medicine");
		Thread.sleep(4000);
		utilobj.selectDropdown(getddlUnit(), driver, "MEDICINE");
		Thread.sleep(4000);
		utilobj.selectDropdown(getddlwardType(), driver, "Male Medical Ward");
		Thread.sleep(4000);
		getpatientAdmission_SaveButton().click();
		Thread.sleep(3000);
		getpatientAdmission_informationOKButton().click();
		Thread.sleep(3000);
		
		getpatientAdmission_succesokbutton().click();
		
		
		
		
	}
	public String getAdmissionNO() {
		String AdmissionNo=getpatientAdmission_AdmissionNoTextBox().getAttribute("value");
		System.out.println(AdmissionNo);
		return AdmissionNo;
	}
	
	
	
	public void testcaseforINPAtientMangement() throws InterruptedException {
		Thread.sleep(3000);
		utilobj.JSClick(getchange_facility_location_linkLink(), driver);
		//getchange_facility_location_linkLink().click();
		Thread.sleep(3000);
		utilobj.selectDropdown(getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL");
		Thread.sleep(3000);
		utilobj.selectDropdown(getSelectFacilityLocationDDL(), driver, "Male Medical Ward");
		Thread.sleep(3000);
		utilobj.JSClick(getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(getINpatientmanagementLink(), driver);
		Thread.sleep(3000);
		utilobj.JSClick(getINpatientmanagementAllotBedLink(), driver);
		Thread.sleep(3000);
		
		getINpatientmanagementAllotbedadmissionNO().click();
		Thread.sleep(5000);

		utilobj.selectDropdown(getINpatientmanagementAllotbed_bedName(), driver, "MMW8");
		 Thread.sleep(3000);

			 getINpatientmanagementAllotbed_saveButton().click();
			 Thread.sleep(3000);
			 getINpatientmanagementAllotbed_Succusokbutton().click();
			 Thread.sleep(3000);
			 boolean popupdisplay=driver.findElement(By.id("popup_ok")).isDisplayed();
				if(popupdisplay==true)
				{
					driver.findElement(By.id("popup_ok")).click();
					System.out.println("popok button is there");
				}
			// driver.findElement(By.id("popup_ok")).click();
			 Thread.sleep(3000);
			 utilobj.MoveElement(getINpatientmanagementLink(), driver);
				Thread.sleep(3000);
				utilobj.JSClick(getINpatientmanagementUpdateStatus(), driver);
				Thread.sleep(3000);
				utilobj.selectDropdown(getINpatientmanagementUpdateStatus_bednametxtDDL(), driver, "MMW8");

				
      			Thread.sleep(3000);
				utilobj.selectDropdown(getINpatientmanagementUpdateStatus_changetostatusddl(), driver, "Occupied");
				Thread.sleep(3000);
				getINpatientmanagementUpdateStatus_saveButton().click();
				Thread.sleep(3000);
				utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")), driver);
				
				Thread.sleep(3000);
				
					
						
				
		 
	}
	public void doIPCasesheetprecripstion(String orderpackname,String Admin) {

		try

		{
			Thread.sleep(3000);
			utilobj.MoveElement(getClinicalRecordLink(), driver);
			Thread.sleep(3000);
			utilobj.JSClick(getDischargeIntimationLink(), driver);
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_ImgAdmissionNo")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys(Admin);
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp"));
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();
			
//			utilobj.JSClick(getInpatientEmargancyPatientSurgeryUnitpluebuuton(), driver);
//			
//			Thread.sleep(3000);
//			utilobj.JSClick(getInpatientEmargancyPatientSurgeryUnitBedIMG(), driver);
			
			
			Thread.sleep(5000);

			getpopok().click();

			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			getlableprecripstionlink().click();

			Thread.sleep(3000);

			
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);

			
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(gettxtOrdPackSearch(), driver, orderpackname);
			Thread.sleep(1000);
			utilobj.JSClick(getclickorderpackbutton(), driver);

			

			Thread.sleep(3000);

			utilobj.JSClick(getorderpackselection(), driver);

			
			Thread.sleep(5000);

			utilobj.JSClick(getbtnISaveClose(), driver);
			Thread.sleep(3000);
			utilobj.waitForalert(driver);
			Thread.sleep(3000);

			driver.switchTo().alert().accept();
			Thread.sleep(3000);

			driver.switchTo().window(parent3);		
			Thread.sleep(3000);
			getpopok().click();
			Thread.sleep(3000);
			utilobj.JSClick(getchange_facility_location_linkLink(), driver);
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
		}
	 
	private By imageWorkListReqDetailPAcheckBox=By.xpath("/html/body/form/div[3]/div/div[2]/div/table/tbody/tr[2]/td[7]/input");
	                                                      
	public WebElement getimageWorkListReqDetailPAcheckBox() {
		return getElement(imageWorkListReqDetailPAcheckBox);
	}
	private By imageWorkListReqDetailTPcheckBox=By.xpath("/html/body/form/div[3]/div/div[2]/div/table/tbody/tr[2]/td[8]/input");
	public WebElement getimageWorkListReqDetailTPcheckBox() {
		return getElement(imageWorkListReqDetailTPcheckBox);
	}
	private By imageWorkListReqDetailTPINFOMESSAGE=By.id("MyMessageBoxInfo_ButtonOK");
	public WebElement getimageWorkListReqDetailTPINFOMESSAGE() {
		return getElement(imageWorkListReqDetailTPINFOMESSAGE);
	}
	private By imageWorkListReqDetailSaveButton=By.id("btnSave");
	public WebElement getimageWorkListReqDetailSaveButton() {
		return getElement(imageWorkListReqDetailSaveButton);
	}
	private By imageWorkListReqDetailTPInformationyesButton=By.id("MyMessageBoxInfo_ButtonYes");
	public WebElement getimageWorkListReqDetailTPInformationyesButton() {
		return getElement(imageWorkListReqDetailTPInformationyesButton);
	}
	private By imageWorkListReqDetailTP_NOFU_ITEMddl=By.id("ddlItems");
	public WebElement getimageWorkListReqDetailTP_NOFU_ITEMddl() {
		return getElement(imageWorkListReqDetailTP_NOFU_ITEMddl);
	}
	private By imageWorkListReqDetailTP_NOFU_BATCHddl=By.id("ddlBatches");
	public WebElement getimageWorkListReqDetailTP_NOFU_BATCHddl() {
		return getElement(imageWorkListReqDetailTP_NOFU_BATCHddl);
	}
	private By imageWorkListReqDetailTP_NOFU_Quantity=By.id("txtXRayQty");
	public WebElement getimageWorkListReqDetailTP_NOFU_Quantity() {
		return getElement(imageWorkListReqDetailTP_NOFU_Quantity);
	}
	private By imageWorkListReqDetailTP_NOFU_ButtonADD=By.id("btnAdd");
	public WebElement getimageWorkListReqDetailTP_NOFU_ButtonADD() {
		return getElement(imageWorkListReqDetailTP_NOFU_ButtonADD);
	}
	private By imageWorkListReqDetailTP_NOFU_ButtonOK=By.id("btnTPOK");
	public WebElement getimageWorkListReqDetailTP_NOFU_ButtonOK() {
		return getElement(imageWorkListReqDetailTP_NOFU_ButtonOK);
	}
	
		 
	public void testcaseforinpatientIssues(String addmission) throws InterruptedException {
		
		
		
		Thread.sleep(3000);
		utilobj.selectDropdown(getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL");
		Thread.sleep(3000);
		utilobj.selectDropdown(getSelectFacilityLocationDDL(), driver, "Male Medical Ward");
		Thread.sleep(3000);
		utilobj.JSClick(getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		
		utilobj.MoveElement(driver.findElement(By.linkText("Stores")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Inpatient Issues")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgBtnAdmissionNo")),driver);
		Thread.sleep(3000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")), driver, addmission);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_btnSearch")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_HISDataSearchCtrl_btnSelect")),driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnOK")), driver);
		Thread.sleep(3000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_Grid_ctl02_txtIssueQty")), driver, "");
		Thread.sleep(3000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_Grid_ctl02_txtIssueQty")), driver, "3");
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnSave")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(getchange_facility_location_linkLink(), driver);
		Thread.sleep(3000);
		utilobj.selectDropdown(getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL");
		Thread.sleep(3000);
		utilobj.selectDropdown(getSelectFacilityLocationDDL(), driver, "LABORATORY SERVICE");
		Thread.sleep(3000);
		utilobj.JSClick(getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(driver.findElement(By.linkText("Laboratory")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Lab Worklist")), driver);
		Thread.sleep(3000);
		//driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_imgInPatient")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_dlData_ctl08_txtCriteria")).sendKeys(addmission);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_btnOK")).click();
		
		Thread.sleep(3000);
		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);
		getreqNoLink().click();
	    System.out.println(getreqNoLink().getText());
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		
		
		utilobj.JSClick(getlaboratory_Requisition_Details_IP_OPSC_checkboxLink(), driver);//click on sc
		
		Thread.sleep(2000);
		utilobj.JSClick(getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);//click save button
		
		Thread.sleep(2000);
		utilobj.JSClick(getlaboratory_requisition_details_IP_OP_SA_CheckBoxLink(), driver);//click on SA
		Thread.sleep(2000);
		utilobj.JSClick(getlaboratory_Requisition_Details_IP_OP_savebuttonLink(), driver);//click on save button
		Thread.sleep(2000);
		Thread.sleep(2000);
		getRequisition_close_buttonLink().click();		
      Thread.sleep(2000);
	   	driver.switchTo().window(parent3);
	   	Thread.sleep(3000);
//	   	utilobj.JSClick(getchange_facility_location_linkLink(), driver);
//	   	Thread.sleep(3000);
	}
	private By ClinicalSummary=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table[2]/tbody/tr/td[1]/div/table/tbody/tr/td/div[1]/a[2]/img");
	private By ClinicalSummaryEditBtn=By.xpath("/html/body/form/div[3]/div[1]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/img[1]");
	private By DoneBtn=By.id("btnDone");
	private By Dignose=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table[2]/tbody/tr/td[1]/div/table/tbody/tr/td/div[8]/a[2]/img");
private By RequestTypeDDL=By.id("ctl00_cphpage_hypDischargeintimation");
public WebElement getRequestTypeDDL() {
	return getElement(RequestTypeDDL);
}
	public WebElement getDignose() {
		return getElement(Dignose);
	}
	public WebElement getClinicalSummary() {
		return getElement(ClinicalSummary);
	}
	
	public WebElement getClinicalSummaryEditBtn() {
		return getElement(ClinicalSummaryEditBtn);
	}
	
	public WebElement getDoneBtn() {
		return getElement(DoneBtn);
	}
	public void testcaseforImagingWorkList(String addmission) throws InterruptedException, AWTException {
	   		Thread.sleep(3000);
	   		utilobj.JSClick(getchange_facility_location_linkLink(), driver);
	   		Thread.sleep(3000);
		utilobj.selectDropdown(getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL");
		Thread.sleep(3000);
		utilobj.selectDropdown(getSelectFacilityLocationDDL(), driver, "IMAGING SERVICES");
		Thread.sleep(3000);
		utilobj.JSClick(getSelectFacilityLocationSubmitButton(), driver);
		Thread.sleep(3000);
		utilobj.MoveElement(driver.findElement(By.linkText("IMAGING SERVICES")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.linkText("Worklist")), driver);
		Thread.sleep(3000);
		//driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		//Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgInPatient")), driver);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_dlData_ctl07_txtCriteria")).sendKeys(addmission);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_IPWorklistSearch_btnOK")).click();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
        String parent3 = driver.getWindowHandle();

	   	
		utilobj.Window(driver);
		Thread.sleep(3000);
		getimagingWorklist_ReqNO().click();
		Thread.sleep(3000);
		utilobj.ChildWindow(driver);
		Thread.sleep(3000);
	    utilobj.JSClick(getimageWorkListReqDetailPAcheckBox(),driver);
		
	   	Thread.sleep(3000);
	   	utilobj.JSClick(getimageWorkListReqDetailSaveButton(),driver);
	   	Thread.sleep(3000);
	   	utilobj.JSClick(getimageWorkListReqDetailTPINFOMESSAGE(),driver);
	   	
	   	Thread.sleep(3000);
	   	utilobj.JSClick(getimageWorkListReqDetailTPcheckBox(),driver);
	   	Thread.sleep(3000);
	   	utilobj.JSClick(getimageWorkListReqDetailTPInformationyesButton(),driver);
	   	Thread.sleep(3000);
	   	utilobj.selectDropdown(getimageWorkListReqDetailTP_NOFU_ITEMddl(), driver, "Dry Lase Film 14 into 17 inch");
	   	Thread.sleep(3000);
	   	utilobj.selectDropdown(getimageWorkListReqDetailTP_NOFU_BATCHddl(), driver, "bv32");
	   	Thread.sleep(3000);
	   	utilobj.JSEnterText(getimageWorkListReqDetailTP_NOFU_Quantity(), driver, "1");
	   	Thread.sleep(3000);
	   	utilobj.JSClick(getimageWorkListReqDetailTP_NOFU_ButtonADD(), driver);
	   	Thread.sleep(3000);
	   	utilobj.JSClick(getimageWorkListReqDetailTP_NOFU_ButtonOK(), driver);
	   	Thread.sleep(3000);
		utilobj.JSClick(getimageWorkListReqDetailSaveButton(),driver);
	   	
	   	Thread.sleep(3000);
	   	utilobj.JSClick(getimageWorkListReqDetailTPINFOMESSAGE(),driver);
	   	Thread.sleep(3000);
	   	driver.close();
	   	Thread.sleep(1000);
	   	driver.switchTo().window(parent3);
	   	Thread.sleep(3000);
//	   	utilobj.JSClick(getchange_facility_location_linkLink(), driver);
//	   	Thread.sleep(3000);
	   	}
	
	   	public void testcaseforgenrateIntimationsummery() throws InterruptedException, AWTException {
	   	Thread.sleep(3000);
		utilobj.MoveElement(getClinicalRecordLink(), driver);
		Thread.sleep(1000);
		utilobj.JSClick(getDischargeIntimationLink(), driver);
		Thread.sleep(1000);
		utilobj.JSClick(getInpatientEmargancyPatientSurgeryUnitpluebuuton(), driver);
		
		Thread.sleep(3000);
		utilobj.JSClick(getInpatientEmargancyPatientSurgeryUnitBedIMG(), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_hypDisSummary")), driver);
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgAdmNo")), driver);
		Thread.sleep(3000);
		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchCriteria_dlData_ctl01_txtCriteria")), driver,"IP11");
		Thread.sleep(3000);
		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSearch")), driver);
		Thread.sleep(3000);
	utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_hisSearchResultGrid_gdvList_ctl02_rdbTemp")), driver);
	Thread.sleep(3000);
	utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_ucCommonSearch_btnSelect")), driver);
	Thread.sleep(3000);
	utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnSave")), driver);
	Thread.sleep(3000);
	utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
	Thread.sleep(3000);
	
	utilobj.MoveElement(getClinicalRecordLink(), driver);
	Thread.sleep(1000);
	utilobj.JSClick(getDischargeIntimationLink(), driver);
	Thread.sleep(1000);
	utilobj.JSClick(getInpatientEmargancyPatientSurgeryUnitpluebuuton(), driver);
	
	Thread.sleep(3000);
	utilobj.JSClick(getInpatientEmargancyPatientSurgeryUnitBedIMG(), driver);
	Thread.sleep(3000);
	utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_hypDischargeintimation")), driver);
	Thread.sleep(3000);
	utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlRequestType")), driver, "Normal Discharge");
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_cphpage_txtRemarks")).sendKeys("test Remarks");
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
	Thread.sleep(3000);
	utilobj.JSClick(getchange_facility_location_linkLink(), driver);
	Thread.sleep(3000);
	utilobj.selectDropdown(getSelectHospitalLocationDDL(), driver, "ESIC TEST HOSPITAL DL");
	Thread.sleep(3000);
	utilobj.selectDropdown(getSelectFacilityLocationDDL(), driver, "Male Medical Ward");
	Thread.sleep(3000);
	utilobj.JSClick(getSelectFacilityLocationSubmitButton(), driver);
	Thread.sleep(3000);
	utilobj.MoveElement(getinpatientManagementLink(), driver);
	Thread.sleep(3000);
	utilobj.JSClick(getIPMDischargeintimationLink(), driver);
	Thread.sleep(3000);
	utilobj.JSClick(driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/div/div/table/tbody/tr[2]/td[1]/span")), driver);
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_cphpage_btnSave")).click();
	
	
	
	
	
	
		// String parent4 = driver.getWindowHandle();

		   	
//			utilobj.Window(driver);
//			Thread.sleep(3000);
//			getClinicalSummary().click();
//			Thread.sleep(3000);
//			utilobj.ChildWindow(driver);
//
//			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
//					.withTimeout(30, TimeUnit.SECONDS) 			
//					.pollingEvery(5, TimeUnit.SECONDS) 			
//					.ignoring(NoSuchElementException.class);
//			WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
//			
//				public WebElement apply(WebDriver driver ) {
//					return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
//				}
//			});
//			utilobj.JSClick(driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/img[1]")), driver);
//		   	Thread.sleep(3000);
//		   	System.out.println(driver.getTitle());
//		   	driver.switchTo().frame(driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/iframe[2]")));
//		   	Thread.sleep(3000);
//		   	utilobj.JSEnterText(driver.findElement(By.xpath("/html/body")), driver, "test");
//		   	Thread.sleep(3000);
//			
//		Thread.sleep(3000);
//		getDignose().click();
//		Thread.sleep(3000);
//		Robot rb=new Robot();
//		rb.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(3000);
//		
//		
//		rb.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(3000);
//		
//		
//		rb.keyPress(KeyEvent.VK_ENTER);
//		
//		Thread.sleep(3000);
//		utilobj.MoveElement(getClinicalRecordLink(), driver);
//		Thread.sleep(1000);
//		utilobj.JSClick(getInpatientEmergancy_Patient(), driver);
//		Thread.sleep(1000);
//		utilobj.JSClick(getInpatientEmargancyPatientSurgeryUnitpluebuuton(), driver);
//		
//		Thread.sleep(3000);
//		utilobj.JSClick(getInpatientEmargancyPatientSurgeryUnitBedIMG(), driver);
//		Thread.sleep(3000);
//		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_hypDischargeintimation")), driver);
//		Thread.sleep(3000);
//		utilobj.selectDropdown(getRequestTypeDDL(), driver, "Normal Discharge");
//		Thread.sleep(3000);
//		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_txtRemarks")), driver, "Test Remarks");
//		Thread.sleep(3000);
//
//		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnSave")), driver);
		
		
		
//		getClinicalSummary().click();
//		Thread.sleep(3000);
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.navigate().to("https://gateway.esic.in/Hospital/ClinicalRecords/CaseSummaryEntry.aspx?CName=Clinical%20Note%28Summary%29");
//		System.out.println(driver.getCurrentUrl());
//		//driver.close();
//		List<String> myList = new ArrayList<String>();
//		
//		Set<String> mySet=driver.getWindowHandles();
//		Iterator<String> itr = mySet.iterator();
//
//		for(int i=0;i<mySet.size();i++){
//			myList.add(itr.next());
//
//		}
//		
//		 System.out.println("Total no of windows : "+myList.size());
//	
//		 driver.switchTo().window(myList.get(1));
		//String MainWindow = driver.getWindowHandle();
		//Thread.sleep(3000);
	    //System.out.println("Main window handle is " + MainWindow);
	 
	    // To handle all new opened window
//	    Set<String> s1 = driver.getWindowHandles();
//	    Thread.sleep(3000);
//	    System.out.println("Child window handle is" + s1);
//	    Iterator<String> i1 = s1.iterator();
//	 
//	    // Here we will check if child window has other child windows and when child window
//	    //is the main window it will come out of loop.
//	      while (i1.hasNext()) {
//	          String ChildWindow = i1.next();
//	          if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
//	              driver.switchTo().window(ChildWindow);
//	              driver.close();
//	              System.out.println("Child window closed");
//	           }
//	       }
		
	   	
//	    String mainWindowHandle = driver.getWindowHandle();
//        Set<String> allWindowHandles = driver.getWindowHandles();
//        Iterator<String> iterator = allWindowHandles.iterator();
// 
//        // Here we will check if child window has other child windows and will fetch the heading of the child window
//        while (iterator.hasNext()) {
//            String ChildWindow = iterator.next();
//                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
//                driver.switchTo().window(ChildWindow);
//              System.out.println(driver.getTitle());
//               // WebElement text = driver.findElement(By.id("sampleHeading"));
//                //System.out.println("Heading of child window is " + text.getText());
//            }
//        }
//	   	
	   	
	   	
	   	
//		public void ChildWindowforclinicalsummery(WebDriver driver) {
//			try {
//				String subWindowHandler = null;
//
//				Set<String> handles = driver.getWindowHandles();
//				System.out.println(handles.size());
//
//				Iterator<String> iterator = handles.iterator();
//
//				while (iterator.hasNext()) {
//					subWindowHandler = iterator.next();
//
//					driver.switchTo().window(subWindowHandler);
//					System.out.println(driver.getTitle());
//
//					if (driver.getTitle().contains(" 	Dhanwantri ")) {
//
//						break;
//
//					}
//
//				}
//
//				System.out.println(driver.getTitle());
//			} catch (Exception e) {
//				System.out.println("Winow not handled");
//
//				// logger("Steps","Window", e);
//
//			}
//		}
		

		

		
		
		
		//driver.get("https://gateway.esic.in/Hospital/ClinicalRecords/CaseSummaryEntry.aspx?CName=Clinical%20Note%28Summary%29");
//		utilobj.SwitchToChildWindow(driver, "Dhanwantri");
//		Thread.sleep(3000);
		//System.out.println(driver.getTitle());
//		Thread.sleep(3000);
//        String parent4 = driver.getWindowHandle();	   	
//		utilobj.Window(driver);	   	
//	   	Thread.sleep(3000);
//	   	
//	   	Thread.sleep(3000);
//	   	utilobj.JSClick(driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/img[1]")), driver);
//	   	Thread.sleep(3000);
//	   	System.out.println(driver.getTitle());
//	   	driver.switchTo().frame(driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/iframe[2]")));
//	   	Thread.sleep(3000);
//	   	utilobj.JSEnterText(driver.findElement(By.xpath("/html/body")), driver, "test");
//	   	Thread.sleep(3000);
//	   	driver.switchTo().defaultContent();
//
//	   	Thread.sleep(3000);
//	   	utilobj.JSClick(driver.findElement(By.id("btnDone")), driver);
//	   	Thread.sleep(3000);
//	   //	driver.close();
//		Thread.sleep(1000);
//	   	driver.switchTo().window(parent4);
//	   	Thread.sleep(3000);
//	   	utilobj.ChildWindowSwitch(driver, SelectFacilityLocationDDL)
		//driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/img[1]")).click();
		                                                
//		utilobj.JSClick(driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table[2]/tbody/tr/td[1]/div/table/tbody/tr/td/div[1]/a[2]/img")), driver);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		utilobj.SwitchToChildWindow(driver, " 	Dhanwantri ");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		System.out.println(driver.getTitle());
//		String parent=driver.getWindowHandle();
//
//		Set<String>handle=driver.getWindowHandles();
//		
//
//		// Now iterate using Iterator
//		Iterator<String> It= handle.iterator();
//
//		System.out.println(handle.size());
//		String parendid=It.next();
//		String childid=It.next();
//		
//		getClinicalSummary().click();
//		
//		driver.switchTo().window(childid);
//		System.out.println(driver.getTitle());
//		getClinicalSummaryEditBtn().click();
//        driver.findElement(By.id("txtEditor_ctl02_ctl00")).sendKeys("Test test");
//		
//	
//		
//		
//		Thread.sleep(3000);
//
//		getDoneBtn().click();
//		
//		
//		driver.switchTo().window(parendid);
   	}
	   	
}
		
	
	
	
	
    
		
	
	
	

