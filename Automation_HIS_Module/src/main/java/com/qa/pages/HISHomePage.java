package com.qa.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.ExtentReporterNG;
import com.qa.util.ExtentReporterNG2;
import com.qa.util.util;

public class HISHomePage extends BasePage {

	util utilobj = new util();

	public HISHomePage(WebDriver driver) {
		super(driver);

	}

	/* Registration module */
	private By RegistrationLink = By.linkText("Registration");
	private By Link_UHID_to_IPNo = By.linkText("Link UHID to IP No");
	private By Investigation_Prescriptions = By.linkText("Investigation Prescriptions");
	private By Clinical_Record_Reports = By.linkText("Clinical Records Reports");	
	

	/* Patient CheckIn */
	private By PatientCheckInLink = By.linkText("Patient Check-In /Registration");

	private By PatientAdmissionLink = By.linkText("Patient Admission");

	private By CancelCheckinLink = By.linkText("Cancel Check-in");

	private By ClinicalRecordsLink = By.linkText("Clinical Records");

	private By DoctorWorklistLink = By.linkText("Doctor Worklist");

	private By InpatientsEmergencyLink = By.linkText("Inpatients/Emergency Patients");
	private By UHIDcreationLink = By.linkText("UHID Creation");
	/*clinical record*/
	private By CertificateGenerationLink=By.linkText("Certificate Generation");
	private By MaternitycertificategenrationLink=By.linkText("Maternity Certificate");
	private By Inpatients_EmergencyPatientsLink=By.linkText("Inpatients/Emergency Patients");
	private By OpenVisit=By.linkText("Open Visits");
	private By DosageType=By.linkText("DosageTypes");
	private By EditCertificate=By.linkText("Edit Certificate");
	private By EditMaternityCertificate=By.linkText("Edit Maternity Certificate");
	

	private By BedstatusLink = By.linkText("Bed Status");

	private By CDRLink = By.linkText("CDR");

	private By PatientFolderLink = By.linkText("Patient Folder");
	

	/* OT module */

	private By OTandResourceSchedulingLink = By.linkText("OT and Resource Scheduling");

	private By ViewOTListLink = By.linkText("View OT List");
	private By Operative_OTnotesLink = By.linkText("Operative/OT notes");
	private By OTPrescriptionLink=By.linkText("OTPrescription");
	

	/* Imaging module */

	private By ImagingServicesLink = By.linkText("IMAGING SERVICES");

	private By ImagingWorklistLink = By.linkText("Worklist");

	// Store

	private By StoreLinks = By.linkText("Stores");

	private By PharmacyIssueLink = By.linkText("Pharmacy Issues");

	private By PhysicalStockEntryLink = By.linkText("Physical Stock Entry");

	private By AdjustmentsLink = By.linkText("Adjustments");
	private By LossBreakageLink = By.linkText("Loss & Breakage");
	private By StoreConsumptionLink = By.linkText("Store Consumption"); 

	private By IndentOrderLink = By.linkText("Indent Raise"); 
	
	private By IndentWorklistLink = By.linkText("Indent Work list");  

	private By IndentIssuesWOOrderLink = By.linkText("Indent Issues WO Order");
	private By DownloadCRCItemList = By.linkText("Download CRC Item List");
	private By IndentIssueWithoutOrder = By.linkText("Indent Issues WO Order");
	private By Health_Passbook = By.linkText("Health Passbook");
	private By Registration_Report = By.linkText("Registration Reports");
	private By OP_Patient_Feedback = By.linkText("OP Patient Feedback");
	private By UpdateDemographyDetail = By.linkText("Update Demographic Details");
	private By SynINSdataToHIS = By.linkText("Sync Insurance Data to HIS");
	
 	public WebElement getHealth_Passbook() {
 		return getElement(Health_Passbook);
 	}
 	public WebElement getLink_UHID_to_IPNo() {
 		return getElement(Link_UHID_to_IPNo);
 	}
 	public WebElement getRegistration_Report() {
 		return getElement(Registration_Report);
 	}
 	public WebElement getOP_Patient_Feedback() {
 		return getElement(OP_Patient_Feedback);
 	}
 	public WebElement getUpdateDemographyDetail() {
 		return getElement(UpdateDemographyDetail);
 	}
 	public WebElement getSynINSdataToHIS() {
 		return getElement(SynINSdataToHIS);
 	}
 	
 	
	/*purchase*/
	private By PurchaseLink = By.linkText("Purchase");
	public WebElement getPurchaseLink() {
		return getElement(PurchaseLink);
	}
	public WebElement getIndentIssueWithoutOrder() {
		return getElement(IndentIssueWithoutOrder);
	}

