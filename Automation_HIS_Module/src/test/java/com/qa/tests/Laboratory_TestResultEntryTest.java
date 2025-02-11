package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Laboratory_TestResultEntryPages;
import com.qa.pages.Loginpage;
import com.qa.pages.MiniCaseSheetPages;
import com.qa.pages.OPCaseSheetPage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Laboratory_TestResultEntryTest extends BaseTest {
	public Laboratory_TestResultEntryTest() {
		
	}
	util utilobj = new util();
	PatientCheckInPage patientcheckinpage;
	Loginpage loginpage;
	HomePage homepage;
	OPCaseSheetPage opcasesheetpage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
    MiniCaseSheetPages minicasesheetpages;	
	Laboratory_TestResultEntryPages LaboratoryTestResultEntryPages;
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
		
	}
	@Test(priority = 5)
	public void DoTestforTestresultEntry() throws InterruptedException {
		
		LaboratoryTestResultEntryPages=hishomepage.doNavigatetoLaboratory_Testwise_Result_Entry();
		LaboratoryTestResultEntryPages.laboratory_TestWise_ResultEntry();
		
		
		
	}
}
