package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.pages.DoctorWorklistPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OPCaseSheetPage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;

public class DoctorWorklistTest extends BaseTest {

	public DoctorWorklistTest() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	DoctorWorklistPage doctorworklistPage;
	PatientCheckInPage patientcheckInpage;

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
	public void doNavigateToPatientCheckInTest() {

		
		doctorworklistPage=hishomepage.doNavigateToPatientCheckInforDoctorWorklist();
	}

	@Test(priority = 4)
	public void doPatientCheckINTest() throws InterruptedException {

		doctorworklistPage.doPatientCheckIN(prop.getProperty("Production_IPNUmber"), prop.getProperty("specialisationName"));

	}

	
	@Test(priority = 5)
	public void doNavigateToDoctorWorklistTest() throws InterruptedException {

		String txtcheckInNumber =doctorworklistPage.getPatientCheckinNumber();
		System.out.println(txtcheckInNumber);
		doctorworklistPage = hishomepage.donavigatetoDoctorworklist();
	
		doctorworklistPage.dotestcaseforDoctorWorkList(txtcheckInNumber);
		
		
		
		
	}
	
	
	
	
	

}