	private By SupplierLink = By.linkText("Supplier");
	public WebElement getSupplierLink() {
		return getElement(SupplierLink);
	}
	
	
	public WebElement getDownloadCRCItemList() {
		return getElement(DownloadCRCItemList);
	}
	private By AlterMRPLink = By.linkText("Alter MRP");
	public WebElement getAlterMRPLink() {
		return getElement(AlterMRPLink);
	}
	/*Laboratory*/
	private By Laboratory=By.linkText("Laboratory");
	public WebElement getLaboratoryLink() {
		return getElement(Laboratory);
	}
	private By Lab_Worklist=By.linkText("Lab Worklist");
	public WebElement getLab_WorklistLink() {
		return getElement(Lab_Worklist);
	}
	private By sample_acknowladge_outpatient=By.linkText("Sample Acknowledge - Outpatient");
	public WebElement getsample_acknowladge_outpatientLink() {
		return getElement(sample_acknowladge_outpatient);
	}
	private By Laboratory_Test_Wise_Result_Entry=By.linkText("Testwise Results Entry - Lab");
	public WebElement getLaboratory_Test_Wise_Result_Entry() {
		return getElement(Laboratory_Test_Wise_Result_Entry);
	}
	private By Laboratory_Bulk_Result_Entry_screen=By.linkText("Bulk Result Entry");
	public WebElement getLaboratory_Bulk_Result_Entry_screenLink() {
		return getElement(Laboratory_Bulk_Result_Entry_screen);
	}
	private By Laboratory_Sample_Acknowledge_Inpatient=By.linkText("Sample Acknowledge - Inpatient");
	public WebElement getLaboratory_Sample_Acknowledge_InpatientLink() {
		return getElement(Laboratory_Sample_Acknowledge_Inpatient);
	}
	private By Laboratory_Bulk_Result_verification=By.linkText("Bulk Results Verification");
	public WebElement getLaboratory_Bulk_Result_verificationLink() {
		return getElement(Laboratory_Bulk_Result_verification);
	}
	private By Laboratory_Group_Printing_Inpatient=By.linkText("Group Printing - Inpatient");
	public WebElement getLaboratory_Group_Printing_InpatientLink() {
		return getElement(Laboratory_Group_Printing_Inpatient);
	}
	private By Laboratory_Dispatch_Report_inpatient=By.linkText("Dispatch Reports - Inpatient");
	public WebElement getLaboratory_Dispatch_Report_inpatientLink() {
		return getElement(Laboratory_Dispatch_Report_inpatient);
	}
	private By Laboratory_Prescription=By.linkText("Prescription");
	public WebElement getLab_Prescription() {
		return getElement(Laboratory_Prescription);
	}
	
	
	/*end of laboratory*/
	/*medical record*/
	private By Medical_Record=By.linkText("Medical Records");
	public WebElement getMedical_Record() {
		return getElement(Medical_Record);

	}
	private By Medical_BirthRegister=By.linkText("Birth Register");
	public WebElement getMedical_BirthRegister() {
		return getElement(Medical_BirthRegister);
	}
	private By Medical_DeathRecord=By.linkText("Death Record");
	public WebElement getMedical_DeathRecord() {
		return getElement(Medical_DeathRecord);
	}
	/*end medical record*/
	/*CSSD start*/
	private By CSSD=By.linkText("CSSD");
	public WebElement getCSSD() {
		return getElement(CSSD);
	}
	private By CSSD_SterilizationRequest=By.linkText("SterilizationRequest");
	public WebElement getCSSD_SterilizationRequest() {
		return getElement(CSSD_SterilizationRequest);
	}
	private By CSSD_Sterilization=By.linkText("Sterilization");
	public WebElement getCSSD_Sterilization() {
		return getElement(CSSD_Sterilization);
	}
	private By CSSD_SterilizationRequestworkList=By.linkText("SterilizationRequestWorkList");
	public WebElement getCSSD_SterilizationRequestworkList() {
		return getElement(CSSD_SterilizationRequestworkList);
	}
	private By CSSD_SterilizationReceiptworkList=By.linkText("SterilizationReceiptsWorkList");
	public WebElement getCSSD_SterilizationReceiptworkList() {
		return getElement(CSSD_SterilizationReceiptworkList);
	}
	private By CSSD_ItemRequest=By.linkText("CSSDItemRequest");
	public WebElement getCSSD_ItemRequest() {
		return getElement(CSSD_ItemRequest);
	}
	private By CSSD_ItemRequestworklist=By.linkText("ItemRequestWorkList");
	public WebElement getCSSD_ItemRequestworklist() {
		return getElement(CSSD_ItemRequestworklist);
	}
	
	
	/* CSSD end*/

	public WebElement getInpatients_EmergencyPatientsLink() {
		return getElement(Inpatients_EmergencyPatientsLink);

	}
	
	
	public WebElement getIndentIssuesWOOrderLink() {
		return getElement(IndentIssuesWOOrderLink);

	}
	
	
	public WebElement getIndentWorklistLink() {
		return getElement(IndentWorklistLink);

	}
	
	
	public WebElement getIndentOrderLink() {
		return getElement(IndentOrderLink);

	}

	
	public WebElement getRegistrationLink() {
		return getElement(RegistrationLink);

	}

