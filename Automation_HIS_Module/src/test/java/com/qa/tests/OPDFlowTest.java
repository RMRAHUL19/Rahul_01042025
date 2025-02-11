package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OPDFlowPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.UHIDPage;

public class OPDFlowTest extends BaseTest{
	
	public OPDFlowTest() {
		
	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	String getUhid=null;
	String checkIN=null;
	OPDFlowPages opdflowPages;

	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {// 	OPGENE042100042

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"));
	}

	@Test(priority = 3)
	public void doNavigateToPatientCheckinLinkTest() {

		opdflowPages = hishomepage.doNavigateToPatientCheck_InforOPDFLowLink();
	}
	
	
	@Test(priority = 4)
	public void doCreateCheckInPageTest() throws InterruptedException {

		//opdflowPages.testcaseforOPDFlowpages(prop.getProperty("Title"),prop.getProperty("FirstName"),prop.getProperty("LastName"),
	//			prop.getProperty("MaritalStatus"),prop.getProperty("Age"),prop.getProperty("Address"));
		//getUhid= opdflowPages.testcasegetUhid();
		
		opdflowPages.getgenratechekIn();	
		checkIN=opdflowPages.getPatientCheckinNumber();
		getUhid= opdflowPages.testcasegetUhid();	
		
		//DL01.0005337466
				
	}
	@Test(priority = 5)
	public void dodoctorworklist() throws InterruptedException {
		opdflowPages.doIPCasesheetprecripstion("AutomationdummyOrderPack",checkIN);
	}
	@Test(priority = 6)
	public void doNavigateToHISHomeTestforfacilityStore() throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("StoreServices"));
		
	}
	@Test(priority = 7)
	public void dofacilityStore() throws InterruptedException {
		
		opdflowPages.TestCaseforStoreServices(checkIN);
	}
	@Test(priority = 8)
	public void doNavigateToHISHomeTestforLaboratoryworklist() throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityNameLABORATORYSERVICE"));//ok
		
	}
	@Test(priority = 9)
	public void testcaseforLaboratoryworkListOPD() throws InterruptedException {
		opdflowPages=hishomepage.donavigatetodoctorworklistOPDFlowPageLINK();
		opdflowPages.testcaseforLaboratoryworkListOPD(getUhid);
		
		
	}
	@Test(priority = 10)
	public void doNavigateToHISHomeTestforImagingServices() throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("imagingfacilityname"));
		
	}
	@Test(priority = 11)
	public void doImagingServices() throws InterruptedException {
		opdflowPages=hishomepage.doNavigateToImagingWorklistOforOPDFlowPages();
		opdflowPages.testcaseforImagingWorklList(getUhid);
		
		
	}
	
	
}
