package com.qa.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

@SuppressWarnings("unused")
public class AbhaNumberAndAbhaAddressPage extends BasePage {
	

	

	public AbhaNumberAndAbhaAddressPage(WebDriver driver) {
		super(driver);
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
	private By popup_ok = By.id("popup_ok");
	public WebElement getpopup_ok() {
		return getElement(popup_ok);

	}
	private By BlackOverlay=By.xpath("/html/body/div[2]/div[2]");
	public WebElement getBlackOverlay() {
		return getElement(BlackOverlay);
	}
	private By ClinicalRecordsLink = By.linkText("Clinical Records");
	public WebElement getClinicalRecordsLink() {
		return getElement(ClinicalRecordsLink);
		

	}
	private By DoctorWorklistLink = By.linkText("Doctor Worklist");
	public WebElement getDoctorWorklistLink() {
		return getElement(DoctorWorklistLink);

	}
	private By checkinno = By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1");
	public WebElement getcheckinno() {
		return getElement(checkinno);

	}
	private By checkin_no_link=By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1");
	public WebElement getcheckin_no_link_Link() {
		return getElement(checkin_no_link);
	}
	private By TxtboxCheckInno=By.id("ctl00_cphpage_gdvSearchConsultation_ctl02_lblBillNo1");
	public WebElement getTxtboxCheckInno() {
		return getElement(TxtboxCheckInno);
	}
	private By OpenStanderdCaseSheet=By.id("ctl00_cphpage_btnCOpenCaseSheet");
	public WebElement getOpenStanderdCaseSheet() {
		return getElement(OpenStanderdCaseSheet);
	}
	private By ButtonOK=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getButtonOK() {
		return getElement(ButtonOK);
	}
	private By imgCheckinnosearch=By.id("ctl00_cphpage_imgCheckinno");
	public WebElement getimgCheckinnosearch() {
		return getElement(imgCheckinnosearch);
	}
	private By btncancel = By.id("popup_cancel");
	public WebElement getBtncancel() {
		return getElement(btncancel);
	}
	private By complaint = By.id("ctl00_cphpage_trvSectionst2");
	public WebElement getcomplaint() {
		return getElement(complaint);
	}
	private By txt_complaint = By.id("TemplatePreviewControl_txtHistoryofPresentIllness");
	public WebElement gettxt_complaint() {
		return getElement(txt_complaint);
	}
	private By testid = By.id("Size of auricle - finding");
	public WebElement gettestid() {
		return getElement(testid);
	}

	private By btn_Submit = By.id("btnSave");
	public WebElement getbtn_Submit() {
		return getElement(btn_Submit);
	}
	private By btn_Add = By.id("btn_Add ");
	public WebElement getbtn_Add() {
		return getElement(btn_Add);
	}
	private By btnPrint = By.id("ctl00_cphpage_btnPrint");
	public WebElement getbtnPrint() {
		return getElement(btnPrint);
	}
	
	private By btnConsultantSpcf = By.id("ctl00_cphpage_imgConsultation");
	public WebElement getbtnConsultantSpcf() {
		return getElement(btnConsultantSpcf);
	}
	}