	public WebElement getPatientCheckInLink() {
		return getElement(PatientCheckInLink);

	}

	public WebElement getPatientAdmissionLink() {
		return getElement(PatientAdmissionLink);

	}

	public WebElement getCancelCheckinLink() {
		return getElement(CancelCheckinLink);

	}

	public WebElement getClinicalRecordsLink() {
		return getElement(ClinicalRecordsLink);

	}

	public WebElement getDoctorWorklistLink() {
		return getElement(DoctorWorklistLink);

	}

	public WebElement getInpatientsEmergencyLink() {
		return getElement(InpatientsEmergencyLink);

	}

	public WebElement getCDRLink() {
		return getElement(CDRLink);

	}

	public WebElement getPatientFolderLink() {
		return getElement(PatientFolderLink);

	}

	public WebElement getOTandResourceSchedulingLink() {
		return getElement(OTandResourceSchedulingLink);

	}

	public WebElement getViewOTListLink() {
		return getElement(ViewOTListLink);

	}

	public WebElement getBedstatusLink() {
		return getElement(BedstatusLink);

	}

	public WebElement getUHIDcreationLink() {
		return getElement(UHIDcreationLink);

	}

	public WebElement getImagingServicesLink() {
		return getElement(ImagingServicesLink);

	}

	public WebElement getImagingWorklistLink() {
		return getElement(ImagingWorklistLink);

	}

	public WebElement getStoreLinks() {
		return getElement(StoreLinks);

	}

	public WebElement getPharmacyIssueLink() {
		return getElement(PharmacyIssueLink);

	}

	public WebElement getPhysicalStockEntryLink() {
		return getElement(PhysicalStockEntryLink);

	}

	public WebElement getAdjustmentsLink() {
		return getElement(AdjustmentsLink);

	}

	public WebElement getLossBreakageLink() {
		return getElement(LossBreakageLink);

	}

	public WebElement getStoreConsumptionLink() {
		return getElement(StoreConsumptionLink);

	}
	public WebElement getCertificateGeneration() {
		return getElement(CertificateGenerationLink);
		

	}
	public WebElement getEditCertificate() {
		return getElement(EditCertificate);
		

	}
	
	public WebElement getEditMaternityCertificate() {
		return getElement(EditMaternityCertificate);
		

	}
	
	public WebElement getMaternitycertificategenrationLink() {
		return getElement(MaternitycertificategenrationLink);
	}
	public WebElement getOperative_OTnotesLink() {
		return getElement(Operative_OTnotesLink);
	}
	public WebElement getOTPrescriptionLink() {
		return getElement(OTPrescriptionLink);
	}
	public WebElement getOpenVisit() {
		return getElement(OpenVisit);
	}
	public WebElement getDosageType() {
		return getElement(DosageType);
	}
	public WebElement getInvestigation_Prescriptions() {
		return getElement(Investigation_Prescriptions);
	}
	
	
	
