package com.qa.tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OTPriscriptionPages;
import com.qa.pages.OToprative_OTNotesPages;
import com.qa.pages.SelectHospitalLocationPage;

public class OTPriscriptionTest extends BaseTest {
	public OTPriscriptionTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OTPriscriptionPages OTPriscriptionpages;
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
				prop.getProperty("OtFacilityname"));
	}
	@Test(priority = 3)
	public void doNavigateToOTPrescriptionLink() {

		OTPriscriptionpages = hishomepage.doNavigateToOTPrescriptionLink();
	}
	@Test(priority = 4)
	public void donavigateTotestcaseOTprescription() throws InterruptedException, AWTException {
		OTPriscriptionpages.testcaseforOTPriscription();
		
	}
	
	

}
