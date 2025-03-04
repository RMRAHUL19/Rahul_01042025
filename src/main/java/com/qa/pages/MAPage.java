package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MAPage extends BasePage {

	public MAPage(WebDriver driver) {
	super(driver);

	}

	
	private By ddlOPDRegistration=By.id("ctl00_cphpage_Page1_ddlOPDRegistration");
	
	public WebElement getddlOPDRegistration() {
		return getElement(ddlOPDRegistration);
	}
	
	private By ddlOPDDoctor=By.id("ctl00_cphpage_Page1_ddlOPDDoctor");
	public WebElement getddlOPDDoctor() {
		return getElement(ddlOPDDoctor);
	}
	
	private By ddlIPDAdmission=By.id("ctl00_cphpage_Page1_ddlIPDAdmission");
	public WebElement getddlIPDAdmission() {
		return getElement(ddlIPDAdmission);
	}
	
	private By ddlIPDDoctor=By.id("ctl00_cphpage_Page1_ddlIPDDoctor");
	public WebElement getddlIPDDoctor() {
		return getElement(ddlIPDDoctor);
	}
	
	private By ddlERPMM=By.id("ctl00_cphpage_Page1_ddlERPMM");
	public WebElement getddlERPMM() {
		return getElement(ddlERPMM);
	}
	
	private By ddlPharmacy=By.id("ctl00_cphpage_Page1_ddlPharmacy");
	public WebElement getddlPharmacy() {
		return getElement(ddlPharmacy);
	}
	
	private By ddlLaboratory=By.id("ctl00_cphpage_Page1_ddlLaboratory");
	public WebElement getddlLaboratory() {
		return getElement(ddlLaboratory);
	}
	
	private By ddlRadiology=By.id("ctl00_cphpage_Page1_ddlRadiology");
	public WebElement getddlRadiology() {
		return getElement(ddlRadiology);
	}
	
	private By ddlOT=By.id("ctl00_cphpage_Page1_ddlOT");
	public WebElement getddlOT() {
		return getElement(ddlOT);
	}
	
	private By ddlP1=By.id("ctl00_cphpage_Page1_ddlP1");
	public WebElement getddlP1() {
		return getElement(ddlP1);
	}
	
	private By ddlUTI=By.id("ctl00_cphpage_Page1_ddlUTI");
	public WebElement getddlUTI() {
		return getElement(ddlUTI);
	}
	
	private By ddlERPTieUpBills=By.id("ctl00_cphpage_Page1_ddlERPTieUpBills");
	public WebElement getddlERPTieUpBills() {
		return getElement(ddlERPTieUpBills);
	}
	
	private By chkSanctionedBed=By.id("ctl00_cphpage_Page1_chkSanctionedBed");
	public WebElement getchkSanctionedBed() {
		return getElement(chkSanctionedBed);
	}
	
	private By ddlSanctionedBed=By.id("ctl00_cphpage_Page1_ddlSanctionedBed");
	public WebElement getddlSanctionedBed() {
		return getElement(ddlSanctionedBed);
	}
	
	private By txtSanctionedBedsManual=By.id("ctl00_cphpage_Page1_txtSanctionedBedsManual");
	public WebElement gettxtSanctionedBedsManual() {
		return getElement(txtSanctionedBedsManual);
	}
	
	private By chkCommissionedBeds=By.id("ctl00_cphpage_Page1_chkCommissionedBeds");
	public WebElement getchkCommissionedBeds() {
		return getElement(chkCommissionedBeds);
	}
	
	private By ddlCommissionedBeds=By.id("ctl00_cphpage_Page1_ddlCommissionedBeds");
	public WebElement getddlCommissionedBeds() {
		return getElement(ddlCommissionedBeds);
	}
	
	private By txtCommissionedBedsManual=By.id("ctl00_cphpage_Page1_txtCommissionedBedsManual");
	public WebElement gettxtCommissionedBedsManual() {
		return getElement(txtCommissionedBedsManual);
	}
	
	private By chkIPCovered=By.id("ctl00_cphpage_Page1_chkIPCovered");
	public WebElement getchkIPCovered() {
		return getElement(chkIPCovered);
	}
	
	private By ddlIPCovered=By.id("ctl00_cphpage_Page1_ddlIPCovered");
	public WebElement getddlIPCovered() {
		return getElement(ddlIPCovered);
	}
	
	private By txtIPCoveredManual=By.id("ctl00_cphpage_Page1_txtIPCoveredManual");
	public WebElement gettxtIPCoveredManual() {
		return getElement(txtIPCoveredManual);
	}
	
	private By chkOldOPDAttendance=By.id("ctl00_cphpage_Page1_chkOldOPDAttendance");
	public WebElement getchkOldOPDAttendance() {
		return getElement(chkOldOPDAttendance);
	}
	
	private By ddlOldOPDAttendance=By.id("ctl00_cphpage_Page1_ddlOldOPDAttendance");
	public WebElement getddlOldOPDAttendance() {
		return getElement(ddlOldOPDAttendance);
	}
	
	private By txtOldOPDAttendanceManual=By.id("ctl00_cphpage_Page1_txtOldOPDAttendanceManual");
	public WebElement gettxtOldOPDAttendanceManual() {
		return getElement(txtOldOPDAttendanceManual);
	}
	
	private By txtNewOPDAttendanceManual=By.id("ctl00_cphpage_Page1_txtNewOPDAttendanceManual");
	public WebElement gettxtNewOPDAttendanceManual() {
		return getElement(txtNewOPDAttendanceManual);
	}
	
	private By txtTotalAttendanceManual=By.id("ctl00_cphpage_Page1_txtTotalAttendanceManual");
	public WebElement gettxtTotalAttendanceManual() {
		return getElement(txtTotalAttendanceManual);
	}
	
	private By txtWorkingDaysManual=By.id("ctl00_cphpage_Page1_txtWorkingDaysManual");
	public WebElement gettxtWorkingDaysManual() {
		return getElement(txtWorkingDaysManual);
	}
	
	private By txtAverageOPDAttendanceManual=By.id("ctl00_cphpage_Page1_txtAverageOPDAttendanceManual");
	public WebElement gettxtAverageOPDAttendanceManual() {
		return getElement(txtAverageOPDAttendanceManual);
	}
	
	private By chkTotalAdmissions=By.id("ctl00_cphpage_Page1_chkTotalAdmissions");
	public WebElement getchkTotalAdmissions() {
		return getElement(chkTotalAdmissions);
	}
	
	private By ddlTotalAdmissions=By.id("ctl00_cphpage_Page1_ddlTotalAdmissions");
	public WebElement getddlTotalAdmissions() {
		return getElement(ddlTotalAdmissions);
	}
	
	private By txtTotalAdmissionsManual=By.id("ctl00_cphpage_Page1_txtTotalAdmissionsManual");
	public WebElement gettxtTotalAdmissionsManual() {
		return getElement(txtTotalAdmissionsManual);
	}
	
	private By chkDeaths=By.id("ctl00_cphpage_Page1_chkDeaths");
	public WebElement getchkDeaths() {
		return getElement(chkDeaths);
	}
	
	private By ddlDeaths=By.id("ctl00_cphpage_Page1_ddlDeaths");
	public WebElement getddlDeaths() {
		return getElement(ddlDeaths);
	}
	
	private By txtDeathsManual=By.id("ctl00_cphpage_Page1_txtDeathsManual");
	public WebElement gettxtDeathsManual() {
		return getElement(txtDeathsManual);
	}
	private By chkEmergencyPatients=By.id("ctl00_cphpage_Page1_chkEmergencyPatients");
	public WebElement getchkEmergencyPatients() {
		return getElement(chkEmergencyPatients);
	}
	private By ddlEmergencyPatients=By.id("ctl00_cphpage_Page1_ddlEmergencyPatients");
	public WebElement getddlEmergencyPatients() {
		return getElement(ddlEmergencyPatients);
	}
	private By txtEmergencyPatientsManual=By.id("ctl00_cphpage_Page1_txtEmergencyPatientsManual");
	public WebElement gettxtEmergencyPatientsManual() {
		return getElement(txtEmergencyPatientsManual);
	}

	private By chkExistingOT=By.id("ctl00_cphpage_Page1_chkExistingOT");
	public WebElement getchkExistingOT() {
		return getElement(chkExistingOT);
	}
	private By ddlExistingOT=By.id("ctl00_cphpage_Page1_ddlExistingOT");
	public WebElement getddlExistingOT() {
		return getElement(ddlExistingOT);
	}
	private By txtExistingOTManual=By.id("ctl00_cphpage_Page1_txtExistingOTManual");
	public WebElement gettxtExistingOTManual() {
		return getElement(txtExistingOTManual);
	}
	private By chkFunctionalOT=By.id("ctl00_cphpage_Page1_chkFunctionalOT");
	public WebElement getchkFunctionalOT() {
		return getElement(chkFunctionalOT);
	}
	private By ddlFunctionalOT=By.id("ctl00_cphpage_Page1_ddlFunctionalOT");
	public WebElement getddlFunctionalOT() {
		return getElement(ddlFunctionalOT);
	}
	private By txtFunctionalOTManual=By.id("ctl00_cphpage_Page1_txtFunctionalOTManual");
	public WebElement gettxtFunctionalOTManual() {
		return getElement(txtFunctionalOTManual);
	}
	private By chkMinorSurgeries=By.id("ctl00_cphpage_Page1_chkMinorSurgeries");
	public WebElement getchkMinorSurgeries() {
		return getElement(chkMinorSurgeries);
	}
	private By ddlMinorSurgeries=By.id("ctl00_cphpage_Page1_ddlMinorSurgeries");
	public WebElement getddlMinorSurgeries() {
		return getElement(ddlMinorSurgeries);
	}
	private By txtMinorSurgeriesManual=By.id("ctl00_cphpage_Page1_txtMinorSurgeriesManual");
	public WebElement gettxtMinorSurgeriesManual() {
		return getElement(txtMinorSurgeriesManual);
	}
	private By chkMajorsurgeries=By.id("ctl00_cphpage_Page1_chkMajorsurgeries");
	public WebElement getchkMajorsurgeries() {
		return getElement(chkMajorsurgeries);
	}
	private By ddlMajorsurgeries=By.id("ctl00_cphpage_Page1_ddlMajorsurgeries");
	public WebElement getddlMajorsurgeries() {
		return getElement(ddlMajorsurgeries);
	}
	private By txtMajorsurgeriesManual=By.id("ctl00_cphpage_Page1_txtMajorsurgeriesManual");
	public WebElement gettxtMajorsurgeriesManual() {
		return getElement(txtMajorsurgeriesManual);
	}
	private By chkCancelledsurgeries=By.id("ctl00_cphpage_Page1_chkCancelledsurgeries");
	public WebElement getchkCancelledsurgeries() {
		return getElement(chkCancelledsurgeries);
	}
	private By ddlCancelledsurgeries=By.id("ctl00_cphpage_Page1_ddlCancelledsurgeries");
	public WebElement getddlCancelledsurgeries() {
		return getElement(ddlCancelledsurgeries);
	}
	private By txtCancelledsurgeriesManual=By.id("ctl00_cphpage_Page1_txtCancelledsurgeriesManual");
	public WebElement gettxtCancelledsurgeriesManual() {
		return getElement(txtCancelledsurgeriesManual);
	}
	
	private By chkDeathOperationTable=By.id("ctl00_cphpage_Page1_chkDeathOperationTable");
	public WebElement getchkDeathOperationTable() {
		return getElement(chkDeathOperationTable);
	}
	private By ddlDeathOperationTable=By.id("ctl00_cphpage_Page1_ddlDeathOperationTable");
	public WebElement getddlDeathOperationTable() {
		return getElement(ddlDeathOperationTable);
	}
	private By txtDeathOperationTableManual=By.id("ctl00_cphpage_Page1_txtDeathOperationTableManual");
	public WebElement gettxtDeathOperationTableManual() {
		return getElement(txtDeathOperationTableManual);
	}
	
	private By chkAnaesthesiaMortality=By.id("ctl00_cphpage_Page1_chkAnaesthesiaMortality");
	public WebElement getchkAnaesthesiaMortality() {
		return getElement(chkAnaesthesiaMortality);
	}
	private By ddlAnaesthesiaMortality=By.id("ctl00_cphpage_Page1_ddlAnaesthesiaMortality");
	public WebElement getddlAnaesthesiaMortality() {
		return getElement(ddlAnaesthesiaMortality);
	}
	private By txtAnaesthesiaMortalityManual=By.id("ctl00_cphpage_Page1_txtAnaesthesiaMortalityManual");
	public WebElement gettxtAnaesthesiaMortalityManual() {
		return getElement(txtAnaesthesiaMortalityManual);
	}
	private By chkSurgicalInfectionRate=By.id("ctl00_cphpage_Page1_chkSurgicalInfectionRate");
	public WebElement getchkSurgicalInfectionRate() {
		return getElement(chkSurgicalInfectionRate);
	}
	private By ddlSurgicalInfectionRate=By.id("ctl00_cphpage_Page1_ddlSurgicalInfectionRate");
	public WebElement getddlSurgicalInfectionRate() {
		return getElement(ddlSurgicalInfectionRate);
	}
	private By txtSurgicalInfectionRateManual=By.id("ctl00_cphpage_Page1_txtSurgicalInfectionRateManual");
	public WebElement gettxtSurgicalInfectionRateManual() {
		return getElement(txtSurgicalInfectionRateManual);
	}
	
	private By txtOperationTheatreRemarks=By.id("ctl00_cphpage_Page1_txtOperationTheatreRemarks");
	public WebElement gettxtOperationTheatreRemarks() {
		return getElement(txtOperationTheatreRemarks);
	}
	
	private By chkNormalDeliveries=By.id("ctl00_cphpage_Page1_chkNormalDeliveries");
	public WebElement getchkNormalDeliveries() {
		return getElement(chkNormalDeliveries);
	}
	private By ddlNormalDeliveries=By.id("ctl00_cphpage_Page1_ddlNormalDeliveries");
	public WebElement getddlNormalDeliveries() {
		return getElement(ddlNormalDeliveries);
	}
	
	private By txtNormalDeliveriesManual=By.id("ctl00_cphpage_Page1_txtNormalDeliveriesManual");
	public WebElement gettxtNormalDeliveriesManual() {
		return getElement(txtNormalDeliveriesManual);
	}
	private By chkCSectionDeliveries=By.id("ctl00_cphpage_Page1_chkCSectionDeliveries");
	public WebElement getchkCSectionDeliveries() {
		return getElement(chkCSectionDeliveries);
	}
	private By ddlCSectionDeliveries=By.id("ctl00_cphpage_Page1_ddlCSectionDeliveries");
	public WebElement getddlCSectionDeliveries() {
		return getElement(ddlCSectionDeliveries);
	}
	
	private By txtCSectionDeliveriesManual=By.id("ctl00_cphpage_Page1_txtCSectionDeliveriesManual");
	public WebElement gettxtCSectionDeliveriesManual() {
		return getElement(txtCSectionDeliveriesManual);
	}
	private By chkLiveBirths=By.id("ctl00_cphpage_Page1_chkLiveBirths");
	public WebElement getchkLiveBirths() {
		return getElement(chkLiveBirths);
	}
	private By ddlLiveBirths=By.id("ctl00_cphpage_Page1_ddlLiveBirths");
	public WebElement getddlLiveBirths() {
		return getElement(ddlLiveBirths);
	}
	
	private By txtLiveBirthsManual=By.id("ctl00_cphpage_Page1_txtLiveBirthsManual");
	public WebElement gettxtLiveBirthsManual() {
		return getElement(txtLiveBirthsManual);
	}
	private By chkStillBirths=By.id("ctl00_cphpage_Page1_chkStillBirths");
	public WebElement getchkStillBirths() {
		return getElement(chkStillBirths);
	}
	private By ddlStillBirths=By.id("ctl00_cphpage_Page1_ddlStillBirths");
	public WebElement getddlStillBirths() {
		return getElement(ddlStillBirths);
	}
	
	private By txtStillBirthsManual=By.id("ctl00_cphpage_Page1_txtStillBirthsManual");
	public WebElement gettxtStillBirthsManual() {
		return getElement(txtStillBirthsManual);
	}
	private By chkNeonatalDeaths=By.id("ctl00_cphpage_Page1_chkNeonatalDeaths");
	public WebElement getchkNeonatalDeaths() {
		return getElement(chkNeonatalDeaths);
	}
	private By ddlNeonatalDeaths=By.id("ctl00_cphpage_Page1_ddlNeonatalDeaths");
	public WebElement getddlNeonatalDeaths() {
		return getElement(ddlNeonatalDeaths);
	}
	
	private By txtNeonatalDeathsManual=By.id("ctl00_cphpage_Page1_txtNeonatalDeathsManual");
	public WebElement gettxtNeonatalDeathsManual() {
		return getElement(txtNeonatalDeathsManual);
	}
	
	private By chkMTPs=By.id("ctl00_cphpage_Page1_chkMTPs");
	public WebElement getchkMTPs() {
		return getElement(chkMTPs);
	}
	private By ddlMTPs=By.id("ctl00_cphpage_Page1_ddlMTPs");
	public WebElement getddlMTPs() {
		return getElement(ddlMTPs);
	}
	
	private By txtMTPsManual=By.id("ctl00_cphpage_Page1_txtMTPsManual");
	public WebElement gettxtMTPsManual() {
		return getElement(txtMTPsManual);
	}
	private By chkLSCSRate=By.id("ctl00_cphpage_Page1_chkLSCSRate");
	public WebElement getchkLSCSRate() {
		return getElement(chkLSCSRate);
	}
	private By ddlLSCSRate=By.id("ctl00_cphpage_Page1_ddlLSCSRate");
	public WebElement getddlLSCSRate() {
		return getElement(ddlLSCSRate);
	}
	
	private By txtLSCSRateManual=By.id("ctl00_cphpage_Page1_txtLSCSRateManual");
	public WebElement gettxtLSCSRateManual() {
		return getElement(txtLSCSRateManual);
	}
	
	private By chkMaternalMortality=By.id("ctl00_cphpage_Page1_chkMaternalMortality");
	public WebElement getchkMaternalMortality() {
		return getElement(chkMaternalMortality);
	}
	private By ddlMaternalMortality=By.id("ctl00_cphpage_Page1_ddlMaternalMortality");
	public WebElement getddlMaternalMortality() {
		return getElement(ddlMaternalMortality);
	}
	
	private By txtMaternalMortalityManual=By.id("ctl00_cphpage_Page1_txtMaternalMortalityManual");
	public WebElement gettxtMaternalMortalityManual() {
		return getElement(txtMaternalMortalityManual);
	}
	private By chkNeonatalMortality=By.id("ctl00_cphpage_Page1_chkNeonatalMortality");
	public WebElement getchkNeonatalMortality() {
		return getElement(chkNeonatalMortality);
	}
	private By ddlNeonatalMortality=By.id("ctl00_cphpage_Page1_ddlNeonatalMortality");
	public WebElement getddlNeonatalMortality() {
		return getElement(ddlNeonatalMortality);
	}
	
	private By txtNeonatalMortalityManual=By.id("ctl00_cphpage_Page1_txtNeonatalMortalityManual");
	public WebElement gettxtNeonatalMortalityManual() {
		return getElement(txtNeonatalMortalityManual);
	}
	private By chkInfantMortality=By.id("ctl00_cphpage_Page1_chkInfantMortality");
	public WebElement getchkInfantMortality() {
		return getElement(chkInfantMortality);
	}
	private By ddlInfantMortality=By.id("ctl00_cphpage_Page1_ddlInfantMortality");
	public WebElement getddlInfantMortality() {
		return getElement(ddlInfantMortality);
	}
	
	private By txtInfantMortalityManual=By.id("ctl00_cphpage_Page1_txtInfantMortalityManual");
	public WebElement gettxtInfantMortalityManual() {
		return getElement(txtInfantMortalityManual);
	}
	
	private By txtMaternalRemarks=By.id("ctl00_cphpage_Page1_txtMaternalRemarks");
	public WebElement gettxtMaternalRemarks() {
		return getElement(txtMaternalRemarks);
	}
	
	private By chkXRayPerformed=By.id("ctl00_cphpage_Page1_chkXRayPerformed");
	public WebElement getchkXRayPerformed() {
		return getElement(chkXRayPerformed);
	}
	
	private By ddlXRayPerformed=By.id("ctl00_cphpage_Page1_ddlXRayPerformed");
	public WebElement getddlXRayPerformed() {
		return getElement(ddlXRayPerformed);
	}
	
	private By txtXRayPerformedManual=By.id("ctl00_cphpage_Page1_txtXRayPerformedManual");
	public WebElement gettxtXRayPerformedManual() {
		return getElement(txtXRayPerformedManual);
	}
	
	private By chkUltasoundPerformed=By.id("ctl00_cphpage_Page1_chkUltasoundPerformed");
	public WebElement getchkUltasoundPerformed() {
		return getElement(chkUltasoundPerformed);
	}
	
	private By ddlUltasoundPerformed=By.id("ctl00_cphpage_Page1_ddlUltasoundPerformed");
	public WebElement getddlUltasoundPerformed() {
		return getElement(ddlUltasoundPerformed);
	}
	
	private By txtUltasoundPerformedManual=By.id("ctl00_cphpage_Page1_txtUltasoundPerformedManual");
	public WebElement gettxtUltasoundPerformedManual() {
		return getElement(txtUltasoundPerformedManual);
	}
	
	private By chkCTScanPerformed=By.id("ctl00_cphpage_Page1_chkCTScanPerformed");
	public WebElement getchkCTScanPerformed() {
		return getElement(chkCTScanPerformed);
	}
	
	private By ddlCTScanPerformed=By.id("ctl00_cphpage_Page1_ddlCTScanPerformed");
	public WebElement getddlCTScanPerformed() {
		return getElement(ddlCTScanPerformed);
	}
	
	private By txtCTScanPerformedManual=By.id("ctl00_cphpage_Page1_txtCTScanPerformedManual");
	public WebElement gettxtCTScanPerformedManual() {
		return getElement(txtCTScanPerformedManual);
	}
	private By chkMRIScanPerformed=By.id("ctl00_cphpage_Page1_chkMRIScanPerformed");
	public WebElement getchkMRIScanPerformed() {
		return getElement(chkMRIScanPerformed);
	}
	
	private By ddlMRIScanPerformed=By.id("ctl00_cphpage_Page1_ddlMRIScanPerformed");
	public WebElement getddlMRIScanPerformed() {
		return getElement(ddlMRIScanPerformed);
	}
	
	private By txtMRIScanPerformedManual=By.id("ctl00_cphpage_Page1_txtMRIScanPerformedManual");
	public WebElement gettxtMRIScanPerformedManual() {
		return getElement(txtMRIScanPerformedManual);
	}
	
	private By chkRadiologyPerformed=By.id("ctl00_cphpage_Page1_chkRadiologyPerformed");
	public WebElement getchkRadiologyPerformed() {
		return getElement(chkRadiologyPerformed);
	}
	
	private By ddlRadiologyPerformed=By.id("ctl00_cphpage_Page1_ddlRadiologyPerformed");
	public WebElement getddlRadiologyPerformed() {
		return getElement(ddlRadiologyPerformed);
	}
	
	private By txtRadiologyPerformedManual=By.id("ctl00_cphpage_Page1_txtRadiologyPerformedManual");
	public WebElement gettxtRadiologyPerformedManual() {
		return getElement(txtRadiologyPerformedManual);
	}
	
	private By chkXRayReporting=By.id("ctl00_cphpage_Page1_chkXRayReporting");
	public WebElement getchkXRayReporting() {
		return getElement(chkXRayReporting);
	}
	
	private By ddlXRayReporting=By.id("ctl00_cphpage_Page1_ddlXRayReporting");
	public WebElement getddlXRayReporting() {
		return getElement(ddlXRayReporting);
	}
	
	private By txtXRayReportingManual=By.id("ctl00_cphpage_Page1_txtXRayReportingManual");
	public WebElement gettxtXRayReportingManual() {
		return getElement(txtXRayReportingManual);
	}
	
	private By txtRadiologyRemarks=By.id("ctl00_cphpage_Page1_txtRadiologyRemarks");
	public WebElement gettxtRadiologyRemarks() {
		return getElement(txtRadiologyRemarks);
	}
	
	private By chkPathology=By.id("ctl00_cphpage_Page1_chkPathology");
	public WebElement getchkPathology() {
		return getElement(chkPathology);
	}
	
	private By ddlPathology=By.id("ctl00_cphpage_Page1_ddlPathology");
	public WebElement getddlPathology() {
		return getElement(ddlPathology);
	}
	
	private By txtPathologyManual=By.id("ctl00_cphpage_Page1_txtPathologyManual");
	public WebElement gettxtPathologyManual() {
		return getElement(txtPathologyManual);
	}
	
	private By chkMicrobiology=By.id("ctl00_cphpage_Page1_chkMicrobiology");
	public WebElement getchkMicrobiology() {
		return getElement(chkMicrobiology);
	}
	
	private By ddlMicrobiology=By.id("ctl00_cphpage_Page1_ddlMicrobiology");
	public WebElement getddlMicrobiology() {
		return getElement(ddlMicrobiology);
	}
	
	private By txtMicrobiologyManual=By.id("ctl00_cphpage_Page1_txtMicrobiologyManual");
	public WebElement gettxtMicrobiologyManual() {
		return getElement(txtMicrobiologyManual);
	}
	
	private By chkBiochemistry=By.id("ctl00_cphpage_Page1_chkBiochemistry");
	public WebElement getchkBiochemistry() {
		return getElement(chkBiochemistry);
	}
	
	private By ddlBiochemistry=By.id("ctl00_cphpage_Page1_ddlBiochemistry");
	public WebElement getddlBiochemistry() {
		return getElement(ddlBiochemistry);
	}
	
	private By txtBiochemistryManual=By.id("ctl00_cphpage_Page1_txtBiochemistryManual");
	public WebElement gettxtBiochemistryManual() {
		return getElement(txtBiochemistryManual);
	}
	
	private By txtLaboratoryRemarks=By.id("ctl00_cphpage_Page1_txtLaboratoryRemarks");
	public WebElement gettxtLaboratoryRemarks() {
		return getElement(txtLaboratoryRemarks);
	}
	private By btnNext=By.id("ctl00_cphpage_btnNext");
	public WebElement getbtnNext() {
		return getElement(btnNext);
	}


	
	
	
	
	}
	
	