	/*Laboratory*/
	public PatientCheckInPage donavigatetodoctorworklist() {
		utilobj.MoveElement(getClinicalRecordsLink(), driver);
		getDoctorWorklistLink().click();
		return new PatientCheckInPage(driver);
	}
	public DoctorWorklistPage donavigatetoDoctorworklist() {
		utilobj.MoveElement(getClinicalRecordsLink(), driver);
		getDoctorWorklistLink().click();
		return new DoctorWorklistPage(driver);
	}
	public OPDFlowPages donavigatetodoctorworklistOPDFlowPageLINK() {
		utilobj.MoveElement(getLaboratoryLink(), driver);
		getLab_WorklistLink().click();	
				return new OPDFlowPages(driver);
	}
	public OPDFlowPageswait donavigatetodoctorworklistOPDFlowwaitPageLINK() {
		utilobj.MoveElement(getLaboratoryLink(), driver);
		getLab_WorklistLink().click();	
				return new OPDFlowPageswait(driver);
	}
	public Laboratory_Worklist_OutpatientPages donavigatetoLaboratory() {
		utilobj.MoveElement(getLaboratoryLink(), driver);
		getLab_WorklistLink().click();
		return new Laboratory_Worklist_OutpatientPages(driver);
	}
	public Laboratory_Worklist_OutpatientPages donavigatetoLaboratory_sample_acknowladge_outpatient() {
		utilobj.MoveElement(getLaboratoryLink(), driver);
		getsample_acknowladge_outpatientLink().click();
		return new Laboratory_Worklist_OutpatientPages(driver);
	}
	public Laboratory_TestResultEntryPages doNavigatetoLaboratory_Testwise_Result_Entry() {
		utilobj.MoveElement(getLaboratoryLink(), driver);
		getLaboratory_Test_Wise_Result_Entry().click();
		return new Laboratory_TestResultEntryPages(driver);
	}
	public BulkResultEntryScreenPages doNavigatetoLaboratory_Bulk_Result_Screen() {
		utilobj.MoveElement(getLaboratoryLink(), driver);
		getLaboratory_Bulk_Result_Entry_screenLink().click();
		return new BulkResultEntryScreenPages(driver);
	}
	public Laboratory_WorklistInpatientPages donavigatetoLaboratoryInpatient() {
		utilobj.MoveElement(getLaboratoryLink(), driver);
		getLab_WorklistLink().click();
		return new Laboratory_WorklistInpatientPages(driver);
	}
	public Laboratory_Sample_acknowledge_inpatient_Pages donavigatetoLaboratory_Sample_acknowledge_inpatient() {
		utilobj.MoveElement(getLaboratoryLink(), driver);
		getLaboratory_Sample_Acknowledge_InpatientLink().click();
		return new Laboratory_Sample_acknowledge_inpatient_Pages(driver);
		
		
	}
	public Laboratory_Bulk_Result_verification_Pages donavigatetoLaboratory_Bulk_Result_verification() {
		utilobj.MoveElement(getLaboratoryLink(), driver);
		getLaboratory_Bulk_Result_verificationLink().click();
		return new Laboratory_Bulk_Result_verification_Pages(driver);
		
	}
	public Laboratory_Group_Printing_Inpatient_Pages donavigatetoLaboratory_Group_Printing_Inpatient() {
		utilobj.MoveElement(getLaboratoryLink(), driver);
		getLaboratory_Group_Printing_InpatientLink().click();
		return new Laboratory_Group_Printing_Inpatient_Pages(driver);
		
	}
	public Laboratory_Dispatch_Report_Inpatient_Pages donavigatetoLaboratory_Dispatch_Report_Inpatient() {
		utilobj.MoveElement(getLaboratoryLink(), driver);
		getLaboratory_Dispatch_Report_inpatientLink().click();
		return new Laboratory_Dispatch_Report_Inpatient_Pages(driver);
		
	}
	public LaboratoryPrescriptionPages donavigatetolaboratoryprescriptiontest() {
        utilobj.MoveElement(getLaboratoryLink(), driver);
        getLab_Prescription().click();
    return new LaboratoryPrescriptionPages(driver);
}
	
	
	/*end of Laboratory*/
	public PatientCheckInPage doNavigateToPatientCheckIn() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getPatientCheckInLink().click();

