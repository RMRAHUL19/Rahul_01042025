package com.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;
import com.qa.util.util;

public class CertificationGenrationpages extends BasePage {
	util utilobj=new util();
	public CertificationGenrationpages(WebDriver driver) {
		super(driver);
		
	}
	private By insuranceNo_searchimgbutton=By.id("ctl00_cphpage_imgbtnInsuranceno");
	public WebElement getinsuranceNo_searchimgbuttonLink() {
		return getElement(insuranceNo_searchimgbutton);
	}
	private By insuranceNoWindow_serchTxtbox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	public WebElement getinsuranceNoWindow_serchTxtboxLink() {
		return getElement(insuranceNoWindow_serchTxtbox);
	}
	private By insuranceNoWindow_serchTxtbox2=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl01_txtCriteria");
	public WebElement getinsuranceNoWindow_serchTxtbox2Link() {
		return getElement(insuranceNoWindow_serchTxtbox2);
	}
	private By insuranceNowindow_serchbutton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	public WebElement getinsuranceNowindow_serchbuttonLink() {
		return getElement(insuranceNowindow_serchbutton);
		
	}
	private By insuranceNowindow_radioButton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
	                                                
	public WebElement getinsuranceNowindow_radioButtonLink() {
		return getElement(insuranceNowindow_radioButton);
	}

	private By insuranceNowindow_selectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
	public WebElement getinsuranceNowindow_selectButtonLink() {
		return getElement(insuranceNowindow_selectButton);
	}
	private By insuranceNo_certificateType=By.id("ctl00_cphpage_ddlCertificatetype");
	public WebElement getinsuranceNo_certificateTypeLink() {
		return getElement(insuranceNo_certificateType);
	}
	private By MedicalCertificateFirstAndFinal_CreateDateOfSpell_callander=By.id("ctl00_cphpage_txtStartDateOfSpell");
	public WebElement getMedicalCertificateFirstAndFinal_CreateDateOfSpell_callanderLink() {
		return getElement(MedicalCertificateFirstAndFinal_CreateDateOfSpell_callander);
	}
	private By MedicalCertificateFirstAndFinal_CreateDateOfSpell_callander_date=By.id("ctl00_cphpage_CalendarExtender3_day_0_1");
	public WebElement getMedicalCertificateFirstAndFinal_CreateDateOfSpell_callander_dateLink() {
		return getElement(MedicalCertificateFirstAndFinal_CreateDateOfSpell_callander_date);
	}
	private By medicalCertificate_leveRecommendationImgTitlePanel5=By.id("ctl00_cphpage_imgTitlePanel5");
	public WebElement getmedicalCertificate_leveRecommendationLink() {
		return getElement(medicalCertificate_leveRecommendationImgTitlePanel5);
	}
	private By medicalCertifiacteLeveRecommendation_leaveRequire=By.id("ctl00_cphpage_txtTotalleaveavailed");
	public WebElement getmedicalCertifiacteLeveRecommendation_leaveRequireLink() {
		return getElement(medicalCertifiacteLeveRecommendation_leaveRequire);
	}
	private By Maternitycertification_layout_previousCertification_hidebutton=By.id("ctl00_cphpage_Image5");
	public WebElement getMaternitycertification_layout_previousCertification_hidebuttonLink() {
		return getElement(Maternitycertification_layout_previousCertification_hidebutton);
	}
	private By Medicalcertification_layout_previousCertification_calender_privious=By.id("ctl00_cphpage_CalendarExtender3_prevArrow");
	public WebElement  getMedicalcertification_layout_previousCertification_calender_priviousLink() {
		return getElement(Medicalcertification_layout_previousCertification_calender_privious);
	}
	private By Medicalcertification_layout_previousCertification_informationclose=By.id("ctl00_cphpage_MyMessageBoxInfo_ImageYes");
	public WebElement  getMedicalcertification_layout_previousCertification_informationcloseLink() {
		return getElement(Medicalcertification_layout_previousCertification_informationclose);
	}
	private By Medicalcertification_deathcertification_dateofdeath=By.id("ctl00_cphpage_txtDateOfDeath");
	public WebElement  getMedicalcertification_deathcertification_dateofdeath() {
		return getElement(Medicalcertification_deathcertification_dateofdeath);
	}
	private By Medicalcertification_deathcertification_causeofdeath=By.id("ctl00_cphpage_txtCauseOfDeath");
	public WebElement  getMedicalcertification_deathcertification_causeofdeath() {
		return getElement(Medicalcertification_deathcertification_causeofdeath);
	}
	private By Medicalcertification_deathcertification_causeofdeath_SelectDate=By.xpath("/html/body/div/form/div[4]/div[2]/div[1]/div/div/table[5]/tbody/tr/td/table/tbody/tr[2]/td/div/div/div/table/tbody/tr[1]/td[2]/div[1]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[4]/div");
	public WebElement  Medicalcertification_deathcertification_causeofdeath_SelectDate() {
		return getElement(Medicalcertification_deathcertification_causeofdeath_SelectDate);
	}
	
