package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OPCaseSheetPage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.PharmacyIssuePage;
import com.qa.pages.SelectHospitalLocationPage;

public class PharmacyIssuePageTest  extends BaseTest {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	PharmacyIssuePage pharmacyissuepage;
	OPCaseSheetPage opCaseSheetPage;
	PatientCheckInPage patientcheckInpage;
	@Test(priority =0,description = "Enter the User Name and Password And Click on Submit Button")
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}
	
	@Test(priority =1 ,description = "Namvigate to Hospital Location Page")
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2,description="Select Hospital Location and Facility ")
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("storefacility"));
	}
	
	
	@Test(priority = 3 ,description = "Naviagte to Patient Check In Number Screen")
	public void doNavigateToPatientCheckInTest() {

		patientcheckInpage = hishomepage.doNavigateToPatientCheckIn();
	}

	@Test(priority = 4,description = "Create the CheckIN in Patient CheckIn Screen")
	public void doPatientCheckINTest() {

		patientcheckInpage.doPatientCheckIN(prop.getProperty("IPNumber"), prop.getProperty("specialisationName"));

	}

	@Test(priority = 5,description = "Navigate to Doctor WorkList And Open CaseSheet")
	public void doNavigateToDoctorWorklistTest() throws InterruptedException {

		String txtcheckInNumber = patientcheckInpage.getPatientCheckinNumber();
		opCaseSheetPage = hishomepage.doNavigateToDoctorWorklistLink();
		// String txtcheckInNumber = "";
		opCaseSheetPage.doOpenCaseSheet(txtcheckInNumber);
		// doctorWorklistpage.doOpenCaseSheet(txtcheckInNumber);

	}

	@Test(priority = 6,description = "Select Casesheet Precription With Dummy Order pack")
	public void doCasesheetprecripstionTest() throws InterruptedException {

		opCaseSheetPage.doCasesheetprecripstion(prop.getProperty("orderpackname"));

	}

	
	@Test(priority =7,description = "Naviagate to Pharmacy Issue screen ")
	public void doNavigateToPharmacyIssueTest() {

		pharmacyissuepage = hishomepage.doNavigateToPharmacyIssueLink();
	}
	
		
	@Test(priority =8,description = "To check the functionality of Save Button")
	public void doPharmacyIssueTest() {

		pharmacyissuepage.doPharmacyIssue("1199900090");
		
	}
	
	
	
}
