package com.qa.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.util;

public class OPDFlowPages extends BasePage  {
	public static Properties prop;
	//private String typevalue;
	 util utilobj = new util();
	public OPDFlowPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By popupmessage = By.id("popup_message");
	private By changeLocation = By.id("ctl00_lnkbtnChangeHospital");
	private By lableprecripstionlink = By.id("ctl00_cphpage_trvSectionst11");
	private By ClinicalRecordsLink = By.linkText("Clinical Records");
	private By PharmacyIssue = By.xpath("/html/body/div[1]/form/div[3]/div[2]/table/tbody/tr/td[2]/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr/td/div/ul[4]/li[10]/a");
	
	private By popupok = By.id("popup_ok");
	private By Stores = By.linkText("Stores");
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
	private By UHID_creation_Uhid_txtbox = By.id("ctl00_cphpage_txtuhid");
	private By UHID_creation_Uhid_succes = By.id("ctl00_cphpage_btnOK11");
	private By UHID_creation_Uhid_OPDNumber = By.id("ctl00_cphpage_lnkbtnCheckIn");
	private By patientCheckInNumberUHIDTXTBOX=By.id("ctl00_cphpage_txtuhid");
	private By patientCheckInNumberSeviceOkButton=By.id("ctl00_cphpage_btnOK");
	private By patientCheckInNumberSaveButton=By.id("ctl00_cphpage_btnSaveDisplay");
	private By patientCheckInNumberinfoMsgboxcancelbutton=By.id("popup_cancel");
	private By patientCheckInNumberRegistration=By.id("ctl00_cphpage_lnkRegistration");
	private By UHID_creation_clearButton=By.id("ctl00_cphpage_btnClear");
	private By DoctorWorklistLink = By.linkText("Doctor Worklist");
	private By doctorworklist_checkintextBox=By.id("ctl00_cphpage_txtCheckinno");
	private By txtOrdPackSearch = By.id("txtOrdPackSearch");
	private By orderpack = By.id("97701");
	private By btnISaveClose = By.id("btnISaveClose");
	private By clickorderpackbutton = By.id("btnOrdpack"); // 97701

	private By orderpackselection = By.id("97701"); //
	private By StoreUhidTextBox = By.id("ctl00_cphpage_txtCheckinNo");
	private By StoreUhidImgSerch = By.id("ctl00_cphpage_imgCheckinno");
	private By StoreUhidIssueQuantity = By.id("ctl00_cphpage_grdIssueDetails_ctl02_txtIssueQty");
	private By StoreUhidIssueSaveButton = By.id("ctl00_cphpage_btnSave");
	private By btncancel = By.id("popup_cancel");
	public WebElement getdoctorworklist_checkintextBox() {
		return getElement(doctorworklist_checkintextBox);
	}
	public WebElement getBtncancel() {
		return getElement(btncancel);
	}
	public WebElement getStoreUhidIssueSaveButton() {
		return getElement(StoreUhidIssueSaveButton);

	}
	
	public WebElement getStoreUhidIssueQuantity() {
		return getElement(StoreUhidIssueQuantity);

	}
	public WebElement getpopupok() {
		return getElement(popupok);

	}
	public WebElement getStoreUhidImgSerch() {
		return getElement(StoreUhidImgSerch);

	}
	public WebElement getStoreUhidTextBox() {
		return getElement(StoreUhidTextBox);

	}
	public WebElement gettxtOrdPackSearch() {
		return getElement(txtOrdPackSearch);

	}
	public WebElement getPharmacyIssue() {
		return getElement(PharmacyIssue);

	}
	
	public WebElement getbtnISaveClose() {
		return getElement(btnISaveClose);

	}
	public WebElement getStores() {
		return getElement(Stores);

	}
	public WebElement getorderpackselection() {
		return getElement(orderpackselection);

	}
	public WebElement getorderpack() {
		return getElement(orderpack);

	}