	private By Medicalcertification_deathcertification_remarkss=By.id("ctl00_cphpage_txtRemarksforDeathCertificate");
	public WebElement  getMedicalcertification_deathcertification_remarkss() {
		return getElement(Medicalcertification_deathcertification_remarkss);
	}
	private By Medicalcertification_deathcertification_printbutton=By.id("ctl00_cphpage_btnPrint");
	public WebElement  getMedicalcertification_deathcertification_printbutton() {
		return getElement(Medicalcertification_deathcertification_printbutton);
	}
	
	private By Medicalcertification_deathcertification_Savebutton=By.id("ctl00_cphpage_btnSaveDisplay");
	public WebElement  getMedicalcertification_deathcertification_Savebutton() {
		return getElement(Medicalcertification_deathcertification_Savebutton);
	}
	private By Medicalcertification_Information_buttonYes=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");
	public WebElement  getMedicalcertification_Information_buttonYes() {
		return getElement(Medicalcertification_Information_buttonYes);
	}
	private By Medicalcertification_ForceClouser=By.id("ctl00_cphpage_btnPopUpOK");
	public WebElement  getMedicalcertification_ForceClouser() {
		return getElement(Medicalcertification_ForceClouser);
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
	private By GetCertificationNumberFromTextBox=By.id("ctl00_cphpage_txtCertificateno");
	public WebElement getGetCertificationNumberFromTextBox() {
		return getElement(GetCertificationNumberFromTextBox);
	}
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

	public  void getgenratechekIn(String IPnumber) throws InterruptedException {
		Thread.sleep(2000);
		 driver.findElement(By.id("ctl00_cphpage_txtIPNO")).sendKeys(IPnumber);
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
			WebDriverWait wait=new WebDriverWait(driver, 300);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")));
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnSelect")).click();
			wait.until(ExpectedConditions.visibilityOf(getpatientCheckInNumberSeviceOkButton()));
			Thread.sleep(4000);
		getpatientCheckInNumberSeviceOkButton().click();
		Thread.sleep(4000);
		getpatientCheckInNumberSaveButton().click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(getPopupmessage()));
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
		
		return typeValue;
		
	}
	
	public void doIPCasesheetprecripstion(String orderpackname,String checkin) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(getClinicalRecordsLink()));
		utilobj.MoveElement(getClinicalRecordsLink(), driver);
		Thread.sleep(2000);
		getDoctorWorklistLink().click();
		Thread.sleep(2000);
		utilobj.JSEnterText(getdoctorworklist_checkintextBox(), driver, checkin);
		Thread.sleep(2000);

utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgCheckinno")), driver);
Thread.sleep(2000);
utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")), driver);


		
			Thread.sleep(2000);

			getpopupok().click();

			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			getlableprecripstionlink().click();

			Thread.sleep(2000);

			
			utilobj.ChildWindow(driver);
			Thread.sleep(1000);

			
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(gettxtOrdPackSearch(), driver, orderpackname);

			utilobj.JSClick(getclickorderpackbutton(), driver);

			

			Thread.sleep(3000);

			utilobj.JSClick(getorderpackselection(), driver);

			
			Thread.sleep(5000);



			utilobj.JSClick(getbtnISaveClose(), driver);

			utilobj.waitForalert(driver);

			driver.switchTo().alert().accept();

			driver.switchTo().window(parent3);



			getpopupok().click();
		
			Thread.sleep(5000);
		

	}
	
	private By succesOkButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"); 
	public WebElement getSuccesOkButton() {
		return getElement(succesOkButton);
	}
	
	
	//certification Genration
	public String testCaseofCertificationGenration(String IPnumber) throws InterruptedException {
		getinsuranceNo_searchimgbuttonLink().click();
		Thread.sleep(2000);
		getinsuranceNoWindow_serchTxtboxLink().sendKeys(IPnumber);
		Thread.sleep(2000);
		
		
		getinsuranceNowindow_serchbuttonLink().click();
		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(getinsuranceNowindow_radioButtonLink()));
				
		getinsuranceNowindow_radioButtonLink().click();
		Thread.sleep(2000);
		getinsuranceNowindow_selectButtonLink().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(getinsuranceNo_certificateTypeLink()));
		Thread.sleep(2000);
		utilobj.selectDropdown(getinsuranceNo_certificateTypeLink(), driver, "Life Certificate");
		Thread.sleep(2000);
		getMedicalcertification_deathcertification_Savebutton().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(getSuccesOkButton()));
		Thread.sleep(2000);
		getSuccesOkButton().click();
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(2000);

	String CertificationNumber=getGetCertificationNumberFromTextBox().getText();
	System.out.println(CertificationNumber);
	Thread.sleep(2000);
	return CertificationNumber;
	}
	private By EC_SearchIMG=By.id("ctl00_cphpage_ImgSearchCertificateno");
public WebElement getEC_SearchIMG() {
	return getElement(EC_SearchIMG);
}
private By EC_SearchTextBox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl03_txtCriteria");
public WebElement getEC_SearchTextBox() {
	return getElement(EC_SearchTextBox);
}

	public void testcaseofEditCertification(String CertificationNumber) throws InterruptedException {
		utilobj.MoveElement(driver.findElement(By.linkText("Clinical Records")), driver);
		utilobj.JSClick(driver.findElement(By.linkText("Edit Certificate")), driver);
		getEC_SearchIMG().click();
		Thread.sleep(2000);
		getEC_SearchTextBox().sendKeys(CertificationNumber);
		Thread.sleep(2000);
		getinsuranceNowindow_serchbuttonLink().click();
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(getinsuranceNowindow_radioButtonLink()));
		getinsuranceNowindow_radioButtonLink().click();
		Thread.sleep(2000);
		getinsuranceNowindow_selectButtonLink().click();
		Thread.sleep(2000);
		
		