		return new PatientCheckInPage(driver);

	}
	public ANMServicesPage doNavigateToPatientCheckInforANMServices() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getPatientCheckInLink().click();

		return new ANMServicesPage(driver);

	}
	public PatientCheckInPageforIMGServices doNavigateToPatientCheckInforIMGServices() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getPatientCheckInLink().click();

		return new PatientCheckInPageforIMGServices(driver);

	}
	public DoctorWorklistPage doNavigateToPatientCheckInforDoctorWorklist() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getPatientCheckInLink().click();

		return new DoctorWorklistPage(driver);

	}
	public MiniCaseSheetPages doNavigateToPatientCheckInForMinicasesheet() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getPatientCheckInLink().click();

		return new MiniCaseSheetPages(driver);

	}
	public OPCaseSheetPage doNavigateToPatientCheckInForOPcasesheet() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getPatientCheckInLink().click();

		return new OPCaseSheetPage(driver);

	}
	 //health passbook
	     public Health_PassBook_Pages donavigatetoHealth_PassBook_Pages() {
	    	 utilobj.MoveElement(getRegistrationLink(), driver);
	    	 getHealth_Passbook().click();
	    	 return new Health_PassBook_Pages(driver);
	     }
	     //get UHID Link to IP number
	   
	     public LinkUHIDtoIP_NoPages donavigatetoLinkUHIDtoIP_NoPages() {
	    	 utilobj.MoveElement(getRegistrationLink(), driver);
	    	 getLink_UHID_to_IPNo().click();
	    	 return new LinkUHIDtoIP_NoPages(driver);
	     }
	     //Registration report
	     public Registration_ReportPages donavigatetoRegistration_Report() {
	    	 utilobj.MoveElement(getRegistrationLink(), driver);
	    	 getRegistration_Report().click();
	    	 return new Registration_ReportPages(driver);
	     }//op patient patient feedback
	     public getOP_Patient_FeedbackPages donavigatetoOP_Patient_Feedback() {
	    	 utilobj.MoveElement(getRegistrationLink(), driver);
	    	 getOP_Patient_Feedback().click();
	    	 return new getOP_Patient_FeedbackPages(driver);
	     }
	     public getdemographicDetailPages donavigatetoUpdateDemographicDetail() {
	    	 utilobj.MoveElement(getRegistrationLink(), driver);
	    	 getUpdateDemographyDetail().click();
	    	 return new getdemographicDetailPages(driver);
	     }
	     public getSynInsurancedataToHISPages donavigatetoSynInsuranceDataToHis() {
	    	 utilobj.MoveElement(getRegistrationLink(), driver);
	    	 getSynINSdataToHIS().click();
	    	 return new getSynInsurancedataToHISPages(driver);
	     }
	     
	public PatientAdmissionPage doNavigateToPatientAdmission() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getPatientAdmissionLink().click();

		return new PatientAdmissionPage(driver);
	}

	public CancelCheckinPage doNavigateToCancelCheckinLink() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getCancelCheckinLink().click();

		return new CancelCheckinPage(driver);
	}
	public MiniCaseSheetPages doNavigateToDoctorWorklistLinkforMiniCaseSheet() {
		utilobj.MoveElement(getClinicalRecordsLink(), driver);

		getDoctorWorklistLink().click();

		return new MiniCaseSheetPages(driver);
	}

	public OPCaseSheetPage doNavigateToDoctorWorklistLink() {
		utilobj.MoveElement(getClinicalRecordsLink(), driver);

		getDoctorWorklistLink().click();

		return new OPCaseSheetPage(driver);
	}
	public ImagingWorkListOPPage doNavigateToDoctorWorklistforimagingLink() {
		utilobj.MoveElement(getClinicalRecordsLink(), driver);

		getDoctorWorklistLink().click();

		return new ImagingWorkListOPPage(driver);
	}
	public CertificationGenrationpages doNavigateTogenrateCheckInLinkforcertificationGenration() {
		utilobj.MoveElement(getRegistrationLink(),driver);

		getPatientCheckInLink().click();

		return new CertificationGenrationpages(driver);
	}
	public CertificationGenrationpages doNavigateCertificateGenerationLink() {
		utilobj.MoveElement(getClinicalRecordsLink(), driver);

		getCertificateGeneration().click();

		return new CertificationGenrationpages(driver);
	}
	public MaternityCertificatepages doNavigatematernitycertificagte()
	{
		utilobj.MoveElement(getClinicalRecordsLink(), driver);
		getMaternitycertificategenrationLink().click();
		return new MaternityCertificatepages(driver);
	}
	public Inpatient_EmergencyPatientpages doNavigateInpatientsEmergencyPatients()
	{
		utilobj.MoveElement(getClinicalRecordsLink(), driver);
		getInpatients_EmergencyPatientsLink().click();
		return new Inpatient_EmergencyPatientpages(driver);
	}
	
	public IPCaseSheetPrescriptionPage doNavigateToInpatientEmergencyLink() {
		utilobj.MoveElement(getClinicalRecordsLink(), driver);

		getInpatientsEmergencyLink().click();

		return new IPCaseSheetPrescriptionPage(driver);
	}
	public OpenVisitPage doNavigateToOpenVisitPageLink() {
		utilobj.MoveElement(getClinicalRecordsLink(), driver);

		getOpenVisit().click();

		return new OpenVisitPage(driver);
	}
	public OpenVisitPage doNavigateToDosageTypePageLink() {
		utilobj.MoveElement(getClinicalRecordsLink(), driver);

		getDosageType().click();

		return new OpenVisitPage(driver);
	}
	public EditCertificatePage doNavigateToEditCertificatePageLink() {
		utilobj.MoveElement(getClinicalRecordsLink(), driver);

		getEditCertificate().click();

		return new EditCertificatePage(driver);
	}

	public EditCertificatePage doNavigateToEditMaternityCertificatePageLink() {
		utilobj.MoveElement(getClinicalRecordsLink(), driver);

		getEditMaternityCertificate().click();

		return new EditCertificatePage(driver);
	}

	public CDRPage doNavigateToCDRLink() {
		utilobj.MoveElement(getCDRLink(), driver);

		getPatientFolderLink().click();

		return new CDRPage(driver);
	}

	public OTandResourceSchedulingPage doNavigateToOTandResourceSchedulingLink() {

		utilobj.MoveElement(getOTandResourceSchedulingLink(), driver);

		getViewOTListLink().click();

		return new OTandResourceSchedulingPage(driver);

	}

	public BedStatusPage doNavigateToBedStatusLink() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getBedstatusLink().click();

		return new BedStatusPage(driver);

	}

	public UHIDPage doNavigateToUHIDcreationLink() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getUHIDcreationLink().click();

		return new UHIDPage(driver);

	}
