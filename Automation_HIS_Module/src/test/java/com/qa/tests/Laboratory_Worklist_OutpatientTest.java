package com.qa.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Laboratory_Worklist_OutpatientPages;
import com.qa.pages.Loginpage;
import com.qa.pages.MiniCaseSheetPages;
import com.qa.pages.OPCaseSheetPage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Laboratory_Worklist_OutpatientTest extends BaseTest {
	public Laboratory_Worklist_OutpatientTest() {
		
	}
	util utilobj = new util();
	
	PatientCheckInPage patientcheckinpage;
	Loginpage loginpage;
	HomePage homepage;
	OPCaseSheetPage opcasesheetpage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
    MiniCaseSheetPages minicasesheetpages;
	Laboratory_Worklist_OutpatientPages laboratoryworklistoutpatientpages;
	public String checkinnumber="1199900090";
	public String SpecialisationName="ENT (Otorhinolaryngology)";
	public String orderpack_name="AutomationdummyOrderPack";
	public String check_innumber="OPGENE052100079";
 String checkINNUmber=null;
//	public String orderpack_name="AutomationdummyOrderPack";
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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityNameLABORATORYSERVICE"));
	}
//	@Test(priority = 3)
//	public void donavigateTolaboratoryTest() throws InterruptedException {
//		patientcheckinpage=hishomepage.doNavigateToPatientCheckIn();
//		patientcheckinpage.doPatientCheckIN(checkinnumber, SpecialisationName);
//		
//		checkINNUmber=patientcheckinpage.getPatientCheckinNumber();
//		opcasesheetpage=hishomepage.doNavigateToDoctorWorklistLink();
//	opcasesheetpage.doOpenCaseSheet(check_innumber);
//		opcasesheetpage.doCasesheetprecripstion(orderpack_name);
//
//
//		
//	}
//	@Test(priority = 4)
//	public void changeHospitalLocationTest() throws InterruptedException {
//		patientcheckinpage.changelocationfacility();
//		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityNameLABORATORYSERVICE"));
//
//		
//		
//		
//	}
	@Test(priority = 3)
	public void donavigatetoworklaboratory() throws InterruptedException {
		laboratoryworklistoutpatientpages=hishomepage.donavigatetoLaboratory();
		laboratoryworklistoutpatientpages.laboratorylink();
		laboratoryworklistoutpatientpages=hishomepage.donavigatetoLaboratory_sample_acknowladge_outpatient();
		laboratoryworklistoutpatientpages.laboratory_sample_acknowledgeall_outpatient();
		
		
		
		
	}

	
	
}
