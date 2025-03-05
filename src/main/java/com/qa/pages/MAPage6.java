 package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class MAPage6 extends BasePage {

	util utilobj = new util();

	public MAPage6(WebDriver driver) {
		super(driver);

	}
	
	private By Page6_ddlPatientSatisfactionCitizenAvailability=By.id("ctl00_cphpage_Page6_ddlPatientSatisfactionCitizenAvailability");
	public WebElement getPage6_ddlPatientSatisfactionCitizenAvailability() {
		return getElement(Page6_ddlPatientSatisfactionCitizenAvailability);
	}
	private By Page6_ddlPatientSatisfactionEmergency=By.id("ctl00_cphpage_Page6_ddlPatientSatisfactionEmergency");
	public WebElement getPage6_ddlPatientSatisfactionEmergency() {
		return getElement(Page6_ddlPatientSatisfactionEmergency);
	}
	private By Page6_ddlPatientSatisfactionHelpDesk=By.id("ctl00_cphpage_Page6_ddlPatientSatisfactionHelpDesk");
	public WebElement getPage6_ddlPatientSatisfactionHelpDesk() {
		return getElement(Page6_ddlPatientSatisfactionHelpDesk);
	}
	private By Page6_ddlPatientSatisfactionUserCharges=By.id("ctl00_cphpage_Page6_ddlPatientSatisfactionUserCharges");
	public WebElement getPage6_ddlPatientSatisfactionUserCharges() {
		return getElement(Page6_ddlPatientSatisfactionUserCharges);
	}
	private By Page6_ddlPatientSatisfactionAvailDrugs=By.id("ctl00_cphpage_Page6_ddlPatientSatisfactionAvailDrugs");
	public WebElement getPage6_ddlPatientSatisfactionAvailDrugs() {
		return getElement(Page6_ddlPatientSatisfactionAvailDrugs);
	}
	private By Page6_ddlPatientSatisfactionDepertmentalSignage=By.id("ctl00_cphpage_Page6_ddlPatientSatisfactionDepertmentalSignage");
	public WebElement getPage6_ddlPatientSatisfactionDepertmentalSignage() {
		return getElement(Page6_ddlPatientSatisfactionDepertmentalSignage);
	}
	private By Page6_ddlPatientSatisfactionMandateInfo=By.id("ctl00_cphpage_Page6_ddlPatientSatisfactionMandateInfo");
	public WebElement getPage6_ddlPatientSatisfactionMandateInfo() {
		return getElement(Page6_ddlPatientSatisfactionMandateInfo);
	}
	private By Page6_ddlPatientSatisfactionComplaintBox=By.id("ctl00_cphpage_Page6_ddlPatientSatisfactionComplaintBox");
	public WebElement getPage6_ddlPatientSatisfactionComplaintBox() {
		return getElement(Page6_ddlPatientSatisfactionComplaintBox);
	}
	private By Page6_ddlPatientSatisfactionSafetyCaution=By.id("ctl00_cphpage_Page6_ddlPatientSatisfactionSafetyCaution");
	public WebElement getPage6_ddlPatientSatisfactionSafetyCaution() {
		return getElement(Page6_ddlPatientSatisfactionSafetyCaution);
	}
	private By Page6_ddlPatientSatisfactionConsentPracticed=By.id("ctl00_cphpage_Page6_ddlPatientSatisfactionConsentPracticed");
	public WebElement getPage6_ddlPatientSatisfactionConsentPracticed() {
		return getElement(Page6_ddlPatientSatisfactionConsentPracticed);
	}
	private By Page6_txtPatientSatisfactionWaitingtime=By.id("ctl00_cphpage_Page6_txtPatientSatisfactionWaitingtime");
	public WebElement getPage6_txtPatientSatisfactionWaitingtime() {
		return getElement(Page6_txtPatientSatisfactionWaitingtime);
	}
	private By Page6_txtPatientSatisfactionComplaintReceived=By.id("ctl00_cphpage_Page6_txtPatientSatisfactionComplaintReceived");
	public WebElement getPage6_txtPatientSatisfactionComplaintReceived() {
		return getElement(Page6_txtPatientSatisfactionComplaintReceived);
	}
	private By Page6_txtPatientSatisfactionSuggestionReceived=By.id("ctl00_cphpage_Page6_txtPatientSatisfactionSuggestionReceived");
	public WebElement getPage6_txtPatientSatisfactionSuggestionReceived() {
		return getElement(Page6_txtPatientSatisfactionSuggestionReceived);
	}
	private By Page6_txtPatientSatisfactionOPDConsultation=By.id("ctl00_cphpage_Page6_txtPatientSatisfactionOPDConsultation");
	public WebElement getPage6_txtPatientSatisfactionOPDConsultation() {
		return getElement(Page6_txtPatientSatisfactionOPDConsultation);
	}
	private By Page6_txtPatientSatisfactionRemarks=By.id("ctl00_cphpage_Page6_txtPatientSatisfactionRemarks");
	public WebElement getPage6_txtPatientSatisfactionRemarks() {
		return getElement(Page6_txtPatientSatisfactionRemarks);
	}
	private By Page6_txtReferralSecondaryCount=By.id("ctl00_cphpage_Page6_txtReferralSecondaryCount");
	public WebElement getPage6_txtReferralSecondaryCount() {
		return getElement(Page6_txtReferralSecondaryCount);
	}
	private By Page6_txtReferralTertiaryCount=By.id("ctl00_cphpage_Page6_txtReferralTertiaryCount");
	public WebElement getPage6_txtReferralTertiaryCount() {
		return getElement(Page6_txtReferralTertiaryCount);
	}
	private By Page6_txtReferralAfterCount=By.id("ctl00_cphpage_Page6_txtReferralAfterCount");
	public WebElement getPage6_txtReferralAfterCount() {
		return getElement(Page6_txtReferralAfterCount);
	}
	private By Page6_txtReferralSecondaryRemarks=By.id("ctl00_cphpage_Page6_txtReferralSecondaryRemarks");
	public WebElement getPage6_txtReferralSecondaryRemarks() {
		return getElement(Page6_txtReferralSecondaryRemarks);
	}
	private By Page6_txtReferralTertiaryRemarks=By.id("ctl00_cphpage_Page6_txtReferralTertiaryRemarks");
	public WebElement getPage6_txtReferralTertiaryRemarks() {
		return getElement(Page6_txtReferralTertiaryRemarks);
	}
	private By Page6_txtReferralAfterRemarks=By.id("ctl00_cphpage_Page6_txtReferralAfterRemarks");
	public WebElement getPage6_txtReferralAfterRemarks() {
		return getElement(Page6_txtReferralAfterRemarks);
	}
	private By Page6_ddlFireSysWhetherSignagase=By.id("ctl00_cphpage_Page6_ddlFireSysWhetherSignagase");
	public WebElement getPage6_ddlFireSysWhetherSignagase() {
		return getElement(Page6_ddlFireSysWhetherSignagase);
	}
	private By Page6_txtFireSysMockDrill=By.id("ctl00_cphpage_Page6_txtFireSysMockDrill");
	public WebElement getPage6_txtFireSysMockDrill() {
		return getElement(Page6_txtFireSysMockDrill);
	}
	private By Page6_txtcclFireSysMockDrill_day_0_4=By.id("ctl00_cphpage_Page6_txtcclFireSysMockDrill_day_0_4");
	public WebElement getPage6_txtcclFireSysMockDrill_day_0_4() {
		return getElement(Page6_txtcclFireSysMockDrill_day_0_4);
	}
	private By Page6_ddlFireSysStatusNOC=By.id("ctl00_cphpage_Page6_ddlFireSysStatusNOC");
	public WebElement getPage6_ddlFireSysStatusNOC() {
		return getElement(Page6_ddlFireSysStatusNOC);
	}
	private By Page6_ddlFireSysExtinguisher=By.id("ctl00_cphpage_Page6_ddlFireSysExtinguisher");
	public WebElement getPage6_ddlFireSysExtinguisher() {
		return getElement(Page6_ddlFireSysExtinguisher);
	}
	private By Page6_ddlFireSysAvailDrugs=By.id("ctl00_cphpage_Page6_ddlFireSysAvailDrugs");
	public WebElement getPage6_ddlFireSysAvailDrugs() {
		return getElement(Page6_ddlFireSysAvailDrugs);
	}
	private By Page6_ddlFireSysOpenWindows=By.id("ctl00_cphpage_Page6_ddlFireSysOpenWindows");
	public WebElement getPage6_ddlFireSysOpenWindows() {
		return getElement(Page6_ddlFireSysOpenWindows);
	}
	private By Page6_txtFireSysRemarks=By.id("ctl00_cphpage_Page6_txtFireSysRemarks");
	public WebElement getPage6_txtFireSysRemarks() {
		return getElement(Page6_txtFireSysRemarks);
	}
	private By txtParamedicalOTRemarks = By.id("ctl00_cphpage_Page4_txtParamedicalOTRemarks");
	public WebElement gettxtParamedicalOTRemarks() {
	    return getElement(txtParamedicalOTRemarks);
	}

	private By txtReferralDeptCardiologyValue = By.id("ctl00_cphpage_Page6_txtReferralDeptCardiologyValue");
	private By txtReferralDeptCTVSValue = By.id("ctl00_cphpage_Page6_txtReferralDeptCTVSValue");
	private By txtReferralDeptNeurologyValue = By.id("ctl00_cphpage_Page6_txtReferralDeptNeurologyValue");
	private By txtReferralDeptNeurosurgeryValue = By.id("ctl00_cphpage_Page6_txtReferralDeptNeurosurgeryValue");
	private By txtReferralDeptNephrologyValue = By.id("ctl00_cphpage_Page6_txtReferralDeptNephrologyValue");
	private By txtReferralDeptUrologyValue = By.id("ctl00_cphpage_Page6_txtReferralDeptUrologyValue");
	private By txtReferralDeptOncologyValue = By.id("ctl00_cphpage_Page6_txtReferralDeptOncologyValue");
	private By txtReferralDeptOncosurgeryValue = By.id("ctl00_cphpage_Page6_txtReferralDeptOncosurgeryValue");
	private By txtReferralDeptRadiotherapyValue = By.id("ctl00_cphpage_Page6_txtReferralDeptRadiotherapyValue");
	private By txtReferralDeptGastroenterologyValue = By.id("ctl00_cphpage_Page6_txtReferralDeptGastroenterologyValue");
	private By txtReferralDeptRadiologyUltrasoundValue = By.id("ctl00_cphpage_Page6_txtReferralDeptRadioUltraValue");
	private By txtReferralDeptRadiologyCTScanValue = By.id("ctl00_cphpage_Page6_txtReferralDeptRadioCTValue");
	private By txtReferralDeptRadiologyMRIValue = By.id("ctl00_cphpage_Page6_txtReferralDeptRadioMRIValue");
	private By txtReferralDeptRadiologyPETScanValue = By.id("ctl00_cphpage_Page6_txtReferralDeptRadioPETValue");
	private By txtReferralDeptRadiologyOthersValue = By.id("ctl00_cphpage_Page6_txtReferralDeptRadioOtherValue");
	private By txtReferralDeptLaboratoryInvestigationsValue = By.id("ctl00_cphpage_Page6_txtReferralDeptLabValue");

	public WebElement getTxtReferralDeptCardiologyValue() {
	    return getElement(txtReferralDeptCardiologyValue);
	}

	public WebElement getTxtReferralDeptCTVSValue() {
	    return getElement(txtReferralDeptCTVSValue);
	}

	public WebElement getTxtReferralDeptNeurologyValue() {
	    return getElement(txtReferralDeptNeurologyValue);
	}

	public WebElement getTxtReferralDeptNeurosurgeryValue() {
	    return getElement(txtReferralDeptNeurosurgeryValue);
	}

	public WebElement getTxtReferralDeptNephrologyValue() {
	    return getElement(txtReferralDeptNephrologyValue);
	}

	public WebElement getTxtReferralDeptUrologyValue() {
	    return getElement(txtReferralDeptUrologyValue);
	}

	public WebElement getTxtReferralDeptOncologyValue() {
	    return getElement(txtReferralDeptOncologyValue);
	}

	public WebElement getTxtReferralDeptOncosurgeryValue() {
	    return getElement(txtReferralDeptOncosurgeryValue);
	}

	public WebElement getTxtReferralDeptRadiotherapyValue() {
	    return getElement(txtReferralDeptRadiotherapyValue);
	}

	public WebElement getTxtReferralDeptGastroenterologyValue() {
	    return getElement(txtReferralDeptGastroenterologyValue);
	}

	public WebElement getTxtReferralDeptRadiologyUltrasoundValue() {
	    return getElement(txtReferralDeptRadiologyUltrasoundValue);
	}

	public WebElement getTxtReferralDeptRadiologyCTScanValue() {
	    return getElement(txtReferralDeptRadiologyCTScanValue);
	}

	public WebElement getTxtReferralDeptRadiologyMRIValue() {
	    return getElement(txtReferralDeptRadiologyMRIValue);
	}

	public WebElement getTxtReferralDeptRadiologyPETScanValue() {
	    return getElement(txtReferralDeptRadiologyPETScanValue);
	}

	public WebElement getTxtReferralDeptRadiologyOthersValue() {
	    return getElement(txtReferralDeptRadiologyOthersValue);
	}

	public WebElement getTxtReferralDeptLaboratoryInvestigationsValue() {
	    return getElement(txtReferralDeptLaboratoryInvestigationsValue);
	}
	
	private By txtReferralDeptCardiologyRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptCardiologyRemarks");
	private By txtReferralDeptCTVSRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptCTVSRemarks");
	private By txtReferralDeptNeurologyRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptNeurologyRemarks");
	private By txtReferralDeptNeurosurgeryRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptNeurosurgeryRemarks");
	private By txtReferralDeptNephrologyRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptNephrologyRemarks");
	private By txtReferralDeptUrologyRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptUrologyRemarks");
	private By txtReferralDeptOncologyRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptOncologyRemarks");
	private By txtReferralDeptOncosurgeryRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptOncosurgeryRemarks");
	private By txtReferralDeptRadiotherapyRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptRadiotherapyRemarks");
	private By txtReferralDeptGastroenterologyRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptGastroenterologyRemarks");
	private By txtReferralDeptRadioUltraRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptRadioUltraRemarks");
	private By txtReferralDeptRadioCTRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptRadioCTRemarks");
	private By txtReferralDeptRadioMRIRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptRadioMRIRemarks");
	private By txtReferralDeptRadioPETRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptRadioPETRemarks");
	private By txtReferralDeptRadioOtherRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptRadioOtherRemarks");
	private By txtReferralDeptLabRemarks = By.id("ctl00_cphpage_Page6_txtReferralDeptLabRemarks");

	public WebElement getTxtReferralDeptCardiologyRemarks() {
	    return getElement(txtReferralDeptCardiologyRemarks);
	}

	public WebElement getTxtReferralDeptCTVSRemarks() {
	    return getElement(txtReferralDeptCTVSRemarks);
	}

	public WebElement getTxtReferralDeptNeurologyRemarks() {
	    return getElement(txtReferralDeptNeurologyRemarks);
	}

	public WebElement getTxtReferralDeptNeurosurgeryRemarks() {
	    return getElement(txtReferralDeptNeurosurgeryRemarks);
	}

	public WebElement getTxtReferralDeptNephrologyRemarks() {
	    return getElement(txtReferralDeptNephrologyRemarks);
	}

	public WebElement getTxtReferralDeptUrologyRemarks() {
	    return getElement(txtReferralDeptUrologyRemarks);
	}

	public WebElement getTxtReferralDeptOncologyRemarks() {
	    return getElement(txtReferralDeptOncologyRemarks);
	}

	public WebElement getTxtReferralDeptOncosurgeryRemarks() {
	    return getElement(txtReferralDeptOncosurgeryRemarks);
	}

	public WebElement getTxtReferralDeptRadiotherapyRemarks() {
	    return getElement(txtReferralDeptRadiotherapyRemarks);
	}

	public WebElement getTxtReferralDeptGastroenterologyRemarks() {
	    return getElement(txtReferralDeptGastroenterologyRemarks);
	}

	public WebElement getTxtReferralDeptRadioUltraRemarks() {
	    return getElement(txtReferralDeptRadioUltraRemarks);
	}

	public WebElement getTxtReferralDeptRadioCTRemarks() {
	    return getElement(txtReferralDeptRadioCTRemarks);
	}

	public WebElement getTxtReferralDeptRadioMRIRemarks() {
	    return getElement(txtReferralDeptRadioMRIRemarks);
	}

	public WebElement getTxtReferralDeptRadioPETRemarks() {
	    return getElement(txtReferralDeptRadioPETRemarks);
	}

	public WebElement getTxtReferralDeptRadioOtherRemarks() {
	    return getElement(txtReferralDeptRadioOtherRemarks);
	}

	public WebElement getTxtReferralDeptLabRemarks() {
	    return getElement(txtReferralDeptLabRemarks);
	}
	private By Page6_btnAddReferral1=By.id("ctl00_cphpage_Page6_btnAddReferral1");
	public WebElement getPage6_btnAddReferral1() {
		return getElement(Page6_btnAddReferral1);
	}
	private By Page6_txtExtraReferralValue1=By.id("ctl00_cphpage_Page6_txtExtraReferralValue1");
	public WebElement getPage6_txtExtraReferralValue1() {
		return getElement(Page6_txtExtraReferralValue1);
	}
	private By Page6_txtReferralValue1=By.id("ctl00_cphpage_Page6_txtReferralValue1");
	public WebElement getPage6_txtReferralValue1() {
		return getElement(Page6_txtReferralValue1);
	}
	private By Page6_txtReferralRemarks1=By.id("ctl00_cphpage_Page6_txtReferralRemarks1");
	public WebElement getPage6_txtReferralRemarks1() {
		return getElement(Page6_txtReferralRemarks1);
	}
	private By Page6_txtReferralRemarks=By.id("ctl00_cphpage_Page6_txtReferralRemarks");
	public WebElement getPage6_txtReferralRemarks() {
		return getElement(Page6_txtReferralRemarks);
	}
	private By Page6_txtTieUpBillflowSecondary=By.id("ctl00_cphpage_Page6_txtTieUpBillInflowSecondary");
	public WebElement getPage6_txtTieUpBillflowSecondary() {
		return getElement(Page6_txtTieUpBillflowSecondary);
	}

	private By Page6_txtTieUpBillClearedSecondary=By.id("ctl00_cphpage_Page6_txtTieUpBillClearedSecondary");
	public WebElement getPage6_txtTieUpBillClearedSecondary() {
		return getElement(Page6_txtTieUpBillClearedSecondary);
	}

	private By Page6_txtTieUpBillInflowTertiary=By.id("ctl00_cphpage_Page6_txtTieUpBillInflowTertiary");
	public WebElement getPage6_txtTieUpBillInflowTertiary() {
		return getElement(Page6_txtTieUpBillInflowTertiary);
	}

	private By Page6_txtTieUpBillClearedTertiary=By.id("ctl00_cphpage_Page6_txtTieUpBillClearedTertiary");
	public WebElement getPage6_txtTieUpBillClearedTertiary() {
		return getElement(Page6_txtTieUpBillClearedTertiary);
	}
	private By Page6_txtTieUpBillInflowRemarks=By.id("ctl00_cphpage_Page6_txtTieUpBillInflowRemarks");
	public WebElement getPage6_txtTieUpBillInflowRemarks() {
		return getElement(Page6_txtTieUpBillInflowRemarks);
	}
	private By Page6_txtTieUpBillClearedRemarks=By.id("ctl00_cphpage_Page6_txtTieUpBillClearedRemarks");
	public WebElement getPage6_txtTieUpBillClearedRemarks() {
		return getElement(Page6_txtTieUpBillClearedRemarks);
	}
	private By Page6_txtTieUpBillPendencyRemarks=By.id("ctl00_cphpage_Page6_txtTieUpBillPendencyRemarks");
	public WebElement getPage6_txtTieUpBillPendencyRemarks() {
		return getElement(Page6_txtTieUpBillPendencyRemarks);
	}
	private By btnNext=By.id("ctl00_cphpage_btnNext");
	public WebElement getbtnNext() {
		return getElement(btnNext);
	}



	

	
}