package com.qa.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.pages.BasePage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class HomeDrugDeliveryPage extends BasePage {
	

	util utilobj = new util();
	

	public HomeDrugDeliveryPage(WebDriver driver) {
		super(driver);
	}
	
	private By txtIPNO = By.id("ctl00_cphpage_txtIPNO");
	public WebElement gettxtIPNO() {
		return getElement(txtIPNO);
	}
	private By lnkbtnIPNo = By.id("ctl00_cphpage_lnkbtnIPNo");
	public WebElement getlnkbtnIPNo() {
		return getElement(lnkbtnIPNo);
	}
	private By chkUHID = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	public WebElement getchkUHID() {
		return getElement(chkUHID);
	}
	private By hisLiveListControl_btnSelect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	public WebElement gethisLiveListControl_btnSelect() {
		return getElement(hisLiveListControl_btnSelect);
	}
	private By txtDrugAddress = By.id("ctl00_cphpage_txtDrugAddress");
	public WebElement gettxtDrugAddress() {
		return getElement(txtDrugAddress);
	}
	private By ddlPermanentLGDState = By.id("ctl00_cphpage_ddlPermanentLGDState");
	public WebElement getddlPermanentLGDState() {
		return getElement(ddlPermanentLGDState);
	}
	private By ddlPermanentLGDDistrict = By.id("ctl00_cphpage_ddlPermanentLGDDistrict");
	public WebElement getddlPermanentLGDDistrict() {
		return getElement(ddlPermanentLGDDistrict);
	}
	private By ddlPermanentLGDSubDistrict = By.id("ctl00_cphpage_ddlPermanentLGDSubDistrict");
	public WebElement getddlPermanentLGDSubDistrict() {
		return getElement(ddlPermanentLGDSubDistrict);
	}
	private By txtPermtPin = By.id("ctl00_cphpage_txtPermtPin");
	public WebElement gettxtPermtPin() {
		return getElement(txtPermtPin);
	}
	private By txtPermtMobileNo = By.id("ctl00_cphpage_txtPermtMobileNo");
	public WebElement gettxtPermtMobileNo() {
		return getElement(txtPermtMobileNo);
	}
	private By btnSave = By.id("ctl00_cphpage_btnSave");
	public WebElement getbtnSave() {
		return getElement(btnSave);
	}
	private By btnClear = By.id("ctl00_cphpage_btnClear");
	public WebElement getbtnClear() {
		return getElement(btnClear);
	}
	
	private By popup_ok = By.id("popup_ok");
	public WebElement getpopup_ok() {
		return getElement(popup_ok);
	}
	private By ButtonOK = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getButtonOK() {
		return getElement(ButtonOK);
	}
	private By BlackOverlay=By.xpath("/html/body/div[2]/div[2]");
	public WebElement getBlackOverlay() {
		return getElement(BlackOverlay);
	}
	private By patientCheckInNumberSeviceOkButton=By.id("ctl00_cphpage_btnOK");
	public WebElement getpatientCheckInNumberSeviceOkButton() {
		return getElement(patientCheckInNumberSeviceOkButton);
	}
	private By patientCheckInNumberSaveButton=By.id("ctl00_cphpage_btnSaveDisplay");
	public WebElement getpatientCheckInNumberSaveButton() {
		return getElement(patientCheckInNumberSaveButton);
	}
	private By popupmessage = By.id("popup_message");
	public WebElement getPopupmessage() {
		return getElement(popupmessage);

	}
	private By btncancel = By.id("popup_cancel");
	public WebElement getBtncancel() {
		return getElement(btncancel);
	}
	private By ClinicalRecordsLink = By.linkText("Clinical Records");
	public WebElement getClinicalRecordsLink() {
		return getElement(ClinicalRecordsLink);
		

	}
	private By DoctorWorklistLink = By.linkText("Doctor Worklist");
	public WebElement getDoctorWorklistLink() {
		return getElement(DoctorWorklistLink);

	}
	private By checkin_no_link=By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1");
	public WebElement getcheckin_no_link_Link() {
		return getElement(checkin_no_link);
	}
	private By TxtboxCheckInno=By.id("ctl00_cphpage_txtCheckinno");
	public WebElement getTxtboxCheckInno() {
		return getElement(TxtboxCheckInno);
	}
	private By imgCheckinnosearch=By.id("ctl00_cphpage_imgCheckinno");
	public WebElement getimgCheckinnosearch() {
		return getElement(imgCheckinnosearch);
	}
	private By OpenStanderdCaseSheet=By.id("ctl00_cphpage_btnCOpenCaseSheet");
	public WebElement getOpenStanderdCaseSheet() {
		return getElement(OpenStanderdCaseSheet);
	}
	private By Lnkaddress=By.id("ctl00_cphpage_Lnkaddress");
	public WebElement getLnkaddress() {
		return getElement(Lnkaddress);
	}
	private By ChkEligible=By.id("ctl00_cphpage_ChkEligible");
	public WebElement getChkEligible() {
		return getElement(ChkEligible);
	}
	private By ButtonYes=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");
	public WebElement getButtonYes() {
		return getElement(ButtonYes);
	}
	private By ButtonNo=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonNo");
	public WebElement getButtonNo() {
		return getElement(ButtonNo);
	}
	private By prescription=By.id("ctl00_cphpage_trvSectionst11");
	public WebElement getprescription() {
		return getElement(prescription);
	}
	private By addbtn=By.id("btnADDM");
	public WebElement getaddbtn() {
		return getElement(addbtn);
	}
	private By allopathic=By.xpath("/html/body/form/div[3]/div[2]/table/tbody/tr/td/div/table[1]/tbody/tr[1]/td/input[1]");
	public WebElement getallopathic() {
		return getElement(allopathic);
	}
	private By txtSearch=By.id("txtSearch");
	public WebElement gettxtSearch() {
		return getElement(txtSearch);
	}
	private By txtSearchid=By.id("3667");
	public WebElement gettxtSearchid() {
		return getElement(txtSearchid);
	}
	private By txtDrugDose=By.id("txtDrugDose");
	public WebElement gettxtDrugDose() {
		return getElement(txtDrugDose);
	}
	private By ddlDrugDose=By.id("ddlDrugDose");
	public WebElement getddlDrugDose() {
		return getElement(ddlDrugDose);
	}
	private By txtDuration=By.id("txtDuration");
	public WebElement gettxtDuration() {
		return getElement(txtDuration);
	}
	private By ddlFrequency=By.id("ddlFrequency");
	public WebElement getddlFrequency() {
		return getElement(ddlFrequency);
	}
	private By txtQuantity=By.id("txtQuantity");
	public WebElement gettxtQuantity() {
		return getElement(txtQuantity);
	}
	private By ddlQuantityUOM=By.id("ddlQuantityUOM");
	public WebElement getddlQuantityUOM() {
		return getElement(ddlQuantityUOM);
	}
	private By btnOK=By.id("btnOK");
	public WebElement getbtnOK() {
		return getElement(btnOK);
	}
	private By btnclose=By.id("btnM");
	public WebElement getbtnclose() {
		return getElement(btnclose);
	}
	private By btnISaveClose=By.id("btnISaveClose");
	public WebElement getbtnISaveClose() {
		return getElement(btnISaveClose);
	}
	private By delete=By.id("btnDeLeteM3");
	public WebElement getdelete() {
		return getElement(delete);
	}
	private By PharmacyIssue = By.xpath("/html/body/div[1]/form/div[3]/div[2]/table/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr/td/div/ul[4]/li[10]/a");
    public WebElement getPharmacyIssue() {
		return getElement(PharmacyIssue);

	}
	private By lnkHomeDrugWorklist=By.id("ctl00_cphpage_lnkHomeDrugWorklist");
	public WebElement getlnkHomeDrugWorklist() {
		return getElement(lnkHomeDrugWorklist);
	}
	private By btnHDDPrint=By.id("ctl00_cphpage_btnHDDPrint");
	public WebElement getbtnHDDPrint() {
		return getElement(btnHDDPrint);
	}
	private By homedrugdeliveryreports=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst0");
	public WebElement gethomedrugdeliveryreports() {
		return getElement(homedrugdeliveryreports);
	}
	private By logout=By.id("ctl00_ImageButton1");
	public WebElement getlogout() {
		return getElement(logout);
	}
	private By txtFromDate=By.id("ctl00_ctl00_cphpage_cphReport_txtFromDate");
	public WebElement gettxtFromDate() {
		return getElement(txtFromDate);
	}
	private By txtToDate=By.id("ctl00_ctl00_cphpage_cphReport_txtToDate");
	public WebElement gettxtToDate() {
		return getElement(txtToDate);
	}
	private By btnPreview=By.id("ctl00_ctl00_cphpage_cphReport_btnPreview");
	public WebElement getbtnPreview() {
		return getElement(btnPreview);
	}
	private By buttonClear=By.id("ctl00_ctl00_cphpage_cphReport_btnClear");
	public WebElement getbuttonClear() {
		return getElement(buttonClear);
	}
	private By Printbtn=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[4]/input");
	public WebElement getPrintbtn() {
		return getElement(Printbtn);
	}
	private By ClExtFromDate_day_0_1=By.id("ctl00_ctl00_cphpage_cphReport_ClExtFromDate_day_0_1");
	public WebElement getClExtFromDate_day_0_1() {
		return getElement(ClExtFromDate_day_0_1);
	}
	private By submitexport=By.id("submitexport");
	public WebElement getsubmitexport() {
		return getElement(submitexport);
	}
}