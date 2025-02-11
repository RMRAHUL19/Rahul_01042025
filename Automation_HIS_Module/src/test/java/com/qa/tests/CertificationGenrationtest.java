package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.CertificationGenrationpages;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class CertificationGenrationtest extends BaseTest{
	util utilobj=new util();
	public CertificationGenrationtest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	String Check_in;
	CertificationGenrationpages certificategenrationpage;
	String Uhid;
	String CertificationNumber;
	//private WebDriver driver=null;
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
	public void genrateCheck_inForCertificationGenration() throws InterruptedException {
		certificategenrationpage=hishomepage.doNavigateTogenrateCheckInLinkforcertificationGenration();
		certificategenrationpage.getgenratechekIn(prop.getProperty("Production_IPNUmber"));
	Check_in=certificategenrationpage.getPatientCheckinNumber();
	Uhid=certificategenrationpage.testcasegetUhid();
	certificategenrationpage.doIPCasesheetprecripstion("Automation", Check_in);
	}
	@Test(priority =4)
	public void doNavigateToClinicalRecord_genrate_certificate() throws InterruptedException {
	certificategenrationpage=hishomepage.doNavigateCertificateGenerationLink();
		CertificationNumber=certificategenrationpage.testCaseofCertificationGenration(prop.getProperty("Production_IPNUmber"));
certificategenrationpage.testcaseofEditCertification(CertificationNumber);
	}

}
