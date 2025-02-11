package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.DischargeIntimationPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class DischargeIntimationTest  extends BaseTest {

	public DischargeIntimationTest() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	DischargeIntimationPage dischargeintimationpage;

	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"));
	}


	@Test(priority = 3)
	public void doNavigateTogetDischargeIntimationLinkTest() {

		dischargeintimationpage = hishomepage.doNavigateToDischargeIntimationLink();
	}
	
	@Test(priority = 4)
	public void doDischargeIntimationPageTest() {

		dischargeintimationpage.doDischargeIntimationPage(prop.getProperty("AdmissionNo"),prop.getProperty("RequestType"),prop.getProperty("Remarks"));
		
	}	
	
			
}
