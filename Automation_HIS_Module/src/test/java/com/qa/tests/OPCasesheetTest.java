package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MiniCaseSheetPages;
import com.qa.pages.OPCaseSheetPage;
import com.qa.pages.SelectHospitalLocationPage;

public class OPCasesheetTest extends BaseTest {
	public OPCasesheetTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	public String orderpack_name="AutomationdummyOrderPack";
	public String check_innumber="OPGENE052100079";
	MiniCaseSheetPages minicasesheetpages;
	OPCaseSheetPage opcasesheetpage;
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
	public void doNavigateToClinicalRecord_DoctorWorkList() throws InterruptedException {
		opcasesheetpage=hishomepage.doNavigateToPatientCheckInForOPcasesheet();
		opcasesheetpage.GoToPatient_check_in(prop.getProperty("Production_IPNUmber"));
		opcasesheetpage=hishomepage.doNavigateToDoctorWorklistLink();
		//opcasesheetpage.doOpenCaseSheet();
		opcasesheetpage.doCasesheetprecripstion(orderpack_name);
		}
	@Test(priority = 4)
	public void dotestcaseforCheifComplain() throws InterruptedException {
		opcasesheetpage.dotestCaseSheetchiefComplain();
		
	}
	@Test(priority = 5)
	public void dotestcaseforHistoryofpresentIllness() throws InterruptedException {
		opcasesheetpage.dotestCaseSheetHistoryofpresentIllness();
		
	}
	@Test(priority = 6)
	public void dotestcaseforPastHistory() throws InterruptedException {
		opcasesheetpage.dotestCaseSheetpastHistory();
		
}
	@Test(priority = 7)
	public void dotestcaseforGenralExamination() throws InterruptedException {
		opcasesheetpage.dotestCaseSheetgenralexamination();
		
	}


	@Test(priority = 8)
	public void dotestcaseforSystemicExamination() throws InterruptedException {
		opcasesheetpage.dotestCaseSheetsystemicExamination();
		

}
	@Test(priority = 9)
	public void dotestcaseforLocal_SpecialExamination() throws InterruptedException {
		opcasesheetpage.dotestCaseSheetLocal_specialExamination();
		
}
	@Test(priority = 10)
	public void dotestcaseforDiagnose() throws InterruptedException {
		opcasesheetpage.dotestCaseSheetDiagnos();
		

}
	@Test(priority = 11)
	public void dotestcaseforMedicine() throws InterruptedException {
		opcasesheetpage.dotestCaseSheetMedicine();
		
}
	@Test(priority = 12)
	public void dotestcaseforInvestigation() throws InterruptedException {
		opcasesheetpage.dotestCaseSheetInvastigation();
}
	@Test(priority = 13)
	public void dotestcaseforHealthInvestigation() throws InterruptedException {
		opcasesheetpage.dotestCaseSheetHealthInvestigation();
}
	@Test(priority = 14)
	public void dotestcaseforOrderPack() throws InterruptedException {
		opcasesheetpage.dotestCaseSheetOrderPack();
}
	
	}
	
	
