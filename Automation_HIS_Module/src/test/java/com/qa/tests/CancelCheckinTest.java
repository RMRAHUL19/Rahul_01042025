package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.CancelCheckinPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class CancelCheckinTest extends BaseTest{

	public CancelCheckinTest() {
		// TODO Auto-generated constructor stub
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	CancelCheckinPage cancelCheckinpage;
	
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}
	
	
	@Test(priority =1,description = "Navigate to Hospital Location Page")
	public void doNavigateToSelectHospitalLocationTest() {//ctl00_cphpage_imgCheckinno

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2,description = "Select Hospital Location And Facility Name")
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"));
	}
	
	@Test(priority =3,description = "Navigate the Cancel Check In screen")
	public void doNavigateToCancelCheckinTest() {

		cancelCheckinpage = hishomepage.doNavigateToCancelCheckinLink();
	}


@Test(priority =5,description = "1:-Data search by Using UHID and IP Number 2:-to check the Functionality of Clear Button Cancel Check In Button And select the multiple check in to delete 3:-To check the Functionality of Cancel CheckINfrom Doctor WorkList")
public void doCancelCheckinTest() throws InterruptedException {

	cancelCheckinpage.doCancelCheckin(prop.getProperty("UHIDNumber"));
	
}
}
