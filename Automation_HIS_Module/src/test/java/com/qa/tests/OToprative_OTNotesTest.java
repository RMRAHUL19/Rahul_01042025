package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OToprative_OTNotesPages;
import com.qa.pages.SelectHospitalLocationPage;

public class OToprative_OTNotesTest extends BaseTest {
	public OToprative_OTNotesTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OToprative_OTNotesPages OToprativeOTNotesPages;
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
	public void doNavigateToOTandResourceSchedulingTest() {

		OToprativeOTNotesPages = hishomepage.doNavigateTooprativeOTNoteLink();
	}
	@Test(priority = 4)
public void dotestcaseforotoperativeotnotesLink()throws InterruptedException {
		OToprativeOTNotesPages.testcaseforOPrative_OTNotespages();
	}
	
}
