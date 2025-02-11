package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.Emergency_Check_In_RegistrationPages;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class Emergency_Check_In_RegistrationTest extends BaseTest{
	public Emergency_Check_In_RegistrationTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Emergency_Check_In_RegistrationPages EmergencyCheckInRegistrationPages;
	
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}
	
	
	@Test(priority =1)//IP072100036
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"));
	}
	
	@Test(priority =3)
	public void doNavigateToEmergency_Check_In_RegistrationPagesLink() throws InterruptedException {

		EmergencyCheckInRegistrationPages = hishomepage.donavigateToEmergency_Check_In_Registration();
	}
	@Test(priority = 4)
	public void dotestcaseforEmergency_Check_In_RegistrationPagesLink() throws InterruptedException {
		EmergencyCheckInRegistrationPages.testcaseforeEmergency_Check_In_RegistrationPages();
		

}
}