	public WebElement getclickorderpackbutton() {
		return getElement(clickorderpackbutton);

	}
	public WebElement getDoctorWorklistLink() {
		return getElement(DoctorWorklistLink);

	}
	public WebElement getlableprecripstionlink() {
		return getElement(lableprecripstionlink);

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
	public WebElement getClinicalRecordsLink() {
		return getElement(ClinicalRecordsLink);

	}
	public WebElement getchange_facility_location_linkLink() {
		return getElement(changeLocation);

	}
	
	public String verifyUHIDPageTitle() {

		return driver.getTitle();

	}
	private By DoctorworklistUhidTR=By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblUHID");
	public WebElement getDoctorworklistUhidTR() {
		return getElement(DoctorworklistUhidTR);

	}
	private By DoctorworklistCheckINno=By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1");
	public WebElement getDoctorworklistCheckINno() {
		return getElement(DoctorworklistCheckINno);

	}
	private By CheckINPrescription=By.id("ctl00_cphpage_trvSectionst11");
	
	public WebElement getCheckINPrescription() {
		return getElement(CheckINPrescription);

	}private By getUHidOP=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[2]/tbody/tr[1]/td[2]/span");
	
	public WebElement getUHidOP() {
		return getElement(getUHidOP);

	}
	public WebElement getPopupmessage() {
		return getElement(popupmessage);

	}
	/*laboratory*/
private By labotatory_reqno=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/a");
                                      //html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/a
                                     // /html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[3]/td[1]/a
	private By laboratory_Requisition_Details_IP_OP_SCcheckboxcheckbox=By.xpath("/html/body/form/div[3]/div/div[1]/div/table/tbody/tr[2]/td[10]/table/tbody/tr/td[2]/input");
	private By laboratory_Requisition_Details_savebutton=By.id("btnSave");
	private By laboratory_sample_knowladge_outpatient_okbutton=By.id("ctl00_cphpage_btnOk");
	private By laboratory_sample_knowladge_outpatient_acknowladgeallbutton=By.id("ctl00_cphpage_btnAcknowledgeAll");
	private By laboratory_outpatient_worklist_ip_no=By.id("ctl00_cphpage_OPWorklistSearch_dlData_ctl09_txtCriteria"); 
	private By laboratory_sample_knowladge_outpatient_acknowladgepopok=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	private By laboratory_sample_knowladge_outpatient_IPNo=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[4]/input");
	private By laboratoryWorklistOKButton=By.id("ctl00_cphpage_OPWorklistSearch_btnOK");
	//html/body/div[1]/form/div[4]/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/a
	/*laboratotary*/
	public WebElement getlaboratoryWorklistOKButton() {
		return getElement(laboratoryWorklistOKButton);
	}
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
	private By laboratory_Requisition_Details_IP_OP_SC_RE=By.xpath("/html/body/form/div[3]/div/div[1]/div/table/tbody/tr[2]/td[12]/input");
	
	public WebElement getlaboratory_Requisition_Details_IP_OP_SC_RE() {
		return getElement(laboratory_Requisition_Details_IP_OP_SC_RE);
	}
	private By laboratory_Requisition_Details_IP_OP_SC_RE_resultBASEEXCESS=By.id("ctl00_cphpage_gdvSearchResult_ctl02_txtControl");
	public WebElement getlaboratory_Requisition_Details_IP_OP_SC_RE_resultBASEEXCESS() {
		return getElement(laboratory_Requisition_Details_IP_OP_SC_RE_resultBASEEXCESS);
	}
	private By laboratory_Requisition_Details_IP_OP_SC_RE_resultBASEEXCESSOFEXTUCULLAR=By.id("ctl00_cphpage_gdvSearchResult_ctl03_txtControl");
	public WebElement getlaboratory_Requisition_Details_IP_OP_SC_RE_resultBASEEXCESSOFEXTUCULLAR() {
		return getElement(laboratory_Requisition_Details_IP_OP_SC_RE_resultBASEEXCESSOFEXTUCULLAR);
	}
	private By laboratory_Requisition_Details_IP_OP_SC_RE_resultPCO2=By.id("ctl00_cphpage_gdvSearchResult_ctl04_txtControl");
	public WebElement getlaboratory_Requisition_Details_IP_OP_SC_RE_resultPCO2() {
		return getElement(laboratory_Requisition_Details_IP_OP_SC_RE_resultPCO2);
	}
	private By laboratory_Requisition_Details_IP_OP_SC_RE_resultPO2=By.id("ctl00_cphpage_gdvSearchResult_ctl05_txtControl");
	public WebElement getlaboratory_Requisition_Details_IP_OP_SC_RE_resultPO2() {
		return getElement(laboratory_Requisition_Details_IP_OP_SC_RE_resultPO2);
	}
	private By laboratory_Requisition_Details_IP_OP_SC_RE_resultSTDBICARBONATE=By.id("ctl00_cphpage_gdvSearchResult_ctl06_txtControl");
	public WebElement getlaboratory_Requisition_Details_IP_OP_SC_RE_resultSTDBICARBONATE() {
		return getElement(laboratory_Requisition_Details_IP_OP_SC_RE_resultSTDBICARBONATE);
	}
	private By laboratory_Requisition_Details_IP_OP_SC_RE_resultSAVE=By.id("btnSave");
	public WebElement getlaboratory_Requisition_Details_IP_OP_SC_RE_resultSAVE() {
		return getElement(laboratory_Requisition_Details_IP_OP_SC_RE_resultSAVE);
	}
	private By laboratory=By.linkText("Laboratory");
	public WebElement getlaboratoryLink() {
		return getElement(laboratory);
	}
	private By labWorkList=By.linkText("Lab Worklist");
	public WebElement getlabWorkListLink() {
		return getElement(labWorkList);
	}
	private By BulkResultEntry=By.linkText("Bulk Result Entry");
	public WebElement getBulkResultEntry() {
		return getElement(BulkResultEntry);
	}
	private By BulkResultEntryReqNO=By.id("ctl00_cphpage_txtRequNo");
	public WebElement getBulkResultEntryReqNO() {
		return getElement(BulkResultEntryReqNO);
	}
	private By BulkResultEntryOKBUTTON=By.id("ctl00_cphpage_btnOK");
	public WebElement getBulkResultEntryOKBUTTON() {
		return getElement(BulkResultEntryOKBUTTON);
	}
	private By LaboratoryOPworkListTxtboxsearch=By.id("ctl00_cphpage_OPWorklistSearch_dlData_ctl07_txtCriteria");
	public WebElement LaboratoryOPworkListTxtboxsearch() {
		return getElement(LaboratoryOPworkListTxtboxsearch);
	}
	private By BulkResultEntryDOctorachkBox=By.id("ctl00_cphpage_gdvDoctors_ctl02_chkDoctor");
	public WebElement getBulkResultEntryDOctorachkBox() {
		return getElement(BulkResultEntryDOctorachkBox);
	}
	private By BulkResultEntryverifyedCheckBOX=By.id("ctl00_cphpage_gdvSearchResult_ctl01_chkVerifyAll");
	public WebElement getBulkResultEntryverifyedCheckBOX() {
		return getElement(BulkResultEntryverifyedCheckBOX);
	}
	private By BulkResultEntrysavebutton=By.id("ctl00_cphpage_btnSave");
	public WebElement getBulkResultEntrysavebutton() {
		return getElement(BulkResultEntrysavebutton);
	}
	private By BulkResultEntrySuccesOKbutton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getBulkResultEntrySuccesOKbutton() {
		return getElement(BulkResultEntrySuccesOKbutton);
	}
	
	
	
	
	
	/*laboratory*/
	
//	public  void testcaseforOPDFlowpages(String Title, String FirstName, String LastName, String MaritalStatus1, String Age,
//			String Address) throws InterruptedException {
//		
//	utilobj.selectDropdown(getTitle(), driver, Title);
//	Thread.sleep(2000);
//	getFirstName().sendKeys(FirstName);
//	Thread.sleep(2000);
//	getLastName().sendKeys(LastName);
//	
//	Thread.sleep(2000);
//	
//	System.out.println(MaritalStatus1 + getMarriageStatus());
//	//utilobj.selectDropdown(getMarriageStatus(), driver, MaritalStatus1);
//	Thread.sleep(2000);
//	getAge().sendKeys(Age);
//	Thread.sleep(2000);
//	getPresentAddres().sendKeys(Address);
//	Thread.sleep(2000);
//	utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlPresentLGDState")), driver, "Maharashtra");
//	Thread.sleep(2000);
//	utilobj.selectDropdown(driver.findElement(By.id("ctl00_cphpage_ddlPresentLGDDistrict")), driver, "Mumbai");
//	Thread.sleep(2000);
//	driver.findElement(By.id("ctl00_cphpage_txtPincode")).sendKeys("250001");
//	Thread.sleep(2000);
//	getSavebutton().click();
//	Thread.sleep(2000);
//	getbtnYes().click();
//	Thread.sleep(2000);
//	//getInformationPopUp().click();
//	Thread.sleep(2000);
//	getUHID_creation_Uhid_succes().click();
//	Thread.sleep(2000);
//
////	getUHID_creation_Uhid_OPDNumber().click();
//
//	Thread.sleep(1000);
//	
//
//}
	
	
	public  void getgenratechekIn() throws InterruptedException {
		Thread.sleep(2000);
		 driver.findElement(By.id("ctl00_cphpage_txtIPNO")).sendKeys("1111111114");
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnSelect")).click();
			//getUHID_creation_Uhid_OPDNumber().click();
			Thread.sleep(4000);
		getpatientCheckInNumberSeviceOkButton().click();
		Thread.sleep(4000);
		getpatientCheckInNumberSaveButton().click();
		Thread.sleep(4000);
		}
	
	public String getPatientCheckinNumber() throws InterruptedException {

		System.out.println(getPopupmessage().getText());
		System.out.println(utilobj.GetCheckinNumberText(getPopupmessage(), driver));

		String strCheckinNumber = utilobj.GetCheckinNumberText(getPopupmessage(), driver);

		getBtncancel().click();
		return strCheckinNumber;
	}
	public String testcasegetUhid() throws InterruptedException {
		String typeValue= getUHID_creation_Uhid_txtbox().getAttribute("value");
		Thread.sleep(3000);
		System.out.println(typeValue);
		
		Thread.sleep(1000);
		//getUHID_creation_Uhid_OPDNumber().click();
		return typeValue;
		
	}
	
	public void doIPCasesheetprecripstion(String orderpackname,String checkin) {
		try

		{
		utilobj.MoveElement(getClinicalRecordsLink(), driver);
		Thread.sleep(2000);
		getDoctorWorklistLink().click();
		Thread.sleep(2000);
		utilobj.JSEnterText(getdoctorworklist_checkintextBox(), driver, checkin);
		Thread.sleep(2000);
//		getdoctorworklist_checkintextBox().sendKeys(checkin);
//		Thread.sleep(2000);
utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
Thread.sleep(2000);
utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);
//Thread.sleep(2000);
//getDoctorworklistCheckINno().click();

		
			Thread.sleep(2000);

			getpopupok().click();

			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			getlableprecripstionlink().click();

			Thread.sleep(2000);

			// utilobj.ChildWindowforPrescription(driver);
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);

			// driver.switchTo().window("ClientSide_Prescriptions");
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(gettxtOrdPackSearch(), driver, orderpackname);

			utilobj.JSClick(getclickorderpackbutton(), driver);

			// gettxtOrdPackSearch().sendKeys(orderpackname);
			// getclickorderpackbutton().click();

			Thread.sleep(3000);

			utilobj.JSClick(getorderpackselection(), driver);

			//Thread.sleep(5000);
			
			//utilobj.JSClick(getbtn_clear_Link(), driver);
			//Thread.sleep(5000);
			//utilobj.JSClick(getbtn_close_Link(), driver);
			Thread.sleep(5000);
//			getpopok().click();
//			Thread.sleep(5000);
//			getpopok().click();

			utilobj.JSClick(getbtnISaveClose(), driver);

			utilobj.waitForalert(driver);

			driver.switchTo().alert().accept();

			driver.switchTo().window(parent3);

			//driver.switchTo().defaultContent();

			getpopupok().click();
//			Thread.sleep(1000);
			getchange_facility_location_linkLink().click();
			Thread.sleep(5000);
		}
		