//	public UHIDPageTestStaging doNavigateToUHIDcreationFORStagingLink() {
//		utilobj.MoveElement(getRegistrationLink(), driver);
//
//		getUHIDcreationLink().click();
//
//		return new UHIDPageTestStaging(driver);
//
//	}
	/*UHIDFLOW*/
	public OPDFlowPages doNavigateToPatientCheck_InforOPDFLowLink() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getPatientCheckInLink().click();

		return new OPDFlowPages(driver);

	}
	public OPDFlowPageswait doNavigateToUHIDcreationforOPDFLowwaitLink() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getUHIDcreationLink().click();

		return new OPDFlowPageswait(driver);

	}
	public IPDFlowPages doNavigateToUHIDcreationforIPDFLowLink() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getPatientAdmissionLink().click();

		return new IPDFlowPages(driver);

	}

	public ImagingWorkListOPPage doNavigateToImagingWorklistOPLink() {
		utilobj.MoveElement(getImagingServicesLink(), driver);

		getImagingWorklistLink().click();

		return new ImagingWorkListOPPage(driver);

	}
	public OPDFlowPages doNavigateToImagingWorklistOforOPDFlowPages() {
		utilobj.MoveElement(getImagingServicesLink(), driver);

		getImagingWorklistLink().click();

		return new OPDFlowPages(driver);

	}
	public OPDFlowPageswait doNavigateToImagingWorklistOforOPDFlowPagesWait() {
		utilobj.MoveElement(getImagingServicesLink(), driver);

		getImagingWorklistLink().click();

		return new OPDFlowPageswait(driver);

	}

	public ImagingWorkListIPPage doNavigateToImagingWorklistIPLink() {
		utilobj.MoveElement(getImagingServicesLink(), driver);

		getImagingWorklistLink().click();

		return new ImagingWorkListIPPage(driver);

	}

	public PharmacyIssuePage doNavigateToPharmacyIssueLink() {

		utilobj.MoveElement(getStoreLinks(), driver);

		getPharmacyIssueLink().click();

		return new PharmacyIssuePage(driver);

	}

	public PhysicalStockEntryPage doNavigateToPhysicalStockEntryLink() {

		utilobj.MoveElement(getStoreLinks(), driver);

		getPhysicalStockEntryLink().click();

		return new PhysicalStockEntryPage(driver);

	}

	public AdjustmentLBStoreConsumptionPage doNavigateAdjustmentLink() {

		utilobj.MoveElement(getStoreLinks(), driver);

		getAdjustmentsLink().click();

		return new AdjustmentLBStoreConsumptionPage(driver);

	}

	public AdjustmentLBStoreConsumptionPage doNavigateLossBreakageLink() {

		utilobj.MoveElement(getStoreLinks(), driver);

		getLossBreakageLink().click();

		return new AdjustmentLBStoreConsumptionPage(driver);

	}
	
	public AdjustmentLBStoreConsumptionPage doNavigateStoreConsumptionLink() {

		utilobj.MoveElement(getStoreLinks(), driver);

		getStoreConsumptionLink().click();

		return new AdjustmentLBStoreConsumptionPage(driver);

	}
	
	public IndentOrderPage doNavigateIndentOrderLink() {

		utilobj.MoveElement(getStoreLinks(), driver);

		getIndentOrderLink().click();

		return new IndentOrderPage(driver);

	}
	
	public IndentIssueWithoutOrderPage  doNavigateIndentIssuesWOOrderLink () {

		utilobj.MoveElement(getStoreLinks(), driver);

		getIndentIssuesWOOrderLink().click();

		return new IndentIssueWithoutOrderPage(driver);

	}

	public IndentWorkListPage doNavigateIndentWorkListLink() {

		utilobj.MoveElement(getStoreLinks(), driver);

		getIndentWorklistLink().click();

		return new IndentWorkListPage(driver);

	}
	

	public AlterMRPPage doNavigateAlterMRPLink() {

		utilobj.MoveElement(getStoreLinks(), driver);

		getAlterMRPLink().click();

		return new AlterMRPPage(driver);

	}
	/*end of laboratory*/
	/* medical record*/
	public Medical_Birth_Registration_Pages donavigatetoMedical_Birth_Registration_Pages() {
		utilobj.MoveElement(getMedical_Record(), driver);
		getMedical_BirthRegister().click();
		return new Medical_Birth_Registration_Pages(driver);
	}
	public Medical_Death_Record_Pages donavigatetoMedical_Death_Record_Pages() {
		utilobj.MoveElement(getMedical_Record(), driver);
		getMedical_DeathRecord().click();
		return new Medical_Death_Record_Pages(driver);
	}
	/* End medical record*/
	/*CSSD Start*/
	public CSSD_SterilizationRequest_Pages donavigatetoCSSD_SterilizationRequest_Pages() {
		utilobj.MoveElement(getCSSD(), driver);
		getCSSD_SterilizationRequest().click();
		return new CSSD_SterilizationRequest_Pages(driver);
	}
	public CSSD_SterilizationRequest_Pages donavigatetoCSSD_SterilizationRequestworkList_Pages() {
		utilobj.MoveElement(getCSSD(), driver);
		getCSSD_SterilizationRequestworkList().click();
		return new CSSD_SterilizationRequest_Pages(driver);
	}
	public CSSD_Sterilization_Pages donavigatetoCSSD_Sterilization_Pages() {
		utilobj.MoveElement(getCSSD(), driver);
		getCSSD_Sterilization().click();
		return new CSSD_Sterilization_Pages(driver);
	}
	public CSSD_Sterilization_Pages donavigatetoCSSD_SterilizationRequestworkListafter_Pages() {
		utilobj.MoveElement(getCSSD(), driver);
		getCSSD_SterilizationRequestworkList().click();
		return new CSSD_Sterilization_Pages(driver);
	}
	public CSSD_Sterilizationrecepiet_Pages donavigatetoCSSD_SterilizationRecepitworkListafter_Pages() {
		utilobj.MoveElement(getCSSD(), driver);
		getCSSD_SterilizationReceiptworkList().click();
		return new CSSD_Sterilizationrecepiet_Pages(driver);
	}
	public CSSD_ItemRequest_Pages donavigatetoCSSD_ItemRequest_Pages() {
		utilobj.MoveElement(getCSSD(), driver);
		getCSSD_ItemRequest().click();
		return new CSSD_ItemRequest_Pages(driver);
	}
	public CSSD_ItemRequestworklist_Pages donavigatetoCSSD_ItemRequestworklist_Pages() {
		utilobj.MoveElement(getCSSD(), driver);
		getCSSD_ItemRequestworklist().click();
		return new CSSD_ItemRequestworklist_Pages(driver);
	}
	private By CSSD_Itemrecieptworklist=By.linkText("ItemReceiptsWorklist");
	public WebElement getCSSD_Itemrecieptworklist() {
		return getElement(CSSD_Itemrecieptworklist);
	}
	public CSSD_ItemRecieptworklist_Pages donavigatetoCSSD_ItemRecieptworklist_Pages() {
		utilobj.MoveElement(getCSSD(), driver);
		getCSSD_Itemrecieptworklist().click();
		return new CSSD_ItemRecieptworklist_Pages(driver);
	}
	private By CSSD_ItemProfileRequest=By.linkText("ItemProfileRequest");
	public WebElement getCSSD_ItemProfileRequest() {
		return getElement(CSSD_ItemProfileRequest);
	}
	public CSSD_ItemProfileRequest_pages donavigatetoCSSD_profileRequest_Pages() {
		utilobj.MoveElement(getCSSD(), driver);
		getCSSD_ItemProfileRequest().click();
		return new CSSD_ItemProfileRequest_pages(driver);
	}
	private By SterilizationReceiptWorklist=By.linkText("SterilizationReceiptsWorkList");
	public WebElement getSterilizationReceiptWorklist() {
		return getElement(SterilizationReceiptWorklist);
	}
	public SterilizationReceiptWorklist_Pages donavigatetoSterilizationReceiptWorklist_Pages() {
		utilobj.MoveElement(getCSSD(), driver);
		getSterilizationReceiptWorklist().click();
		return new SterilizationReceiptWorklist_Pages(driver);
	}
	private By ReturnReciept=By.linkText("ReturnReceipts");
	public WebElement getReturnReciept() {
		return getElement(ReturnReciept);
	}
	public ReturnReceipts_Pages donavigatetoReturnReceipts_Pages() {
		utilobj.MoveElement(getCSSD(), driver);
		getReturnReciept().click();
		return new ReturnReceipts_Pages(driver);
	}
	private By Emergency_Check_In_Registration  = By.linkText("Emergency Check-In / Registration");
	
	public WebElement getEmergency_Check_In_Registration() {
		return getElement(Emergency_Check_In_Registration);

	}/*bad m module add kiye h */
	public Emergency_Check_In_RegistrationPages donavigateToEmergency_Check_In_Registration() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getEmergency_Check_In_Registration().click();

		return new Emergency_Check_In_RegistrationPages(driver);
	}
