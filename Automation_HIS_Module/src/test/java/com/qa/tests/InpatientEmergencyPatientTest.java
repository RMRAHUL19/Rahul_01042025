package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Inpatient_EmergencyPatientpages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class InpatientEmergencyPatientTest extends BaseTest {
public	InpatientEmergencyPatientTest() {
	
}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	Inpatient_EmergencyPatientpages inpatientemergencypatientpages;
	
	
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));	

	}
	
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"));
	}
	
	
	@Test(priority = 3)
	public void doNavigateToClinicalRecord_Inpatients_EmergencyPatients() throws InterruptedException {
		inpatientemergencypatientpages=hishomepage.doNavigateInpatientsEmergencyPatients();
		inpatientemergencypatientpages.testCaseforInpatientsEmergencyPatients();
		
	}
	
	
}
