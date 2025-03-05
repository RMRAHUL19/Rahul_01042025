 package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class MAPage5 extends BasePage {

	util utilobj = new util();

	public MAPage5(WebDriver driver) {
		super(driver);

	}
	
	private By ddlFacilityFunctional=By.id("ctl00_cphpage_Page5_ddlFacilityFunctional");
	public WebElement getddlFacilityFunctional() {
		return getElement(ddlFacilityFunctional);
	}
	private By Page5_txtPercentageBloodBank=By.id("ctl00_cphpage_Page5_txtPercentageBloodBank");
	public WebElement getPage5_txtPercentageBloodBank() {
		return getElement(Page5_txtPercentageBloodBank);
	}
	private By Page5_txtBloodUnitsIssuedMonth=By.id("ctl00_cphpage_Page5_txtBloodUnitsIssuedMonth");
	public WebElement getPage5_txtBloodUnitsIssuedMonth() {
		return getElement(Page5_txtBloodUnitsIssuedMonth);
	}
	private By txtBloodUnitsExpiredMonth=By.id("ctl00_cphpage_Page5_txtBloodUnitsExpiredMonth");
	public WebElement gettxtBloodUnitsExpiredMonth() {
		return getElement(txtBloodUnitsExpiredMonth);
	}
	private By Page5_txtBloodDonationCamp=By.id("ctl00_cphpage_Page5_txtBloodDonationCamp");
	public WebElement getPage5_txtBloodDonationCamp() {
		return getElement(Page5_txtBloodDonationCamp);
	}
	private By Page5_txtRemarksBloodBank=By.id("ctl00_cphpage_Page5_txtRemarksBloodBank");
	public WebElement getPage5_txtRemarksBloodBank() {
		return getElement(Page5_txtRemarksBloodBank);
	}
	private By Page5_txtItemsCondemnedPresentMedical=By.id("ctl00_cphpage_Page5_txtItemsCondemnedPresentMedical");
	public WebElement getPage5_txtItemsCondemnedPresentMedical() {
		return getElement(Page5_txtItemsCondemnedPresentMedical);
	}
	private By Page5_txtItemsCondemnedPresentNonMedical=By.id("ctl00_cphpage_Page5_txtItemsCondemnedPresentNonMedical");
	public WebElement getPage5_txtItemsCondemnedPresentNonMedical() {
		return getElement(Page5_txtItemsCondemnedPresentNonMedical);
	}
	private By Page5_txtItemsCondemnedMedical=By.id("ctl00_cphpage_Page5_txtItemsCondemnedMedical");
	public WebElement getPage5_txtItemsCondemnedMedical() {
		return getElement(Page5_txtItemsCondemnedMedical);
	}
	private By Page5_txtItemsCondemnedNonMedical=By.id("ctl00_cphpage_Page5_txtItemsCondemnedNonMedical");
	public WebElement getPage5_txtItemsCondemnedNonMedical() {
		return getElement(Page5_txtItemsCondemnedNonMedical);
	}
	private By Page5_txtDateLastCondemnedMedical=By.id("ctl00_cphpage_Page5_txtDateLastCondemnedMedical");
	public WebElement getPage5_txtDateLastCondemnedMedical() {
		return getElement(Page5_txtDateLastCondemnedMedical);
	}
	private By Page5_calLastCondemnedMedical_day_2_3=By.id("ctl00_cphpage_Page5_calLastCondemnedMedical_day_0_1");
	public WebElement getPage5_calLastCondemnedMedical_day_2_3() {
		return getElement(Page5_calLastCondemnedMedical_day_2_3);
	}
	private By Page5_txtDateLastCondemnedNonMedical=By.id("ctl00_cphpage_Page5_txtDateLastCondemnedNonMedical");
	public WebElement getPage5_txtDateLastCondemnedNonMedical() {
		return getElement(Page5_txtDateLastCondemnedNonMedical);
	}
	
	private By Page5_calLastCondemnedNonMedical_day_2_3=By.id("ctl00_cphpage_Page5_calLastCondemnedNonMedical_day_0_4");
	public WebElement getPage5_calLastCondemnedNonMedical_day_2_3() {
		return getElement(Page5_calLastCondemnedNonMedical_day_2_3);
	}
	private By Page5_txtDateDisposalItemMedical=By.id("ctl00_cphpage_Page5_txtDateDisposalItemMedical");
	public WebElement getPage5_txtDateDisposalItemMedical() {
		return getElement(Page5_txtDateDisposalItemMedical);
	}
	private By Page5_calDisposalItemMedical_day_2_3=By.id("ctl00_cphpage_Page5_calDisposalItemMedical_day_0_4");
	public WebElement getPage5_calDisposalItemMedical_day_2_3() {
		return getElement(Page5_calDisposalItemMedical_day_2_3);
	}
	private By Page5_txtDateDisposalItemNonMedical=By.id("ctl00_cphpage_Page5_txtDateDisposalItemNonMedical");
	public WebElement getPage5_txtDateDisposalItemNonMedical() {
		return getElement(Page5_txtDateDisposalItemNonMedical);
	}
	private By Page5_calDisposalItemNonMedical_day_2_3=By.id("ctl00_cphpage_Page5_calDisposalItemNonMedical_day_0_4");
	public WebElement getPage5_calDisposalItemNonMedical_day_2_3() {
		return getElement(Page5_calDisposalItemNonMedical_day_2_3);
	}
	private By Page5_txtRecordWeeding=By.id("ctl00_cphpage_Page5_txtRecordWeeding");
	public WebElement getPage5_txtRecordWeeding() {
		return getElement(Page5_txtRecordWeeding);
	}
	private By Page5_calRecordWeeding_day_2_3=By.id("ctl00_cphpage_Page5_calRecordWeeding_day_0_4");
	public WebElement getPage5_calRecordWeeding_day_2_3() {
		return getElement(Page5_calRecordWeeding_day_2_3);
	}
	private By Page5_txtRemarksCondemnation=By.id("ctl00_cphpage_Page5_txtRemarksCondemnation");
	public WebElement getPage5_txtRemarksCondemnation() {
		return getElement(Page5_txtRemarksCondemnation);
	}
	private By Page5_txtHouseKeepingPersonnelHired=By.id("ctl00_cphpage_Page5_txtHouseKeepingPersonnelHired");
	public WebElement getPage5_txtHouseKeepingPersonnelHired() {
		return getElement(Page5_txtHouseKeepingPersonnelHired);
	}
	private By Page5_ddlHouseKeepingBiometricAttendance=By.id("ctl00_cphpage_Page5_ddlHouseKeepingBiometricAttendance");
	public WebElement getPage5_ddlHouseKeepingBiometricAttendance() {
		return getElement(Page5_ddlHouseKeepingBiometricAttendance);
	}
	private By Page5_ddlHouseKeepingPFDeduction=By.id("ctl00_cphpage_Page5_ddlHouseKeepingPFDeduction");
	public WebElement getPage5_ddlHouseKeepingPFDeduction() {
		return getElement(Page5_ddlHouseKeepingPFDeduction);
	}
	private By Page5_ddlHouseKeepingMinWages=By.id("ctl00_cphpage_Page5_ddlHouseKeepingMinWages");
	public WebElement getPage5_ddlHouseKeepingMinWages() {
		return getElement(Page5_ddlHouseKeepingMinWages);
	}
	private By Page5_ddlHouseKeepingECS=By.id("ctl00_cphpage_Page5_ddlHouseKeepingECS");
	public WebElement getPage5_ddlHouseKeepingECS() {
		return getElement(Page5_ddlHouseKeepingECS);
	}
	private By Page5_txtHouseKeepingDateOnsetContract=By.id("ctl00_cphpage_Page5_txtHouseKeepingDateOnsetContract");
	public WebElement getPage5_txtHouseKeepingDateOnsetContract() {
		return getElement(Page5_txtHouseKeepingDateOnsetContract);
	}
	
	private By cclHouseKeepingDateOnsetContract_day_2_3=By.id("ctl00_cphpage_Page_cclHouseKeepingDateOnsetContract_day_0_4");
	public WebElement getcclHouseKeepingDateOnsetContract_day_2_3() {
		return getElement(cclHouseKeepingDateOnsetContract_day_2_3);
	}
	private By Page5_txtHouseKeepingRemarks=By.id("ctl00_cphpage_Page5_txtHouseKeepingRemarks");
	public WebElement getPage5_txtHouseKeepingRemarks() {
		return getElement(Page5_txtHouseKeepingRemarks);
	}
	private By Page5_txtSecurityStaffPersonelHired=By.id("ctl00_cphpage_Page5_txtSecurityStaffPersonelHired");
	public WebElement getPage5_txtSecurityStaffPersonelHired() {
		return getElement(Page5_txtSecurityStaffPersonelHired);
	}

	private By ddlSecurityStaffBiometricAttendance=By.id("ctl00_cphpage_Page5_ddlSecurityStaffBiometricAttendance");
	public WebElement getddlSecurityStaffBiometricAttendance() {
		return getElement(ddlSecurityStaffBiometricAttendance);
	}

	private By ddlSecurityStaffPFDeduction=By.id("ctl00_cphpage_Page5_ddlSecurityStaffPFDeduction");
	public WebElement getddlSecurityStaffPFDeduction() {
		return getElement(ddlSecurityStaffPFDeduction);
	}

	private By Page5_ddlSecurityStaffMinWages=By.id("ctl00_cphpage_Page5_ddlSecurityStaffMinWages");
	public WebElement getPage5_ddlSecurityStaffMinWages() {
		return getElement(Page5_ddlSecurityStaffMinWages);
	}
	private By Page5_ddlSecurityStaffECS=By.id("ctl00_cphpage_Page5_ddlSecurityStaffECS");
	public WebElement getPage5_ddlSecurityStaffECS() {
		return getElement(Page5_ddlSecurityStaffECS);
	}
	private By Page5_txtSecurityStaffDateOnsetContract=By.id("ctl00_cphpage_Page5_txtSecurityStaffDateOnsetContract");
	public WebElement getPage5_txtSecurityStaffDateOnsetContract() {
		return getElement(Page5_txtSecurityStaffDateOnsetContract);
	}

	private By Page5_cclSecurityStaffDateOnsetContract_day_2_3=By.id("ctl00_cphpage_Page5_cclSecurityStaffDateOnsetContract_day_0_4");
	public WebElement getPage5_cclSecurityStaffDateOnsetContract_day_2_3() {
		return getElement(Page5_cclSecurityStaffDateOnsetContract_day_2_3);
	}
	private By Page5_txtSecurityStaffRemarks=By.id("ctl00_cphpage_Page5_txtSecurityStaffRemarks");
	public WebElement getPage5_txtSecurityStaffRemarks() {
		return getElement(Page5_txtSecurityStaffRemarks);
	}
	private By Page5_txtARMPersonnelHired=By.id("ctl00_cphpage_Page5_txtARMPersonnelHired");
	public WebElement getPage5_txtARMPersonnelHired() {
		return getElement(Page5_txtARMPersonnelHired);
	}
	private By Page5_ddlARMBiometricAttendance=By.id("ctl00_cphpage_Page5_ddlARMBiometricAttendance");
	public WebElement getPage5_ddlARMBiometricAttendance() {
		return getElement(Page5_ddlARMBiometricAttendance);
	}
	private By Page5_ddlARMPFDeduction=By.id("ctl00_cphpage_Page5_ddlARMPFDeduction");
	public WebElement getPage5_ddlARMPFDeduction() {
		return getElement(Page5_ddlARMPFDeduction);
	}
	private By Page5_ddlARMMinWages=By.id("ctl00_cphpage_Page5_ddlARMMinWages");
	public WebElement getPage5_ddlARMMinWages() {
		return getElement(Page5_ddlARMMinWages);
	}
	private By Page5_ddlARMStatusECS=By.id("ctl00_cphpage_Page5_ddlARMStatusECS");
	public WebElement getPage5_ddlARMStatusECS() {
		return getElement(Page5_ddlARMStatusECS);
	}
	private By Page5_txtARMDateOnsetContract=By.id("ctl00_cphpage_Page5_txtARMDateOnsetContract");
	public WebElement getPage5_txtARMDateOnsetContract() {
		return getElement(Page5_txtARMDateOnsetContract);
	}
	private By Page5_cclARMDateOnsetContract_day_2_3=By.id("ctl00_cphpage_Page5_cclARMDateOnsetContract_day_0_4");
	public WebElement getPage5_cclARMDateOnsetContract_day_2_3() {
		return getElement(Page5_cclARMDateOnsetContract_day_2_3);
	}
	private By Page5_txtARMRemarks=By.id("ctl00_cphpage_Page5_txtARMRemarks");
	public WebElement getPage5_txtARMRemarks() {
		return getElement(Page5_txtARMRemarks);
	}
	private By Page5_ddlInfectionControlBMWManagement=By.id("ctl00_cphpage_Page5_ddlInfectionControlBMWManagement");
	public WebElement getPage5_ddlInfectionControlBMWManagement() {
		return getElement(Page5_ddlInfectionControlBMWManagement);
	}
	private By Page5_ddlInfectionControlDisplayWorkInstruction=By.id("ctl00_cphpage_Page5_ddlInfectionControlDisplayWorkInstruction");
	public WebElement getPage5_ddlInfectionControlDisplayWorkInstruction() {
		return getElement(Page5_ddlInfectionControlDisplayWorkInstruction);
	}
	private By getPage5_ddlInfectionControlAvailColorCoded=By.id("ctl00_cphpage_Page5_ddlInfectionControlAvailColuredLiners");
	public WebElement getPage5_ddlInfectionControlAvailColuredLiners() {
		return getElement(getPage5_ddlInfectionControlAvailColorCoded);
	}
	private By Page5_ddlInfectionControlAvailColorCoded=By.id("ctl00_cphpage_Page5_ddlInfectionControlAvailColorCoded");
	public WebElement getPage5_ddlInfectionControlAvailColorCoded() {
		return getElement(Page5_ddlInfectionControlAvailColorCoded);
	}
	private By Page5_ddlInfectionControlSegregationBMW=By.id("ctl00_cphpage_Page5_ddlInfectionControlSegregationBMW");
	public WebElement getPage5_ddlInfectionControlSegregationBMW() {
		return getElement(Page5_ddlInfectionControlSegregationBMW);
	}
	private By Page5_ddlInfectionControlAvailPPE=By.id("ctl00_cphpage_Page5_ddlInfectionControlAvailPPE");
	public WebElement getPage5_ddlInfectionControlAvailPPE() {
		return getElement(Page5_ddlInfectionControlAvailPPE);
	}
	private By Page5_ddlInfectionControlProofBoxes=By.id("ctl00_cphpage_Page5_ddlInfectionControlProofBoxes");
	public WebElement getPage5_ddlInfectionControlProofBoxes() {
		return getElement(Page5_ddlInfectionControlProofBoxes);
	}
	private By Page5_ddlInfectionControlMutilation=By.id("ctl00_cphpage_Page5_ddlInfectionControlMutilation");
	public WebElement getPage5_ddlInfectionControlMutilation() {
		return getElement(Page5_ddlInfectionControlMutilation);
	}
	private By Page5_txtInfectionControlRemarks=By.id("ctl00_cphpage_Page5_txtInfectionControlRemarks");
	public WebElement getPage5_txtInfectionControlRemarks() {
		return getElement(Page5_txtInfectionControlRemarks);
	}
	private By Page5_txtTrainingConductedLastMonth=By.id("ctl00_cphpage_Page5_txtTrainingConductedLastMonth");
	public WebElement getPage5_txtTrainingConductedLastMonth() {
		return getElement(Page5_txtTrainingConductedLastMonth);
	}
	private By Page5_txtTrainingCategory1=By.id("ctl00_cphpage_Page5_txtTrainingCategory1");
	public WebElement getPage5_txtTrainingCategory1() {
		return getElement(Page5_txtTrainingCategory1);
	}
	private By Page5_txtTrainingTrainedPerson1=By.id("ctl00_cphpage_Page5_txtTrainingTrainedPerson1");
	public WebElement getPage5_txtTrainingTrainedPerson1() {
		return getElement(Page5_txtTrainingTrainedPerson1);
	}
	private By Page5_txtTrainingRemarks1=By.id("ctl00_cphpage_Page5_txtTrainingRemarks1");
	public WebElement getPage5_txtTrainingRemarks1() {
		return getElement(Page5_txtTrainingRemarks1);
	}
	private By Page5_btnTrainingAdd1=By.id("ctl00_cphpage_Page5_btnTrainingAdd1");
	public WebElement getPage5_btnTrainingAdd1() {
		return getElement(Page5_btnTrainingAdd1);
	}
	private By Page5_txtTrainingCategory2=By.id("ctl00_cphpage_Page5_txtTrainingCategory2");
	public WebElement getPage5_txtTrainingCategory2() {
		return getElement(Page5_txtTrainingCategory2);
	}
	private By Page5_txtTrainingTrainedPerson2=By.id("ctl00_cphpage_Page5_txtTrainingTrainedPerson2");
	public WebElement getPage5_txtTrainingTrainedPerson2() {
		return getElement(Page5_txtTrainingTrainedPerson2);
	}
	private By Page5_txtTrainingRemarks2=By.id("ctl00_cphpage_Page5_txtTrainingRemarks2");
	public WebElement getPage5_txtTrainingRemarks2() {
		return getElement(Page5_txtTrainingRemarks2);
	}
	private By Page5_txtHardwareACtiveTerminals=By.id("ctl00_cphpage_Page5_txtHardwareACtiveTerminals");
	public WebElement getPage5_txtHardwareACtiveTerminals() {
		return getElement(Page5_txtHardwareACtiveTerminals);
	}
	private By Page5_txtHardwareLoginIdIssued=By.id("ctl00_cphpage_Page5_txtHardwareLoginIdIssued");
	public WebElement getPage5_txtHardwareLoginIdIssued() {
		return getElement(Page5_txtHardwareLoginIdIssued);
	}
	private By Page5_txtHardwareRemarks=By.id("ctl00_cphpage_Page5_txtHardwareRemarks");
	public WebElement getPage5_txtHardwareRemarks() {
		return getElement(Page5_txtHardwareRemarks);
	}

	private By cphpage_btnNext=By.id("ctl00_cphpage_btnNext");
	public WebElement getcphpage_btnNext() {
		return getElement(cphpage_btnNext);
	}


}