private By Check_In_Admission_of_Reffered_Patients  = By.linkText("Check-In / Admission of Reffered Patients");
	
	public WebElement getCheck_In_Admission_of_Reffered_Patients() {
		return getElement(Check_In_Admission_of_Reffered_Patients);

	}/*bad m module add kiye h */
	public Check_In_Admission_of_Reffered_PatientsPages donavigateToCheck_In_Admission_of_Reffered_Patients() {
		utilobj.MoveElement(getRegistrationLink(), driver);

		getCheck_In_Admission_of_Reffered_Patients().click();

		return new Check_In_Admission_of_Reffered_PatientsPages(driver);
	}
	/*gulshan mirza module*/
	 private By DischargeSummaryLink=By.linkText("Discharge Summary");

     private By DischargeIntimationLink=By.linkText("Discharge Intimation");
             
     private By ANMServicesLink = By.linkText("ANM Service");  

     private By FUPPageLink = By.linkText("Frequently Used packs");  
     
     private By OrderPacksPageLink=By.linkText("Order Packs");

     public WebElement getDischargeSummaryLink() {
             return getElement(DischargeSummaryLink);

     }
     
     public WebElement getDischargeIntimationLink() {
             return getElement(DischargeIntimationLink);

     }

private WebElement getANMServicesPageLink() {
             return getElement(ANMServicesLink);

     }
     
     private WebElement getFUPPageLink() {
             return getElement(FUPPageLink);
     }
     
     private WebElement getOrderPacksPageLink() {
             return getElement(OrderPacksPageLink);
     }

