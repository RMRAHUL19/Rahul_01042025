package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PM10639_printAndCutomizedPrint_SubsituteItemPage extends BasePage {

	public PM10639_printAndCutomizedPrint_SubsituteItemPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
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
	private By UHID_creation_Uhid_txtbox = By.id("ctl00_cphpage_txtuhid");
	public WebElement getUHID_creation_Uhid_txtbox() {
		return getElement(UHID_creation_Uhid_txtbox);
	}
	private By ClinicalRecordsLink = By.linkText("Clinical Records");
	public WebElement getClinicalRecordsLink() {
		return getElement(ClinicalRecordsLink);

	}
	private By DoctorWorklistLink = By.linkText("Doctor Worklist");
	public WebElement getDoctorWorklistLink() {
		return getElement(DoctorWorklistLink);

	}
	private By doctorworklist_checkintextBox=By.id("ctl00_cphpage_txtCheckinno");
	public WebElement getdoctorworklist_checkintextBox() {
		return getElement(doctorworklist_checkintextBox);
	}
	private By popupok = By.id("popup_ok");
	public WebElement getpopupok() {
		return getElement(popupok);

	}
	private By txtOrdPackSearch = By.id("txtOrdPackSearch");
	public WebElement gettxtOrdPackSearch() {
		return getElement(txtOrdPackSearch);

	}
	private By clickorderpackbutton = By.id("btnOrdpack"); // 97701
	public WebElement getclickorderpackbutton() {
		return getElement(clickorderpackbutton);

	}
	private By orderpackselection = By.id("97701"); //
	public WebElement getorderpackselection() {
		return getElement(orderpackselection);

	}
	private By btnISaveClose = By.id("btnISaveClose");
	public WebElement getbtnISaveClose() {
		return getElement(btnISaveClose);
}
	private By lableprecripstionlink = By.id("ctl00_cphpage_trvSectionst11");
	public WebElement getlableprecripstionlink() {
		return getElement(lableprecripstionlink);

	}
	private By Casesheet_PrintButton = By.id("ctl00_cphpage_btnPrint");
	public WebElement getCasesheet_PrintButton() {
		return getElement(Casesheet_PrintButton);
}
	
	//casesheet demographic Detail
	private By Casesheet_UHIDLable = By.id("ctl00_cphpage_lblUHID_OP");
	public WebElement getCasesheet_UHIDLable() {
		return getElement(Casesheet_UHIDLable);
}
	private By Casesheet_IPLable = By.id("ctl00_cphpage_lblIPNO_OP");
	public WebElement getCasesheet_IPLable() {
		return getElement(Casesheet_IPLable);
}
	private By Casesheet_PatientNameLable = By.id("ctl00_cphpage_lblPatientName_OP");
	public WebElement getCasesheet_PatientNameLable() {
		return getElement(Casesheet_PatientNameLable);
}
	private By Casesheet_AgeGenderLable = By.id("ctl00_cphpage_lblAgeGender_OP");
	public WebElement getCasesheet_AgeGenderLable() {
		return getElement(Casesheet_AgeGenderLable);
}
	
	private By Casesheet_CheckInNumberLable = By.id("ctl00_cphpage_lblCheckinNO_OP");
	public WebElement getCasesheet_CheckInNumberLable() {
		return getElement(Casesheet_CheckInNumberLable);
}
	private By Casesheet_DateTimeLable = By.id("ctl00_cphpage_lblCheckinDateTime_OP");
	public WebElement getCasesheet_DateTimeLableLable() {
		return getElement(Casesheet_DateTimeLable);
}
	private By Casesheet_RelationshipLable = By.id("ctl00_cphpage_lblRelationship_OP");
	public WebElement getCasesheet_RelationshipLable() {
		return getElement(Casesheet_RelationshipLable);
}
	
	// Print demographic detail 
	private By Casesheet_Print_NameLable = By.xpath("/html/body/div[1]/div[2]/div[6]/div/div[1]/div[2]/span[13]");
	public WebElement getCasesheet_Print_PatientNameLable() {
		return getElement(Casesheet_Print_NameLable);
}
	private By Casesheet_Print_AgeGenderLable = By.xpath("/html/body/div[1]/div[2]/div[6]/div/div[1]/div[2]/span[43]");
	public WebElement getCasesheet_Print_AgeGenderLable() {
		return getElement(Casesheet_Print_AgeGenderLable);
}
	private By Casesheet_Print_UHIDLable = By.xpath("/html/body/div[1]/div[2]/div[6]/div/div[1]/div[2]/span[16]");
	public WebElement getCasesheet_Print_UHIDLable() {
		return getElement(Casesheet_Print_UHIDLable);
}
	private By Casesheet_Print_IPNumberLable = By.xpath("/html/body/div[1]/div[2]/div[6]/div/div[1]/div[2]/span[24]");
	public WebElement getCasesheet_Print_IPNumberLable() {
		return getElement(Casesheet_Print_IPNumberLable);
}
	private By Casesheet_Print_Check_INNumberLable = By.xpath("/html/body/div[1]/div[2]/div[6]/div/div[1]/div[2]/span[17]");
	public WebElement getCasesheet_Print_Check_INNumberLable() {
		return getElement(Casesheet_Print_Check_INNumberLable);
}
	private By Casesheet_Print_Check_IN_DateLable = By.xpath("/html/body/div[1]/div[2]/div[6]/div/div[1]/div[2]/span[25]");
	public WebElement getCasesheet_Print_Check_IN_DateLableLable() {
		return getElement(Casesheet_Print_Check_IN_DateLable);
}
	private By Casesheet_CustomizedPrint = By.id("ctl00_cphpage_btnCustomizedPrint");
	public WebElement getCasesheet_CustomizedPrint() {
		return getElement(Casesheet_CustomizedPrint);
}
	private By Casesheet_CustomizedPrint_CloseButton = By.id("ctl00_cphpage_imgbtnPopClosePrint");
	public WebElement getCasesheet_CustomizedPrint_CloseButton() {
		return getElement(Casesheet_CustomizedPrint_CloseButton);
}
	private By Casesheet_CustomizedPrint_UncheckAllButton = By.id("ctl00_cphpage_btnUncheckAll");
	public WebElement getCasesheet_CustomizedPrint_UncheckAllButton() {
		return getElement(Casesheet_CustomizedPrint_UncheckAllButton);
}
	private By Casesheet_CustomizedPrint_CheckAllButton = By.id("ctl00_cphpage_btnCheckAll");
	public WebElement getCasesheet_CustomizedPrint_CheckAllButton() {
		return getElement(Casesheet_CustomizedPrint_CheckAllButton);
}
	private By Casesheet_CustomizedPrint_ChiefCompalinCheckBox = By.id("ctl00_cphpage_chktreeview_23");
	public WebElement getCasesheet_CustomizedPrint_ChiefCompalinCheckBox() {
		return getElement(Casesheet_CustomizedPrint_ChiefCompalinCheckBox);
}
	private By Casesheet_CustomizedPrint_PrintButton = By.id("ctl00_cphpage_btnprintchk");
	public WebElement getCasesheet_CustomizedPrint_PrintButton() {
		return getElement(Casesheet_CustomizedPrint_PrintButton);
}
	private By changeLocation = By.id("ctl00_lnkbtnChangeHospital");
	public WebElement getchange_facility_location_linkLink() {
		return getElement(changeLocation);

	}		
	private By StoreUhidTextBox = By.id("ctl00_cphpage_txtCheckinNo");
	public WebElement getStoreUhidTextBox() {
		return getElement(StoreUhidTextBox);

	}
	private By StoreUhidImgSerch = By.id("ctl00_cphpage_imgCheckinno");
	public WebElement getStoreUhidImgSerch() {
		return getElement(StoreUhidImgSerch);

	}
	private By StoreUhidIssueQuantity = By.id("ctl00_cphpage_grdIssueDetails_ctl02_txtIssueQty");
	public WebElement getStoreUhidIssueQuantity() {
		return getElement(StoreUhidIssueQuantity);

	}
	private By StoreUhidIssueSaveButton = By.id("ctl00_cphpage_btnSave");
	public WebElement getStoreUhidIssueSaveButton() {
		return getElement(StoreUhidIssueSaveButton);

	}
	
	private By MedicationLink = By.id("ctl00_cphpage_trvSectionst12");
	public WebElement getMedicationLink() {
		return getElement(MedicationLink);

	}
	private By MedicationTExtSearch = By.id("txtSearch");
	public WebElement getMedicationTExtSearchLink() {
		return getElement(MedicationTExtSearch);

	}
	private By DrugButton = By.id("btnDrug");
	public WebElement getDrugButtonLink() {
		return getElement(DrugButton);

	}
	private By SearchMedicineName = By.id("9155");
	public WebElement getSearchMedicineNameLink() {
		return getElement(SearchMedicineName);

	}
	private By DrugDoseText = By.id("txtDrugDose");
	public WebElement getDrugDoseTextLink() {
		return getElement(DrugDoseText);

	}
	private By DrugDoseDDL = By.id("ddlDrugDose");
	public WebElement getDrugDoseDDLLink() {
		return getElement(DrugDoseDDL);

	}
	private By DurationTextBox = By.id("txtDuration");
	public WebElement getDurationTextBoxLink() {
		return getElement(DurationTextBox);

	} 
	private By DurationDDl = By.id("ddlDuration");
	public WebElement getDurationDDlLink() {
		return getElement(DurationDDl);

	}
	private By ddlFrequency = By.id("ddlFrequency");
	public WebElement getddlFrequencyLink() {
		return getElement(ddlFrequency);
}
	private By MEdicationQuantityTextBox = By.id("txtQuantity");
	public WebElement getMEdicationQuantityTextBoxLink() {
		return getElement(MEdicationQuantityTextBox);

	}
	private By MedicationOKButton = By.id("btnOK");
	public WebElement getMedicationOKButtonLink() {
		return getElement(MedicationOKButton);

	}
	private By MedicationDDLQuantityUOM = By.id("ddlQuantityUOM");
	public WebElement getMedicationDDLQuantityUOMLink() {
		return getElement(MedicationDDLQuantityUOM);

	}
	private By prescriptiondeletemedicineButton = By.id("btnDeLeteM3");
	public WebElement getprescriptiondeletemedicineButtonLink() {
		return getElement(prescriptiondeletemedicineButton);

	}
	private By pharmacyIsuueSubsituteItem = By.id("ctl00_cphpage_grdIssueDetails_ctl02_imgbtnSearchSubstituteNew");
	public WebElement getpharmacyIsuueSubsituteItemLink() {
		return getElement(pharmacyIsuueSubsituteItem);

	}
	private By SubsituteScreenCheckBox = By.id("ChkSelect0");
	public WebElement getSubsituteScreenCheckBoxLink() {
		return getElement(SubsituteScreenCheckBox);

	}
	private By SubsituteScreenSelectButton = By.id("btnSelect");
	public WebElement getSubsituteScreenSelectButtonLink() {
		return getElement(SubsituteScreenSelectButton);

	}
	
	
	
	
	
	
}