//		getMedicalcertification_Information_buttonYes().click();
//		Thread.sleep(2000);
//		getMedicalcertification_ForceClouser().click();
//		Thread.sleep(2000);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//		  Calendar cal = Calendar.getInstance();
//		  String Date = sdf.format(cal.getTime());
//		  System.out.println(Date);
//		utilobj.JSEnterText(driver.findElement(By.id("ctl00_cphpage_txtStartDateOfSpell")), driver, Date);
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_cphpage_imgVisitDate")).click();
//		Thread.sleep(2000);
//		getinsuranceNoWindow_serchTxtbox2Link().sendKeys("Fever");
//		Thread.sleep(2000);
//		
//		getinsuranceNowindow_serchbuttonLink().click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_chkTemp")).click();
//		Thread.sleep(2000);
//		
//		getinsuranceNowindow_selectButtonLink().click();
//		Thread.sleep(2000);
//		utilobj.selectDropdown(getinsuranceNo_certificateTypeLink(), driver, "Medical Certificate-First And Final");
//		Thread.sleep(2000);
//		getMedicalcertification_Information_buttonYes().click();
//		Thread.sleep(2000);
//		getMedicalcertification_ForceClouser().click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_cphpage_imgTitlePanel5")).click();
//		Thread.sleep(2000);
//		
//		
//
//		
//		
//		String Elegbleleave=driver.findElement(By.id("ctl00_cphpage_txtTotalleaveeligible")).getAttribute("value");
//		System.out.println(Elegbleleave);
//		int Leave=Integer.parseInt(Elegbleleave);
//		int newLeave=Leave-2;
//		String convertvalue=Integer.toString(newLeave);
//		Thread.sleep(2000);
//		
//		
//		
//		driver.findElement(By.id("ctl00_cphpage_txtTotalleaveavailed")).sendKeys(convertvalue);
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_cphpage_txtRemarks")).sendKeys("test remarkes");
//		Thread.sleep(1000);
//		utilobj.JSClick(getMedicalcertification_deathcertification_Savebutton(), driver);
//		//getMedicalcertification_deathcertification_Savebutton().click();
//		Thread.sleep(4000);
//		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("ctl00_cphpage_ImgSearchCertificateno")).click();
//		Thread.sleep(5000);
//		getinsuranceNoWindow_serchTxtboxLink().sendKeys("1199900090");
//		Thread.sleep(2000);
//		
//		
//		getinsuranceNowindow_serchbuttonLink().click();
//		Thread.sleep(2000);
//		getinsuranceNowindow_radioButtonLink().click();
//		Thread.sleep(2000);
//		getinsuranceNowindow_selectButtonLink().click();
//		Thread.sleep(2000);
//		getMedicalcertification_deathcertification_printbutton().click();
//		Thread.sleep(1000);
//		utilobj.SwitchToChildWindow(driver, "");
//		Thread.sleep(1000);
//		driver.close();
//		Thread.sleep(1000);
//		utilobj.SwitchToChildWindow(driver, "Dhanwantri");
//		Thread.sleep(1000);
//		driver.findElement(By.id("ctl00_cphpage_btnMed11")).click();
//		Thread.sleep(1000);
//		utilobj.SwitchToChildWindow(driver, "");
//		Thread.sleep(1000);
//		driver.close();
//		Thread.sleep(1000);
//		utilobj.SwitchToChildWindow(driver, "Dhanwantri");
//		Thread.sleep(1000);
//		driver.findElement(By.id("ctl00_cphpage_btnClear")).click();
//		Thread.sleep(1000);
		//driver.findElement(By.id("ctl00_cphpage_txtTotalleaveavailed")).sendKeys(Elegbleleave);

//		getMedicalcertification_deathcertification_dateofdeath().click();
//		Thread.sleep(4000);
//		Medicalcertification_deathcertification_causeofdeath_SelectDate().click();
//		Thread.sleep(4000);
//		getMedicalcertification_deathcertification_causeofdeath().sendKeys("Heart Attack");
//		Thread.sleep(4000);
//		getMedicalcertification_deathcertification_remarkss().sendKeys("TestRemarks....");
//		Thread.sleep(2000);
		
		
//		utilobj.selectDropdown(getinsuranceNo_certificateTypeLink(), driver, "Medical Certificate-First And Final");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getinsuranceNo_certificateTypeLink(), driver, "Medical Certificate-First");
//		Thread.sleep(4000);
//		utilobj.selectDropdown(getinsuranceNo_certificateTypeLink(), driver, "Medical Certificate-Intermediate");
//		Thread.sleep(4000);
//		utilobj.JSClick(getMedicalcertification_deathcertification_printbutton(), driver);
		
		//getMedicalcertification_deathcertification_Savebutton().click();
		
		
		
		
		
		
		}

}
