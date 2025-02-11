package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Laboratory_Sample_acknowledge_inpatient_Pages;
import com.qa.pages.Loginpage;
import com.qa.pages.OPCaseSheetPage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Laboratory_Sample_acknowledge_inpatientTest extends BaseTest {
	 public Laboratory_Sample_acknowledge_inpatientTest() {
		 
	 }
	 util utilobj = new util();
		PatientCheckInPage patientcheckinpage;
		Loginpage loginpage;
		HomePage homepage;
		OPCaseSheetPage opcasesheetpage;
		SelectHospitalLocationPage selecthospitallocationpage;
		HISHomePage hishomepage;
		Laboratory_Sample_acknowledge_inpatient_Pages LaboratorySampleacknowledgeinpatientPages;
	 
	 @Test(priority =0)
		public void doLoginTest() {

			loginpage = new Loginpage(driver);

			homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));	

		}
		
		
		@Test(priority =1)
		public void doNavigateToSelectHospitalLocationTest() {

			selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
		}
		@Test(priority = 4)
		public void changeHospitalLocationTest() throws InterruptedException {
			
			hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityNameLABORATORYSERVICE"));
			LaboratorySampleacknowledgeinpatientPages=hishomepage.donavigatetoLaboratory_Sample_acknowledge_inpatient();
			LaboratorySampleacknowledgeinpatientPages.Test_case_for_Laboratory_Sample_acknowledge_inpatient();

}
}