package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Laboratory_Dispatch_Report_Inpatient_Pages;
import com.qa.pages.Loginpage;
import com.qa.pages.OPCaseSheetPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Laboratory_Dispatch_Report_Inpatient_Test extends BaseTest {
 public	Laboratory_Dispatch_Report_Inpatient_Test() {
	 
 }
 util utilobj = new util();
	
	Loginpage loginpage;
	HomePage homepage;
	OPCaseSheetPage opcasesheetpage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Laboratory_Dispatch_Report_Inpatient_Pages LaboratoryDispatchReportInpatientPages;
	
	
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
	public void TestCasefordDispatchReportInpatient() throws InterruptedException {
		
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityNameLABORATORYSERVICE"));
		LaboratoryDispatchReportInpatientPages=hishomepage.donavigatetoLaboratory_Dispatch_Report_Inpatient();
		LaboratoryDispatchReportInpatientPages.TestCaseForLaboratory_Dispatch_Report_Inpatient();
}
}