		catch (Exception ex) {
			System.err.println(ex);
		}

	}
	
	
	public  void TestCaseforStoreServices(String s) throws InterruptedException {
	
		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(getStores()));
		
		utilobj.MoveElement(getStores(), driver);
		Thread.sleep(2000);		
		getPharmacyIssue().click();		
		Thread.sleep(2000);
		getStoreUhidTextBox().sendKeys(s);
		Thread.sleep(2000);
		getStoreUhidImgSerch().click();
		Thread.sleep(2000);
		getStoreUhidIssueQuantity().clear();
		Thread.sleep(4000);
		getStoreUhidIssueQuantity().sendKeys("3");
		Thread.sleep(2000);
		getStoreUhidIssueSaveButton().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popup_ok")));
		utilobj.JSClick(driver.findElement(By.id("popup_ok")), driver);
		//driver.findElement(By.id("popup_ok")).click();
		//getUHID_creation_Uhid_succes().click();
		Thread.sleep(2000);
		getchange_facility_location_linkLink().click();
		Thread.sleep(2000);

		
	}
	public void testcaseforLaboratoryworkListOPD(String UHID) throws InterruptedException {
//		Thread.sleep(2000);
//		utilobj.MoveElement(getlaboratoryLink(), driver);
//		Thread.sleep(2000);
//		getlabWorkListLink().click();
		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(LaboratoryOPworkListTxtboxsearch()));
		LaboratoryOPworkListTxtboxsearch().sendKeys(UHID);
		Thread.sleep(2000);
		
		getlaboratoryWorklistOKButton().click();
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();
	   	
		utilobj.Window(driver);
		Thread.sleep(2000);
		//String ReqNo=getlabotatory_reqnoLink().getText();
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
	   		
		
	   	driver.close();
	   	
	   	driver.switchTo().window(parent3);
	   	Thread.sleep(5000);
	   	String ReqNo=getlabotatory_reqnoLink().getText();
		Thread.sleep(2000);
	   	
		utilobj.MoveElement(getlaboratoryLink(), driver);
		Thread.sleep(2000);
		getBulkResultEntry().click();
		Thread.sleep(2000);
		getBulkResultEntryReqNO().sendKeys(ReqNo);
		Thread.sleep(2000);
		getBulkResultEntryOKBUTTON().click();
		Thread.sleep(2000);
		getlaboratory_Requisition_Details_IP_OP_SC_RE_resultBASEEXCESS().sendKeys("5");
		Thread.sleep(2000);
		getlaboratory_Requisition_Details_IP_OP_SC_RE_resultBASEEXCESSOFEXTUCULLAR().sendKeys("6");
		Thread.sleep(2000);
		getlaboratory_Requisition_Details_IP_OP_SC_RE_resultPCO2().sendKeys("10");
		Thread.sleep(2000);
		getlaboratory_Requisition_Details_IP_OP_SC_RE_resultPO2().sendKeys("12");
		Thread.sleep(2000);
		getlaboratory_Requisition_Details_IP_OP_SC_RE_resultSTDBICARBONATE().sendKeys("20");
		Thread.sleep(2000);
		getBulkResultEntryverifyedCheckBOX().click();
		Thread.sleep(2000);
		getBulkResultEntryDOctorachkBox().click();
		Thread.sleep(2000);
		getBulkResultEntrysavebutton().click();
		Thread.sleep(2000);
		utilobj.JSClick(getBulkResultEntrySuccesOKbutton(), driver);
		//getBulkResultEntrySuccesOKbutton().click();
		//driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		Thread.sleep(2000);
		getchange_facility_location_linkLink().click();
		Thread.sleep(2000);
		
	}
	private By imageWorkListUHIDtxtsearch=By.id("ctl00_cphpage_OPWorklistSearch_dlData_ctl07_txtCriteria");
	public WebElement getimageWorkListUHIDtxtsearch() {
		return getElement(imageWorkListUHIDtxtsearch);
	}
	private By imageWorkListUHIDOKBUtton=By.id("ctl00_cphpage_OPWorklistSearch_btnOK");
	public WebElement getimageWorkListUHIDOKBUtton() {
		return getElement(imageWorkListUHIDOKBUtton);
	}
	private By imageWorkListUHIDOKBUtReqNO=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[1]/a");
	public WebElement getimageWorkListUHIDOKBUtReqNO() {
		return getElement(imageWorkListUHIDOKBUtReqNO);
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
	
	
	
	
	public void testcaseforImagingWorklList(String UHID) throws InterruptedException {
		Thread.sleep(2000);
		getimageWorkListUHIDtxtsearch().sendKeys(UHID);
		Thread.sleep(2000);
		getimageWorkListUHIDOKBUtton().click();
		Thread.sleep(2000);
		
        String parent3 = driver.getWindowHandle();
	   	
		utilobj.Window(driver);
		Thread.sleep(2000);
		//String ReqNo=getlabotatory_reqnoLink().getText();
		getimageWorkListUHIDOKBUtReqNO().click();
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
	   	Thread.sleep(2000);
	   	utilobj.JSEnterText(getimageWorkListReqDetailTP_NOFU_Quantity(), driver, "1");
	   	Thread.sleep(3000);
	   	utilobj.JSClick(getimageWorkListReqDetailTP_NOFU_ButtonADD(), driver);
	   	Thread.sleep(3000);
	   	utilobj.JSClick(getimageWorkListReqDetailTP_NOFU_ButtonOK(), driver);
	   	Thread.sleep(3000);
	   	utilobj.JSClick(getlaboratory_Requisition_Details_savebuttonLink(), driver);
	   	Thread.sleep(3000);
	   	utilobj.JSClick(getimageWorkListReqDetailTPINFOMESSAGE(),driver);
	   		
		
	   	driver.close();
	   		driver.switchTo().window(parent3);
	   	Thread.sleep(5000);
	   
		
	}
	
	
}