public DischargeSummaryPage doNavigateToDischargeSummaryLink() {
             utilobj.MoveElement(getClinicalRecordsLink(), driver);

             getDischargeSummaryLink().click();

             return new DischargeSummaryPage(driver);
     }

public DischargeIntimationPage doNavigateToDischargeIntimationLink() {
             
             utilobj.MoveElement(getClinicalRecordsLink(), driver);

             getDischargeIntimationLink().click();

             return new DischargeIntimationPage(driver);
     }
public Investigation_PrescriptionsPage doNavigateTogetInvestigation_PrescriptionsLink() {
    
    utilobj.MoveElement(getClinicalRecordsLink(), driver);

    getInvestigation_Prescriptions().click();

    return new Investigation_PrescriptionsPage(driver);
}



     public ANMServicesPage doNavigateTogetANMServicesPageLink() {
             utilobj.MoveElement(getClinicalRecordsLink(), driver);

             getANMServicesPageLink().click();

             return new ANMServicesPage(driver);
     }


     public FUPPage doNavigateToFUP() {
             utilobj.MoveElement(getClinicalRecordsLink(), driver);

             getFUPPageLink().click();

             return new FUPPage(driver);
     }


     public OrderPacksPage doNavigateToOrderPacks() {
             utilobj.MoveElement(getClinicalRecordsLink(), driver);

             getOrderPacksPageLink().click();

             return new OrderPacksPage(driver);
     }
     private WebElement getClinical_Record_ReportsLink() {
         return getElement(Clinical_Record_Reports);
 }
     public Clinical_Record_ReportPages doNavigateToClinical_Record_Reports() {
         utilobj.MoveElement(getClinicalRecordsLink(), driver);

         getClinical_Record_ReportsLink().click();

         return new Clinical_Record_ReportPages(driver);
 }
     /*store A*/
     public DownloadCRCItemListpage donavigateToDownloadCRCItemList() {
    	 utilobj.MoveElement(getStoreLinks(), driver);
    	 
    	 getDownloadCRCItemList().click();
    	 return new DownloadCRCItemListpage(driver);
     }
	
	/*opration threter*/
     public OperationTheatrePage doNavigateToUHIDcreationOperationtheartreLink() {
 		utilobj.MoveElement(getRegistrationLink(), driver);

 		getPatientCheckInLink().click();

 		return new OperationTheatrePage(driver);

 	}
     public OToprative_OTNotesPages doNavigateTooprativeOTNoteLink() {
  		utilobj.MoveElement(getOTandResourceSchedulingLink(), driver);

  		getOperative_OTnotesLink().click();

  		return new OToprative_OTNotesPages(driver);

  	}
     public OTPriscriptionPages doNavigateToOTPrescriptionLink() {
   		utilobj.MoveElement(getOTandResourceSchedulingLink(), driver);

   		getOTPrescriptionLink().click();

   		return new OTPriscriptionPages(driver);

   	}
     public SupplierManufactureBrandPages doNavigateToSupplierManufactureBrandLink() {
    		utilobj.MoveElement(getPurchaseLink(), driver);

    		getSupplierLink().click();

    		return new SupplierManufactureBrandPages(driver);

    	}
     private By InpatientReferralWorklistLink = By.linkText("Inpatient referral worklist");
 	public WebElement getInpatientReferralWorklistLink() {
 		return getElement(InpatientReferralWorklistLink);
 	}
     public InpatientReferralWorklistPages doNavigateToInpatientReferralWorklistLink() {
 		utilobj.MoveElement(getClinicalRecordsLink(), driver);

 		getInpatientReferralWorklistLink().click();

 		return new InpatientReferralWorklistPages(driver);

 	}
     public ImagingWorkListIPPage donavigatetoInpatientEmergencyPatientforImaginservices() {
    	 utilobj.MoveElement(getClinicalRecordsLink(), driver);
    	 getInpatients_EmergencyPatientsLink().click();
    	 return new ImagingWorkListIPPage(driver);
     }// ImpactOnHis_Ins_Uhid_CreationPage
     public ImpactOnHis_Ins_Uhid_CreationPage donavigatetoUhidCreationforImpactOnHis_Ins_Uhid_CreationPage() {
    	 utilobj.MoveElement(getRegistrationLink(), driver);
    	getUHIDcreationLink().click();
    	 return new ImpactOnHis_Ins_Uhid_CreationPage(driver);
     }// for health passbook

 	
    
}
